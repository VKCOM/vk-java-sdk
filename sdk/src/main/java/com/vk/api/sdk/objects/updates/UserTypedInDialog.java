package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class UserTypedInDialog implements Update {
    private final int userId;

    public UserTypedInDialog(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
