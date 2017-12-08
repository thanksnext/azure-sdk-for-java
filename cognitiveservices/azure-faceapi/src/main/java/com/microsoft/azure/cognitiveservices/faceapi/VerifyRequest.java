/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for verify operation.
 */
public class VerifyRequest {
    /**
     * faceId of the first face, comes from Face - Detect.
     */
    @JsonProperty(value = "faceId1", required = true)
    private String faceId1;

    /**
     * faceId of the second face, comes from Face - Detect.
     */
    @JsonProperty(value = "faceId2", required = true)
    private String faceId2;

    /**
     * Get the faceId1 value.
     *
     * @return the faceId1 value
     */
    public String faceId1() {
        return this.faceId1;
    }

    /**
     * Set the faceId1 value.
     *
     * @param faceId1 the faceId1 value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withFaceId1(String faceId1) {
        this.faceId1 = faceId1;
        return this;
    }

    /**
     * Get the faceId2 value.
     *
     * @return the faceId2 value
     */
    public String faceId2() {
        return this.faceId2;
    }

    /**
     * Set the faceId2 value.
     *
     * @param faceId2 the faceId2 value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withFaceId2(String faceId2) {
        this.faceId2 = faceId2;
        return this;
    }

}
