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
package com.ibm.cloud.my_services.example_service.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createResource options.
 */
public class CreateResourceOptions extends GenericModel {

  protected String name;
  protected String tag;
  protected String resourceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String tag;
    private String resourceId;

    private Builder(CreateResourceOptions createResourceOptions) {
      this.name = createResourceOptions.name;
      this.tag = createResourceOptions.tag;
      this.resourceId = createResourceOptions.resourceId;
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
     * @param tag the tag
     */
    public Builder(String name, String tag) {
      this.name = name;
      this.tag = tag;
    }

    /**
     * Builds a CreateResourceOptions.
     *
     * @return the new CreateResourceOptions instance
     */
    public CreateResourceOptions build() {
      return new CreateResourceOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateResourceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the tag.
     *
     * @param tag the tag
     * @return the CreateResourceOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }

    /**
     * Set the resourceId.
     *
     * @param resourceId the resourceId
     * @return the CreateResourceOptions builder
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the CreateResourceOptions builder
     */
    public Builder resource(Resource resource) {
      this.name = resource.name();
      this.tag = resource.tag();
      this.resourceId = resource.resourceId();
      return this;
    }
  }

  protected CreateResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tag,
      "tag cannot be null");
    name = builder.name;
    tag = builder.tag;
    resourceId = builder.resourceId;
  }

  /**
   * New builder.
   *
   * @return a CreateResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name of the resource.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the tag.
   *
   * A tag value for the resource.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
  }

  /**
   * Gets the resourceId.
   *
   * The id of the resource. If not specified, it will be assigned by the server.
   *
   * @return the resourceId
   */
  public String resourceId() {
    return resourceId;
  }
}

