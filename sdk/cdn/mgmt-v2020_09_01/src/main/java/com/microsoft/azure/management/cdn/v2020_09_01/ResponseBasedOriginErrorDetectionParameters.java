/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties to determine origin health
 * using real requests/responses.
 */
public class ResponseBasedOriginErrorDetectionParameters {
    /**
     * Type of response errors for real user requests for which origin will be
     * deemed unhealthy. Possible values include: 'None', 'TcpErrorsOnly',
     * 'TcpAndHttpErrors'.
     */
    @JsonProperty(value = "responseBasedDetectedErrorTypes")
    private ResponseBasedDetectedErrorTypes responseBasedDetectedErrorTypes;

    /**
     * The percentage of failed requests in the sample where failover should
     * trigger.
     */
    @JsonProperty(value = "responseBasedFailoverThresholdPercentage")
    private Integer responseBasedFailoverThresholdPercentage;

    /**
     * The list of Http status code ranges that are considered as server errors
     * for origin and it is marked as unhealthy.
     */
    @JsonProperty(value = "httpErrorRanges")
    private List<HttpErrorRangeParameters> httpErrorRanges;

    /**
     * Get type of response errors for real user requests for which origin will be deemed unhealthy. Possible values include: 'None', 'TcpErrorsOnly', 'TcpAndHttpErrors'.
     *
     * @return the responseBasedDetectedErrorTypes value
     */
    public ResponseBasedDetectedErrorTypes responseBasedDetectedErrorTypes() {
        return this.responseBasedDetectedErrorTypes;
    }

    /**
     * Set type of response errors for real user requests for which origin will be deemed unhealthy. Possible values include: 'None', 'TcpErrorsOnly', 'TcpAndHttpErrors'.
     *
     * @param responseBasedDetectedErrorTypes the responseBasedDetectedErrorTypes value to set
     * @return the ResponseBasedOriginErrorDetectionParameters object itself.
     */
    public ResponseBasedOriginErrorDetectionParameters withResponseBasedDetectedErrorTypes(ResponseBasedDetectedErrorTypes responseBasedDetectedErrorTypes) {
        this.responseBasedDetectedErrorTypes = responseBasedDetectedErrorTypes;
        return this;
    }

    /**
     * Get the percentage of failed requests in the sample where failover should trigger.
     *
     * @return the responseBasedFailoverThresholdPercentage value
     */
    public Integer responseBasedFailoverThresholdPercentage() {
        return this.responseBasedFailoverThresholdPercentage;
    }

    /**
     * Set the percentage of failed requests in the sample where failover should trigger.
     *
     * @param responseBasedFailoverThresholdPercentage the responseBasedFailoverThresholdPercentage value to set
     * @return the ResponseBasedOriginErrorDetectionParameters object itself.
     */
    public ResponseBasedOriginErrorDetectionParameters withResponseBasedFailoverThresholdPercentage(Integer responseBasedFailoverThresholdPercentage) {
        this.responseBasedFailoverThresholdPercentage = responseBasedFailoverThresholdPercentage;
        return this;
    }

    /**
     * Get the list of Http status code ranges that are considered as server errors for origin and it is marked as unhealthy.
     *
     * @return the httpErrorRanges value
     */
    public List<HttpErrorRangeParameters> httpErrorRanges() {
        return this.httpErrorRanges;
    }

    /**
     * Set the list of Http status code ranges that are considered as server errors for origin and it is marked as unhealthy.
     *
     * @param httpErrorRanges the httpErrorRanges value to set
     * @return the ResponseBasedOriginErrorDetectionParameters object itself.
     */
    public ResponseBasedOriginErrorDetectionParameters withHttpErrorRanges(List<HttpErrorRangeParameters> httpErrorRanges) {
        this.httpErrorRanges = httpErrorRanges;
        return this;
    }

}
