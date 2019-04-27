package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * Keyboard object
 */
public class Keyboard {
    /**
     * Community or bot, which set this keyboard
     */
    @SerializedName("author_id")
    private Integer authorId;

    @SerializedName("buttons")
    private List<List<KeyboardButton>> buttons;

    /**
     * Should this keyboard disappear on first use
     */
    @SerializedName("one_time")
    private Boolean oneTime;

    public Integer getAuthorId() {
        return authorId;
    }

    public Keyboard setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public List<List<KeyboardButton>> getButtons() {
        return buttons;
    }

    public Keyboard setButtons(List<List<KeyboardButton>> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Boolean getOneTime() {
        return oneTime;
    }

    public Keyboard setOneTime(Boolean oneTime) {
        this.oneTime = oneTime;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttons, authorId, oneTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return Objects.equals(buttons, keyboard.buttons) &&
                Objects.equals(authorId, keyboard.authorId) &&
                Objects.equals(oneTime, keyboard.oneTime);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("buttons=").append(buttons);
        sb.append(", authorId=").append(authorId);
        sb.append(", oneTime=").append(oneTime);
        sb.append('}');
        return sb.toString();
    }
}
