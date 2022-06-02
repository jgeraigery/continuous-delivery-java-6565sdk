/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.my_services.example_service.v1;

import com.ibm.cloud.my_services.example_service.v1.model.CreateResourceOptions;
import com.ibm.cloud.my_services.example_service.v1.model.GetResourceEncodedOptions;
import com.ibm.cloud.my_services.example_service.v1.model.GetResourceOptions;
import com.ibm.cloud.my_services.example_service.v1.model.ListResourcesOptions;
import com.ibm.cloud.my_services.example_service.v1.model.Resource;
import com.ibm.cloud.my_services.example_service.v1.model.Resources;
import com.ibm.cloud.my_services.example_service.v1.utils.TestUtilities;
import com.ibm.cloud.my_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the ExampleService service.
 */
public class ExampleServiceIT extends SdkIntegrationTestBase {
  public ExampleService service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  // Globlal variables to hold link values
  String getResourceLink = null;

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../example_service_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = ExampleService.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(ExampleService.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateResource() throws Exception {
    try {
      CreateResourceOptions createResourceOptions = new CreateResourceOptions.Builder()
      .name("The Hunt for Red October")
      .tag("Book")
      .build();

      // Invoke operation
      Response<Resource> response = service.createResource(createResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
      getResourceLink = resourceResult.resourceId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListResources() throws Exception {
    try {
      ListResourcesOptions listResourcesOptions = new ListResourcesOptions.Builder()
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<Resources> response = service.listResources(listResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resources resourcesResult = response.getResult();

      assertNotNull(resourcesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateResource" })
  public void testGetResource() throws Exception {
    try {
      GetResourceOptions getResourceOptions = new GetResourceOptions.Builder()
      .resourceId(getResourceLink)
      .build();

      // Invoke operation
      Response<Resource> response = service.getResource(getResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetResourceEncoded() throws Exception {
    try {
        CreateResourceOptions createResourceOptions = new CreateResourceOptions.Builder()
                .name("Debt of Honor")
                .tag("Book")
                .resourceId("url%3encoded%3resource%3id")
                .build();

        // Invoke operation
        Response<Resource> createResponse = service.createResource(createResourceOptions).execute();
        // Validate response
        assertNotNull(createResponse);
        assertEquals(createResponse.getStatusCode(), 201);

      GetResourceEncodedOptions getResourceEncodedOptions = new GetResourceEncodedOptions.Builder()
      .urlEncodedResourceId("url%3encoded%3resource%3id")
      .build();

      // Invoke operation
      Response<Resource> response = service.getResourceEncoded(getResourceEncodedOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
