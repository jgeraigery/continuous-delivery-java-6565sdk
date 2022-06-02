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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerTimerTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerTimerTriggerPropertiesItem;
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
 * Unit test class for the TriggerTimerTrigger model.
 */
public class TriggerTimerTriggerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerTimerTrigger() throws Throwable {
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

    TriggerTimerTrigger triggerTimerTriggerModel = new TriggerTimerTrigger.Builder()
      .type("testString")
      .name("start-deploy")
      .eventListener("testString")
      .id("testString")
      .xProperties(new java.util.ArrayList<TriggerTimerTriggerPropertiesItem>(java.util.Arrays.asList(triggerTimerTriggerPropertiesItemModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .worker(workerModel)
      .concurrency(concurrencyModel)
      .disabled(true)
      .cron("testString")
      .timezone("Africa/Abidjan")
      .build();
    assertEquals(triggerTimerTriggerModel.type(), "testString");
    assertEquals(triggerTimerTriggerModel.name(), "start-deploy");
    assertEquals(triggerTimerTriggerModel.eventListener(), "testString");
    assertEquals(triggerTimerTriggerModel.id(), "testString");
    assertEquals(triggerTimerTriggerModel.xProperties(), new java.util.ArrayList<TriggerTimerTriggerPropertiesItem>(java.util.Arrays.asList(triggerTimerTriggerPropertiesItemModel)));
    assertEquals(triggerTimerTriggerModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerTimerTriggerModel.worker(), workerModel);
    assertEquals(triggerTimerTriggerModel.concurrency(), concurrencyModel);
    assertEquals(triggerTimerTriggerModel.disabled(), Boolean.valueOf(true));
    assertEquals(triggerTimerTriggerModel.cron(), "testString");
    assertEquals(triggerTimerTriggerModel.timezone(), "Africa/Abidjan");

    String json = TestUtilities.serialize(triggerTimerTriggerModel);

    TriggerTimerTrigger triggerTimerTriggerModelNew = TestUtilities.deserialize(json, TriggerTimerTrigger.class);
    assertTrue(triggerTimerTriggerModelNew instanceof TriggerTimerTrigger);
    assertEquals(triggerTimerTriggerModelNew.type(), "testString");
    assertEquals(triggerTimerTriggerModelNew.name(), "start-deploy");
    assertEquals(triggerTimerTriggerModelNew.eventListener(), "testString");
    assertEquals(triggerTimerTriggerModelNew.id(), "testString");
    assertEquals(triggerTimerTriggerModelNew.worker().toString(), workerModel.toString());
    assertEquals(triggerTimerTriggerModelNew.concurrency().toString(), concurrencyModel.toString());
    assertEquals(triggerTimerTriggerModelNew.disabled(), Boolean.valueOf(true));
    assertEquals(triggerTimerTriggerModelNew.cron(), "testString");
    assertEquals(triggerTimerTriggerModelNew.timezone(), "Africa/Abidjan");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerTimerTriggerError() throws Throwable {
    new TriggerTimerTrigger.Builder().build();
  }

}