/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiffDiskPlacement.
 */
public final class DiffDiskPlacement extends ExpandableStringEnum<DiffDiskPlacement> {
    /** Static value CacheDisk for DiffDiskPlacement. */
    public static final DiffDiskPlacement CACHE_DISK = fromString("CacheDisk");

    /** Static value ResourceDisk for DiffDiskPlacement. */
    public static final DiffDiskPlacement RESOURCE_DISK = fromString("ResourceDisk");

    /**
     * Creates or finds a DiffDiskPlacement from its string representation.
     * @param name a name to look for
     * @return the corresponding DiffDiskPlacement
     */
    @JsonCreator
    public static DiffDiskPlacement fromString(String name) {
        return fromString(name, DiffDiskPlacement.class);
    }

    /**
     * @return known DiffDiskPlacement values
     */
    public static Collection<DiffDiskPlacement> values() {
        return values(DiffDiskPlacement.class);
    }
}
