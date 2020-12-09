package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * ContactsItem object
 */
public class ContactsItem implements Validable {
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
     * Contact phone
     */
    @SerializedName("phone")
    private String phone;

    /**
     * Contact email
     */
    @SerializedName("email")
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public ContactsItem setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ContactsItem setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ContactsItem setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactsItem setEmail(String email) {
        this.email = email;
        return this;
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
                Objects.equals(phone, contactsItem.phone) &&
                Objects.equals(email, contactsItem.email) &&
                Objects.equals(desc, contactsItem.desc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ContactsItem{");
        sb.append("userId=").append(userId);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", email='").append(email).append("'");
        sb.append(", desc='").append(desc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
