package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DuplicateResult object
 */
public class DuplicateResult implements Validable {
    /**
     * Need to upload or not
     */
    @SerializedName("duplicated")
    private Boolean duplicated;

    public Boolean getDuplicated() {
        return duplicated;
    }

    public DuplicateResult setDuplicated(Boolean duplicated) {
        this.duplicated = duplicated;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(duplicated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuplicateResult duplicateResult = (DuplicateResult) o;
        return Objects.equals(duplicated, duplicateResult.duplicated);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DuplicateResult{");
        sb.append("duplicated=").append(duplicated);
        sb.append('}');
        return sb.toString();
    }
}
