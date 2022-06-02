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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GenericSecret;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerScmSource;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.UpdateTektonPipelineTriggerOptions;
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
 * Unit test class for the UpdateTektonPipelineTriggerOptions model.
 */
public class UpdateTektonPipelineTriggerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTektonPipelineTriggerOptions() throws Throwable {
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

    GenericSecret genericSecretModel = new GenericSecret.Builder()
      .type("tokenMatches")
      .value("testString")
      .source("header")
      .keyName("testString")
      .algorithm("md4")
      .build();
    assertEquals(genericSecretModel.type(), "tokenMatches");
    assertEquals(genericSecretModel.value(), "testString");
    assertEquals(genericSecretModel.source(), "header");
    assertEquals(genericSecretModel.keyName(), "testString");
    assertEquals(genericSecretModel.algorithm(), "md4");

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

    UpdateTektonPipelineTriggerOptions updateTektonPipelineTriggerOptionsModel = new UpdateTektonPipelineTriggerOptions.Builder()
      .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
      .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
      .type("manual")
      .name("start-deploy")
      .eventListener("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .worker(workerModel)
      .concurrency(concurrencyModel)
      .disabled(true)
      .secret(genericSecretModel)
      .cron("testString")
      .timezone("Africa/Abidjan")
      .scmSource(triggerScmSourceModel)
      .events(eventsModel)
      .build();
    assertEquals(updateTektonPipelineTriggerOptionsModel.pipelineId(), "94619026-912b-4d92-8f51-6c74f0692d90");
    assertEquals(updateTektonPipelineTriggerOptionsModel.triggerId(), "1bb892a1-2e04-4768-a369-b1159eace147");
    assertEquals(updateTektonPipelineTriggerOptionsModel.type(), "manual");
    assertEquals(updateTektonPipelineTriggerOptionsModel.name(), "start-deploy");
    assertEquals(updateTektonPipelineTriggerOptionsModel.eventListener(), "testString");
    assertEquals(updateTektonPipelineTriggerOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(updateTektonPipelineTriggerOptionsModel.worker(), workerModel);
    assertEquals(updateTektonPipelineTriggerOptionsModel.concurrency(), concurrencyModel);
    assertEquals(updateTektonPipelineTriggerOptionsModel.disabled(), Boolean.valueOf(true));
    assertEquals(updateTektonPipelineTriggerOptionsModel.secret(), genericSecretModel);
    assertEquals(updateTektonPipelineTriggerOptionsModel.cron(), "testString");
    assertEquals(updateTektonPipelineTriggerOptionsModel.timezone(), "Africa/Abidjan");
    assertEquals(updateTektonPipelineTriggerOptionsModel.scmSource(), triggerScmSourceModel);
    assertEquals(updateTektonPipelineTriggerOptionsModel.events(), eventsModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTektonPipelineTriggerOptionsError() throws Throwable {
    new UpdateTektonPipelineTriggerOptions.Builder().build();
  }

}