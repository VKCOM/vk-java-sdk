package com.vk.api.sdk.objects.audio.responses;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * AudioUploadResponse object
 */
public class AudioUploadResponse {
    /**
     * Redirect URL
     */
    @SerializedName("redirect")
    private String redirect;

    /**
     * Upload server number
     */
    @SerializedName("server")
    private Integer server;

    /**
     * Uploaded aduio data
     */
    @SerializedName("audio")
    private String audio;

    /**
     * Uploading hash
     */
    @SerializedName("hash")
    private String hash;

    public String getRedirect() {
        return redirect;
    }

    public Integer getServer() {
        return server;
    }

    public String getAudio() {
        return audio;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirect, server, audio, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioUploadResponse audioUploadResponse = (AudioUploadResponse) o;
        return Objects.equals(redirect, audioUploadResponse.redirect) &&
                Objects.equals(server, audioUploadResponse.server) &&
                Objects.equals(audio, audioUploadResponse.audio) &&
                Objects.equals(hash, audioUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioUploadResponse{");
        sb.append("redirect='").append(redirect).append("'");
        sb.append(", server=").append(server);
        sb.append(", audio='").append(audio).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
