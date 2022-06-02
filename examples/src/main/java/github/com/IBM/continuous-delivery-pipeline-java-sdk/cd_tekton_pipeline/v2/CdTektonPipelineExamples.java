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

package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CancelTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelinePropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineTriggerPropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Definition;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DefinitionScmSource;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Definitions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelinePropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.DeleteTektonPipelineTriggerPropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.EnvProperties;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelinePropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineRunLogContentOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineRunLogsOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.GetTektonPipelineTriggerPropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelineDefinitionsOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelinePropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelineRunsOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelineTriggerPropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ListTektonPipelineTriggersOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.PipelineRun;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.PipelineRunLogs;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.PipelineRuns;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Property;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ReplaceTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ReplaceTektonPipelinePropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.ReplaceTektonPipelineTriggerPropertyOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.RerunTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.StepLog;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TektonPipeline;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Trigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerDuplicateTrigger;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerProperties;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerProperty;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Triggers;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.UpdateTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.UpdateTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.WorkerWithId;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the CD Tekton Pipeline service.
//
// The following configuration properties are assumed to be defined:
// CD_TEKTON_PIPELINE_URL=<service base url>
// CD_TEKTON_PIPELINE_AUTH_TYPE=iam
// CD_TEKTON_PIPELINE_APIKEY=<IAM apikey>
// CD_TEKTON_PIPELINE_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
public class CdTektonPipelineExamples {
  private static final Logger logger = LoggerFactory.getLogger(CdTektonPipelineExamples.class);
  protected CdTektonPipelineExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../cd_tekton_pipeline_v2.env");
  }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    CdTektonPipeline cdTektonPipelineService = CdTektonPipeline.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(CdTektonPipeline.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("createTektonPipeline() result:");
      // begin-create_tekton_pipeline
      WorkerWithId workerWithIdModel = new WorkerWithId.Builder()
        .id("public")
        .build();
      CreateTektonPipelineOptions createTektonPipelineOptions = new CreateTektonPipelineOptions.Builder()
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .worker(workerWithIdModel)
        .build();

      Response<TektonPipeline> response = cdTektonPipelineService.createTektonPipeline(createTektonPipelineOptions).execute();
      TektonPipeline tektonPipeline = response.getResult();

      System.out.println(tektonPipeline);
      // end-create_tekton_pipeline
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipeline() result:");
      // begin-get_tekton_pipeline
      GetTektonPipelineOptions getTektonPipelineOptions = new GetTektonPipelineOptions.Builder()
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<TektonPipeline> response = cdTektonPipelineService.getTektonPipeline(getTektonPipelineOptions).execute();
      TektonPipeline tektonPipeline = response.getResult();

      System.out.println(tektonPipeline);
      // end-get_tekton_pipeline
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateTektonPipeline() result:");
      // begin-update_tekton_pipeline
      WorkerWithId workerWithIdModel = new WorkerWithId.Builder()
        .id("public")
        .build();
      UpdateTektonPipelineOptions updateTektonPipelineOptions = new UpdateTektonPipelineOptions.Builder()
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .worker(workerWithIdModel)
        .build();

      Response<TektonPipeline> response = cdTektonPipelineService.updateTektonPipeline(updateTektonPipelineOptions).execute();
      TektonPipeline tektonPipeline = response.getResult();

      System.out.println(tektonPipeline);
      // end-update_tekton_pipeline
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTektonPipelineRuns() result:");
      // begin-list_tekton_pipeline_runs
      ListTektonPipelineRunsOptions listTektonPipelineRunsOptions = new ListTektonPipelineRunsOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .status("succeeded")
        .triggerName("manual-trigger")
        .build();

      Response<PipelineRuns> response = cdTektonPipelineService.listTektonPipelineRuns(listTektonPipelineRunsOptions).execute();
      PipelineRuns pipelineRuns = response.getResult();

      System.out.println(pipelineRuns);
      // end-list_tekton_pipeline_runs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTektonPipelineRun() result:");
      // begin-create_tekton_pipeline_run
      CreateTektonPipelineRunOptions createTektonPipelineRunOptions = new CreateTektonPipelineRunOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerName("Generic Webhook Trigger - 0")
        .build();

      Response<PipelineRun> response = cdTektonPipelineService.createTektonPipelineRun(createTektonPipelineRunOptions).execute();
      PipelineRun pipelineRun = response.getResult();

      System.out.println(pipelineRun);
      // end-create_tekton_pipeline_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineRun() result:");
      // begin-get_tekton_pipeline_run
      GetTektonPipelineRunOptions getTektonPipelineRunOptions = new GetTektonPipelineRunOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .includes("definitions")
        .build();

      Response<PipelineRun> response = cdTektonPipelineService.getTektonPipelineRun(getTektonPipelineRunOptions).execute();
      PipelineRun pipelineRun = response.getResult();

      System.out.println(pipelineRun);
      // end-get_tekton_pipeline_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("cancelTektonPipelineRun() result:");
      // begin-cancel_tekton_pipeline_run
      CancelTektonPipelineRunOptions cancelTektonPipelineRunOptions = new CancelTektonPipelineRunOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .force(true)
        .build();

      Response<PipelineRun> response = cdTektonPipelineService.cancelTektonPipelineRun(cancelTektonPipelineRunOptions).execute();
      PipelineRun pipelineRun = response.getResult();

      System.out.println(pipelineRun);
      // end-cancel_tekton_pipeline_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("rerunTektonPipelineRun() result:");
      // begin-rerun_tekton_pipeline_run
      RerunTektonPipelineRunOptions rerunTektonPipelineRunOptions = new RerunTektonPipelineRunOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<PipelineRun> response = cdTektonPipelineService.rerunTektonPipelineRun(rerunTektonPipelineRunOptions).execute();
      PipelineRun pipelineRun = response.getResult();

      System.out.println(pipelineRun);
      // end-rerun_tekton_pipeline_run
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineRunLogs() result:");
      // begin-get_tekton_pipeline_run_logs
      GetTektonPipelineRunLogsOptions getTektonPipelineRunLogsOptions = new GetTektonPipelineRunLogsOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<PipelineRunLogs> response = cdTektonPipelineService.getTektonPipelineRunLogs(getTektonPipelineRunLogsOptions).execute();
      PipelineRunLogs pipelineRunLogs = response.getResult();

      System.out.println(pipelineRunLogs);
      // end-get_tekton_pipeline_run_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineRunLogContent() result:");
      // begin-get_tekton_pipeline_run_log_content
      GetTektonPipelineRunLogContentOptions getTektonPipelineRunLogContentOptions = new GetTektonPipelineRunLogContentOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .pipelineRunId("bf4b3abd-0c93-416b-911e-9cf42f1a1085")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<StepLog> response = cdTektonPipelineService.getTektonPipelineRunLogContent(getTektonPipelineRunLogContentOptions).execute();
      StepLog stepLog = response.getResult();

      System.out.println(stepLog);
      // end-get_tekton_pipeline_run_log_content
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTektonPipelineDefinitions() result:");
      // begin-list_tekton_pipeline_definitions
      ListTektonPipelineDefinitionsOptions listTektonPipelineDefinitionsOptions = new ListTektonPipelineDefinitionsOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<Definitions> response = cdTektonPipelineService.listTektonPipelineDefinitions(listTektonPipelineDefinitionsOptions).execute();
      Definitions definitions = response.getResult();

      System.out.println(definitions);
      // end-list_tekton_pipeline_definitions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTektonPipelineDefinition() result:");
      // begin-create_tekton_pipeline_definition
      DefinitionScmSource definitionScmSourceModel = new DefinitionScmSource.Builder()
        .url("https://github.com/IBM/tekton-tutorial.git")
        .branch("master")
        .path(".tekton")
        .build();
      CreateTektonPipelineDefinitionOptions createTektonPipelineDefinitionOptions = new CreateTektonPipelineDefinitionOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .scmSource(definitionScmSourceModel)
        .build();

      Response<Definition> response = cdTektonPipelineService.createTektonPipelineDefinition(createTektonPipelineDefinitionOptions).execute();
      Definition definition = response.getResult();

      System.out.println(definition);
      // end-create_tekton_pipeline_definition
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineDefinition() result:");
      // begin-get_tekton_pipeline_definition
      GetTektonPipelineDefinitionOptions getTektonPipelineDefinitionOptions = new GetTektonPipelineDefinitionOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .definitionId("94299034-d45f-4e9a-8ed5-6bd5c7bb7ada")
        .build();

      Response<Definition> response = cdTektonPipelineService.getTektonPipelineDefinition(getTektonPipelineDefinitionOptions).execute();
      Definition definition = response.getResult();

      System.out.println(definition);
      // end-get_tekton_pipeline_definition
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceTektonPipelineDefinition() result:");
      // begin-replace_tekton_pipeline_definition
      DefinitionScmSource definitionScmSourceModel = new DefinitionScmSource.Builder()
        .url("https://github.com/IBM/tekton-tutorial.git")
        .branch("master")
        .path(".tekton")
        .build();
      ReplaceTektonPipelineDefinitionOptions replaceTektonPipelineDefinitionOptions = new ReplaceTektonPipelineDefinitionOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .definitionId("94299034-d45f-4e9a-8ed5-6bd5c7bb7ada")
        .scmSource(definitionScmSourceModel)
        .serviceInstanceId("071d8049-d984-4feb-a2ed-2a1e938918ba")
        .id("22f92ab1-e0ac-4c65-84e7-8a4cb32dba0f")
        .build();

      Response<Definition> response = cdTektonPipelineService.replaceTektonPipelineDefinition(replaceTektonPipelineDefinitionOptions).execute();
      Definition definition = response.getResult();

      System.out.println(definition);
      // end-replace_tekton_pipeline_definition
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTektonPipelineProperties() result:");
      // begin-list_tekton_pipeline_properties
      ListTektonPipelinePropertiesOptions listTektonPipelinePropertiesOptions = new ListTektonPipelinePropertiesOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .name("prod")
        .type(new java.util.ArrayList<String>(java.util.Arrays.asList("SECURE", "TEXT")))
        .sort("name")
        .build();

      Response<EnvProperties> response = cdTektonPipelineService.listTektonPipelineProperties(listTektonPipelinePropertiesOptions).execute();
      EnvProperties envProperties = response.getResult();

      System.out.println(envProperties);
      // end-list_tekton_pipeline_properties
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTektonPipelineProperties() result:");
      // begin-create_tekton_pipeline_properties
      CreateTektonPipelinePropertiesOptions createTektonPipelinePropertiesOptions = new CreateTektonPipelinePropertiesOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .name("key1")
        .value("https://github.com/IBM/tekton-tutorial.git")
        .type("TEXT")
        .build();

      Response<Property> response = cdTektonPipelineService.createTektonPipelineProperties(createTektonPipelinePropertiesOptions).execute();
      Property property = response.getResult();

      System.out.println(property);
      // end-create_tekton_pipeline_properties
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineProperty() result:");
      // begin-get_tekton_pipeline_property
      GetTektonPipelinePropertyOptions getTektonPipelinePropertyOptions = new GetTektonPipelinePropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .propertyName("debug-pipeline")
        .build();

      Response<Property> response = cdTektonPipelineService.getTektonPipelineProperty(getTektonPipelinePropertyOptions).execute();
      Property property = response.getResult();

      System.out.println(property);
      // end-get_tekton_pipeline_property
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceTektonPipelineProperty() result:");
      // begin-replace_tekton_pipeline_property
      ReplaceTektonPipelinePropertyOptions replaceTektonPipelinePropertyOptions = new ReplaceTektonPipelinePropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .propertyName("debug-pipeline")
        .name("key1")
        .value("https://github.com/IBM/tekton-tutorial.git")
        .type("TEXT")
        .build();

      Response<Property> response = cdTektonPipelineService.replaceTektonPipelineProperty(replaceTektonPipelinePropertyOptions).execute();
      Property property = response.getResult();

      System.out.println(property);
      // end-replace_tekton_pipeline_property
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTektonPipelineTriggers() result:");
      // begin-list_tekton_pipeline_triggers
      ListTektonPipelineTriggersOptions listTektonPipelineTriggersOptions = new ListTektonPipelineTriggersOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .type("manual,scm")
        .disabled("true")
        .tags("tag1,tag2")
        .build();

      Response<Triggers> response = cdTektonPipelineService.listTektonPipelineTriggers(listTektonPipelineTriggersOptions).execute();
      Triggers triggers = response.getResult();

      System.out.println(triggers);
      // end-list_tekton_pipeline_triggers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTektonPipelineTrigger() result:");
      // begin-create_tekton_pipeline_trigger
      TriggerDuplicateTrigger triggerModel = new TriggerDuplicateTrigger.Builder()
        .sourceTriggerId("b3a8228f-1c82-409b-b249-7639166a0300")
        .name("Generic Trigger- duplicated")
        .build();
      CreateTektonPipelineTriggerOptions createTektonPipelineTriggerOptions = new CreateTektonPipelineTriggerOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .trigger(triggerModel)
        .build();

      Response<Trigger> response = cdTektonPipelineService.createTektonPipelineTrigger(createTektonPipelineTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-create_tekton_pipeline_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineTrigger() result:");
      // begin-get_tekton_pipeline_trigger
      GetTektonPipelineTriggerOptions getTektonPipelineTriggerOptions = new GetTektonPipelineTriggerOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .build();

      Response<Trigger> response = cdTektonPipelineService.getTektonPipelineTrigger(getTektonPipelineTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-get_tekton_pipeline_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateTektonPipelineTrigger() result:");
      // begin-update_tekton_pipeline_trigger
      UpdateTektonPipelineTriggerOptions updateTektonPipelineTriggerOptions = new UpdateTektonPipelineTriggerOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .name("start-deploy")
        .disabled(true)
        .build();

      Response<Trigger> response = cdTektonPipelineService.updateTektonPipelineTrigger(updateTektonPipelineTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-update_tekton_pipeline_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listTektonPipelineTriggerProperties() result:");
      // begin-list_tekton_pipeline_trigger_properties
      ListTektonPipelineTriggerPropertiesOptions listTektonPipelineTriggerPropertiesOptions = new ListTektonPipelineTriggerPropertiesOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .name("prod")
        .type("SECURE,TEXT")
        .sort("name")
        .build();

      Response<TriggerProperties> response = cdTektonPipelineService.listTektonPipelineTriggerProperties(listTektonPipelineTriggerPropertiesOptions).execute();
      TriggerProperties triggerProperties = response.getResult();

      System.out.println(triggerProperties);
      // end-list_tekton_pipeline_trigger_properties
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createTektonPipelineTriggerProperties() result:");
      // begin-create_tekton_pipeline_trigger_properties
      CreateTektonPipelineTriggerPropertiesOptions createTektonPipelineTriggerPropertiesOptions = new CreateTektonPipelineTriggerPropertiesOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .name("key1")
        .value("https://github.com/IBM/tekton-tutorial.git")
        .type("TEXT")
        .build();

      Response<TriggerProperty> response = cdTektonPipelineService.createTektonPipelineTriggerProperties(createTektonPipelineTriggerPropertiesOptions).execute();
      TriggerProperty triggerProperty = response.getResult();

      System.out.println(triggerProperty);
      // end-create_tekton_pipeline_trigger_properties
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getTektonPipelineTriggerProperty() result:");
      // begin-get_tekton_pipeline_trigger_property
      GetTektonPipelineTriggerPropertyOptions getTektonPipelineTriggerPropertyOptions = new GetTektonPipelineTriggerPropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .propertyName("debug-pipeline")
        .build();

      Response<TriggerProperty> response = cdTektonPipelineService.getTektonPipelineTriggerProperty(getTektonPipelineTriggerPropertyOptions).execute();
      TriggerProperty triggerProperty = response.getResult();

      System.out.println(triggerProperty);
      // end-get_tekton_pipeline_trigger_property
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceTektonPipelineTriggerProperty() result:");
      // begin-replace_tekton_pipeline_trigger_property
      ReplaceTektonPipelineTriggerPropertyOptions replaceTektonPipelineTriggerPropertyOptions = new ReplaceTektonPipelineTriggerPropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .propertyName("debug-pipeline")
        .name("key1")
        .value("https://github.com/IBM/tekton-tutorial.git")
        .type("TEXT")
        .build();

      Response<TriggerProperty> response = cdTektonPipelineService.replaceTektonPipelineTriggerProperty(replaceTektonPipelineTriggerPropertyOptions).execute();
      TriggerProperty triggerProperty = response.getResult();

      System.out.println(triggerProperty);
      // end-replace_tekton_pipeline_trigger_property
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline_trigger_property
      DeleteTektonPipelineTriggerPropertyOptions deleteTektonPipelineTriggerPropertyOptions = new DeleteTektonPipelineTriggerPropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .propertyName("debug-pipeline")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipelineTriggerProperty(deleteTektonPipelineTriggerPropertyOptions).execute();
      // end-delete_tekton_pipeline_trigger_property
      System.out.printf("deleteTektonPipelineTriggerProperty() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline_trigger
      DeleteTektonPipelineTriggerOptions deleteTektonPipelineTriggerOptions = new DeleteTektonPipelineTriggerOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .triggerId("1bb892a1-2e04-4768-a369-b1159eace147")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipelineTrigger(deleteTektonPipelineTriggerOptions).execute();
      // end-delete_tekton_pipeline_trigger
      System.out.printf("deleteTektonPipelineTrigger() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline_run
      DeleteTektonPipelineRunOptions deleteTektonPipelineRunOptions = new DeleteTektonPipelineRunOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipelineRun(deleteTektonPipelineRunOptions).execute();
      // end-delete_tekton_pipeline_run
      System.out.printf("deleteTektonPipelineRun() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline_property
      DeleteTektonPipelinePropertyOptions deleteTektonPipelinePropertyOptions = new DeleteTektonPipelinePropertyOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .propertyName("debug-pipeline")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipelineProperty(deleteTektonPipelinePropertyOptions).execute();
      // end-delete_tekton_pipeline_property
      System.out.printf("deleteTektonPipelineProperty() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline_definition
      DeleteTektonPipelineDefinitionOptions deleteTektonPipelineDefinitionOptions = new DeleteTektonPipelineDefinitionOptions.Builder()
        .pipelineId("94619026-912b-4d92-8f51-6c74f0692d90")
        .definitionId("94299034-d45f-4e9a-8ed5-6bd5c7bb7ada")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipelineDefinition(deleteTektonPipelineDefinitionOptions).execute();
      // end-delete_tekton_pipeline_definition
      System.out.printf("deleteTektonPipelineDefinition() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_tekton_pipeline
      DeleteTektonPipelineOptions deleteTektonPipelineOptions = new DeleteTektonPipelineOptions.Builder()
        .id("94619026-912b-4d92-8f51-6c74f0692d90")
        .build();

      Response<Void> response = cdTektonPipelineService.deleteTektonPipeline(deleteTektonPipelineOptions).execute();
      // end-delete_tekton_pipeline
      System.out.printf("deleteTektonPipeline() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
