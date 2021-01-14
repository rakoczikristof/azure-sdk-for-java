/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.attestation.v2020_10_01.implementation.AttestationManager;
import com.microsoft.azure.management.attestation.v2020_10_01.implementation.OperationListInner;
import java.util.List;

/**
 * Type representing OperationList.
 */
public interface OperationList extends HasInner<OperationListInner>, HasManager<AttestationManager> {
    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the value value.
     */
    List<OperationsDefinition> value();

}
