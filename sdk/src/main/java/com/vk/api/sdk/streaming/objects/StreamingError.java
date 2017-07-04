package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Streaming error object
 */
public class StreamingError {

    @SerializedName("error_code")
    private Integer errorCode;

    @SerializedName("message")
    private String message;

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
