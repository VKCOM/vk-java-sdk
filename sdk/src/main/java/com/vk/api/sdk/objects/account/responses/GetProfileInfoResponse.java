package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.users.UserSettingsXtr;
import java.net.URI;
import java.util.Objects;

/**
 * GetProfileInfoResponse object
 */
public class GetProfileInfoResponse extends UserSettingsXtr implements Validable {
    /**
     * URL of square photo of the user with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * flag about service account
     */
    @SerializedName("is_service_account")
    private Boolean isServiceAccount;

    public URI getPhoto200() {
        return photo200;
    }

    public GetProfileInfoResponse setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public Boolean getIsServiceAccount() {
        return isServiceAccount;
    }

    public GetProfileInfoResponse setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo200, isServiceAccount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetProfileInfoResponse getProfileInfoResponse = (GetProfileInfoResponse) o;
        return Objects.equals(isServiceAccount, getProfileInfoResponse.isServiceAccount) &&
                Objects.equals(photo200, getProfileInfoResponse.photo200);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetProfileInfoResponse{");
        sb.append("isServiceAccount=").append(isServiceAccount);
        sb.append(", photo200=").append(photo200);
        sb.append('}');
        return sb.toString();
    }
}
