package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * Error object
 */
public class Error implements Validable {
    /**
     * Error code
     */
    @SerializedName("error_code")
    private Integer errorCode;

    /**
     * Error subcode
     */
    @SerializedName("error_subcode")
    private Integer errorSubcode;

    /**
     * Error message
     */
    @SerializedName("error_msg")
    private String errorMsg;

    /**
     * Localized error message
     */
    @SerializedName("error_text")
    private String errorText;

    @SerializedName("request_params")
    private List<RequestParam> requestParams;

    public Integer getErrorCode() {
        return errorCode;
    }

    public Error setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Integer getErrorSubcode() {
        return errorSubcode;
    }

    public Error setErrorSubcode(Integer errorSubcode) {
        this.errorSubcode = errorSubcode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Error setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorText() {
        return errorText;
    }

    public Error setErrorText(String errorText) {
        this.errorText = errorText;
        return this;
    }

    public List<RequestParam> getRequestParams() {
        return requestParams;
    }

    public Error setRequestParams(List<RequestParam> requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorText, errorSubcode, requestParams, errorCode, errorMsg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(errorText, error.errorText) &&
                Objects.equals(errorMsg, error.errorMsg) &&
                Objects.equals(requestParams, error.requestParams) &&
                Objects.equals(errorCode, error.errorCode) &&
                Objects.equals(errorSubcode, error.errorSubcode);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Error{");
        sb.append("errorText='").append(errorText).append("'");
        sb.append(", errorMsg='").append(errorMsg).append("'");
        sb.append(", requestParams=").append(requestParams);
        sb.append(", errorCode=").append(errorCode);
        sb.append(", errorSubcode=").append(errorSubcode);
        sb.append('}');
        return sb.toString();
    }
}
