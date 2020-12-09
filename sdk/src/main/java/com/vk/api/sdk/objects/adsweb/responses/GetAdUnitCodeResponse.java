package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetAdUnitCodeResponse object
 */
public class GetAdUnitCodeResponse implements Validable {
    @SerializedName("html")
    @Required
    private String html;

    public String getHtml() {
        return html;
    }

    public GetAdUnitCodeResponse setHtml(String html) {
        this.html = html;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(html);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAdUnitCodeResponse getAdUnitCodeResponse = (GetAdUnitCodeResponse) o;
        return Objects.equals(html, getAdUnitCodeResponse.html);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAdUnitCodeResponse{");
        sb.append("html='").append(html).append("'");
        sb.append('}');
        return sb.toString();
    }
}
