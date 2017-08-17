package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Multi send error object
 */
public class MultiSendError {
    /**
     * Error code
     */
    @SerializedName("code")
    private Integer code;

    /**
     * Error message
     */
    @SerializedName("description")
    private String description;

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiSendError error = (MultiSendError) o;
        return Objects.equals(code, error.code) &&
                Objects.equals(description, error.description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Error{");
        sb.append("code=").append(code);
        sb.append(", description='").append(description).append("'");
        sb.append('}');
        return sb.toString();
    }
}
