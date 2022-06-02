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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerDuplicateTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTektonPipelineTriggerOptions model.
 */
public class CreateTektonPipelineTriggerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTektonPipelineTriggerOptions() throws Throwable {
    TriggerDuplicateTrigger triggerModel = new TriggerDuplicateTrigger.Builder()
      .sourceTriggerId("testString")
      .name("start-deploy")
      .build();
    assertEquals(triggerModel.sourceTriggerId(), "testString");
    assertEquals(triggerModel.name(), "start-deploy");

    CreateTektonPipelineTriggerOptions createTektonPipelineTriggerOptionsModel = new CreateTektonPipelineTriggerOptions.Builder()
      .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
      .trigger(triggerModel)
      .build();
    assertEquals(createTektonPipelineTriggerOptionsModel.pipelineId(), "94619026-912b-4d92-8f51-6c74f0692d90");
    assertEquals(createTektonPipelineTriggerOptionsModel.trigger(), triggerModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTektonPipelineTriggerOptionsError() throws Throwable {
    new CreateTektonPipelineTriggerOptions.Builder().build();
  }

}