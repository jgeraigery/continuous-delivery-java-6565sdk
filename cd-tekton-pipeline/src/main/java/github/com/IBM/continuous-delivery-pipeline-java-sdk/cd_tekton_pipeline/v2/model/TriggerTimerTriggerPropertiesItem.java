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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Trigger Property object.
 */
public class TriggerTimerTriggerPropertiesItem extends GenericModel {

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

  protected String name;
  protected String value;
  @SerializedName("enum")
  protected List<String> xEnum;
  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected String path;
  protected String href;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String value;
    private List<String> xEnum;
    private String xDefault;
    private String type;
    private String path;
    private String href;

    private Builder(TriggerTimerTriggerPropertiesItem triggerTimerTriggerPropertiesItem) {
      this.name = triggerTimerTriggerPropertiesItem.name;
      this.value = triggerTimerTriggerPropertiesItem.value;
      this.xEnum = triggerTimerTriggerPropertiesItem.xEnum;
      this.xDefault = triggerTimerTriggerPropertiesItem.xDefault;
      this.type = triggerTimerTriggerPropertiesItem.type;
      this.path = triggerTimerTriggerPropertiesItem.path;
      this.href = triggerTimerTriggerPropertiesItem.href;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param type the type
     */
    public Builder(String name, String type) {
      this.name = name;
      this.type = type;
    }

    /**
     * Builds a TriggerTimerTriggerPropertiesItem.
     *
     * @return the new TriggerTimerTriggerPropertiesItem instance
     */
    public TriggerTimerTriggerPropertiesItem build() {
      return new TriggerTimerTriggerPropertiesItem(this);
    }

    /**
     * Adds an xEnum to xEnum.
     *
     * @param xEnum the new xEnum
     * @return the TriggerTimerTriggerPropertiesItem builder
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
     * Set the name.
     *
     * @param name the name
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the TriggerTimerTriggerPropertiesItem builder
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
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder xEnum(List<String> xEnum) {
      this.xEnum = xEnum;
      return this;
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder xDefault(String xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the TriggerTimerTriggerPropertiesItem builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected TriggerTimerTriggerPropertiesItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    name = builder.name;
    value = builder.value;
    xEnum = builder.xEnum;
    xDefault = builder.xDefault;
    type = builder.type;
    path = builder.path;
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a TriggerTimerTriggerPropertiesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the href.
   *
   * General href URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

