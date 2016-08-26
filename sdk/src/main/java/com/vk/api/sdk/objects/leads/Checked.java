package com.vk.api.sdk.objects.leads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Checked object
 */
public class Checked {
    /**
     * Information whether user can start the lead
     */
    @SerializedName("result")
    private CheckedResult result;

    /**
     * Reason why user can't start the lead
     */
    @SerializedName("reason")
    private String reason;

    /**
     * URL user should open to start the lead
     */
    @SerializedName("start_link")
    private String startLink;

    /**
     * Session ID
     */
    @SerializedName("sid")
    private String sid;

    public CheckedResult getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public String getStartLink() {
        return startLink;
    }

    public String getSid() {
        return sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, reason, startLink, sid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checked checked = (Checked) o;
        return Objects.equals(result, checked.result) &&
                Objects.equals(reason, checked.reason) &&
                Objects.equals(startLink, checked.startLink) &&
                Objects.equals(sid, checked.sid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checked{");
        sb.append("result='").append(result).append("'");
        sb.append(", reason='").append(reason).append("'");
        sb.append(", startLink='").append(startLink).append("'");
        sb.append(", sid='").append(sid).append("'");
        sb.append('}');
        return sb.toString();
    }
}
