package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * TargetGroup object
 */
public class TargetGroup {
    /**
     * Group ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Group name
     */
    @SerializedName("name")
    private String name;

    /**
     * Site domain
     */
    @SerializedName("domain")
    private String domain;

    /**
     * Audience
     */
    @SerializedName("audience_count")
    private Integer audienceCount;

    /**
     * Number of days for user to be in group
     */
    @SerializedName("lifetime")
    private Integer lifetime;

    /**
     * Pixel code
     */
    @SerializedName("pixel")
    private String pixel;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public Integer getLifetime() {
        return lifetime;
    }

    public String getPixel() {
        return pixel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, name, audienceCount, lifetime, id, pixel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetGroup targetGroup = (TargetGroup) o;
        return Objects.equals(id, targetGroup.id) &&
                Objects.equals(name, targetGroup.name) &&
                Objects.equals(domain, targetGroup.domain) &&
                Objects.equals(audienceCount, targetGroup.audienceCount) &&
                Objects.equals(lifetime, targetGroup.lifetime) &&
                Objects.equals(pixel, targetGroup.pixel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargetGroup{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", domain='").append(domain).append("'");
        sb.append(", audienceCount=").append(audienceCount);
        sb.append(", lifetime=").append(lifetime);
        sb.append(", pixel='").append(pixel).append("'");
        sb.append('}');
        return sb.toString();
    }
}
