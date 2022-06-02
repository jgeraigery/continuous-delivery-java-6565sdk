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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTektonPipelineTrigger options.
 */
public class CreateTektonPipelineTriggerOptions extends GenericModel {

  protected String pipelineId;
  protected Trigger trigger;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
    private Trigger trigger;

    private Builder(CreateTektonPipelineTriggerOptions createTektonPipelineTriggerOptions) {
      this.pipelineId = createTektonPipelineTriggerOptions.pipelineId;
      this.trigger = createTektonPipelineTriggerOptions.trigger;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pipelineId the pipelineId
     */
    public Builder(String pipelineId) {
      this.pipelineId = pipelineId;
    }

    /**
     * Builds a CreateTektonPipelineTriggerOptions.
     *
     * @return the new CreateTektonPipelineTriggerOptions instance
     */
    public CreateTektonPipelineTriggerOptions build() {
      return new CreateTektonPipelineTriggerOptions(this);
    }

    /**
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the trigger.
     *
     * @param trigger the trigger
     * @return the CreateTektonPipelineTriggerOptions builder
     */
    public Builder trigger(Trigger trigger) {
      this.trigger = trigger;
      return this;
    }
  }

  protected CreateTektonPipelineTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    pipelineId = builder.pipelineId;
    trigger = builder.trigger;
  }

  /**
   * New builder.
   *
   * @return a CreateTektonPipelineTriggerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pipelineId.
   *
   * The tekton pipeline ID.
   *
   * @return the pipelineId
   */
  public String pipelineId() {
    return pipelineId;
  }

  /**
   * Gets the trigger.
   *
   * Tekton pipeline trigger object.
   *
   * @return the trigger
   */
  public Trigger trigger() {
    return trigger;
  }
}

