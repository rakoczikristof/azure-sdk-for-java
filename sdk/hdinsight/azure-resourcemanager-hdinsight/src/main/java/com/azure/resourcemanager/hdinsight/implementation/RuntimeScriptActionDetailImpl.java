// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.RuntimeScriptActionDetailInner;
import com.azure.resourcemanager.hdinsight.models.RuntimeScriptActionDetail;
import com.azure.resourcemanager.hdinsight.models.ScriptActionExecutionSummary;
import java.util.Collections;
import java.util.List;

public final class RuntimeScriptActionDetailImpl implements RuntimeScriptActionDetail {
    private RuntimeScriptActionDetailInner innerObject;

    private final HDInsightManager serviceManager;

    RuntimeScriptActionDetailImpl(RuntimeScriptActionDetailInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String parameters() {
        return this.innerModel().parameters();
    }

    public List<String> roles() {
        List<String> inner = this.innerModel().roles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String applicationName() {
        return this.innerModel().applicationName();
    }

    public Long scriptExecutionId() {
        return this.innerModel().scriptExecutionId();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public String endTime() {
        return this.innerModel().endTime();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public List<ScriptActionExecutionSummary> executionSummary() {
        List<ScriptActionExecutionSummary> inner = this.innerModel().executionSummary();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String debugInformation() {
        return this.innerModel().debugInformation();
    }

    public RuntimeScriptActionDetailInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
