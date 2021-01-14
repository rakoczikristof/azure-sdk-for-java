// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for Salesforce Service Cloud. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloud")
@JsonFlatten
@Fluent
public class SalesforceServiceCloudLinkedService extends LinkedService {
    /*
     * The URL of Salesforce Service Cloud instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify
     * 'https://test.salesforce.com'. To copy data from custom domain, specify,
     * for example, 'https://[domain].my.salesforce.com'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentUrl")
    private Object environmentUrl;

    /*
     * The username for Basic authentication of the Salesforce instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password for Basic authentication of the Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The security token is required to remotely access Salesforce instance.
     */
    @JsonProperty(value = "typeProperties.securityToken")
    private SecretBase securityToken;

    /*
     * Extended properties appended to the connection string. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.extendedProperties")
    private Object extendedProperties;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the environmentUrl property: The URL of Salesforce Service Cloud instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data
     * from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with
     * resultType string).
     *
     * @return the environmentUrl value.
     */
    public Object getEnvironmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce Service Cloud instance. Default is
     * 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data
     * from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with
     * resultType string).
     *
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication of the Salesforce instance.
     *
     * @param password the password value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the securityToken property: The security token is required to remotely access Salesforce instance.
     *
     * @return the securityToken value.
     */
    public SecretBase getSecurityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The security token is required to remotely access Salesforce instance.
     *
     * @param securityToken the securityToken value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setSecurityToken(SecretBase securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the extendedProperties property: Extended properties appended to the connection string. Type: string (or
     * Expression with resultType string).
     *
     * @return the extendedProperties value.
     */
    public Object getExtendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set the extendedProperties property: Extended properties appended to the connection string. Type: string (or
     * Expression with resultType string).
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setExtendedProperties(Object extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceServiceCloudLinkedService object itself.
     */
    public SalesforceServiceCloudLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
