package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * PushSettings object
 */
public class PushSettings implements Validable {
    /**
     * Information whether push notifications are disabled forever
     */
    @SerializedName("disabled_forever")
    private Boolean disabledForever;

    /**
     * Time until what notifications are disabled
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    /**
     * Information whether the sound is on
     */
    @SerializedName("no_sound")
    private Boolean noSound;

    public Boolean getDisabledForever() {
        return disabledForever;
    }

    public PushSettings setDisabledForever(Boolean disabledForever) {
        this.disabledForever = disabledForever;
        return this;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public PushSettings setDisabledUntil(Integer disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public Boolean getNoSound() {
        return noSound;
    }

    public PushSettings setNoSound(Boolean noSound) {
        this.noSound = noSound;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(disabledForever, noSound, disabledUntil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushSettings pushSettings = (PushSettings) o;
        return Objects.equals(disabledUntil, pushSettings.disabledUntil) &&
                Objects.equals(disabledForever, pushSettings.disabledForever) &&
                Objects.equals(noSound, pushSettings.noSound);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PushSettings{");
        sb.append("disabledUntil=").append(disabledUntil);
        sb.append(", disabledForever=").append(disabledForever);
        sb.append(", noSound=").append(noSound);
        sb.append('}');
        return sb.toString();
    }
}
