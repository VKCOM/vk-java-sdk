package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * TagsSuggestionItem object
 */
public class TagsSuggestionItem implements Validable {
    @SerializedName("title")
    private String title;

    @SerializedName("caption")
    private String caption;

    @SerializedName("type")
    private String type;

    @SerializedName("buttons")
    private List<TagsSuggestionItemButton> buttons;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("tags")
    private List<PhotoTag> tags;

    @SerializedName("track_code")
    private String trackCode;

    public String getTitle() {
        return title;
    }

    public TagsSuggestionItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public TagsSuggestionItem setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getType() {
        return type;
    }

    public TagsSuggestionItem setType(String type) {
        this.type = type;
        return this;
    }

    public List<TagsSuggestionItemButton> getButtons() {
        return buttons;
    }

    public TagsSuggestionItem setButtons(List<TagsSuggestionItemButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public TagsSuggestionItem setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public List<PhotoTag> getTags() {
        return tags;
    }

    public TagsSuggestionItem setTags(List<PhotoTag> tags) {
        this.tags = tags;
        return this;
    }

    public String getTrackCode() {
        return trackCode;
    }

    public TagsSuggestionItem setTrackCode(String trackCode) {
        this.trackCode = trackCode;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackCode, buttons, caption, photo, title, type, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagsSuggestionItem tagsSuggestionItem = (TagsSuggestionItem) o;
        return Objects.equals(buttons, tagsSuggestionItem.buttons) &&
                Objects.equals(caption, tagsSuggestionItem.caption) &&
                Objects.equals(photo, tagsSuggestionItem.photo) &&
                Objects.equals(trackCode, tagsSuggestionItem.trackCode) &&
                Objects.equals(title, tagsSuggestionItem.title) &&
                Objects.equals(type, tagsSuggestionItem.type) &&
                Objects.equals(tags, tagsSuggestionItem.tags);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TagsSuggestionItem{");
        sb.append("buttons=").append(buttons);
        sb.append(", caption='").append(caption).append("'");
        sb.append(", photo=").append(photo);
        sb.append(", trackCode='").append(trackCode).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", tags=").append(tags);
        sb.append('}');
        return sb.toString();
    }
}
