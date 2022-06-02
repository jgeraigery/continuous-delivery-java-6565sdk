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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Events;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerScmSource;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerScmTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerScmTriggerPropertiesItem;
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
 * Unit test class for the TriggerScmTrigger model.
 */
public class TriggerScmTriggerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerScmTrigger() throws Throwable {
    TriggerScmTriggerPropertiesItem triggerScmTriggerPropertiesItemModel = new TriggerScmTriggerPropertiesItem.Builder()
      .name("testString")
      .value("testString")
      .xEnum(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .xDefault("testString")
      .type("SECURE")
      .path("testString")
      .href("testString")
      .build();
    assertEquals(triggerScmTriggerPropertiesItemModel.name(), "testString");
    assertEquals(triggerScmTriggerPropertiesItemModel.value(), "testString");
    assertEquals(triggerScmTriggerPropertiesItemModel.xEnum(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerScmTriggerPropertiesItemModel.xDefault(), "testString");
    assertEquals(triggerScmTriggerPropertiesItemModel.type(), "SECURE");
    assertEquals(triggerScmTriggerPropertiesItemModel.path(), "testString");
    assertEquals(triggerScmTriggerPropertiesItemModel.href(), "testString");

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

    TriggerScmSource triggerScmSourceModel = new TriggerScmSource.Builder()
      .url("testString")
      .branch("testString")
      .pattern("testString")
      .blindConnection(true)
      .hookId("testString")
      .build();
    assertEquals(triggerScmSourceModel.url(), "testString");
    assertEquals(triggerScmSourceModel.branch(), "testString");
    assertEquals(triggerScmSourceModel.pattern(), "testString");
    assertEquals(triggerScmSourceModel.blindConnection(), Boolean.valueOf(true));
    assertEquals(triggerScmSourceModel.hookId(), "testString");

    Events eventsModel = new Events.Builder()
      .push(true)
      .pullRequestClosed(true)
      .pullRequest(true)
      .build();
    assertEquals(eventsModel.push(), Boolean.valueOf(true));
    assertEquals(eventsModel.pullRequestClosed(), Boolean.valueOf(true));
    assertEquals(eventsModel.pullRequest(), Boolean.valueOf(true));

    TriggerScmTrigger triggerScmTriggerModel = new TriggerScmTrigger.Builder()
      .type("testString")
      .name("start-deploy")
      .eventListener("testString")
      .id("testString")
      .xProperties(new java.util.ArrayList<TriggerScmTriggerPropertiesItem>(java.util.Arrays.asList(triggerScmTriggerPropertiesItemModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .worker(workerModel)
      .concurrency(concurrencyModel)
      .disabled(true)
      .scmSource(triggerScmSourceModel)
      .events(eventsModel)
      .serviceInstanceId("testString")
      .build();
    assertEquals(triggerScmTriggerModel.type(), "testString");
    assertEquals(triggerScmTriggerModel.name(), "start-deploy");
    assertEquals(triggerScmTriggerModel.eventListener(), "testString");
    assertEquals(triggerScmTriggerModel.id(), "testString");
    assertEquals(triggerScmTriggerModel.xProperties(), new java.util.ArrayList<TriggerScmTriggerPropertiesItem>(java.util.Arrays.asList(triggerScmTriggerPropertiesItemModel)));
    assertEquals(triggerScmTriggerModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerScmTriggerModel.worker(), workerModel);
    assertEquals(triggerScmTriggerModel.concurrency(), concurrencyModel);
    assertEquals(triggerScmTriggerModel.disabled(), Boolean.valueOf(true));
    assertEquals(triggerScmTriggerModel.scmSource(), triggerScmSourceModel);
    assertEquals(triggerScmTriggerModel.events(), eventsModel);
    assertEquals(triggerScmTriggerModel.serviceInstanceId(), "testString");

    String json = TestUtilities.serialize(triggerScmTriggerModel);

    TriggerScmTrigger triggerScmTriggerModelNew = TestUtilities.deserialize(json, TriggerScmTrigger.class);
    assertTrue(triggerScmTriggerModelNew instanceof TriggerScmTrigger);
    assertEquals(triggerScmTriggerModelNew.type(), "testString");
    assertEquals(triggerScmTriggerModelNew.name(), "start-deploy");
    assertEquals(triggerScmTriggerModelNew.eventListener(), "testString");
    assertEquals(triggerScmTriggerModelNew.id(), "testString");
    assertEquals(triggerScmTriggerModelNew.worker().toString(), workerModel.toString());
    assertEquals(triggerScmTriggerModelNew.concurrency().toString(), concurrencyModel.toString());
    assertEquals(triggerScmTriggerModelNew.disabled(), Boolean.valueOf(true));
    assertEquals(triggerScmTriggerModelNew.scmSource().toString(), triggerScmSourceModel.toString());
    assertEquals(triggerScmTriggerModelNew.events().toString(), eventsModel.toString());
    assertEquals(triggerScmTriggerModelNew.serviceInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerScmTriggerError() throws Throwable {
    new TriggerScmTrigger.Builder().build();
  }

}