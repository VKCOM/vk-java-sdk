package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * MessageActionPhoto object
 */
public class MessageActionPhoto implements Validable {
    /**
     * URL of the preview image with 100px in width
     */
    @SerializedName("photo_100")
    private URL photo100;

    /**
     * URL of the preview image with 200px in width
     */
    @SerializedName("photo_200")
    private URL photo200;

    /**
     * URL of the preview image with 50px in width
     */
    @SerializedName("photo_50")
    private URL photo50;

    public URL getPhoto100() {
        return photo100;
    }

    public MessageActionPhoto setPhoto100(URL photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URL getPhoto200() {
        return photo200;
    }

    public MessageActionPhoto setPhoto200(URL photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URL getPhoto50() {
        return photo50;
    }

    public MessageActionPhoto setPhoto50(URL photo50) {
        this.photo50 = photo50;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, photo50, photo200);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageActionPhoto messageActionPhoto = (MessageActionPhoto) o;
        return Objects.equals(photo50, messageActionPhoto.photo50) &&
                Objects.equals(photo100, messageActionPhoto.photo100) &&
                Objects.equals(photo200, messageActionPhoto.photo200);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageActionPhoto{");
        sb.append("photo50=").append(photo50);
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append('}');
        return sb.toString();
    }
}
