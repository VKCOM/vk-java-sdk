package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetCallbackConfirmationCodeResponse object
 */
public class GetCallbackConfirmationCodeResponse implements Validable {
    /**
     * Confirmation code
     */
    @SerializedName("code")
    @Required
    private String code;

    public String getCode() {
        return code;
    }

    public GetCallbackConfirmationCodeResponse setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackConfirmationCodeResponse getCallbackConfirmationCodeResponse = (GetCallbackConfirmationCodeResponse) o;
        return Objects.equals(code, getCallbackConfirmationCodeResponse.code);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCallbackConfirmationCodeResponse{");
        sb.append("code='").append(code).append("'");
        sb.append('}');
        return sb.toString();
    }
}
