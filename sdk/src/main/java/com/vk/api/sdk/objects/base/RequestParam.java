package com.vk.api.sdk.objects.base;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * RequestParam object
 */
public class RequestParam {
    /**
     * Parameter name
     */
    @SerializedName("key")
    private String key;

    /**
     * Parameter value
     */
    @SerializedName("value")
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestParam requestParam = (RequestParam) o;
        return Objects.equals(key, requestParam.key) &&
                Objects.equals(value, requestParam.value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestParam{");
        sb.append("key='").append(key).append("'");
        sb.append(", value='").append(value).append("'");
        sb.append('}');
        return sb.toString();
    }
}
