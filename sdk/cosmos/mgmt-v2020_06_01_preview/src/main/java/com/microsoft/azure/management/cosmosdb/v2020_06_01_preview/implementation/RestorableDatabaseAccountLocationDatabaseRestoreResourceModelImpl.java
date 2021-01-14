/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableDatabaseAccountLocationDatabaseRestoreResourceModel;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;

class RestorableDatabaseAccountLocationDatabaseRestoreResourceModelImpl extends WrapperImpl<DatabaseRestoreResourceInner> implements RestorableDatabaseAccountLocationDatabaseRestoreResourceModel {
    private final CosmosDBManager manager;

    RestorableDatabaseAccountLocationDatabaseRestoreResourceModelImpl(DatabaseRestoreResourceInner inner,  CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }



    @Override
    public List<String> collectionNames() {
        return this.inner().collectionNames();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

}
