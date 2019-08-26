package com.vk.api.sdk.objects.notifications;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Notification object
 */
public class Notification implements Validable {
    /**
     * Date when the event has been occurred
     */
    @SerializedName("date")
    private Integer date;

    @SerializedName("feedback")
    private Feedback feedback;

    @SerializedName("parent")
    private NotificationParent parent;

    @SerializedName("reply")
    private Reply reply;

    /**
     * Notification type
     */
    @SerializedName("type")
    private String type;

    public Integer getDate() {
        return date;
    }

    public Notification setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public Notification setFeedback(Feedback feedback) {
        this.feedback = feedback;
        return this;
    }

    public NotificationParent getParent() {
        return parent;
    }

    public Notification setParent(NotificationParent parent) {
        this.parent = parent;
        return this;
    }

    public Reply getReply() {
        return reply;
    }

    public Notification setReply(Reply reply) {
        this.reply = reply;
        return this;
    }

    public String getType() {
        return type;
    }

    public Notification setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, feedback, parent, reply, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification notification = (Notification) o;
        return Objects.equals(date, notification.date) &&
                Objects.equals(feedback, notification.feedback) &&
                Objects.equals(parent, notification.parent) &&
                Objects.equals(reply, notification.reply) &&
                Objects.equals(type, notification.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Notification{");
        sb.append("date=").append(date);
        sb.append(", feedback=").append(feedback);
        sb.append(", parent=").append(parent);
        sb.append(", reply=").append(reply);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
