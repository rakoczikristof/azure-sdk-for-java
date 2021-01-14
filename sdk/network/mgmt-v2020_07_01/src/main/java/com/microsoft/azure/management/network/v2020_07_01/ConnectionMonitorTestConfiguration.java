/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a connection monitor test configuration.
 */
public class ConnectionMonitorTestConfiguration {
    /**
     * The name of the connection monitor test configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The frequency of test evaluation, in seconds.
     */
    @JsonProperty(value = "testFrequencySec")
    private Integer testFrequencySec;

    /**
     * The protocol to use in test evaluation. Possible values include: 'Tcp',
     * 'Http', 'Icmp'.
     */
    @JsonProperty(value = "protocol", required = true)
    private ConnectionMonitorTestConfigurationProtocol protocol;

    /**
     * The preferred IP version to use in test evaluation. The connection
     * monitor may choose to use a different version depending on other
     * parameters. Possible values include: 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "preferredIPVersion")
    private PreferredIPVersion preferredIPVersion;

    /**
     * The parameters used to perform test evaluation over HTTP.
     */
    @JsonProperty(value = "httpConfiguration")
    private ConnectionMonitorHttpConfiguration httpConfiguration;

    /**
     * The parameters used to perform test evaluation over TCP.
     */
    @JsonProperty(value = "tcpConfiguration")
    private ConnectionMonitorTcpConfiguration tcpConfiguration;

    /**
     * The parameters used to perform test evaluation over ICMP.
     */
    @JsonProperty(value = "icmpConfiguration")
    private ConnectionMonitorIcmpConfiguration icmpConfiguration;

    /**
     * The threshold for declaring a test successful.
     */
    @JsonProperty(value = "successThreshold")
    private ConnectionMonitorSuccessThreshold successThreshold;

    /**
     * Get the name of the connection monitor test configuration.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the connection monitor test configuration.
     *
     * @param name the name value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the frequency of test evaluation, in seconds.
     *
     * @return the testFrequencySec value
     */
    public Integer testFrequencySec() {
        return this.testFrequencySec;
    }

    /**
     * Set the frequency of test evaluation, in seconds.
     *
     * @param testFrequencySec the testFrequencySec value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTestFrequencySec(Integer testFrequencySec) {
        this.testFrequencySec = testFrequencySec;
        return this;
    }

    /**
     * Get the protocol to use in test evaluation. Possible values include: 'Tcp', 'Http', 'Icmp'.
     *
     * @return the protocol value
     */
    public ConnectionMonitorTestConfigurationProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol to use in test evaluation. Possible values include: 'Tcp', 'Http', 'Icmp'.
     *
     * @param protocol the protocol value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withProtocol(ConnectionMonitorTestConfigurationProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the preferredIPVersion value
     */
    public PreferredIPVersion preferredIPVersion() {
        return this.preferredIPVersion;
    }

    /**
     * Set the preferred IP version to use in test evaluation. The connection monitor may choose to use a different version depending on other parameters. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param preferredIPVersion the preferredIPVersion value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withPreferredIPVersion(PreferredIPVersion preferredIPVersion) {
        this.preferredIPVersion = preferredIPVersion;
        return this;
    }

    /**
     * Get the parameters used to perform test evaluation over HTTP.
     *
     * @return the httpConfiguration value
     */
    public ConnectionMonitorHttpConfiguration httpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * Set the parameters used to perform test evaluation over HTTP.
     *
     * @param httpConfiguration the httpConfiguration value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withHttpConfiguration(ConnectionMonitorHttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
        return this;
    }

    /**
     * Get the parameters used to perform test evaluation over TCP.
     *
     * @return the tcpConfiguration value
     */
    public ConnectionMonitorTcpConfiguration tcpConfiguration() {
        return this.tcpConfiguration;
    }

    /**
     * Set the parameters used to perform test evaluation over TCP.
     *
     * @param tcpConfiguration the tcpConfiguration value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTcpConfiguration(ConnectionMonitorTcpConfiguration tcpConfiguration) {
        this.tcpConfiguration = tcpConfiguration;
        return this;
    }

    /**
     * Get the parameters used to perform test evaluation over ICMP.
     *
     * @return the icmpConfiguration value
     */
    public ConnectionMonitorIcmpConfiguration icmpConfiguration() {
        return this.icmpConfiguration;
    }

    /**
     * Set the parameters used to perform test evaluation over ICMP.
     *
     * @param icmpConfiguration the icmpConfiguration value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withIcmpConfiguration(ConnectionMonitorIcmpConfiguration icmpConfiguration) {
        this.icmpConfiguration = icmpConfiguration;
        return this;
    }

    /**
     * Get the threshold for declaring a test successful.
     *
     * @return the successThreshold value
     */
    public ConnectionMonitorSuccessThreshold successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the threshold for declaring a test successful.
     *
     * @param successThreshold the successThreshold value to set
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withSuccessThreshold(ConnectionMonitorSuccessThreshold successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

}
