package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Dialog object
 */
public class Dialog {
    /**
     * Information whether unread messages are in the dialog
     */
    @SerializedName("unread")
    private Integer unread;

    @SerializedName("message")
    private Message message;

    /**
     * ID of the last message read by current user
     */
    @SerializedName("in_read")
    private Integer inRead;

    /**
     * ID of the last message read by the others
     */
    @SerializedName("out_read")
    private Integer outRead;

    /**
     * Is it an important dialog
     */
    @SerializedName("important")
    private Boolean important;

    /**
     * Is it an unanswered dialog
     */
    @SerializedName("unanswered")
    private Boolean unanswered;

    public Integer getUnread() {
        return unread;
    }

    public Message getMessage() {
        return message;
    }

    public Integer getInRead() {
        return inRead;
    }

    public Integer getOutRead() {
        return outRead;
    }

    public Boolean isImportant() {
        return important;
    }

    public Boolean isUnanswered() {
        return unanswered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dialog dialog = (Dialog) o;
        return Objects.equals(unread, dialog.unread) &&
                Objects.equals(message, dialog.message) &&
                Objects.equals(inRead, dialog.inRead) &&
                Objects.equals(outRead, dialog.outRead) &&
                Objects.equals(important, dialog.important) &&
                Objects.equals(unanswered, dialog.unanswered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unread, message, inRead, outRead, important, unanswered);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dialog{");
        sb.append("unread=").append(unread);
        sb.append(", message=").append(message);
        sb.append(", inRead=").append(inRead);
        sb.append(", outRead=").append(outRead);
        sb.append(", important=").append(important);
        sb.append(", unanswered=").append(unanswered);
        sb.append('}');
        return sb.toString();
    }
}
