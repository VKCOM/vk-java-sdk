package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * GetCallbackConfirmationCodeResponse object
 */
public class GetCallbackConfirmationCodeResponse {
    /**
     * Confirmation code
     */
    @SerializedName("code")
    private String code;

    public String getCode() {
        return code;
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
        final StringBuilder sb = new StringBuilder("GetCallbackConfirmationCodeResponse{");
        sb.append("code='").append(code).append("'");
        sb.append('}');
        return sb.toString();
    }
}
