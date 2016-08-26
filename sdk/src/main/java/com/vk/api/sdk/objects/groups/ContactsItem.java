package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ContactsItem object
 */
public class ContactsItem {
    /**
     * User ID
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Contact description
     */
    @SerializedName("desc")
    private String desc;

    /**
     * Contact email
     */
    @SerializedName("email")
    private String email;

    /**
     * Contact phone
     */
    @SerializedName("phone")
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public String getDesc() {
        return desc;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, userId, email, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactsItem contactsItem = (ContactsItem) o;
        return Objects.equals(userId, contactsItem.userId) &&
                Objects.equals(desc, contactsItem.desc) &&
                Objects.equals(email, contactsItem.email) &&
                Objects.equals(phone, contactsItem.phone);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactsItem{");
        sb.append("userId=").append(userId);
        sb.append(", desc='").append(desc).append("'");
        sb.append(", email='").append(email).append("'");
        sb.append(", phone='").append(phone).append("'");
        sb.append('}');
        return sb.toString();
    }
}
