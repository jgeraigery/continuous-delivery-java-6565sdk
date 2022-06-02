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
 * The replaceTektonPipelineTriggerProperty options.
 */
public class ReplaceTektonPipelineTriggerPropertyOptions extends GenericModel {

  /**
   * Property type.
   */
  public interface Type {
    /** SECURE. */
    String SECURE = "SECURE";
    /** TEXT. */
    String TEXT = "TEXT";
    /** INTEGRATION. */
    String INTEGRATION = "INTEGRATION";
    /** SINGLE_SELECT. */
    String SINGLE_SELECT = "SINGLE_SELECT";
    /** APPCONFIG. */
    String APPCONFIG = "APPCONFIG";
  }

  protected String pipelineId;
  protected String triggerId;
  protected String propertyName;
  protected String name;
  protected String value;
  protected List<String> xEnum;
  protected String xDefault;
  protected String type;
  protected String path;

  /**
   * Builder.
   */
  public static class Builder {
    private String pipelineId;
    private String triggerId;
    private String propertyName;
    private String name;
    private String value;
    private List<String> xEnum;
    private String xDefault;
    private String type;
    private String path;

    private Builder(ReplaceTektonPipelineTriggerPropertyOptions replaceTektonPipelineTriggerPropertyOptions) {
      this.pipelineId = replaceTektonPipelineTriggerPropertyOptions.pipelineId;
      this.triggerId = replaceTektonPipelineTriggerPropertyOptions.triggerId;
      this.propertyName = replaceTektonPipelineTriggerPropertyOptions.propertyName;
      this.name = replaceTektonPipelineTriggerPropertyOptions.name;
      this.value = replaceTektonPipelineTriggerPropertyOptions.value;
      this.xEnum = replaceTektonPipelineTriggerPropertyOptions.xEnum;
      this.xDefault = replaceTektonPipelineTriggerPropertyOptions.xDefault;
      this.type = replaceTektonPipelineTriggerPropertyOptions.type;
      this.path = replaceTektonPipelineTriggerPropertyOptions.path;
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
     * @param propertyName the propertyName
     */
    public Builder(String pipelineId, String triggerId, String propertyName) {
      this.pipelineId = pipelineId;
      this.triggerId = triggerId;
      this.propertyName = propertyName;
    }

    /**
     * Builds a ReplaceTektonPipelineTriggerPropertyOptions.
     *
     * @return the new ReplaceTektonPipelineTriggerPropertyOptions instance
     */
    public ReplaceTektonPipelineTriggerPropertyOptions build() {
      return new ReplaceTektonPipelineTriggerPropertyOptions(this);
    }

    /**
     * Adds an xEnum to xEnum.
     *
     * @param xEnum the new xEnum
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder addXEnum(String xEnum) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xEnum,
        "xEnum cannot be null");
      if (this.xEnum == null) {
        this.xEnum = new ArrayList<String>();
      }
      this.xEnum.add(xEnum);
      return this;
    }

    /**
     * Set the pipelineId.
     *
     * @param pipelineId the pipelineId
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder pipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
      return this;
    }

    /**
     * Set the triggerId.
     *
     * @param triggerId the triggerId
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder triggerId(String triggerId) {
      this.triggerId = triggerId;
      return this;
    }

    /**
     * Set the propertyName.
     *
     * @param propertyName the propertyName
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder propertyName(String propertyName) {
      this.propertyName = propertyName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the xEnum.
     * Existing xEnum will be replaced.
     *
     * @param xEnum the xEnum
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder xEnum(List<String> xEnum) {
      this.xEnum = xEnum;
      return this;
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder xDefault(String xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the triggerProperty.
     *
     * @param triggerProperty the triggerProperty
     * @return the ReplaceTektonPipelineTriggerPropertyOptions builder
     */
    public Builder triggerProperty(TriggerProperty triggerProperty) {
      this.name = triggerProperty.name();
      this.value = triggerProperty.value();
      this.xEnum = triggerProperty.xEnum();
      this.xDefault = triggerProperty.xDefault();
      this.type = triggerProperty.type();
      this.path = triggerProperty.path();
      return this;
    }
  }

  protected ReplaceTektonPipelineTriggerPropertyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pipelineId,
      "pipelineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.triggerId,
      "triggerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.propertyName,
      "propertyName cannot be empty");
    pipelineId = builder.pipelineId;
    triggerId = builder.triggerId;
    propertyName = builder.propertyName;
    name = builder.name;
    value = builder.value;
    xEnum = builder.xEnum;
    xDefault = builder.xDefault;
    type = builder.type;
    path = builder.path;
  }

  /**
   * New builder.
   *
   * @return a ReplaceTektonPipelineTriggerPropertyOptions builder
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
   * Gets the propertyName.
   *
   * The property's name.
   *
   * @return the propertyName
   */
  public String propertyName() {
    return propertyName;
  }

  /**
   * Gets the name.
   *
   * Property name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the value.
   *
   * String format property value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the xEnum.
   *
   * Options for SINGLE_SELECT property type.
   *
   * @return the xEnum
   */
  public List<String> xEnum() {
    return xEnum;
  }

  /**
   * Gets the xDefault.
   *
   * Default option for SINGLE_SELECT property type.
   *
   * @return the xDefault
   */
  public String xDefault() {
    return xDefault;
  }

  /**
   * Gets the type.
   *
   * Property type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the path.
   *
   * property path for INTEGRATION type properties.
   *
   * @return the path
   */
  public String path() {
    return path;
  }
}

