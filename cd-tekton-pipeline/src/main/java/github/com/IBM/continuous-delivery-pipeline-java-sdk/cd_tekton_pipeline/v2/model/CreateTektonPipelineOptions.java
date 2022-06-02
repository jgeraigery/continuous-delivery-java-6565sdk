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
 * The createTektonPipeline options.
 */
public class CreateTektonPipelineOptions extends GenericModel {

  protected String id;
  protected WorkerWithId worker;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private WorkerWithId worker;

    private Builder(CreateTektonPipelineOptions createTektonPipelineOptions) {
      this.id = createTektonPipelineOptions.id;
      this.worker = createTektonPipelineOptions.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateTektonPipelineOptions.
     *
     * @return the new CreateTektonPipelineOptions instance
     */
    public CreateTektonPipelineOptions build() {
      return new CreateTektonPipelineOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateTektonPipelineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the CreateTektonPipelineOptions builder
     */
    public Builder worker(WorkerWithId worker) {
      this.worker = worker;
      return this;
    }
  }

  protected CreateTektonPipelineOptions(Builder builder) {
    id = builder.id;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a CreateTektonPipelineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * UUID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the worker.
   *
   * Worker object with worker ID only.
   *
   * @return the worker
   */
  public WorkerWithId worker() {
    return worker;
  }
}

