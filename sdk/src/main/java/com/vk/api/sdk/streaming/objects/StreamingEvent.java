package com.vk.api.sdk.streaming.objects;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Streaming event object
 */
public class StreamingEvent {

    @SerializedName("event_type")
    private StreamingEventType eventType;

    @SerializedName("event_id")
    private StreamingEventId eventId;

    @SerializedName("author")
    private StreamingEventAuthor author;

    @SerializedName("event_url")
    private String eventUrl;

    @SerializedName("text")
    private String text;

    @SerializedName("creation_time")
    private Integer creationTime;

    @SerializedName("tags")
    private List<String> tags;

    public StreamingEventType getEventType() {
        return eventType;
    }

    public StreamingEventId getEventId() {
        return eventId;
    }

    public StreamingEventAuthor getAuthor() {
        return author;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public String getText() {
        return text;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StreamingEvent{");
        sb.append("eventType=").append(eventType);
        sb.append(", eventId=").append(eventId);
        sb.append(", author=").append(author);
        sb.append(", eventUrl='").append(eventUrl).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", creationTime=").append(creationTime);
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
