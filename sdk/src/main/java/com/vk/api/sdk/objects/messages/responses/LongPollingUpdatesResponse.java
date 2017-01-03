package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Denis Kokorin
 */
public class LongPollingUpdatesResponse {
    @SerializedName("ts")
    private Integer ts;

    @SerializedName("updates")
    private Object[][] updates;

    public Integer getTs() {
        return ts;
    }

    public Object[][] getUpdates() {
        return updates;
    }
}
