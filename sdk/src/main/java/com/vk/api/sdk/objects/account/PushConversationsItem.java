package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * PushConversationsItem object
 */
public class PushConversationsItem implements Validable {
    /**
     * Time until that notifications are disabled in seconds
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    /**
     * Peer ID
     */
    @SerializedName("peer_id")
    private Integer peerId;

    /**
     * Information whether the sound are enabled
     */
    @SerializedName("sound")
    @Required
    private BoolInt sound;

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public PushConversationsItem setDisabledUntil(Integer disabledUntil) {
        this.disabledUntil = disabledUntil;
        return this;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public PushConversationsItem setPeerId(Integer peerId) {
        this.peerId = peerId;
        return this;
    }

    public boolean isSound() {
        return sound == BoolInt.YES;
    }

    public BoolInt getSound() {
        return sound;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, sound, disabledUntil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushConversationsItem pushConversationsItem = (PushConversationsItem) o;
        return Objects.equals(disabledUntil, pushConversationsItem.disabledUntil) &&
                Objects.equals(sound, pushConversationsItem.sound) &&
                Objects.equals(peerId, pushConversationsItem.peerId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PushConversationsItem{");
        sb.append("disabledUntil=").append(disabledUntil);
        sb.append(", sound=").append(sound);
        sb.append(", peerId=").append(peerId);
        sb.append('}');
        return sb.toString();
    }
}
