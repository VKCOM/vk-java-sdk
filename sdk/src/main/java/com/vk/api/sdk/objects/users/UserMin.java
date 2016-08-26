package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserMin object
 */
public class UserMin {
    /**
     * User ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * User last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Returns if a profile is deleted or blocked
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Returns if a profile is hidden.
     */
    @SerializedName("hidden")
    private Integer hidden;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Integer getHidden() {
        return hidden;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, hidden, id, deactivated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMin userMin = (UserMin) o;
        return Objects.equals(id, userMin.id) &&
                Objects.equals(firstName, userMin.firstName) &&
                Objects.equals(lastName, userMin.lastName) &&
                Objects.equals(deactivated, userMin.deactivated) &&
                Objects.equals(hidden, userMin.hidden);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMin{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", hidden=").append(hidden);
        sb.append('}');
        return sb.toString();
    }
}
