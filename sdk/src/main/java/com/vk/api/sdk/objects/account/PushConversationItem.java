package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * PushConversationItem object
 */
public class PushConversationItem {

    /**
     * Peer ID
     */
    @SerializedName("peer_id")
    private Integer peerId;

    /**
     * Information whether the sound are enabled
     */
    @SerializedName("sound")
    private BoolInt sound;

    /**
     * Time until that notifications are disabled in seconds
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    public Integer getPeerId() {
        return peerId;
    }

    public boolean isSound() {
        return sound == BoolInt.YES;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushConversationItem that = (PushConversationItem) o;
        return Objects.equals(peerId, that.peerId) &&
                sound == that.sound &&
                Objects.equals(disabledUntil, that.disabledUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, sound, disabledUntil);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushConversationItem{");
        sb.append("peerId=").append(peerId);
        sb.append(", sound=").append(sound);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append('}');
        return sb.toString();
    }
}
