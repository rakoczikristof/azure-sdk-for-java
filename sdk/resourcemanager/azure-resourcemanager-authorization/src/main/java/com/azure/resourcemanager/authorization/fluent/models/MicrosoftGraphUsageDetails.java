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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** usageDetails. */
@Fluent
public final class MicrosoftGraphUsageDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphUsageDetails.class);

    /*
     * The date and time the resource was last accessed by the user. The
     * timestamp represents date and time information using ISO 8601 format and
     * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: 2014-01-01T00:00:00Z. Read-only.
     */
    @JsonProperty(value = "lastAccessedDateTime")
    private OffsetDateTime lastAccessedDateTime;

    /*
     * The date and time the resource was last modified by the user. The
     * timestamp represents date and time information using ISO 8601 format and
     * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: 2014-01-01T00:00:00Z. Read-only.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * usageDetails
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the lastAccessedDateTime property: The date and time the resource was last accessed by the user. The
     * timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example,
     * midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @return the lastAccessedDateTime value.
     */
    public OffsetDateTime lastAccessedDateTime() {
        return this.lastAccessedDateTime;
    }

    /**
     * Set the lastAccessedDateTime property: The date and time the resource was last accessed by the user. The
     * timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example,
     * midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @param lastAccessedDateTime the lastAccessedDateTime value to set.
     * @return the MicrosoftGraphUsageDetails object itself.
     */
    public MicrosoftGraphUsageDetails withLastAccessedDateTime(OffsetDateTime lastAccessedDateTime) {
        this.lastAccessedDateTime = lastAccessedDateTime;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The date and time the resource was last modified by the user. The
     * timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example,
     * midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The date and time the resource was last modified by the user. The
     * timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example,
     * midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphUsageDetails object itself.
     */
    public MicrosoftGraphUsageDetails withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: usageDetails.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: usageDetails.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUsageDetails object itself.
     */
    public MicrosoftGraphUsageDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
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
