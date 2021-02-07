package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Video restriction button
 */
public class RestrictionButton implements Validable {
    @SerializedName("action")
    private RestrictionButtonAction action;

    @SerializedName("title")
    private String title;

    public RestrictionButtonAction getAction() {
        return action;
    }

    public RestrictionButton setAction(RestrictionButtonAction action) {
        this.action = action;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public RestrictionButton setTitle(String title) {
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
        RestrictionButton restrictionButton = (RestrictionButton) o;
        return Objects.equals(action, restrictionButton.action) &&
                Objects.equals(title, restrictionButton.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("RestrictionButton{");
        sb.append("action='").append(action).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
