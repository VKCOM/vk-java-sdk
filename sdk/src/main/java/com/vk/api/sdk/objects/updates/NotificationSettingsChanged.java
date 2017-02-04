package com.vk.api.sdk.objects.updates;

import java.time.Instant;

/**
 * @author Denis Kokorin
 */
public class NotificationSettingsChanged implements Update {
    private final int peerId;
    private final boolean soundOn;
    private final Instant disabledUntil;
    private final boolean disabled;

    public NotificationSettingsChanged(int peerId, boolean soundOn, Instant disabledUntil, boolean disabled) {
        this.peerId = peerId;
        this.soundOn = soundOn;
        this.disabledUntil = disabledUntil;
        this.disabled = disabled;
    }

    public int getPeerId() {
        return peerId;
    }

    public boolean isSoundOn() {
        return soundOn;
    }

    public Instant getDisabledUntil() {
        return disabledUntil;
    }

    public boolean isDisabled() {
        return disabled;
    }
}
