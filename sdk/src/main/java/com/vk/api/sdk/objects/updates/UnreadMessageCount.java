package com.vk.api.sdk.objects.updates;

/**
 * @author Denis Kokorin
 */
public class UnreadMessageCount implements Update{
    private final int count;

    public UnreadMessageCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
