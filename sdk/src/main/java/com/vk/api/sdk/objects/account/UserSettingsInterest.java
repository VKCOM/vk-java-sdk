package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UserSettingsInterest object
 */
public class UserSettingsInterest implements Validable {
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("value")
    @Required
    private String value;

    public String getTitle() {
        return title;
    }

    public UserSettingsInterest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UserSettingsInterest setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettingsInterest userSettingsInterest = (UserSettingsInterest) o;
        return Objects.equals(title, userSettingsInterest.title) &&
                Objects.equals(value, userSettingsInterest.value);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserSettingsInterest{");
        sb.append("title='").append(title).append("'");
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
