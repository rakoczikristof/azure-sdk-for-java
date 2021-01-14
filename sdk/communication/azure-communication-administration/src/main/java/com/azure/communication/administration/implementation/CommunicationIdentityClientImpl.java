// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the CommunicationIdentityClient type. */
public final class CommunicationIdentityClientImpl {
    /** The communication resource, for example https://my-resource.communication.azure.com. */
    private final String endpoint;

    /**
     * Gets The communication resource, for example https://my-resource.communication.azure.com.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The CommunicationIdentityImpl object to access its operations. */
    private final CommunicationIdentityImpl communicationIdentity;

    /**
     * Gets the CommunicationIdentityImpl object to access its operations.
     *
     * @return the CommunicationIdentityImpl object.
     */
    public CommunicationIdentityImpl getCommunicationIdentity() {
        return this.communicationIdentity;
    }

    /** Initializes an instance of CommunicationIdentityClient client. */
    CommunicationIdentityClientImpl(String endpoint) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                endpoint);
    }

    /**
     * Initializes an instance of CommunicationIdentityClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    CommunicationIdentityClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.apiVersion = "2021-03-07";
        this.communicationIdentity = new CommunicationIdentityImpl(this);
    }
}
