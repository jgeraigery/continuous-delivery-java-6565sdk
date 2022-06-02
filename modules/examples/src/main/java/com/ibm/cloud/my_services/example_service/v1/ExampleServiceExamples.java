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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the ExampleService service.
//
// The following configuration properties are assumed to be defined:
// EXAMPLE_SERVICE_URL=<service base url>
// EXAMPLE_SERVICE_AUTH_TYPE=iam
// EXAMPLE_SERVICE_APIKEY=<IAM apikey>
// EXAMPLE_SERVICE_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
public class ExampleServiceExamples {
  private static final Logger logger = LoggerFactory.getLogger(ExampleServiceExamples.class);
  protected ExampleServiceExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../example_service_v1.env");
  }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    ExampleService exampleServiceService = ExampleService.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(ExampleService.DEFAULT_SERVICE_NAME);

    // Variables to hold link values
    String getResourceLink = null;

    try {
      System.out.println("createResource() result:");
      // begin-create_resource
      CreateResourceOptions createResourceOptions = new CreateResourceOptions.Builder()
        .name("The Hunt for Red October")
        .tag("Book")
        .build();

      Response<Resource> response = exampleServiceService.createResource(createResourceOptions).execute();
      Resource resource = response.getResult();

      System.out.println(resource);
      // end-create_resource

      getResourceLink = resource.resourceId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listResources() result:");
      // begin-list_resources
      ListResourcesOptions listResourcesOptions = new ListResourcesOptions.Builder()
        .limit(Long.valueOf("1"))
        .build();

      Response<Resources> response = exampleServiceService.listResources(listResourcesOptions).execute();
      Resources resources = response.getResult();

      System.out.println(resources);
      // end-list_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getResource() result:");
      // begin-get_resource
      GetResourceOptions getResourceOptions = new GetResourceOptions.Builder()
        .resourceId(getResourceLink)
        .build();

      Response<Resource> response = exampleServiceService.getResource(getResourceOptions).execute();
      Resource resource = response.getResult();

      System.out.println(resource);
      // end-get_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_resource
      CreateResourceOptions createResourceOptions = new CreateResourceOptions.Builder()
                .name("Debt of Honor")
                .tag("Book")
                .resourceId("url%3encoded%3resource%3id")
                .build();
      exampleServiceService.createResource(createResourceOptions).execute();

      System.out.println("getResourceEncoded() result:");
      // begin-get_resource_encoded
      GetResourceEncodedOptions getResourceEncodedOptions = new GetResourceEncodedOptions.Builder()
        .urlEncodedResourceId("url%3encoded%3resource%3id")
        .build();

      Response<Resource> response = exampleServiceService.getResourceEncoded(getResourceEncodedOptions).execute();
      Resource resource = response.getResult();

      System.out.println(resource);
      // end-get_resource_encoded
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
