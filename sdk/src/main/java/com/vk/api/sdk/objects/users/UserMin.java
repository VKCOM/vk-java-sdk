package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UserMin object
 */
public class UserMin implements Validable {
    /**
     * Returns if a profile is deleted or blocked
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Returns if a profile is hidden.
     */
    @SerializedName("hidden")
    private Integer hidden;

    /**
     * User ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * User last name
     */
    @SerializedName("last_name")
    private String lastName;

    @SerializedName("can_access_closed")
    private Boolean canAccessClosed;

    @SerializedName("is_closed")
    private Boolean isClosed;

    public String getDeactivated() {
        return deactivated;
    }

    public UserMin setDeactivated(String deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserMin setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Integer getHidden() {
        return hidden;
    }

    public UserMin setHidden(Integer hidden) {
        this.hidden = hidden;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserMin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserMin setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getCanAccessClosed() {
        return canAccessClosed;
    }

    public UserMin setCanAccessClosed(Boolean canAccessClosed) {
        this.canAccessClosed = canAccessClosed;
        return this;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public UserMin setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAccessClosed, lastName, firstName, hidden, isClosed, id, deactivated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMin userMin = (UserMin) o;
        return Objects.equals(canAccessClosed, userMin.canAccessClosed) &&
                Objects.equals(hidden, userMin.hidden) &&
                Objects.equals(lastName, userMin.lastName) &&
                Objects.equals(id, userMin.id) &&
                Objects.equals(firstName, userMin.firstName) &&
                Objects.equals(deactivated, userMin.deactivated) &&
                Objects.equals(isClosed, userMin.isClosed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserMin{");
        sb.append("canAccessClosed=").append(canAccessClosed);
        sb.append(", hidden=").append(hidden);
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", id=").append(id);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append('}');
        return sb.toString();
    }
}
