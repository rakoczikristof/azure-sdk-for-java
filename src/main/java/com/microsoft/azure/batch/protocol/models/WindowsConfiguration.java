/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;


/**
 * Windows operating system settings on the virtual machine.
 */
public class WindowsConfiguration {
    /**
     * Gets or sets whether virtual machine is enabled for automatic updates.
     * If omitted, the default value is true.
     */
    private Boolean enableAutomaticUpdates;

    /**
     * Get the enableAutomaticUpdates value.
     *
     * @return the enableAutomaticUpdates value
     */
    public Boolean getEnableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates value.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set
     */
    public void setEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }

}
