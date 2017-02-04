package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class UserMadeCall implements Update {
    private final int userId;
    private final int callId;

    public UserMadeCall(int userId, int callId) {
        this.userId = userId;
        this.callId = callId;
    }

    public int getUserId() {
        return userId;
    }

    public int getCallId() {
        return callId;
    }
}
