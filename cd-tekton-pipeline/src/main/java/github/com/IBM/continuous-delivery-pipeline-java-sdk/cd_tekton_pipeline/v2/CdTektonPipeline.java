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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.50.0-af9e48c4-20220523-163800
 */

package github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CancelTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineDefinitionOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelinePropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineRunOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.CreateTektonPipelineTriggerPropertiesOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Definition;
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
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerProperties;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.TriggerProperty;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.Triggers;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.UpdateTektonPipelineOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.cd_tekton_pipeline.v2.model.UpdateTektonPipelineTriggerOptions;
import github.com/IBM/continuous-delivery-pipeline-java-sdk.common.SdkCommon;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Continuous Delivery Tekton pipeline API definition &lt;br&gt;&lt;br&gt; Maximum request payload size is 512 KB
 * &lt;br&gt;&lt;br&gt; All calls require an &lt;strong&gt;Authorization&lt;/strong&gt; HTTP header.
 * &lt;br&gt;&lt;br&gt; The following header is the accepted authentication mechanism and required credentials for each
 * &lt;ul&gt;&lt;li&gt;&lt;b&gt;Bearer:&lt;/b&gt; an IBM Cloud IAM token (authorized for all endpoints)&lt;/li&gt;.
 *
 * API Version: 2.0.0
 */
public class CdTektonPipeline extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "cd_tekton_pipeline";

  public static final String DEFAULT_SERVICE_URL = "https://api.us-south.devops.cloud.ibm.com/v2";

  private static final Map<String, String> _regionalEndpoints;
  static {
    Map<String, String> m = new HashMap<>();
    m.put("us-south", "https://api.us-south.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the us-south region.
    m.put("us-east", "https://api.us-east.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the us-east region.
    m.put("eu-de", "https://api.eu-de.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the eu-de region.
    m.put("eu-gb", "https://api.eu-gb.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the eu-gb region.
    m.put("jp-osa", "https://api.jp-osa.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the jp-osa region.
    m.put("jp-tok", "https://api.jp-tok.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the jp-tok region.
    m.put("au-syd", "https://api.au-syd.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the au-syd region.
    m.put("ca-tor", "https://api.ca-tor.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the ca-tor region.
    m.put("br-sao", "https://api.br-sao.devops.cloud.ibm.com/v2"); // The host URL for Tekton Pipeline Service in the br-sao region.
    _regionalEndpoints = Collections.unmodifiableMap(m);
  }

  /**
   * Returns the service URL associated with the specified region.
   * @param region a string representing the region
   * @return the service URL associated with the specified region or null
   * if no mapping for the region exists
   */
  public static String getServiceUrlForRegion(String region) {
    return _regionalEndpoints.get(region);
  }

 /**
   * Class method which constructs an instance of the `CdTektonPipeline` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `CdTektonPipeline` client using external configuration
   */
  public static CdTektonPipeline newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `CdTektonPipeline` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `CdTektonPipeline` client using external configuration
   */
  public static CdTektonPipeline newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    CdTektonPipeline service = new CdTektonPipeline(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `CdTektonPipeline` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public CdTektonPipeline(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Create tekton pipeline.
   *
   * This request creates a tekton pipeline for a tekton pipeline toolchain integration, user has to use the toolchain
   * endpoint to create the tekton pipeline toolchain integration first and then use the generated UUID to create the
   * tekton pipeline with or without a specified worker.
   *
   * @param createTektonPipelineOptions the {@link CreateTektonPipelineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TektonPipeline}
   */
  public ServiceCall<TektonPipeline> createTektonPipeline(CreateTektonPipelineOptions createTektonPipelineOptions) {
    boolean skipBody = false;
    if (createTektonPipelineOptions == null) {
      createTektonPipelineOptions = new CreateTektonPipelineOptions.Builder().build();
      skipBody = true;
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipeline");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createTektonPipelineOptions.id() != null) {
        contentJson.addProperty("id", createTektonPipelineOptions.id());
      }
      if (createTektonPipelineOptions.worker() != null) {
        contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineOptions.worker()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<TektonPipeline> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TektonPipeline>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create tekton pipeline.
   *
   * This request creates a tekton pipeline for a tekton pipeline toolchain integration, user has to use the toolchain
   * endpoint to create the tekton pipeline toolchain integration first and then use the generated UUID to create the
   * tekton pipeline with or without a specified worker.
   *
   * @return a {@link ServiceCall} with a result of type {@link TektonPipeline}
   */
  public ServiceCall<TektonPipeline> createTektonPipeline() {
    return createTektonPipeline(null);
  }

  /**
   * Get tekton pipeline data.
   *
   * This request retrieves whole tekton pipeline data.
   *
   * @param getTektonPipelineOptions the {@link GetTektonPipelineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TektonPipeline}
   */
  public ServiceCall<TektonPipeline> getTektonPipeline(GetTektonPipelineOptions getTektonPipelineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineOptions,
      "getTektonPipelineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getTektonPipelineOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipeline");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TektonPipeline> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TektonPipeline>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update tekton pipeline data.
   *
   * This request updates tekton pipeline data, but you can only change worker ID in this endpoint. Use other endpoints
   * such as /definitions, /triggers, and /properties for detailed updated.
   *
   * @param updateTektonPipelineOptions the {@link UpdateTektonPipelineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TektonPipeline}
   */
  public ServiceCall<TektonPipeline> updateTektonPipeline(UpdateTektonPipelineOptions updateTektonPipelineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTektonPipelineOptions,
      "updateTektonPipelineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateTektonPipelineOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "updateTektonPipeline");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateTektonPipelineOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TektonPipeline> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TektonPipeline>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete tekton pipeline instance.
   *
   * This request deletes tekton pipeline instance that associated with the pipeline toolchain integration.
   *
   * @param deleteTektonPipelineOptions the {@link DeleteTektonPipelineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipeline(DeleteTektonPipelineOptions deleteTektonPipelineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelineOptions,
      "deleteTektonPipelineOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteTektonPipelineOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipeline");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pipeline run records.
   *
   * This request list pipeline run records, which has data of that run, such as status, user_info, trigger and other
   * information. Default limit is 50.
   *
   * @param listTektonPipelineRunsOptions the {@link ListTektonPipelineRunsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRuns}
   */
  public ServiceCall<PipelineRuns> listTektonPipelineRuns(ListTektonPipelineRunsOptions listTektonPipelineRunsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTektonPipelineRunsOptions,
      "listTektonPipelineRunsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", listTektonPipelineRunsOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "listTektonPipelineRuns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTektonPipelineRunsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTektonPipelineRunsOptions.limit()));
    }
    if (listTektonPipelineRunsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTektonPipelineRunsOptions.offset()));
    }
    if (listTektonPipelineRunsOptions.status() != null) {
      builder.query("status", String.valueOf(listTektonPipelineRunsOptions.status()));
    }
    if (listTektonPipelineRunsOptions.triggerName() != null) {
      builder.query("trigger.name", String.valueOf(listTektonPipelineRunsOptions.triggerName()));
    }
    ResponseConverter<PipelineRuns> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRuns>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start a trigger to create a pipelineRun.
   *
   * This request executes a trigger to create a pipelineRun.
   *
   * @param createTektonPipelineRunOptions the {@link CreateTektonPipelineRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRun}
   */
  public ServiceCall<PipelineRun> createTektonPipelineRun(CreateTektonPipelineRunOptions createTektonPipelineRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTektonPipelineRunOptions,
      "createTektonPipelineRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", createTektonPipelineRunOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipelineRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createTektonPipelineRunOptions.triggerName() != null) {
      contentJson.addProperty("trigger_name", createTektonPipelineRunOptions.triggerName());
    }
    if (createTektonPipelineRunOptions.triggerProperties() != null) {
      contentJson.add("trigger_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineRunOptions.triggerProperties()));
    }
    if (createTektonPipelineRunOptions.secureTriggerProperties() != null) {
      contentJson.add("secure_trigger_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineRunOptions.secureTriggerProperties()));
    }
    if (createTektonPipelineRunOptions.triggerHeader() != null) {
      contentJson.add("trigger_header", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineRunOptions.triggerHeader()));
    }
    if (createTektonPipelineRunOptions.triggerBody() != null) {
      contentJson.add("trigger_body", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineRunOptions.triggerBody()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PipelineRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a pipeline run record.
   *
   * This request retrieves detail of requested pipeline run, to get Kubernetes Resources List of this pipeline run use
   * endpoint /tekton_pipelines/{pipeline_id}/tekton_pipelinerun_resource_list/{id}.
   *
   * @param getTektonPipelineRunOptions the {@link GetTektonPipelineRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRun}
   */
  public ServiceCall<PipelineRun> getTektonPipelineRun(GetTektonPipelineRunOptions getTektonPipelineRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineRunOptions,
      "getTektonPipelineRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineRunOptions.pipelineId());
    pathParamsMap.put("id", getTektonPipelineRunOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTektonPipelineRunOptions.includes() != null) {
      builder.query("includes", String.valueOf(getTektonPipelineRunOptions.includes()));
    }
    ResponseConverter<PipelineRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a pipeline run record.
   *
   * This request deletes the requested pipeline run record.
   *
   * @param deleteTektonPipelineRunOptions the {@link DeleteTektonPipelineRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipelineRun(DeleteTektonPipelineRunOptions deleteTektonPipelineRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelineRunOptions,
      "deleteTektonPipelineRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", deleteTektonPipelineRunOptions.pipelineId());
    pathParamsMap.put("id", deleteTektonPipelineRunOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipelineRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Cancel a pipeline run.
   *
   * This request cancels a running pipeline run, use 'force' payload in case you can't cancel a pipeline run normally.
   *
   * @param cancelTektonPipelineRunOptions the {@link CancelTektonPipelineRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRun}
   */
  public ServiceCall<PipelineRun> cancelTektonPipelineRun(CancelTektonPipelineRunOptions cancelTektonPipelineRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(cancelTektonPipelineRunOptions,
      "cancelTektonPipelineRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", cancelTektonPipelineRunOptions.pipelineId());
    pathParamsMap.put("id", cancelTektonPipelineRunOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{id}/cancel", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "cancelTektonPipelineRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (cancelTektonPipelineRunOptions.force() != null) {
      contentJson.addProperty("force", cancelTektonPipelineRunOptions.force());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PipelineRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rerun a pipeline run.
   *
   * This request reruns a past pipeline run with same data. Request body isn't allowed.
   *
   * @param rerunTektonPipelineRunOptions the {@link RerunTektonPipelineRunOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRun}
   */
  public ServiceCall<PipelineRun> rerunTektonPipelineRun(RerunTektonPipelineRunOptions rerunTektonPipelineRunOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(rerunTektonPipelineRunOptions,
      "rerunTektonPipelineRunOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", rerunTektonPipelineRunOptions.pipelineId());
    pathParamsMap.put("id", rerunTektonPipelineRunOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{id}/rerun", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "rerunTektonPipelineRun");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PipelineRun> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRun>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a list of pipeline run log IDs.
   *
   * This request fetches list of log IDs of a pipeline run.
   *
   * @param getTektonPipelineRunLogsOptions the {@link GetTektonPipelineRunLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PipelineRunLogs}
   */
  public ServiceCall<PipelineRunLogs> getTektonPipelineRunLogs(GetTektonPipelineRunLogsOptions getTektonPipelineRunLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineRunLogsOptions,
      "getTektonPipelineRunLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineRunLogsOptions.pipelineId());
    pathParamsMap.put("id", getTektonPipelineRunLogsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineRunLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PipelineRunLogs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PipelineRunLogs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the log content of a pipeline run step by using the step log ID.
   *
   * This request retrieves log content of a pipeline run step, to get the log ID use endpoint
   * /tekton_pipelines/{pipeline_id}/pipeline_runs/{id}/logs.
   *
   * @param getTektonPipelineRunLogContentOptions the {@link GetTektonPipelineRunLogContentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StepLog}
   */
  public ServiceCall<StepLog> getTektonPipelineRunLogContent(GetTektonPipelineRunLogContentOptions getTektonPipelineRunLogContentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineRunLogContentOptions,
      "getTektonPipelineRunLogContentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineRunLogContentOptions.pipelineId());
    pathParamsMap.put("pipeline_run_id", getTektonPipelineRunLogContentOptions.pipelineRunId());
    pathParamsMap.put("id", getTektonPipelineRunLogContentOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/pipeline_runs/{pipeline_run_id}/logs/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineRunLogContent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<StepLog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StepLog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pipeline definitions.
   *
   * This request fetches pipeline definitions, which is the a collection of individual definition entries, each entry
   * is a composition of a repo url, a repo branch and a repo path.
   *
   * @param listTektonPipelineDefinitionsOptions the {@link ListTektonPipelineDefinitionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Definitions}
   */
  public ServiceCall<Definitions> listTektonPipelineDefinitions(ListTektonPipelineDefinitionsOptions listTektonPipelineDefinitionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTektonPipelineDefinitionsOptions,
      "listTektonPipelineDefinitionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", listTektonPipelineDefinitionsOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/definitions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "listTektonPipelineDefinitions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Definitions> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Definitions>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a single definition.
   *
   * This request adds a single definition.
   *
   * @param createTektonPipelineDefinitionOptions the {@link CreateTektonPipelineDefinitionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Definition}
   */
  public ServiceCall<Definition> createTektonPipelineDefinition(CreateTektonPipelineDefinitionOptions createTektonPipelineDefinitionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTektonPipelineDefinitionOptions,
      "createTektonPipelineDefinitionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", createTektonPipelineDefinitionOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/definitions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipelineDefinition");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createTektonPipelineDefinitionOptions.scmSource() != null) {
      contentJson.add("scm_source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineDefinitionOptions.scmSource()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Definition> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Definition>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a single definition entry.
   *
   * This request fetches a single definition entry, which is a composition of the definition repo's url, branch and
   * directory path.
   *
   * @param getTektonPipelineDefinitionOptions the {@link GetTektonPipelineDefinitionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Definition}
   */
  public ServiceCall<Definition> getTektonPipelineDefinition(GetTektonPipelineDefinitionOptions getTektonPipelineDefinitionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineDefinitionOptions,
      "getTektonPipelineDefinitionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineDefinitionOptions.pipelineId());
    pathParamsMap.put("definition_id", getTektonPipelineDefinitionOptions.definitionId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/definitions/{definition_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineDefinition");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Definition> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Definition>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit a single definition entry.
   *
   * This request replaces a single definition's repo directory path or repo branch. Its scm_source.url and
   * service_instance_id are immutable.
   *
   * @param replaceTektonPipelineDefinitionOptions the {@link ReplaceTektonPipelineDefinitionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Definition}
   */
  public ServiceCall<Definition> replaceTektonPipelineDefinition(ReplaceTektonPipelineDefinitionOptions replaceTektonPipelineDefinitionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTektonPipelineDefinitionOptions,
      "replaceTektonPipelineDefinitionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", replaceTektonPipelineDefinitionOptions.pipelineId());
    pathParamsMap.put("definition_id", replaceTektonPipelineDefinitionOptions.definitionId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/definitions/{definition_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "replaceTektonPipelineDefinition");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceTektonPipelineDefinitionOptions.scmSource() != null) {
      contentJson.add("scm_source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTektonPipelineDefinitionOptions.scmSource()));
    }
    if (replaceTektonPipelineDefinitionOptions.serviceInstanceId() != null) {
      contentJson.addProperty("service_instance_id", replaceTektonPipelineDefinitionOptions.serviceInstanceId());
    }
    if (replaceTektonPipelineDefinitionOptions.id() != null) {
      contentJson.addProperty("id", replaceTektonPipelineDefinitionOptions.id());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Definition> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Definition>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a single definition entry.
   *
   * This request deletes a single definition from definition list.
   *
   * @param deleteTektonPipelineDefinitionOptions the {@link DeleteTektonPipelineDefinitionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipelineDefinition(DeleteTektonPipelineDefinitionOptions deleteTektonPipelineDefinitionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelineDefinitionOptions,
      "deleteTektonPipelineDefinitionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", deleteTektonPipelineDefinitionOptions.pipelineId());
    pathParamsMap.put("definition_id", deleteTektonPipelineDefinitionOptions.definitionId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/definitions/{definition_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipelineDefinition");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pipeline environment properties.
   *
   * This request lists the pipeline environment properties which every pipelineRun execution has access to.
   *
   * @param listTektonPipelinePropertiesOptions the {@link ListTektonPipelinePropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnvProperties}
   */
  public ServiceCall<EnvProperties> listTektonPipelineProperties(ListTektonPipelinePropertiesOptions listTektonPipelinePropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTektonPipelinePropertiesOptions,
      "listTektonPipelinePropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", listTektonPipelinePropertiesOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "listTektonPipelineProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTektonPipelinePropertiesOptions.name() != null) {
      builder.query("name", String.valueOf(listTektonPipelinePropertiesOptions.name()));
    }
    if (listTektonPipelinePropertiesOptions.type() != null) {
      builder.query("type", RequestUtils.join(listTektonPipelinePropertiesOptions.type(), ","));
    }
    if (listTektonPipelinePropertiesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listTektonPipelinePropertiesOptions.sort()));
    }
    ResponseConverter<EnvProperties> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnvProperties>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create pipeline environment property.
   *
   * This request creates a single pipeline environment property.
   *
   * @param createTektonPipelinePropertiesOptions the {@link CreateTektonPipelinePropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Property}
   */
  public ServiceCall<Property> createTektonPipelineProperties(CreateTektonPipelinePropertiesOptions createTektonPipelinePropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTektonPipelinePropertiesOptions,
      "createTektonPipelinePropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", createTektonPipelinePropertiesOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipelineProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createTektonPipelinePropertiesOptions.name() != null) {
      contentJson.addProperty("name", createTektonPipelinePropertiesOptions.name());
    }
    if (createTektonPipelinePropertiesOptions.value() != null) {
      contentJson.addProperty("value", createTektonPipelinePropertiesOptions.value());
    }
    if (createTektonPipelinePropertiesOptions.xEnum() != null) {
      contentJson.add("enum", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelinePropertiesOptions.xEnum()));
    }
    if (createTektonPipelinePropertiesOptions.xDefault() != null) {
      contentJson.addProperty("default", createTektonPipelinePropertiesOptions.xDefault());
    }
    if (createTektonPipelinePropertiesOptions.type() != null) {
      contentJson.addProperty("type", createTektonPipelinePropertiesOptions.type());
    }
    if (createTektonPipelinePropertiesOptions.path() != null) {
      contentJson.addProperty("path", createTektonPipelinePropertiesOptions.path());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Property> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Property>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a single pipeline environment property.
   *
   * This request gets a single pipeline environment property data.
   *
   * @param getTektonPipelinePropertyOptions the {@link GetTektonPipelinePropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Property}
   */
  public ServiceCall<Property> getTektonPipelineProperty(GetTektonPipelinePropertyOptions getTektonPipelinePropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelinePropertyOptions,
      "getTektonPipelinePropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelinePropertyOptions.pipelineId());
    pathParamsMap.put("property_name", getTektonPipelinePropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Property> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Property>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace a single pipeline environment property value.
   *
   * This request updates a single pipeline environment property value, its type or name are immutable. For any property
   * type, the entered value replaces the existing value.
   *
   * @param replaceTektonPipelinePropertyOptions the {@link ReplaceTektonPipelinePropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Property}
   */
  public ServiceCall<Property> replaceTektonPipelineProperty(ReplaceTektonPipelinePropertyOptions replaceTektonPipelinePropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTektonPipelinePropertyOptions,
      "replaceTektonPipelinePropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", replaceTektonPipelinePropertyOptions.pipelineId());
    pathParamsMap.put("property_name", replaceTektonPipelinePropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "replaceTektonPipelineProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceTektonPipelinePropertyOptions.name() != null) {
      contentJson.addProperty("name", replaceTektonPipelinePropertyOptions.name());
    }
    if (replaceTektonPipelinePropertyOptions.value() != null) {
      contentJson.addProperty("value", replaceTektonPipelinePropertyOptions.value());
    }
    if (replaceTektonPipelinePropertyOptions.xEnum() != null) {
      contentJson.add("enum", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTektonPipelinePropertyOptions.xEnum()));
    }
    if (replaceTektonPipelinePropertyOptions.xDefault() != null) {
      contentJson.addProperty("default", replaceTektonPipelinePropertyOptions.xDefault());
    }
    if (replaceTektonPipelinePropertyOptions.type() != null) {
      contentJson.addProperty("type", replaceTektonPipelinePropertyOptions.type());
    }
    if (replaceTektonPipelinePropertyOptions.path() != null) {
      contentJson.addProperty("path", replaceTektonPipelinePropertyOptions.path());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Property> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Property>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a single pipeline environment property.
   *
   * This request deletes a single pipeline environment property.
   *
   * @param deleteTektonPipelinePropertyOptions the {@link DeleteTektonPipelinePropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipelineProperty(DeleteTektonPipelinePropertyOptions deleteTektonPipelinePropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelinePropertyOptions,
      "deleteTektonPipelinePropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", deleteTektonPipelinePropertyOptions.pipelineId());
    pathParamsMap.put("property_name", deleteTektonPipelinePropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipelineProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pipeline triggers.
   *
   * This request lists pipeline triggers.
   *
   * @param listTektonPipelineTriggersOptions the {@link ListTektonPipelineTriggersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Triggers}
   */
  public ServiceCall<Triggers> listTektonPipelineTriggers(ListTektonPipelineTriggersOptions listTektonPipelineTriggersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTektonPipelineTriggersOptions,
      "listTektonPipelineTriggersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", listTektonPipelineTriggersOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "listTektonPipelineTriggers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTektonPipelineTriggersOptions.type() != null) {
      builder.query("type", String.valueOf(listTektonPipelineTriggersOptions.type()));
    }
    if (listTektonPipelineTriggersOptions.name() != null) {
      builder.query("name", String.valueOf(listTektonPipelineTriggersOptions.name()));
    }
    if (listTektonPipelineTriggersOptions.eventListener() != null) {
      builder.query("event_listener", String.valueOf(listTektonPipelineTriggersOptions.eventListener()));
    }
    if (listTektonPipelineTriggersOptions.workerId() != null) {
      builder.query("worker.id", String.valueOf(listTektonPipelineTriggersOptions.workerId()));
    }
    if (listTektonPipelineTriggersOptions.workerName() != null) {
      builder.query("worker.name", String.valueOf(listTektonPipelineTriggersOptions.workerName()));
    }
    if (listTektonPipelineTriggersOptions.disabled() != null) {
      builder.query("disabled", String.valueOf(listTektonPipelineTriggersOptions.disabled()));
    }
    if (listTektonPipelineTriggersOptions.tags() != null) {
      builder.query("tags", String.valueOf(listTektonPipelineTriggersOptions.tags()));
    }
    ResponseConverter<Triggers> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Triggers>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a trigger or duplicate a trigger.
   *
   * This request creates a trigger or duplicate a trigger from an existing trigger.
   *
   * @param createTektonPipelineTriggerOptions the {@link CreateTektonPipelineTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> createTektonPipelineTrigger(CreateTektonPipelineTriggerOptions createTektonPipelineTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTektonPipelineTriggerOptions,
      "createTektonPipelineTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", createTektonPipelineTriggerOptions.pipelineId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipelineTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createTektonPipelineTriggerOptions.trigger() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createTektonPipelineTriggerOptions.trigger()), "application/json");
    }
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a single trigger.
   *
   * This request retrieves a single trigger detail.
   *
   * @param getTektonPipelineTriggerOptions the {@link GetTektonPipelineTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> getTektonPipelineTrigger(GetTektonPipelineTriggerOptions getTektonPipelineTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineTriggerOptions,
      "getTektonPipelineTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineTriggerOptions.pipelineId());
    pathParamsMap.put("trigger_id", getTektonPipelineTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit a single trigger entry.
   *
   * This request changes a single field or many fields of a trigger, note that some fields are immutable, and use
   * /properties to update trigger properties.
   *
   * @param updateTektonPipelineTriggerOptions the {@link UpdateTektonPipelineTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> updateTektonPipelineTrigger(UpdateTektonPipelineTriggerOptions updateTektonPipelineTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTektonPipelineTriggerOptions,
      "updateTektonPipelineTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", updateTektonPipelineTriggerOptions.pipelineId());
    pathParamsMap.put("trigger_id", updateTektonPipelineTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "updateTektonPipelineTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateTektonPipelineTriggerOptions.type() != null) {
      contentJson.addProperty("type", updateTektonPipelineTriggerOptions.type());
    }
    if (updateTektonPipelineTriggerOptions.name() != null) {
      contentJson.addProperty("name", updateTektonPipelineTriggerOptions.name());
    }
    if (updateTektonPipelineTriggerOptions.eventListener() != null) {
      contentJson.addProperty("event_listener", updateTektonPipelineTriggerOptions.eventListener());
    }
    if (updateTektonPipelineTriggerOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.tags()));
    }
    if (updateTektonPipelineTriggerOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.worker()));
    }
    if (updateTektonPipelineTriggerOptions.concurrency() != null) {
      contentJson.add("concurrency", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.concurrency()));
    }
    if (updateTektonPipelineTriggerOptions.disabled() != null) {
      contentJson.addProperty("disabled", updateTektonPipelineTriggerOptions.disabled());
    }
    if (updateTektonPipelineTriggerOptions.secret() != null) {
      contentJson.add("secret", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.secret()));
    }
    if (updateTektonPipelineTriggerOptions.cron() != null) {
      contentJson.addProperty("cron", updateTektonPipelineTriggerOptions.cron());
    }
    if (updateTektonPipelineTriggerOptions.timezone() != null) {
      contentJson.addProperty("timezone", updateTektonPipelineTriggerOptions.timezone());
    }
    if (updateTektonPipelineTriggerOptions.scmSource() != null) {
      contentJson.add("scm_source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.scmSource()));
    }
    if (updateTektonPipelineTriggerOptions.events() != null) {
      contentJson.add("events", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTektonPipelineTriggerOptions.events()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a single trigger.
   *
   * This request deletes a single trigger.
   *
   * @param deleteTektonPipelineTriggerOptions the {@link DeleteTektonPipelineTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipelineTrigger(DeleteTektonPipelineTriggerOptions deleteTektonPipelineTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelineTriggerOptions,
      "deleteTektonPipelineTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", deleteTektonPipelineTriggerOptions.pipelineId());
    pathParamsMap.put("trigger_id", deleteTektonPipelineTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipelineTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List trigger environment properties.
   *
   * This request lists trigger environment properties.
   *
   * @param listTektonPipelineTriggerPropertiesOptions the {@link ListTektonPipelineTriggerPropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TriggerProperties}
   */
  public ServiceCall<TriggerProperties> listTektonPipelineTriggerProperties(ListTektonPipelineTriggerPropertiesOptions listTektonPipelineTriggerPropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTektonPipelineTriggerPropertiesOptions,
      "listTektonPipelineTriggerPropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", listTektonPipelineTriggerPropertiesOptions.pipelineId());
    pathParamsMap.put("trigger_id", listTektonPipelineTriggerPropertiesOptions.triggerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}/properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "listTektonPipelineTriggerProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("name", String.valueOf(listTektonPipelineTriggerPropertiesOptions.name()));
    builder.query("type", String.valueOf(listTektonPipelineTriggerPropertiesOptions.type()));
    builder.query("sort", String.valueOf(listTektonPipelineTriggerPropertiesOptions.sort()));
    ResponseConverter<TriggerProperties> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TriggerProperties>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create trigger's environment property.
   *
   * This request creates a trigger's property.
   *
   * @param createTektonPipelineTriggerPropertiesOptions the {@link CreateTektonPipelineTriggerPropertiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TriggerProperty}
   */
  public ServiceCall<TriggerProperty> createTektonPipelineTriggerProperties(CreateTektonPipelineTriggerPropertiesOptions createTektonPipelineTriggerPropertiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTektonPipelineTriggerPropertiesOptions,
      "createTektonPipelineTriggerPropertiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", createTektonPipelineTriggerPropertiesOptions.pipelineId());
    pathParamsMap.put("trigger_id", createTektonPipelineTriggerPropertiesOptions.triggerId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}/properties", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "createTektonPipelineTriggerProperties");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createTektonPipelineTriggerPropertiesOptions.name() != null) {
      contentJson.addProperty("name", createTektonPipelineTriggerPropertiesOptions.name());
    }
    if (createTektonPipelineTriggerPropertiesOptions.value() != null) {
      contentJson.addProperty("value", createTektonPipelineTriggerPropertiesOptions.value());
    }
    if (createTektonPipelineTriggerPropertiesOptions.xEnum() != null) {
      contentJson.add("enum", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTektonPipelineTriggerPropertiesOptions.xEnum()));
    }
    if (createTektonPipelineTriggerPropertiesOptions.xDefault() != null) {
      contentJson.addProperty("default", createTektonPipelineTriggerPropertiesOptions.xDefault());
    }
    if (createTektonPipelineTriggerPropertiesOptions.type() != null) {
      contentJson.addProperty("type", createTektonPipelineTriggerPropertiesOptions.type());
    }
    if (createTektonPipelineTriggerPropertiesOptions.path() != null) {
      contentJson.addProperty("path", createTektonPipelineTriggerPropertiesOptions.path());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TriggerProperty> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TriggerProperty>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a trigger's environment property.
   *
   * This request retrieves a trigger's environment property.
   *
   * @param getTektonPipelineTriggerPropertyOptions the {@link GetTektonPipelineTriggerPropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TriggerProperty}
   */
  public ServiceCall<TriggerProperty> getTektonPipelineTriggerProperty(GetTektonPipelineTriggerPropertyOptions getTektonPipelineTriggerPropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTektonPipelineTriggerPropertyOptions,
      "getTektonPipelineTriggerPropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", getTektonPipelineTriggerPropertyOptions.pipelineId());
    pathParamsMap.put("trigger_id", getTektonPipelineTriggerPropertyOptions.triggerId());
    pathParamsMap.put("property_name", getTektonPipelineTriggerPropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "getTektonPipelineTriggerProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TriggerProperty> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TriggerProperty>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace a trigger's environment property value.
   *
   * This request updates a trigger's environment property value, its type or name are immutable. For any property type,
   * the entered value replaces the existing value.
   *
   * @param replaceTektonPipelineTriggerPropertyOptions the {@link ReplaceTektonPipelineTriggerPropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TriggerProperty}
   */
  public ServiceCall<TriggerProperty> replaceTektonPipelineTriggerProperty(ReplaceTektonPipelineTriggerPropertyOptions replaceTektonPipelineTriggerPropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTektonPipelineTriggerPropertyOptions,
      "replaceTektonPipelineTriggerPropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", replaceTektonPipelineTriggerPropertyOptions.pipelineId());
    pathParamsMap.put("trigger_id", replaceTektonPipelineTriggerPropertyOptions.triggerId());
    pathParamsMap.put("property_name", replaceTektonPipelineTriggerPropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "replaceTektonPipelineTriggerProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceTektonPipelineTriggerPropertyOptions.name() != null) {
      contentJson.addProperty("name", replaceTektonPipelineTriggerPropertyOptions.name());
    }
    if (replaceTektonPipelineTriggerPropertyOptions.value() != null) {
      contentJson.addProperty("value", replaceTektonPipelineTriggerPropertyOptions.value());
    }
    if (replaceTektonPipelineTriggerPropertyOptions.xEnum() != null) {
      contentJson.add("enum", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTektonPipelineTriggerPropertyOptions.xEnum()));
    }
    if (replaceTektonPipelineTriggerPropertyOptions.xDefault() != null) {
      contentJson.addProperty("default", replaceTektonPipelineTriggerPropertyOptions.xDefault());
    }
    if (replaceTektonPipelineTriggerPropertyOptions.type() != null) {
      contentJson.addProperty("type", replaceTektonPipelineTriggerPropertyOptions.type());
    }
    if (replaceTektonPipelineTriggerPropertyOptions.path() != null) {
      contentJson.addProperty("path", replaceTektonPipelineTriggerPropertyOptions.path());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TriggerProperty> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TriggerProperty>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a trigger's property.
   *
   * this request deletes a trigger's property.
   *
   * @param deleteTektonPipelineTriggerPropertyOptions the {@link DeleteTektonPipelineTriggerPropertyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTektonPipelineTriggerProperty(DeleteTektonPipelineTriggerPropertyOptions deleteTektonPipelineTriggerPropertyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTektonPipelineTriggerPropertyOptions,
      "deleteTektonPipelineTriggerPropertyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("pipeline_id", deleteTektonPipelineTriggerPropertyOptions.pipelineId());
    pathParamsMap.put("trigger_id", deleteTektonPipelineTriggerPropertyOptions.triggerId());
    pathParamsMap.put("property_name", deleteTektonPipelineTriggerPropertyOptions.propertyName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tekton_pipelines/{pipeline_id}/triggers/{trigger_id}/properties/{property_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cd_tekton_pipeline", "v2", "deleteTektonPipelineTriggerProperty");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
