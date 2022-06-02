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
 * Manual trigger.
 */
public class TriggerManualTrigger extends Trigger {


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private String eventListener;
    private String id;
    private List<TriggerManualTriggerPropertiesItem> xProperties;
    private List<String> tags;
    private Worker worker;
    private Concurrency concurrency;
    private Boolean disabled;

    public Builder(Trigger triggerManualTrigger) {
      this.type = triggerManualTrigger.type;
      this.name = triggerManualTrigger.name;
      this.eventListener = triggerManualTrigger.eventListener;
      this.id = triggerManualTrigger.id;
      this.xProperties = triggerManualTrigger.xProperties;
      this.tags = triggerManualTrigger.tags;
      this.worker = triggerManualTrigger.worker;
      this.concurrency = triggerManualTrigger.concurrency;
      this.disabled = triggerManualTrigger.disabled;
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
     * Builds a TriggerManualTrigger.
     *
     * @return the new TriggerManualTrigger instance
     */
    public TriggerManualTrigger build() {
      return new TriggerManualTrigger(this);
    }

    /**
     * Adds an xProperties to xProperties.
     *
     * @param xProperties the new xProperties
     * @return the TriggerManualTrigger builder
     */
    public Builder addXProperties(TriggerManualTriggerPropertiesItem xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<TriggerManualTriggerPropertiesItem>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the TriggerManualTrigger builder
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
     * @return the TriggerManualTrigger builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TriggerManualTrigger builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the TriggerManualTrigger builder
     */
    public Builder eventListener(String eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the TriggerManualTrigger builder
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
     * @return the TriggerManualTrigger builder
     */
    public Builder xProperties(List<TriggerManualTriggerPropertiesItem> xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the TriggerManualTrigger builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the TriggerManualTrigger builder
     */
    public Builder worker(Worker worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the concurrency.
     *
     * @param concurrency the concurrency
     * @return the TriggerManualTrigger builder
     */
    public Builder concurrency(Concurrency concurrency) {
      this.concurrency = concurrency;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the TriggerManualTrigger builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }
  }

  protected TriggerManualTrigger(Builder builder) {
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
  }

  /**
   * New builder.
   *
   * @return a TriggerManualTrigger builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

