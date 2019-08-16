package com.vk.api.sdk.objects.search;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.apps.App;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.UserMin;
import java.util.Objects;

/**
 * Hint object
 */
public class Hint implements Validable {
    @SerializedName("app")
    private App app;

    /**
     * Object description
     */
    @SerializedName("description")
    @Required
    private String description;

    /**
     * Information whether the object has been found globally
     */
    @SerializedName("global")
    private BoolInt global;

    @SerializedName("group")
    private Group group;

    @SerializedName("profile")
    private UserMin profile;

    @SerializedName("section")
    @Required
    private HintSection section;

    @SerializedName("type")
    @Required
    private HintType type;

    public App getApp() {
        return app;
    }

    public Hint setApp(App app) {
        this.app = app;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Hint setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isGlobal() {
        return global == BoolInt.YES;
    }

    public BoolInt getGlobal() {
        return global;
    }

    public Group getGroup() {
        return group;
    }

    public Hint setGroup(Group group) {
        this.group = group;
        return this;
    }

    public UserMin getProfile() {
        return profile;
    }

    public Hint setProfile(UserMin profile) {
        this.profile = profile;
        return this;
    }

    public HintSection getSection() {
        return section;
    }

    public Hint setSection(HintSection section) {
        this.section = section;
        return this;
    }

    public HintType getType() {
        return type;
    }

    public Hint setType(HintType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, profile, description, global, section, type, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hint hint = (Hint) o;
        return Objects.equals(app, hint.app) &&
                Objects.equals(profile, hint.profile) &&
                Objects.equals(description, hint.description) &&
                Objects.equals(global, hint.global) &&
                Objects.equals(section, hint.section) &&
                Objects.equals(type, hint.type) &&
                Objects.equals(group, hint.group);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Hint{");
        sb.append("app=").append(app);
        sb.append(", profile=").append(profile);
        sb.append(", description='").append(description).append("'");
        sb.append(", global=").append(global);
        sb.append(", section=").append(section);
        sb.append(", type=").append(type);
        sb.append(", group=").append(group);
        sb.append('}');
        return sb.toString();
    }
}
