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
public class Template implements Validable {

    @SerializedName("type")
    private TemplateType type;

    @SerializedName("elements")
    @Required
    private List<TemplateElement> elements;

    public List<TemplateElement> getElements() {
        return elements;
    }

    public Template setElements(List<TemplateElement> elements) {
        this.elements = elements;
        return this;
    }

    public TemplateType getType() {
        return type;
    }

    public Template setType(TemplateType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, elements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Template template = (Template) o;
        return Objects.equals(type, template.type) &&
                Objects.equals(elements, template.elements);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Template{");
        sb.append("type=").append(type);
        sb.append(", elements=").append(elements);
        sb.append('}');
        return sb.toString();
    }
}
