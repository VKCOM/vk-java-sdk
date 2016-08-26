package com.vk.api.sdk.objects.search;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.UserMin;

import java.util.Objects;

/**
 * Hint object
 */
public class Hint {
    /**
     * Object type
     */
    @SerializedName("type")
    private HintType type;

    /**
     * Section title
     */
    @SerializedName("section")
    private HintSection section;

    /**
     * Object description
     */
    @SerializedName("description")
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

    public HintType getType() {
        return type;
    }

    public HintSection getSection() {
        return section;
    }

    public String getDescription() {
        return description;
    }

    public boolean isGlobal() {
        return global == BoolInt.YES;
    }

    public Group getGroup() {
        return group;
    }

    public UserMin getProfile() {
        return profile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profile, description, section, global, type, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hint hint = (Hint) o;
        return Objects.equals(type, hint.type) &&
                Objects.equals(section, hint.section) &&
                Objects.equals(description, hint.description) &&
                Objects.equals(global, hint.global) &&
                Objects.equals(group, hint.group) &&
                Objects.equals(profile, hint.profile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hint{");
        sb.append("type='").append(type).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", global=").append(global);
        sb.append(", group=").append(group);
        sb.append(", profile=").append(profile);
        sb.append('}');
        return sb.toString();
    }
}
