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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerPropertiesItem;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerPropertiesItem model.
 */
public class TriggerPropertiesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerPropertiesItem() throws Throwable {
    TriggerPropertiesItem triggerPropertiesItemModel = new TriggerPropertiesItem.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .href("testString")
      .build();
    assertEquals(triggerPropertiesItemModel.name(), "testString");
    assertEquals(triggerPropertiesItemModel.value(), "testString");
    assertEquals(triggerPropertiesItemModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerPropertiesItemModel.xDefault(), "testString");
    assertEquals(triggerPropertiesItemModel.type(), "SECURE");
    assertEquals(triggerPropertiesItemModel.path(), "testString");
    assertEquals(triggerPropertiesItemModel.href(), "testString");

    String json = TestUtilities.serialize(triggerPropertiesItemModel);

    TriggerPropertiesItem triggerPropertiesItemModelNew = TestUtilities.deserialize(json, TriggerPropertiesItem.class);
    assertTrue(triggerPropertiesItemModelNew instanceof TriggerPropertiesItem);
    assertEquals(triggerPropertiesItemModelNew.name(), "testString");
    assertEquals(triggerPropertiesItemModelNew.value(), "testString");
    assertEquals(triggerPropertiesItemModelNew.xDefault(), "testString");
    assertEquals(triggerPropertiesItemModelNew.type(), "SECURE");
    assertEquals(triggerPropertiesItemModelNew.path(), "testString");
    assertEquals(triggerPropertiesItemModelNew.href(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerPropertiesItemError() throws Throwable {
    new TriggerPropertiesItem.Builder().build();
  }

}