/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.UsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes resource usage.
 */
public class UsageInner {
    /**
     * Resource identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * An enum describing the unit of measurement.
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /**
     * The current value of the usage.
     */
    @JsonProperty(value = "currentValue", required = true)
    private long currentValue;

    /**
     * The limit of usage.
     */
    @JsonProperty(value = "limit", required = true)
    private long limit;

    /**
     * The name of the type of usage.
     */
    @JsonProperty(value = "name", required = true)
    private UsageName name;

    /**
     * Creates an instance of UsageInner class.
     * @param currentValue the current value of the usage.
     * @param limit the limit of usage.
     * @param name the name of the type of usage.
     */
    public UsageInner() {
        unit = "Count";
    }

    /**
     * Get resource identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get an enum describing the unit of measurement.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set an enum describing the unit of measurement.
     *
     * @param unit the unit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the current value of the usage.
     *
     * @return the currentValue value
     */
    public long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the current value of the usage.
     *
     * @param currentValue the currentValue value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit of usage.
     *
     * @return the limit value
     */
    public long limit() {
        return this.limit;
    }

    /**
     * Set the limit of usage.
     *
     * @param limit the limit value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name of the type of usage.
     *
     * @return the name value
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name of the type of usage.
     *
     * @param name the name value to set
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

}
