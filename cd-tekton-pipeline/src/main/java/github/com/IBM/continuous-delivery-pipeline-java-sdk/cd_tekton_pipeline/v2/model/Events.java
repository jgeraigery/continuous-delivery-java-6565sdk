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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Needed only for git trigger type. Events object defines the events this git trigger listening to.
 */
public class Events extends GenericModel {

  protected Boolean push;
  @SerializedName("pull_request_closed")
  protected Boolean pullRequestClosed;
  @SerializedName("pull_request")
  protected Boolean pullRequest;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean push;
    private Boolean pullRequestClosed;
    private Boolean pullRequest;

    private Builder(Events events) {
      this.push = events.push;
      this.pullRequestClosed = events.pullRequestClosed;
      this.pullRequest = events.pullRequest;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Events.
     *
     * @return the new Events instance
     */
    public Events build() {
      return new Events(this);
    }

    /**
     * Set the push.
     *
     * @param push the push
     * @return the Events builder
     */
    public Builder push(Boolean push) {
      this.push = push;
      return this;
    }

    /**
     * Set the pullRequestClosed.
     *
     * @param pullRequestClosed the pullRequestClosed
     * @return the Events builder
     */
    public Builder pullRequestClosed(Boolean pullRequestClosed) {
      this.pullRequestClosed = pullRequestClosed;
      return this;
    }

    /**
     * Set the pullRequest.
     *
     * @param pullRequest the pullRequest
     * @return the Events builder
     */
    public Builder pullRequest(Boolean pullRequest) {
      this.pullRequest = pullRequest;
      return this;
    }
  }

  protected Events(Builder builder) {
    push = builder.push;
    pullRequestClosed = builder.pullRequestClosed;
    pullRequest = builder.pullRequest;
  }

  /**
   * New builder.
   *
   * @return a Events builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the push.
   *
   * If true, the trigger starts when tekton pipeline service receive a repo's 'push' git webhook event.
   *
   * @return the push
   */
  public Boolean push() {
    return push;
  }

  /**
   * Gets the pullRequestClosed.
   *
   * If true, the trigger starts when tekton pipeline service receive a repo pull reqeust's 'close' git webhook event.
   *
   * @return the pullRequestClosed
   */
  public Boolean pullRequestClosed() {
    return pullRequestClosed;
  }

  /**
   * Gets the pullRequest.
   *
   * If true, the trigger starts when tekton pipeline service receive a repo pull reqeust's 'open' or 'update' git
   * webhook event.
   *
   * @return the pullRequest
   */
  public Boolean pullRequest() {
    return pullRequest;
  }
}

