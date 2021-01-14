// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Cursor methods for Mongodb query. */
@Fluent
public final class MongoDbCursorMethodsProperties {
    /*
     * Specifies the fields to return in the documents that match the query
     * filter. To return all fields in the matching documents, omit this
     * parameter. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "project")
    private Object project;

    /*
     * Specifies the order in which the query returns matching documents. Type:
     * string (or Expression with resultType string). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "sort")
    private Object sort;

    /*
     * Specifies the how many documents skipped and where MongoDB begins
     * returning results. This approach may be useful in implementing paginated
     * results. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "skip")
    private Object skip;

    /*
     * Specifies the maximum number of documents the server returns. limit() is
     * analogous to the LIMIT statement in a SQL database. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "limit")
    private Object limit;

    /*
     * Cursor methods for Mongodb query
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the project property: Specifies the fields to return in the documents that match the query filter. To return
     * all fields in the matching documents, omit this parameter. Type: string (or Expression with resultType string).
     *
     * @return the project value.
     */
    public Object getProject() {
        return this.project;
    }

    /**
     * Set the project property: Specifies the fields to return in the documents that match the query filter. To return
     * all fields in the matching documents, omit this parameter. Type: string (or Expression with resultType string).
     *
     * @param project the project value to set.
     * @return the MongoDbCursorMethodsProperties object itself.
     */
    public MongoDbCursorMethodsProperties setProject(Object project) {
        this.project = project;
        return this;
    }

    /**
     * Get the sort property: Specifies the order in which the query returns matching documents. Type: string (or
     * Expression with resultType string). Type: string (or Expression with resultType string).
     *
     * @return the sort value.
     */
    public Object getSort() {
        return this.sort;
    }

    /**
     * Set the sort property: Specifies the order in which the query returns matching documents. Type: string (or
     * Expression with resultType string). Type: string (or Expression with resultType string).
     *
     * @param sort the sort value to set.
     * @return the MongoDbCursorMethodsProperties object itself.
     */
    public MongoDbCursorMethodsProperties setSort(Object sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the skip property: Specifies the how many documents skipped and where MongoDB begins returning results. This
     * approach may be useful in implementing paginated results. Type: integer (or Expression with resultType integer).
     *
     * @return the skip value.
     */
    public Object getSkip() {
        return this.skip;
    }

    /**
     * Set the skip property: Specifies the how many documents skipped and where MongoDB begins returning results. This
     * approach may be useful in implementing paginated results. Type: integer (or Expression with resultType integer).
     *
     * @param skip the skip value to set.
     * @return the MongoDbCursorMethodsProperties object itself.
     */
    public MongoDbCursorMethodsProperties setSkip(Object skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Get the limit property: Specifies the maximum number of documents the server returns. limit() is analogous to the
     * LIMIT statement in a SQL database. Type: integer (or Expression with resultType integer).
     *
     * @return the limit value.
     */
    public Object getLimit() {
        return this.limit;
    }

    /**
     * Set the limit property: Specifies the maximum number of documents the server returns. limit() is analogous to the
     * LIMIT statement in a SQL database. Type: integer (or Expression with resultType integer).
     *
     * @param limit the limit value to set.
     * @return the MongoDbCursorMethodsProperties object itself.
     */
    public MongoDbCursorMethodsProperties setLimit(Object limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the additionalProperties property: Cursor methods for Mongodb query.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Cursor methods for Mongodb query.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MongoDbCursorMethodsProperties object itself.
     */
    public MongoDbCursorMethodsProperties setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
