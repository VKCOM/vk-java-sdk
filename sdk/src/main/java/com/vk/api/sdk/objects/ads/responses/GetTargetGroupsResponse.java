package com.vk.api.sdk.objects.ads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GetTargetGroupsResponse object
 */
public class GetTargetGroupsResponse implements Validable {
    /**
     * Audience
     */
    @SerializedName("audience_count")
    private Integer audienceCount;

    /**
     * Site domain
     */
    @SerializedName("domain")
    private String domain;

    /**
     * Group ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Number of days for user to be in group
     */
    @SerializedName("lifetime")
    private Integer lifetime;

    /**
     * Group name
     */
    @SerializedName("name")
    private String name;

    /**
     * Pixel code
     */
    @SerializedName("pixel")
    private String pixel;

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public GetTargetGroupsResponse setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public GetTargetGroupsResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetTargetGroupsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getLifetime() {
        return lifetime;
    }

    public GetTargetGroupsResponse setLifetime(Integer lifetime) {
        this.lifetime = lifetime;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTargetGroupsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPixel() {
        return pixel;
    }

    public GetTargetGroupsResponse setPixel(String pixel) {
        this.pixel = pixel;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, audienceCount, lifetime, name, id, pixel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTargetGroupsResponse getTargetGroupsResponse = (GetTargetGroupsResponse) o;
        return Objects.equals(domain, getTargetGroupsResponse.domain) &&
                Objects.equals(audienceCount, getTargetGroupsResponse.audienceCount) &&
                Objects.equals(lifetime, getTargetGroupsResponse.lifetime) &&
                Objects.equals(name, getTargetGroupsResponse.name) &&
                Objects.equals(id, getTargetGroupsResponse.id) &&
                Objects.equals(pixel, getTargetGroupsResponse.pixel);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTargetGroupsResponse{");
        sb.append("domain='").append(domain).append("'");
        sb.append(", audienceCount=").append(audienceCount);
        sb.append(", lifetime=").append(lifetime);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", pixel='").append(pixel).append("'");
        sb.append('}');
        return sb.toString();
    }
}
