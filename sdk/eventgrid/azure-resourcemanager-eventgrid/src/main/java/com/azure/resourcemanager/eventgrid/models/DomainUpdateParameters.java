// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Properties of the Domain update. */
@JsonFlatten
@Fluent
public class DomainUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainUpdateParameters.class);

    /*
     * Tags of the domains resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
     * />
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "properties.inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Get the tags property: Tags of the domains resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the domains resource.
     *
     * @param tags the tags value to set.
     * @return the DomainUpdateParameters object itself.
     */
    public DomainUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties.InboundIpRules"
     * /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainUpdateParameters object itself.
     */
    public DomainUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the DomainUpdateParameters object itself.
     */
    public DomainUpdateParameters withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
