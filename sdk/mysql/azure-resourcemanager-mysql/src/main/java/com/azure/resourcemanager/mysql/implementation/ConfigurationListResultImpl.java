// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysql.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.mysql.models.Configuration;
import com.azure.resourcemanager.mysql.models.ConfigurationListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ConfigurationListResultImpl implements ConfigurationListResult {
    private ConfigurationListResultInner innerObject;

    private final MySqlManager serviceManager;

    ConfigurationListResultImpl(ConfigurationListResultInner innerObject, MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Configuration> value() {
        List<ConfigurationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ConfigurationListResultInner innerModel() {
        return this.innerObject;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
