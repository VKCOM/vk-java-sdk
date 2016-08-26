package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CreateTargetGroupResponse object
 */
public class CreateTargetGroupResponse {
    /**
     * Group ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Pixel code
     */
    @SerializedName("pixel")
    private String pixel;

    public Integer getId() {
        return id;
    }

    public String getPixel() {
        return pixel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pixel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTargetGroupResponse createTargetGroupResponse = (CreateTargetGroupResponse) o;
        return Objects.equals(id, createTargetGroupResponse.id) &&
                Objects.equals(pixel, createTargetGroupResponse.pixel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateTargetGroupResponse{");
        sb.append("id=").append(id);
        sb.append(", pixel='").append(pixel).append("'");
        sb.append('}');
        return sb.toString();
    }
}
