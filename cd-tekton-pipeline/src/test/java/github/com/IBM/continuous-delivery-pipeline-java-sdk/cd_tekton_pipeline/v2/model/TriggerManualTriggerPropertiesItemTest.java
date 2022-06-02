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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerManualTriggerPropertiesItem;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerManualTriggerPropertiesItem model.
 */
public class TriggerManualTriggerPropertiesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerManualTriggerPropertiesItem() throws Throwable {
    TriggerManualTriggerPropertiesItem triggerManualTriggerPropertiesItemModel = new TriggerManualTriggerPropertiesItem.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .href("testString")
      .build();
    assertEquals(triggerManualTriggerPropertiesItemModel.name(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModel.value(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerManualTriggerPropertiesItemModel.xDefault(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModel.type(), "SECURE");
    assertEquals(triggerManualTriggerPropertiesItemModel.path(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModel.href(), "testString");

    String json = TestUtilities.serialize(triggerManualTriggerPropertiesItemModel);

    TriggerManualTriggerPropertiesItem triggerManualTriggerPropertiesItemModelNew = TestUtilities.deserialize(json, TriggerManualTriggerPropertiesItem.class);
    assertTrue(triggerManualTriggerPropertiesItemModelNew instanceof TriggerManualTriggerPropertiesItem);
    assertEquals(triggerManualTriggerPropertiesItemModelNew.name(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModelNew.value(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModelNew.xDefault(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModelNew.type(), "SECURE");
    assertEquals(triggerManualTriggerPropertiesItemModelNew.path(), "testString");
    assertEquals(triggerManualTriggerPropertiesItemModelNew.href(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerManualTriggerPropertiesItemError() throws Throwable {
    new TriggerManualTriggerPropertiesItem.Builder().build();
  }

}