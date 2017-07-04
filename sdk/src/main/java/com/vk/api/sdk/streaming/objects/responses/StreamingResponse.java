package com.vk.api.sdk.streaming.objects.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.streaming.objects.StreamingError;

import java.util.Objects;

/**
 * Base response object
 */
public class StreamingResponse {

    @SerializedName("code")
    private Integer code;

    @SerializedName("error")
    private StreamingError error;

    public StreamingResponse() {
    }

    public Integer getCode() {
        return code;
    }

    public StreamingError getError() {
        return error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingResponse that = (StreamingResponse) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, error);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingCallbackMessage{");
        sb.append("code=").append(code);
        sb.append(", error=").append(error);
        sb.append('}');
        return sb.toString();
    }
}
