// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.models.PurgeState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response containing status for a specific purge operation. */
@Fluent
public final class WorkspacePurgeStatusResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspacePurgeStatusResponseInner.class);

    /*
     * Status of the operation represented by the requested Id.
     */
    @JsonProperty(value = "status", required = true)
    private PurgeState status;

    /**
     * Get the status property: Status of the operation represented by the requested Id.
     *
     * @return the status value.
     */
    public PurgeState status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the operation represented by the requested Id.
     *
     * @param status the status value to set.
     * @return the WorkspacePurgeStatusResponseInner object itself.
     */
    public WorkspacePurgeStatusResponseInner withStatus(PurgeState status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model WorkspacePurgeStatusResponseInner"));
        }
    }
}
