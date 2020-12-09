package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Scope description
 */
public class Scope implements Validable {
    /**
     * Scope name
     */
    @SerializedName("name")
    @Required
    private ScopeName name;

    /**
     * Scope title
     */
    @SerializedName("title")
    private String title;

    public ScopeName getName() {
        return name;
    }

    public Scope setName(ScopeName name) {
        this.name = name;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Scope setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scope scope = (Scope) o;
        return Objects.equals(name, scope.name) &&
                Objects.equals(title, scope.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Scope{");
        sb.append("name='").append(name).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
