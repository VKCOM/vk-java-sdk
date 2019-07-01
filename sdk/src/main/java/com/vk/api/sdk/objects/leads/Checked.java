package com.vk.api.sdk.objects.leads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URL;
import java.util.Objects;

/**
 * Checked object
 */
public class Checked implements Validable {
    /**
     * Reason why user can't start the lead
     */
    @SerializedName("reason")
    private String reason;

    @SerializedName("result")
    private CheckedResult result;

    /**
     * Session ID
     */
    @SerializedName("sid")
    private String sid;

    /**
     * URL user should open to start the lead
     */
    @SerializedName("start_link")
    private URL startLink;

    public String getReason() {
        return reason;
    }

    public Checked setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public CheckedResult getResult() {
        return result;
    }

    public Checked setResult(CheckedResult result) {
        this.result = result;
        return this;
    }

    public String getSid() {
        return sid;
    }

    public Checked setSid(String sid) {
        this.sid = sid;
        return this;
    }

    public URL getStartLink() {
        return startLink;
    }

    public Checked setStartLink(URL startLink) {
        this.startLink = startLink;
        return this;
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
                Objects.equals(sid, checked.sid) &&
                Objects.equals(startLink, checked.startLink);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Checked{");
        sb.append("result=").append(result);
        sb.append(", reason='").append(reason).append("'");
        sb.append(", sid='").append(sid).append("'");
        sb.append(", startLink=").append(startLink);
        sb.append('}');
        return sb.toString();
    }
}
