// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Operations Management Suite (OMS) parameters. */
@Fluent
public final class ClusterMonitoringRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterMonitoringRequest.class);

    /*
     * The Operations Management Suite (OMS) workspace ID.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /*
     * The Operations Management Suite (OMS) workspace key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Get the workspaceId property: The Operations Management Suite (OMS) workspace ID.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The Operations Management Suite (OMS) workspace ID.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the ClusterMonitoringRequest object itself.
     */
    public ClusterMonitoringRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the primaryKey property: The Operations Management Suite (OMS) workspace key.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: The Operations Management Suite (OMS) workspace key.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the ClusterMonitoringRequest object itself.
     */
    public ClusterMonitoringRequest withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
