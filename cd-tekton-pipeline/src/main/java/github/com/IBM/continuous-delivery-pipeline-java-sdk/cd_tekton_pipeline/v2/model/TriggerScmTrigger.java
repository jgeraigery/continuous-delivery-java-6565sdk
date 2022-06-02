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

import java.util.ArrayList;
import java.util.List;

/**
 * Git type trigger, which automatically triggers pipelineRun when tekton pipeline service receive a valid corresponding
 * git event.
 */
public class TriggerScmTrigger extends Trigger {


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private String eventListener;
    private String id;
    private List<TriggerScmTriggerPropertiesItem> xProperties;
    private List<String> tags;
    private Worker worker;
    private Concurrency concurrency;
    private Boolean disabled;
    private TriggerScmSource scmSource;
    private Events events;
    private String serviceInstanceId;

    public Builder(Trigger triggerScmTrigger) {
      this.type = triggerScmTrigger.type;
      this.name = triggerScmTrigger.name;
      this.eventListener = triggerScmTrigger.eventListener;
      this.id = triggerScmTrigger.id;
      this.xProperties = triggerScmTrigger.xProperties;
      this.tags = triggerScmTrigger.tags;
      this.worker = triggerScmTrigger.worker;
      this.concurrency = triggerScmTrigger.concurrency;
      this.disabled = triggerScmTrigger.disabled;
      this.scmSource = triggerScmTrigger.scmSource;
      this.events = triggerScmTrigger.events;
      this.serviceInstanceId = triggerScmTrigger.serviceInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param name the name
     * @param eventListener the eventListener
     * @param disabled the disabled
     */
    public Builder(String type, String name, String eventListener, Boolean disabled) {
      this.type = type;
      this.name = name;
      this.eventListener = eventListener;
      this.disabled = disabled;
    }

    /**
     * Builds a TriggerScmTrigger.
     *
     * @return the new TriggerScmTrigger instance
     */
    public TriggerScmTrigger build() {
      return new TriggerScmTrigger(this);
    }

    /**
     * Adds an xProperties to xProperties.
     *
     * @param xProperties the new xProperties
     * @return the TriggerScmTrigger builder
     */
    public Builder addXProperties(TriggerScmTriggerPropertiesItem xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<TriggerScmTriggerPropertiesItem>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the TriggerScmTrigger builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TriggerScmTrigger builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TriggerScmTrigger builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the TriggerScmTrigger builder
     */
    public Builder eventListener(String eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the TriggerScmTrigger builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the xProperties.
     * Existing xProperties will be replaced.
     *
     * @param xProperties the xProperties
     * @return the TriggerScmTrigger builder
     */
    public Builder xProperties(List<TriggerScmTriggerPropertiesItem> xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the TriggerScmTrigger builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the TriggerScmTrigger builder
     */
    public Builder worker(Worker worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the concurrency.
     *
     * @param concurrency the concurrency
     * @return the TriggerScmTrigger builder
     */
    public Builder concurrency(Concurrency concurrency) {
      this.concurrency = concurrency;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the TriggerScmTrigger builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Set the scmSource.
     *
     * @param scmSource the scmSource
     * @return the TriggerScmTrigger builder
     */
    public Builder scmSource(TriggerScmSource scmSource) {
      this.scmSource = scmSource;
      return this;
    }

    /**
     * Set the events.
     *
     * @param events the events
     * @return the TriggerScmTrigger builder
     */
    public Builder events(Events events) {
      this.events = events;
      return this;
    }

    /**
     * Set the serviceInstanceId.
     *
     * @param serviceInstanceId the serviceInstanceId
     * @return the TriggerScmTrigger builder
     */
    public Builder serviceInstanceId(String serviceInstanceId) {
      this.serviceInstanceId = serviceInstanceId;
      return this;
    }
  }

  protected TriggerScmTrigger(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventListener,
      "eventListener cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.disabled,
      "disabled cannot be null");
    type = builder.type;
    name = builder.name;
    eventListener = builder.eventListener;
    id = builder.id;
    xProperties = builder.xProperties;
    tags = builder.tags;
    worker = builder.worker;
    concurrency = builder.concurrency;
    disabled = builder.disabled;
    scmSource = builder.scmSource;
    events = builder.events;
    serviceInstanceId = builder.serviceInstanceId;
  }

  /**
   * New builder.
   *
   * @return a TriggerScmTrigger builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

