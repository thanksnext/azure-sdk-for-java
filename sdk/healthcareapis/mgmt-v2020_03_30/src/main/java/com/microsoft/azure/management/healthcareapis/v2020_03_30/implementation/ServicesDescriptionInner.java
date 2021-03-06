/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation;

import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.ServicesResource;

/**
 * The description of the service.
 */
public class ServicesDescriptionInner extends ServicesResource {
    /**
     * The common properties of a service.
     */
    @JsonProperty(value = "properties")
    private ServicesProperties properties;

    /**
     * Get the common properties of a service.
     *
     * @return the properties value
     */
    public ServicesProperties properties() {
        return this.properties;
    }

    /**
     * Set the common properties of a service.
     *
     * @param properties the properties value to set
     * @return the ServicesDescriptionInner object itself.
     */
    public ServicesDescriptionInner withProperties(ServicesProperties properties) {
        this.properties = properties;
        return this;
    }

}
