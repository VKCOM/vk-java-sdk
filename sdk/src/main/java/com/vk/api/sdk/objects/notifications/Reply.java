package com.vk.api.sdk.objects.notifications;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Reply object
 */
public class Reply {
    /**
     * Reply ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Date when the reply has been created in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Reply text
     */
    @SerializedName("text")
    private String text;

    public Integer getId() {
        return id;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, id, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reply reply = (Reply) o;
        return Objects.equals(id, reply.id) &&
                Objects.equals(date, reply.date) &&
                Objects.equals(text, reply.text);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reply{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", text=").append(text);
        sb.append('}');
        return sb.toString();
    }
}
