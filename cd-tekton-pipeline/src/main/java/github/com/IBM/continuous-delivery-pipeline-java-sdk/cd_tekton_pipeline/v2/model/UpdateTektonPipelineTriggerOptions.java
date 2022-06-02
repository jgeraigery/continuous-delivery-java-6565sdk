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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTektonPipelineTrigger options.
 */
public class UpdateTektonPipelineTriggerOptions extends GenericModel {

  /**
   * Trigger type.
   */
  public interface Type {
    /** manual. */
    String MANUAL = "manual";
    /** scm. */
    String SCM = "scm";
    /** timer. */
    String TIMER = "timer";
    /** generic. */
    String GENERIC = "generic";
  }

  protected String pipelineId;
  protected String triggerId;
  protected String type;
  protected String name;
  protected String eventListener;
  protected List<String> tags;
  protected Worker worker;
  protected Concurrency concurrency;
  protected Boolean disabled;
  protected GenericSecret secret;
  protected String cron;
  protected String timezone;
  protected TriggerScmSource scmSource;
  protected Events events;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
    private String triggerId;
    private String type;
    private String name;
    private String eventListener;
    private List<String> tags;
    private Worker worker;
    private Concurrency concurrency;
    private Boolean disabled;
    private GenericSecret secret;
    private String cron;
    private String timezone;
    private TriggerScmSource scmSource;
    private Events events;

    private Builder(UpdateTektonPipelineTriggerOptions updateTektonPipelineTriggerOptions) {
      this.pipelineId = updateTektonPipelineTriggerOptions.pipelineId;
      this.triggerId = updateTektonPipelineTriggerOptions.triggerId;
      this.type = updateTektonPipelineTriggerOptions.type;
      this.name = updateTektonPipelineTriggerOptions.name;
      this.eventListener = updateTektonPipelineTriggerOptions.eventListener;
      this.tags = updateTektonPipelineTriggerOptions.tags;
      this.worker = updateTektonPipelineTriggerOptions.worker;
      this.concurrency = updateTektonPipelineTriggerOptions.concurrency;
      this.disabled = updateTektonPipelineTriggerOptions.disabled;
      this.secret = updateTektonPipelineTriggerOptions.secret;
      this.cron = updateTektonPipelineTriggerOptions.cron;
      this.timezone = updateTektonPipelineTriggerOptions.timezone;
      this.scmSource = updateTektonPipelineTriggerOptions.scmSource;
      this.events = updateTektonPipelineTriggerOptions.events;
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
     * @param triggerId the triggerId
     */
    public Builder(String pipelineId, String triggerId) {
      this.pipelineId = pipelineId;
      this.triggerId = triggerId;
    }

    /**
     * Builds a UpdateTektonPipelineTriggerOptions.
     *
     * @return the new UpdateTektonPipelineTriggerOptions instance
     */
    public UpdateTektonPipelineTriggerOptions build() {
      return new UpdateTektonPipelineTriggerOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateTektonPipelineTriggerOptions builder
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
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the triggerId.
     *
     * @param triggerId the triggerId
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder triggerId(String triggerId) {
      this.triggerId = triggerId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder eventListener(String eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder worker(Worker worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the concurrency.
     *
     * @param concurrency the concurrency
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder concurrency(Concurrency concurrency) {
      this.concurrency = concurrency;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder secret(GenericSecret secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the cron.
     *
     * @param cron the cron
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder cron(String cron) {
      this.cron = cron;
      return this;
    }

    /**
     * Set the timezone.
     *
     * @param timezone the timezone
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      return this;
    }

    /**
     * Set the scmSource.
     *
     * @param scmSource the scmSource
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder scmSource(TriggerScmSource scmSource) {
      this.scmSource = scmSource;
      return this;
    }

    /**
     * Set the events.
     *
     * @param events the events
     * @return the UpdateTektonPipelineTriggerOptions builder
     */
    public Builder events(Events events) {
      this.events = events;
      return this;
    }
  }

  protected UpdateTektonPipelineTriggerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.triggerId,
      "triggerId cannot be empty");
    pipelineId = builder.pipelineId;
    triggerId = builder.triggerId;
    type = builder.type;
    name = builder.name;
    eventListener = builder.eventListener;
    tags = builder.tags;
    worker = builder.worker;
    concurrency = builder.concurrency;
    disabled = builder.disabled;
    secret = builder.secret;
    cron = builder.cron;
    timezone = builder.timezone;
    scmSource = builder.scmSource;
    events = builder.events;
  }

  /**
   * New builder.
   *
   * @return a UpdateTektonPipelineTriggerOptions builder
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
   * Gets the triggerId.
   *
   * The trigger ID.
   *
   * @return the triggerId
   */
  public String triggerId() {
    return triggerId;
  }

  /**
   * Gets the type.
   *
   * Trigger type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Trigger name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the eventListener.
   *
   * Event listener name.
   *
   * @return the eventListener
   */
  public String eventListener() {
    return eventListener;
  }

  /**
   * Gets the tags.
   *
   * Trigger tags array.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the worker.
   *
   * Trigger worker used to run the trigger, the trigger worker overrides the default pipeline worker.
   *
   * @return the worker
   */
  public Worker worker() {
    return worker;
  }

  /**
   * Gets the concurrency.
   *
   * Concurrency object.
   *
   * @return the concurrency
   */
  public Concurrency concurrency() {
    return concurrency;
  }

  /**
   * Gets the disabled.
   *
   * Defines if this trigger is disabled.
   *
   * @return the disabled
   */
  public Boolean disabled() {
    return disabled;
  }

  /**
   * Gets the secret.
   *
   * Needed only for generic trigger type. Secret used to start generic trigger.
   *
   * @return the secret
   */
  public GenericSecret secret() {
    return secret;
  }

  /**
   * Gets the cron.
   *
   * Needed only for timer trigger type. Cron expression for timer trigger.
   *
   * @return the cron
   */
  public String cron() {
    return cron;
  }

  /**
   * Gets the timezone.
   *
   * Needed only for timer trigger type. Timezones for timer trigger.
   *
   * @return the timezone
   */
  public String timezone() {
    return timezone;
  }

  /**
   * Gets the scmSource.
   *
   * Scm source for git type tekton pipeline trigger.
   *
   * @return the scmSource
   */
  public TriggerScmSource scmSource() {
    return scmSource;
  }

  /**
   * Gets the events.
   *
   * Needed only for git trigger type. Events object defines the events this git trigger listening to.
   *
   * @return the events
   */
  public Events events() {
    return events;
  }
}

