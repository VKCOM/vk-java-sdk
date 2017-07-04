package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Streaming service message object
 */
public class StreamingServiceMessage {

    @SerializedName("message")
    private String message;

    @SerializedName("service_code")
    private Integer serviceCode;

    public String getMessage() {
        return message;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingServiceMessage that = (StreamingServiceMessage) o;
        return Objects.equals(message, that.message) &&
                Objects.equals(serviceCode, that.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, serviceCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingServiceMessage{");
        sb.append("message='").append(message).append('\'');
        sb.append(", serviceCode=").append(serviceCode);
        sb.append('}');
        return sb.toString();
    }
}
