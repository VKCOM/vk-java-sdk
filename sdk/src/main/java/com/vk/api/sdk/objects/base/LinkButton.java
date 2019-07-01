package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * LinkButton object
 */
public class LinkButton implements Validable {
    /**
     * Button action
     */
    @SerializedName("action")
    private LinkButtonAction action;

    /**
     * Button title
     */
    @SerializedName("title")
    private String title;

    public LinkButtonAction getAction() {
        return action;
    }

    public LinkButton setAction(LinkButtonAction action) {
        this.action = action;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public LinkButton setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButton linkButton = (LinkButton) o;
        return Objects.equals(action, linkButton.action) &&
                Objects.equals(title, linkButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LinkButton{");
        sb.append("action=").append(action);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
