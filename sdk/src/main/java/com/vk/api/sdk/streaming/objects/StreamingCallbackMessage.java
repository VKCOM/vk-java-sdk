package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Message from stream
 */
public class StreamingCallbackMessage {

    @SerializedName("code")
    private Integer code;

    @SerializedName("service_message")
    private StreamingServiceMessage serviceMessage;

    @SerializedName("event")
    private StreamingEvent event;

    public Integer getCode() {
        return code;
    }

    public StreamingServiceMessage getServiceMessage() {
        return serviceMessage;
    }

    public StreamingEvent getEvent() {
        return event;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingCallbackMessage{");
        sb.append("code=").append(code);
        sb.append(", serviceMessage=").append(serviceMessage);
        sb.append(", event=").append(event);
        sb.append('}');
        return sb.toString();
    }
}
