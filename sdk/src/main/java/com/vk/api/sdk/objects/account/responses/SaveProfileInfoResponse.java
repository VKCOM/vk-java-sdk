package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.account.NameRequest;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * SaveProfileInfoResponse object
 */
public class SaveProfileInfoResponse implements Validable {
    /**
     * 1 if changes has been processed
     */
    @SerializedName("changed")
    private BoolInt changed;

    @SerializedName("name_request")
    private NameRequest nameRequest;

    public boolean isChanged() {
        return changed == BoolInt.YESBOOL;
    }

    public BoolInt getChanged() {
        return changed;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    public SaveProfileInfoResponse setNameRequest(NameRequest nameRequest) {
        this.nameRequest = nameRequest;
        return this;
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
        return Objects.equals(nameRequest, saveProfileInfoResponse.nameRequest) &&
                Objects.equals(changed, saveProfileInfoResponse.changed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveProfileInfoResponse{");
        sb.append("nameRequest=").append(nameRequest);
        sb.append(", changed=").append(changed);
        sb.append('}');
        return sb.toString();
    }
}
