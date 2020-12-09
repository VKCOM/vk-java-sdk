package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * TagsSuggestionItemButton object
 */
public class TagsSuggestionItemButton implements Validable {
    @SerializedName("title")
    private String title;

    @SerializedName("action")
    private TagsSuggestionItemButtonAction action;

    @SerializedName("style")
    private TagsSuggestionItemButtonStyle style;

    public String getTitle() {
        return title;
    }

    public TagsSuggestionItemButton setTitle(String title) {
        this.title = title;
        return this;
    }

    public TagsSuggestionItemButtonAction getAction() {
        return action;
    }

    public TagsSuggestionItemButton setAction(TagsSuggestionItemButtonAction action) {
        this.action = action;
        return this;
    }

    public TagsSuggestionItemButtonStyle getStyle() {
        return style;
    }

    public TagsSuggestionItemButton setStyle(TagsSuggestionItemButtonStyle style) {
        this.style = style;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, style, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagsSuggestionItemButton tagsSuggestionItemButton = (TagsSuggestionItemButton) o;
        return Objects.equals(action, tagsSuggestionItemButton.action) &&
                Objects.equals(style, tagsSuggestionItemButton.style) &&
                Objects.equals(title, tagsSuggestionItemButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TagsSuggestionItemButton{");
        sb.append("action='").append(action).append("'");
        sb.append(", style='").append(style).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
