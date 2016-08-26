package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ItemNote object
 */
public class ItemNote {
    @SerializedName("notes")
    private JsonObject notes;

    public JsonObject getNotes() {
        return notes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemNote itemNote = (ItemNote) o;
        return Objects.equals(notes, itemNote.notes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemNote{");
        sb.append("notes=").append(notes);
        sb.append('}');
        return sb.toString();
    }
}
