/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowTriggerCallbackUrlInner;
import java.util.List;

/**
 * Type representing WorkflowTriggerCallbackUrl.
 */
public interface WorkflowTriggerCallbackUrl extends HasInner<WorkflowTriggerCallbackUrlInner>, HasManager<LogicManager> {
    /**
     * @return the basePath value.
     */
    String basePath();

    /**
     * @return the method value.
     */
    String method();

    /**
     * @return the queries value.
     */
    WorkflowTriggerListCallbackUrlQueries queries();

    /**
     * @return the relativePath value.
     */
    String relativePath();

    /**
     * @return the relativePathParameters value.
     */
    List<String> relativePathParameters();

    /**
     * @return the value value.
     */
    String value();

}
