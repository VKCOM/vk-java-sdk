package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * NameRequest object
 */
public class NameRequest implements Validable {
    /**
     * First name in request
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Request ID needed to cancel the request
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Last name in request
     */
    @SerializedName("last_name")
    private String lastName;

    @SerializedName("status")
    private NameRequestStatus status;

    @SerializedName("lang")
    private String lang;

    public String getFirstName() {
        return firstName;
    }

    public NameRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public NameRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public NameRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public NameRequestStatus getStatus() {
        return status;
    }

    public NameRequest setStatus(NameRequestStatus status) {
        this.status = status;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public NameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, id, lang, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameRequest nameRequest = (NameRequest) o;
        return Objects.equals(lastName, nameRequest.lastName) &&
                Objects.equals(id, nameRequest.id) &&
                Objects.equals(lang, nameRequest.lang) &&
                Objects.equals(firstName, nameRequest.firstName) &&
                Objects.equals(status, nameRequest.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("NameRequest{");
        sb.append("lastName='").append(lastName).append("'");
        sb.append(", id=").append(id);
        sb.append(", lang='").append(lang).append("'");
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
