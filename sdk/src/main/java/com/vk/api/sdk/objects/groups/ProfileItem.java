package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * ProfileItem object
 */
public class ProfileItem implements Validable {
    /**
     * User id
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Url for user photo
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * Url for user photo
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

    public Integer getId() {
        return id;
    }

    public ProfileItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public ProfileItem setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public ProfileItem setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public ProfileItem setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, photo100, photo50, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileItem profileItem = (ProfileItem) o;
        return Objects.equals(photo50, profileItem.photo50) &&
                Objects.equals(id, profileItem.id) &&
                Objects.equals(photo100, profileItem.photo100) &&
                Objects.equals(firstName, profileItem.firstName);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ProfileItem{");
        sb.append("photo50=").append(photo50);
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append('}');
        return sb.toString();
    }
}
