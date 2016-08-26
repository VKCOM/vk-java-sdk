package com.vk.api.sdk.objects.widgets.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.widgets.WidgetPage;

import java.util.List;
import java.util.Objects;

/**
 * GetPagesResponse object
 */
public class GetPagesResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("pages")
    private List<WidgetPage> pages;

    public Integer getCount() {
        return count;
    }

    public List<WidgetPage> getPages() {
        return pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPagesResponse getPagesResponse = (GetPagesResponse) o;
        return Objects.equals(count, getPagesResponse.count) &&
                Objects.equals(pages, getPagesResponse.pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetPagesResponse{");
        sb.append("count=").append(count);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
