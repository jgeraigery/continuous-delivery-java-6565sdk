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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerGenericTriggerPropertiesItem;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerGenericTriggerPropertiesItem model.
 */
public class TriggerGenericTriggerPropertiesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerGenericTriggerPropertiesItem() throws Throwable {
    TriggerGenericTriggerPropertiesItem triggerGenericTriggerPropertiesItemModel = new TriggerGenericTriggerPropertiesItem.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .href("testString")
      .build();
    assertEquals(triggerGenericTriggerPropertiesItemModel.name(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModel.value(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerGenericTriggerPropertiesItemModel.xDefault(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModel.type(), "SECURE");
    assertEquals(triggerGenericTriggerPropertiesItemModel.path(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModel.href(), "testString");

    String json = TestUtilities.serialize(triggerGenericTriggerPropertiesItemModel);

    TriggerGenericTriggerPropertiesItem triggerGenericTriggerPropertiesItemModelNew = TestUtilities.deserialize(json, TriggerGenericTriggerPropertiesItem.class);
    assertTrue(triggerGenericTriggerPropertiesItemModelNew instanceof TriggerGenericTriggerPropertiesItem);
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.name(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.value(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.xDefault(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.type(), "SECURE");
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.path(), "testString");
    assertEquals(triggerGenericTriggerPropertiesItemModelNew.href(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerGenericTriggerPropertiesItemError() throws Throwable {
    new TriggerGenericTriggerPropertiesItem.Builder().build();
  }

}