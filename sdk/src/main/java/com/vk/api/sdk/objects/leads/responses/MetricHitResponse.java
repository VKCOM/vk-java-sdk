package com.vk.api.sdk.objects.leads.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * MetricHitResponse object
 */
public class MetricHitResponse implements Validable {
    /**
     * Information whether request has been processed successfully
     */
    @SerializedName("result")
    private Boolean result;

    /**
     * Redirect link
     */
    @SerializedName("redirect_link")
    private String redirectLink;

    public Boolean getResult() {
        return result;
    }

    public MetricHitResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }

    public String getRedirectLink() {
        return redirectLink;
    }

    public MetricHitResponse setRedirectLink(String redirectLink) {
        this.redirectLink = redirectLink;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, redirectLink);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetricHitResponse metricHitResponse = (MetricHitResponse) o;
        return Objects.equals(result, metricHitResponse.result) &&
                Objects.equals(redirectLink, metricHitResponse.redirectLink);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MetricHitResponse{");
        sb.append("result=").append(result);
        sb.append(", redirectLink='").append(redirectLink).append("'");
        sb.append('}');
        return sb.toString();
    }
}
