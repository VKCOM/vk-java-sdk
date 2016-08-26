package com.vk.api.sdk.objects.account.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.account.NameRequest;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * SaveProfileInfoResponse object
 */
public class SaveProfileInfoResponse {
    /**
     * 1 if changes has been processed
     */
    @SerializedName("changed")
    private BoolInt changed;

    @SerializedName("name_request")
    private NameRequest nameRequest;

    public boolean isChanged() {
        return changed == BoolInt.YES;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRequest, changed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveProfileInfoResponse saveProfileInfoResponse = (SaveProfileInfoResponse) o;
        return Objects.equals(changed, saveProfileInfoResponse.changed) &&
                Objects.equals(nameRequest, saveProfileInfoResponse.nameRequest);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveProfileInfoResponse{");
        sb.append("changed=").append(changed);
        sb.append(", nameRequest=").append(nameRequest);
        sb.append('}');
        return sb.toString();
    }
}
