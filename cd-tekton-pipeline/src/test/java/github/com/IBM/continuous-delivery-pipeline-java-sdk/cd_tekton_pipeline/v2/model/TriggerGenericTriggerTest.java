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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GenericSecret;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerGenericTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerGenericTriggerPropertiesItem;
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
 * Unit test class for the TriggerGenericTrigger model.
 */
public class TriggerGenericTriggerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTriggerGenericTrigger() throws Throwable {
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

    TriggerGenericTrigger triggerGenericTriggerModel = new TriggerGenericTrigger.Builder()
      .type("testString")
      .name("start-deploy")
      .eventListener("testString")
      .id("testString")
      .xProperties(new java.util.ArrayList<TriggerGenericTriggerPropertiesItem>(java.util.Arrays.asList(triggerGenericTriggerPropertiesItemModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .worker(workerModel)
      .concurrency(concurrencyModel)
      .disabled(true)
      .secret(genericSecretModel)
      .build();
    assertEquals(triggerGenericTriggerModel.type(), "testString");
    assertEquals(triggerGenericTriggerModel.name(), "start-deploy");
    assertEquals(triggerGenericTriggerModel.eventListener(), "testString");
    assertEquals(triggerGenericTriggerModel.id(), "testString");
    assertEquals(triggerGenericTriggerModel.xProperties(), new java.util.ArrayList<TriggerGenericTriggerPropertiesItem>(java.util.Arrays.asList(triggerGenericTriggerPropertiesItemModel)));
    assertEquals(triggerGenericTriggerModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(triggerGenericTriggerModel.worker(), workerModel);
    assertEquals(triggerGenericTriggerModel.concurrency(), concurrencyModel);
    assertEquals(triggerGenericTriggerModel.disabled(), Boolean.valueOf(true));
    assertEquals(triggerGenericTriggerModel.secret(), genericSecretModel);

    String json = TestUtilities.serialize(triggerGenericTriggerModel);

    TriggerGenericTrigger triggerGenericTriggerModelNew = TestUtilities.deserialize(json, TriggerGenericTrigger.class);
    assertTrue(triggerGenericTriggerModelNew instanceof TriggerGenericTrigger);
    assertEquals(triggerGenericTriggerModelNew.type(), "testString");
    assertEquals(triggerGenericTriggerModelNew.name(), "start-deploy");
    assertEquals(triggerGenericTriggerModelNew.eventListener(), "testString");
    assertEquals(triggerGenericTriggerModelNew.id(), "testString");
    assertEquals(triggerGenericTriggerModelNew.worker().toString(), workerModel.toString());
    assertEquals(triggerGenericTriggerModelNew.concurrency().toString(), concurrencyModel.toString());
    assertEquals(triggerGenericTriggerModelNew.disabled(), Boolean.valueOf(true));
    assertEquals(triggerGenericTriggerModelNew.secret().toString(), genericSecretModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTriggerGenericTriggerError() throws Throwable {
    new TriggerGenericTrigger.Builder().build();
  }

}