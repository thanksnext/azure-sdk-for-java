/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation.RoleInner;

/**
 * Compute role.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = IoTRole.class)
@JsonTypeName("IOT")
@JsonFlatten
public class IoTRole extends RoleInner {
    /**
     * Host OS supported by the IoT role. Possible values include: 'Windows',
     * 'Linux'.
     */
    @JsonProperty(value = "properties.hostPlatform", required = true)
    private PlatformType hostPlatform;

    /**
     * IoT device metadata to which data box edge device needs to be connected.
     */
    @JsonProperty(value = "properties.ioTDeviceDetails", required = true)
    private IoTDeviceInfo ioTDeviceDetails;

    /**
     * IoT edge device to which the IoT role needs to be configured.
     */
    @JsonProperty(value = "properties.ioTEdgeDeviceDetails", required = true)
    private IoTDeviceInfo ioTEdgeDeviceDetails;

    /**
     * Mount points of shares in role(s).
     */
    @JsonProperty(value = "properties.shareMappings")
    private List<MountPointMap> shareMappings;

    /**
     * Iot edge agent details to download the agent and bootstrap iot runtime.
     */
    @JsonProperty(value = "properties.ioTEdgeAgentInfo")
    private IoTEdgeAgentInfo ioTEdgeAgentInfo;

    /**
     * Platform where the Iot runtime is hosted. Possible values include:
     * 'KubernetesCluster', 'LinuxVM'.
     */
    @JsonProperty(value = "properties.hostPlatformType", access = JsonProperty.Access.WRITE_ONLY)
    private HostPlatformType hostPlatformType;

    /**
     * Role status. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.roleStatus", required = true)
    private RoleStatus roleStatus;

    /**
     * Get host OS supported by the IoT role. Possible values include: 'Windows', 'Linux'.
     *
     * @return the hostPlatform value
     */
    public PlatformType hostPlatform() {
        return this.hostPlatform;
    }

    /**
     * Set host OS supported by the IoT role. Possible values include: 'Windows', 'Linux'.
     *
     * @param hostPlatform the hostPlatform value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withHostPlatform(PlatformType hostPlatform) {
        this.hostPlatform = hostPlatform;
        return this;
    }

    /**
     * Get ioT device metadata to which data box edge device needs to be connected.
     *
     * @return the ioTDeviceDetails value
     */
    public IoTDeviceInfo ioTDeviceDetails() {
        return this.ioTDeviceDetails;
    }

    /**
     * Set ioT device metadata to which data box edge device needs to be connected.
     *
     * @param ioTDeviceDetails the ioTDeviceDetails value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTDeviceDetails(IoTDeviceInfo ioTDeviceDetails) {
        this.ioTDeviceDetails = ioTDeviceDetails;
        return this;
    }

    /**
     * Get ioT edge device to which the IoT role needs to be configured.
     *
     * @return the ioTEdgeDeviceDetails value
     */
    public IoTDeviceInfo ioTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }

    /**
     * Set ioT edge device to which the IoT role needs to be configured.
     *
     * @param ioTEdgeDeviceDetails the ioTEdgeDeviceDetails value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTEdgeDeviceDetails(IoTDeviceInfo ioTEdgeDeviceDetails) {
        this.ioTEdgeDeviceDetails = ioTEdgeDeviceDetails;
        return this;
    }

    /**
     * Get mount points of shares in role(s).
     *
     * @return the shareMappings value
     */
    public List<MountPointMap> shareMappings() {
        return this.shareMappings;
    }

    /**
     * Set mount points of shares in role(s).
     *
     * @param shareMappings the shareMappings value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withShareMappings(List<MountPointMap> shareMappings) {
        this.shareMappings = shareMappings;
        return this;
    }

    /**
     * Get iot edge agent details to download the agent and bootstrap iot runtime.
     *
     * @return the ioTEdgeAgentInfo value
     */
    public IoTEdgeAgentInfo ioTEdgeAgentInfo() {
        return this.ioTEdgeAgentInfo;
    }

    /**
     * Set iot edge agent details to download the agent and bootstrap iot runtime.
     *
     * @param ioTEdgeAgentInfo the ioTEdgeAgentInfo value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withIoTEdgeAgentInfo(IoTEdgeAgentInfo ioTEdgeAgentInfo) {
        this.ioTEdgeAgentInfo = ioTEdgeAgentInfo;
        return this;
    }

    /**
     * Get platform where the Iot runtime is hosted. Possible values include: 'KubernetesCluster', 'LinuxVM'.
     *
     * @return the hostPlatformType value
     */
    public HostPlatformType hostPlatformType() {
        return this.hostPlatformType;
    }

    /**
     * Get role status. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the roleStatus value
     */
    public RoleStatus roleStatus() {
        return this.roleStatus;
    }

    /**
     * Set role status. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param roleStatus the roleStatus value to set
     * @return the IoTRole object itself.
     */
    public IoTRole withRoleStatus(RoleStatus roleStatus) {
        this.roleStatus = roleStatus;
        return this;
    }

}
