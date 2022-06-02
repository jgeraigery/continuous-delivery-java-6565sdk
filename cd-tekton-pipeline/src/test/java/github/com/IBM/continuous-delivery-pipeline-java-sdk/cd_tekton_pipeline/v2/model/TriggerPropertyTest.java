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

package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerProperty;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerProperty model.
 */
public class TriggerPropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerProperty() throws Throwable {
    TriggerProperty triggerPropertyModel = new TriggerProperty.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .build();
    assertEquals(triggerPropertyModel.name(), "testString");
    assertEquals(triggerPropertyModel.value(), "testString");
    assertEquals(triggerPropertyModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerPropertyModel.xDefault(), "testString");
    assertEquals(triggerPropertyModel.type(), "SECURE");
    assertEquals(triggerPropertyModel.path(), "testString");

    String json = TestUtilities.serialize(triggerPropertyModel);

    TriggerProperty triggerPropertyModelNew = TestUtilities.deserialize(json, TriggerProperty.class);
    assertTrue(triggerPropertyModelNew instanceof TriggerProperty);
    assertEquals(triggerPropertyModelNew.name(), "testString");
    assertEquals(triggerPropertyModelNew.value(), "testString");
    assertEquals(triggerPropertyModelNew.xDefault(), "testString");
    assertEquals(triggerPropertyModelNew.type(), "SECURE");
    assertEquals(triggerPropertyModelNew.path(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerPropertyError() throws Throwable {
    new TriggerProperty.Builder().build();
  }

}