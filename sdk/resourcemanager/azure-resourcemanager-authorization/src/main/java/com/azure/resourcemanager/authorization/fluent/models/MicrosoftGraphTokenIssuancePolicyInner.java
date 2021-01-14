// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphTokenIssuancePolicyInner extends MicrosoftGraphStsPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTokenIssuancePolicyInner.class);

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTokenIssuancePolicyInner object itself.
     */
    public MicrosoftGraphTokenIssuancePolicyInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withDefinition(List<String> definition) {
        super.withDefinition(definition);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withIsOrganizationDefault(Boolean isOrganizationDefault) {
        super.withIsOrganizationDefault(isOrganizationDefault);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withAppliesTo(List<MicrosoftGraphDirectoryObjectInner> appliesTo) {
        super.withAppliesTo(appliesTo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTokenIssuancePolicyInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
