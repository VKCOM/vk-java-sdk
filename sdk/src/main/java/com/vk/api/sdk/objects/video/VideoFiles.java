package com.vk.api.sdk.objects.video;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * VideoFiles object
 */
public class VideoFiles {

    /**
     * URL of the mpeg4 file with 240p quality
     */
    @SerializedName("mp_240")
    private String mp240;

    /**
     * URL of the mpeg4 file with 360p quality
     */
    @SerializedName("mp_360")
    private String mp360;

    /**
     * URL of the mpeg4 file with 480p quality
     */
    @SerializedName("mp_480")
    private String mp480;

    /**
     * URL of the mpeg4 file with 720p quality
     */
    @SerializedName("mp_720")
    private String mp720;

    /**
     * URL of the mpeg4 file with 1080p quality
     */
    @SerializedName("mp_1080")
    private String mp1080;

    /**
     * URL of the external player
     */
    @SerializedName("external")
    private String external;

    public String getMp240() {
        return mp240;
    }

    public String getMp360() {
        return mp360;
    }

    public String getMp480() {
        return mp480;
    }

    public String getMp720() {
        return mp720;
    }

    public String getMp1080() {
        return mp1080;
    }

    public String getExternal() {
        return external;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFiles that = (VideoFiles) o;
        return Objects.equals(mp240, that.mp240) &&
                Objects.equals(mp360, that.mp360) &&
                Objects.equals(mp480, that.mp480) &&
                Objects.equals(mp720, that.mp720) &&
                Objects.equals(mp1080, that.mp1080) &&
                Objects.equals(external, that.external);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mp240, mp360, mp480, mp720, mp1080, external);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoFiles{");
        sb.append("mp240='").append(mp240).append('\'');
        sb.append(", mp360='").append(mp360).append('\'');
        sb.append(", mp480='").append(mp480).append('\'');
        sb.append(", mp720='").append(mp720).append('\'');
        sb.append(", mp1080='").append(mp1080).append('\'');
        sb.append(", external='").append(external).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
