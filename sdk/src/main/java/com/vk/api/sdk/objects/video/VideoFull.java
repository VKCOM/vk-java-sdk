package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * VideoFull object
 */
public class VideoFull extends Video implements Validable {
    @SerializedName("files")
    private VideoFiles files;

    /**
     * Settings for live stream
     */
    @SerializedName("live_settings")
    private LiveSettings liveSettings;

    public VideoFiles getFiles() {
        return files;
    }

    public VideoFull setFiles(VideoFiles files) {
        this.files = files;
        return this;
    }

    public LiveSettings getLiveSettings() {
        return liveSettings;
    }

    public VideoFull setLiveSettings(LiveSettings liveSettings) {
        this.liveSettings = liveSettings;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(files, liveSettings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFull videoFull = (VideoFull) o;
        return Objects.equals(files, videoFull.files) &&
                Objects.equals(liveSettings, videoFull.liveSettings);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoFull{");
        sb.append("files=").append(files);
        sb.append(", liveSettings=").append(liveSettings);
        sb.append('}');
        return sb.toString();
    }
}
