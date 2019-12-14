package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * Description of the action, that should be performed on button click
 */
public class TemplateElementAction implements Validable {

    @SerializedName("type")
    @Required
    private TemplateElementActionType type;

    @SerializedName("link")
    private String link;

    public String getLink() {
        return link;
    }

    public TemplateElementActionType getType() {
        return type;
    }

    public TemplateElementAction setType(TemplateElementActionType type) {
        this.type = type;
        return this;
    }

    public TemplateElementAction setLink(String link) {
        this.link = link;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, link);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateElementAction templateElementAction = (TemplateElementAction) o;
        return Objects.equals(type, templateElementAction.type) &&
                Objects.equals(link, templateElementAction.link);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("TemplateAction{");
        sb.append("type='").append(type).append("'");
        sb.append(", link='").append(link).append("'");
        sb.append('}');
        return sb.toString();
    }
}
