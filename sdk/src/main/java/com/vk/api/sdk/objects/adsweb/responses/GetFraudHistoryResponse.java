package com.vk.api.sdk.objects.adsweb.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetFraudHistoryResponse object
 */
public class GetFraudHistoryResponse implements Validable {
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("entries")
    private List<GetFraudHistoryResponseEntriesEntry> entries;

    public Integer getCount() {
        return count;
    }

    public GetFraudHistoryResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<GetFraudHistoryResponseEntriesEntry> getEntries() {
        return entries;
    }

    public GetFraudHistoryResponse setEntries(List<GetFraudHistoryResponseEntriesEntry> entries) {
        this.entries = entries;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entries, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFraudHistoryResponse getFraudHistoryResponse = (GetFraudHistoryResponse) o;
        return Objects.equals(entries, getFraudHistoryResponse.entries) &&
                Objects.equals(count, getFraudHistoryResponse.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetFraudHistoryResponse{");
        sb.append("entries=").append(entries);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
