package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.net.URL;
import java.util.Objects;

/**
 * VideoFiles object
 */
public class VideoFiles {
    /**
     * URL of the external player
     */
    @SerializedName("external")
    private URL external;

    /**
     * URL of the mpeg4 file with 1080p quality
     */
    @SerializedName("mp_1080")
    private URL mp1080;

    /**
     * URL of the mpeg4 file with 240p quality
     */
    @SerializedName("mp_240")
    private URL mp240;

    /**
     * URL of the mpeg4 file with 360p quality
     */
    @SerializedName("mp_360")
    private URL mp360;

    /**
     * URL of the mpeg4 file with 480p quality
     */
    @SerializedName("mp_480")
    private URL mp480;

    /**
     * URL of the mpeg4 file with 720p quality
     */
    @SerializedName("mp_720")
    private URL mp720;

    public URL getExternal() {
        return external;
    }

    public VideoFiles setExternal(URL external) {
        this.external = external;
        return this;
    }

    public URL getMp1080() {
        return mp1080;
    }

    public VideoFiles setMp1080(URL mp1080) {
        this.mp1080 = mp1080;
        return this;
    }

    public URL getMp240() {
        return mp240;
    }

    public VideoFiles setMp240(URL mp240) {
        this.mp240 = mp240;
        return this;
    }

    public URL getMp360() {
        return mp360;
    }

    public VideoFiles setMp360(URL mp360) {
        this.mp360 = mp360;
        return this;
    }

    public URL getMp480() {
        return mp480;
    }

    public VideoFiles setMp480(URL mp480) {
        this.mp480 = mp480;
        return this;
    }

    public URL getMp720() {
        return mp720;
    }

    public VideoFiles setMp720(URL mp720) {
        this.mp720 = mp720;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mp720, external, mp240, mp360, mp480, mp1080);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFiles videoFiles = (VideoFiles) o;
        return Objects.equals(external, videoFiles.external) &&
                Objects.equals(mp1080, videoFiles.mp1080) &&
                Objects.equals(mp240, videoFiles.mp240) &&
                Objects.equals(mp480, videoFiles.mp480) &&
                Objects.equals(mp360, videoFiles.mp360) &&
                Objects.equals(mp720, videoFiles.mp720);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFiles{");
        sb.append("external=").append(external);
        sb.append(", mp1080=").append(mp1080);
        sb.append(", mp240=").append(mp240);
        sb.append(", mp480=").append(mp480);
        sb.append(", mp360=").append(mp360);
        sb.append(", mp720=").append(mp720);
        sb.append('}');
        return sb.toString();
    }
}
