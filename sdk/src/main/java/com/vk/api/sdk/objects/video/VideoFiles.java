package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * VideoFiles object
 */
public class VideoFiles implements Validable {
    /**
     * URL of the external player
     */
    @SerializedName("external")
    private URI external;

    /**
     * URL of the mpeg4 file with 240p quality
     */
    @SerializedName("mp4_240")
    private URI mp4240;

    /**
     * URL of the mpeg4 file with 360p quality
     */
    @SerializedName("mp4_360")
    private URI mp4360;

    /**
     * URL of the mpeg4 file with 480p quality
     */
    @SerializedName("mp4_480")
    private URI mp4480;

    /**
     * URL of the mpeg4 file with 720p quality
     */
    @SerializedName("mp4_720")
    private URI mp4720;

    /**
     * URL of the mpeg4 file with 1080p quality
     */
    @SerializedName("mp4_1080")
    private URI mp41080;

    /**
     * URL of the flv file with 320p quality
     */
    @SerializedName("flv_320")
    private URI flv320;

    public URI getExternal() {
        return external;
    }

    public VideoFiles setExternal(URI external) {
        this.external = external;
        return this;
    }

    public URI getMp4240() {
        return mp4240;
    }

    public VideoFiles setMp4240(URI mp4240) {
        this.mp4240 = mp4240;
        return this;
    }

    public URI getMp4360() {
        return mp4360;
    }

    public VideoFiles setMp4360(URI mp4360) {
        this.mp4360 = mp4360;
        return this;
    }

    public URI getMp4480() {
        return mp4480;
    }

    public VideoFiles setMp4480(URI mp4480) {
        this.mp4480 = mp4480;
        return this;
    }

    public URI getMp4720() {
        return mp4720;
    }

    public VideoFiles setMp4720(URI mp4720) {
        this.mp4720 = mp4720;
        return this;
    }

    public URI getMp41080() {
        return mp41080;
    }

    public VideoFiles setMp41080(URI mp41080) {
        this.mp41080 = mp41080;
        return this;
    }

    public URI getFlv320() {
        return flv320;
    }

    public VideoFiles setFlv320(URI flv320) {
        this.flv320 = flv320;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mp41080, external, mp4720, flv320, mp4480, mp4360, mp4240);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFiles videoFiles = (VideoFiles) o;
        return Objects.equals(mp4480, videoFiles.mp4480) &&
                Objects.equals(mp4360, videoFiles.mp4360) &&
                Objects.equals(external, videoFiles.external) &&
                Objects.equals(mp41080, videoFiles.mp41080) &&
                Objects.equals(flv320, videoFiles.flv320) &&
                Objects.equals(mp4720, videoFiles.mp4720) &&
                Objects.equals(mp4240, videoFiles.mp4240);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFiles{");
        sb.append("mp4480=").append(mp4480);
        sb.append(", mp4360=").append(mp4360);
        sb.append(", external=").append(external);
        sb.append(", mp41080=").append(mp41080);
        sb.append(", flv320=").append(flv320);
        sb.append(", mp4720=").append(mp4720);
        sb.append(", mp4240=").append(mp4240);
        sb.append('}');
        return sb.toString();
    }
}
