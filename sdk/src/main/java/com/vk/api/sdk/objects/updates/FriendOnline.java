package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class FriendOnline implements Update {
    private final Integer userId;
    private final Platform platform;

    public FriendOnline(Integer userId, Platform platform) {
        this.userId = userId;
        this.platform = platform;
    }

    public Integer getUserId() {
        return userId;
    }

    public Platform getPlatform() {
        return platform;
    }
}
