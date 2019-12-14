package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * Template object
 */
public class TemplateElement implements Validable {

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("photo_id")
    private String photoId;

    @SerializedName("buttons")
    @Required
    private List<KeyboardButton> buttons;

    @SerializedName("action")
    private TemplateElementAction action;

    public List<KeyboardButton> getButtons() {
        return buttons;
    }

    public String getDescription() {
        return description;
    }

    public String getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public TemplateElementAction getAction() {
        return action;
    }

    public TemplateElement setDescription(String description) {
        this.description = description;
        return this;
    }

    public TemplateElement setTitle(String title) {
        this.title = title;
        return this;
    }

    public TemplateElement setAction(TemplateElementAction action) {
        this.action = action;
        return this;
    }

    public TemplateElement setButtons(List<KeyboardButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    public TemplateElement setPhotoId(String photoId) {
        this.photoId = photoId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, photoId, buttons, action);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateElement templateElement = (TemplateElement) o;
        return Objects.equals(title, templateElement.title) &&
                Objects.equals(description, templateElement.description) &&
                Objects.equals(photoId, templateElement.photoId) &&
                Objects.equals(buttons, templateElement.buttons) &&
                Objects.equals(action, templateElement.action);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TemplateElement{");
        sb.append("title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", photo_id=").append(photoId);
        sb.append(", buttons=").append(buttons);
        sb.append(", action=").append(action);
        sb.append('}');
        return sb.toString();
    }
}
