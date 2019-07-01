package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Start object
 */
public class Start implements Validable {
    /**
     * Information whether test mode is enabled
     */
    @SerializedName("test_mode")
    private BoolInt testMode;

    /**
     * Session data
     */
    @SerializedName("vk_sid")
    private String vkSid;

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public BoolInt getTestMode() {
        return testMode;
    }

    public String getVkSid() {
        return vkSid;
    }

    public Start setVkSid(String vkSid) {
        this.vkSid = vkSid;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testMode, vkSid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Start start = (Start) o;
        return Objects.equals(testMode, start.testMode) &&
                Objects.equals(vkSid, start.vkSid);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Start{");
        sb.append("testMode=").append(testMode);
        sb.append(", vkSid='").append(vkSid).append("'");
        sb.append('}');
        return sb.toString();
    }
}
