/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolGeoBackupPolicies;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.GeoBackupPolicy;

class SqlPoolGeoBackupPoliciesImpl extends WrapperImpl<SqlPoolGeoBackupPoliciesInner> implements SqlPoolGeoBackupPolicies {
    private final SynapseManager manager;

    SqlPoolGeoBackupPoliciesImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolGeoBackupPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private GeoBackupPolicyImpl wrapModel(GeoBackupPolicyInner inner) {
        return  new GeoBackupPolicyImpl(inner, manager());
    }

    @Override
    public Observable<GeoBackupPolicy> listAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolGeoBackupPoliciesInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMap(new Func1<List<GeoBackupPolicyInner>, Observable<GeoBackupPolicyInner>>() {
            @Override
            public Observable<GeoBackupPolicyInner> call(List<GeoBackupPolicyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GeoBackupPolicyInner, GeoBackupPolicy>() {
            @Override
            public GeoBackupPolicy call(GeoBackupPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<GeoBackupPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        SqlPoolGeoBackupPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMap(new Func1<GeoBackupPolicyInner, Observable<GeoBackupPolicy>>() {
            @Override
            public Observable<GeoBackupPolicy> call(GeoBackupPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GeoBackupPolicy)wrapModel(inner));
                }
            }
       });
    }

}
