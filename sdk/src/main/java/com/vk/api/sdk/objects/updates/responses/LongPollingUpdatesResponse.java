package com.vk.api.sdk.objects.updates.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.updates.Update;

import java.util.List;

/**
 * @author Denis Kokorin
 */
public class LongPollingUpdatesResponse {
    @SerializedName("ts")
    private Integer ts;

    @SerializedName("pts")
    private Integer pts;

    @SerializedName("updates")
    private List<Update> updates;

    public Integer getTs() {
        return ts;
    }

    public List<Update> getUpdates() {
        return updates;
    }
}
