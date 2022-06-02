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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerTimerTriggerPropertiesItem;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerTimerTriggerPropertiesItem model.
 */
public class TriggerTimerTriggerPropertiesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerTimerTriggerPropertiesItem() throws Throwable {
    TriggerTimerTriggerPropertiesItem triggerTimerTriggerPropertiesItemModel = new TriggerTimerTriggerPropertiesItem.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .href("testString")
      .build();
    assertEquals(triggerTimerTriggerPropertiesItemModel.name(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModel.value(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerTimerTriggerPropertiesItemModel.xDefault(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModel.type(), "SECURE");
    assertEquals(triggerTimerTriggerPropertiesItemModel.path(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModel.href(), "testString");

    String json = TestUtilities.serialize(triggerTimerTriggerPropertiesItemModel);

    TriggerTimerTriggerPropertiesItem triggerTimerTriggerPropertiesItemModelNew = TestUtilities.deserialize(json, TriggerTimerTriggerPropertiesItem.class);
    assertTrue(triggerTimerTriggerPropertiesItemModelNew instanceof TriggerTimerTriggerPropertiesItem);
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.name(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.value(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.xDefault(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.type(), "SECURE");
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.path(), "testString");
    assertEquals(triggerTimerTriggerPropertiesItemModelNew.href(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerTimerTriggerPropertiesItemError() throws Throwable {
    new TriggerTimerTriggerPropertiesItem.Builder().build();
  }

}