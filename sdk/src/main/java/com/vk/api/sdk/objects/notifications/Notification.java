package com.vk.api.sdk.objects.notifications;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Notification object
 */
public class Notification {
    /**
     * Notification type
     */
    @SerializedName("type")
    private String type;

    /**
     * Date when the event has been occured
     */
    @SerializedName("date")
    private Integer date;

    @SerializedName("parent")
    private JsonObject parent;

    @SerializedName("feedback")
    private Feedback feedback;

    @SerializedName("reply")
    private Reply reply;

    public String getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public JsonObject getParent() {
        return parent;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public Reply getReply() {
        return reply;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, feedback, parent, type, reply);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification notification = (Notification) o;
        return Objects.equals(type, notification.type) &&
                Objects.equals(date, notification.date) &&
                Objects.equals(parent, notification.parent) &&
                Objects.equals(feedback, notification.feedback) &&
                Objects.equals(reply, notification.reply);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notification{");
        sb.append("type='").append(type).append("'");
        sb.append(", date=").append(date);
        sb.append(", parent=").append(parent);
        sb.append(", feedback=").append(feedback);
        sb.append(", reply=").append(reply);
        sb.append('}');
        return sb.toString();
    }
}
