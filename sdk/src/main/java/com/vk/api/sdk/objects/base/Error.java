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
     * Error message
     */
    @SerializedName("error_msg")
    private String errorMsg;

    @SerializedName("request_params")
    private List<RequestParam> requestParams;

    public Integer getErrorCode() {
        return errorCode;
    }

    public Error setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public Error setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
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
        return Objects.hash(requestParams, errorCode, errorMsg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(errorMsg, error.errorMsg) &&
                Objects.equals(requestParams, error.requestParams) &&
                Objects.equals(errorCode, error.errorCode);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Error{");
        sb.append("errorMsg='").append(errorMsg).append("'");
        sb.append(", requestParams=").append(requestParams);
        sb.append(", errorCode=").append(errorCode);
        sb.append('}');
        return sb.toString();
    }
}
