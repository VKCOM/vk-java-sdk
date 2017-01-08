package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class FriendOffline implements Update {
    private final int userId;
    private final boolean timeout;

    public FriendOffline(int userId, boolean timeout) {
        this.userId = userId;
        this.timeout = timeout;
    }

    public int getUserId() {
        return userId;
    }

    public boolean isTimeout() {
        return timeout;
    }
}
