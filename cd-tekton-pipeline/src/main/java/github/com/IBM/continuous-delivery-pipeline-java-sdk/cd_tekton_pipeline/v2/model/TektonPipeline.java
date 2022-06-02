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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tekton pipeline object.
 */
public class TektonPipeline extends GenericModel {

  /**
   * Pipeline status.
   */
  public interface Status {
    /** configured. */
    String CONFIGURED = "configured";
    /** configuring. */
    String CONFIGURING = "configuring";
  }

  protected String name;
  protected String status;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;
  protected Toolchain toolchain;
  protected String id;
  protected List<Definition> definitions;
  @SerializedName("properties")
  protected List<Property> xProperties;
  @SerializedName("updated_at")
  protected Date updatedAt;
  protected Date created;
  @SerializedName("pipeline_definition")
  protected TektonPipelinePipelineDefinition pipelineDefinition;
  protected List<Trigger> triggers;
  protected Worker worker;
  @SerializedName("html_url")
  protected String htmlUrl;
  @SerializedName("build_number")
  protected Long buildNumber;
  protected Boolean enabled;

  /**
   * Gets the name.
   *
   * String.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the status.
   *
   * Pipeline status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the resourceGroupId.
   *
   * ID.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the toolchain.
   *
   * Toolchain object.
   *
   * @return the toolchain
   */
  public Toolchain getToolchain() {
    return toolchain;
  }

  /**
   * Gets the id.
   *
   * UUID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the definitions.
   *
   * Definition list.
   *
   * @return the definitions
   */
  public List<Definition> getDefinitions() {
    return definitions;
  }

  /**
   * Gets the xProperties.
   *
   * Tekton pipeline's environment properties.
   *
   * @return the xProperties
   */
  public List<Property> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the updatedAt.
   *
   * Standard RFC 3339 Date Time String.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the created.
   *
   * Standard RFC 3339 Date Time String.
   *
   * @return the created
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Gets the pipelineDefinition.
   *
   * Tekton pipeline definition document detail object. If this property is absent, the pipeline has no definitions
   * added.
   *
   * @return the pipelineDefinition
   */
  public TektonPipelinePipelineDefinition getPipelineDefinition() {
    return pipelineDefinition;
  }

  /**
   * Gets the triggers.
   *
   * Tekton pipeline triggers list.
   *
   * @return the triggers
   */
  public List<Trigger> getTriggers() {
    return triggers;
  }

  /**
   * Gets the worker.
   *
   * Default pipeline worker used to run the pipeline.
   *
   * @return the worker
   */
  public Worker getWorker() {
    return worker;
  }

  /**
   * Gets the htmlUrl.
   *
   * Dashboard URL of this pipeline.
   *
   * @return the htmlUrl
   */
  public String getHtmlUrl() {
    return htmlUrl;
  }

  /**
   * Gets the buildNumber.
   *
   * The latest pipeline run build number. If this property is absent, the pipeline hasn't had any pipelineRuns.
   *
   * @return the buildNumber
   */
  public Long getBuildNumber() {
    return buildNumber;
  }

  /**
   * Gets the enabled.
   *
   * Flag whether this pipeline enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }
}

