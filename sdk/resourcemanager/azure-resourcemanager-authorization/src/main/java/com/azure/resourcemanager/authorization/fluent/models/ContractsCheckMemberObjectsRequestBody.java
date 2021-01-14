// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The ContractsCheckMemberObjectsRequestBody model. */
@Fluent
public final class ContractsCheckMemberObjectsRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContractsCheckMemberObjectsRequestBody.class);

    /*
     * The ids property.
     */
    @JsonProperty(value = "ids")
    private List<String> ids;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the ids property: The ids property.
     *
     * @return the ids value.
     */
    public List<String> ids() {
        return this.ids;
    }

    /**
     * Set the ids property: The ids property.
     *
     * @param ids the ids value to set.
     * @return the ContractsCheckMemberObjectsRequestBody object itself.
     */
    public ContractsCheckMemberObjectsRequestBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ContractsCheckMemberObjectsRequestBody object itself.
     */
    public ContractsCheckMemberObjectsRequestBody withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
