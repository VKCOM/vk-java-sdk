package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * SettingsTwitter object
 */
public class SettingsTwitter implements Validable {
    @SerializedName("status")
    @Required
    private SettingsTwitterStatus status;

    @SerializedName("name")
    private String name;

    public SettingsTwitterStatus getStatus() {
        return status;
    }

    public SettingsTwitter setStatus(SettingsTwitterStatus status) {
        this.status = status;
        return this;
    }

    public String getName() {
        return name;
    }

    public SettingsTwitter setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettingsTwitter settingsTwitter = (SettingsTwitter) o;
        return Objects.equals(name, settingsTwitter.name) &&
                Objects.equals(status, settingsTwitter.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SettingsTwitter{");
        sb.append("name='").append(name).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
