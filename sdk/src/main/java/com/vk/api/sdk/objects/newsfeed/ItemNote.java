package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ItemNote object
 */
public class ItemNote extends ItemBase implements Validable {
    @SerializedName("notes")
    private ItemNoteNotes notes;

    public ItemNoteNotes getNotes() {
        return notes;
    }

    public ItemNote setNotes(ItemNoteNotes notes) {
        this.notes = notes;
        return this;
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
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemNote{");
        sb.append("notes=").append(notes);
        sb.append('}');
        return sb.toString();
    }
}
