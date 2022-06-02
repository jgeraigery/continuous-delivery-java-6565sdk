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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Concurrency;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerManualTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerManualTriggerPropertiesItem;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Worker;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TriggerManualTrigger model.
 */
public class TriggerManualTriggerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerManualTrigger() throws Throwable {
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

    Worker workerModel = new Worker.Builder()
      .name("testString")
      .type("private")
      .id("testString")
      .build();
    assertEquals(workerModel.name(), "testString");
    assertEquals(workerModel.type(), "private");
    assertEquals(workerModel.id(), "testString");

    Concurrency concurrencyModel = new Concurrency.Builder()
      .maxConcurrentRuns(Long.valueOf("20"))
      .build();
    assertEquals(concurrencyModel.maxConcurrentRuns(), Long.valueOf("20"));

    TriggerManualTrigger triggerManualTriggerModel = new TriggerManualTrigger.Builder()
      .type("testString")
      .name("start-deploy")
      .eventListener("testString")
      .id("testString")
      .xProperties(new java.util.ArrayList<TriggerManualTriggerPropertiesItem>(java.util.Arrays.asList(triggerManualTriggerPropertiesItemModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .worker(workerModel)
      .concurrency(concurrencyModel)
      .disabled(true)
      .build();
    assertEquals(triggerManualTriggerModel.type(), "testString");
    assertEquals(triggerManualTriggerModel.name(), "start-deploy");
    assertEquals(triggerManualTriggerModel.eventListener(), "testString");
    assertEquals(triggerManualTriggerModel.id(), "testString");
    assertEquals(triggerManualTriggerModel.xProperties(), new java.util.ArrayList<TriggerManualTriggerPropertiesItem>(java.util.Arrays.asList(triggerManualTriggerPropertiesItemModel)));
    assertEquals(triggerManualTriggerModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerManualTriggerModel.worker(), workerModel);
    assertEquals(triggerManualTriggerModel.concurrency(), concurrencyModel);
    assertEquals(triggerManualTriggerModel.disabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(triggerManualTriggerModel);

    TriggerManualTrigger triggerManualTriggerModelNew = TestUtilities.deserialize(json, TriggerManualTrigger.class);
    assertTrue(triggerManualTriggerModelNew instanceof TriggerManualTrigger);
    assertEquals(triggerManualTriggerModelNew.type(), "testString");
    assertEquals(triggerManualTriggerModelNew.name(), "start-deploy");
    assertEquals(triggerManualTriggerModelNew.eventListener(), "testString");
    assertEquals(triggerManualTriggerModelNew.id(), "testString");
    assertEquals(triggerManualTriggerModelNew.worker().toString(), workerModel.toString());
    assertEquals(triggerManualTriggerModelNew.concurrency().toString(), concurrencyModel.toString());
    assertEquals(triggerManualTriggerModelNew.disabled(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerManualTriggerError() throws Throwable {
    new TriggerManualTrigger.Builder().build();
  }

}