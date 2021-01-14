/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.QueryTextInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.MySQLManager;

/**
 * Type representing QueryText.
 */
public interface QueryText extends HasInner<QueryTextInner>, Indexable, Refreshable<QueryText>, HasManager<MySQLManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the queryId value.
     */
    String queryId();

    /**
     * @return the queryText value.
     */
    String queryText();

    /**
     * @return the type value.
     */
    String type();

}
