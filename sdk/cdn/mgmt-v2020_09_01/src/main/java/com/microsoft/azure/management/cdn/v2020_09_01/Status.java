/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Status.
 */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Valid for Status. */
    public static final Status VALID = fromString("Valid");

    /** Static value Invalid for Status. */
    public static final Status INVALID = fromString("Invalid");

    /** Static value AccessDenied for Status. */
    public static final Status ACCESS_DENIED = fromString("AccessDenied");

    /** Static value CertificateExpired for Status. */
    public static final Status CERTIFICATE_EXPIRED = fromString("CertificateExpired");

    /**
     * Creates or finds a Status from its string representation.
     * @param name a name to look for
     * @return the corresponding Status
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * @return known Status values
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
