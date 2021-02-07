package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * OutReadBy object
 */
public class OutReadBy implements Validable {
    @SerializedName("count")
    private Integer count;

    @SerializedName("member_ids")
    private List<Integer> memberIds;

    public Integer getCount() {
        return count;
    }

    public OutReadBy setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Integer> getMemberIds() {
        return memberIds;
    }

    public OutReadBy setMemberIds(List<Integer> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, memberIds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutReadBy outReadBy = (OutReadBy) o;
        return Objects.equals(memberIds, outReadBy.memberIds) &&
                Objects.equals(count, outReadBy.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("OutReadBy{");
        sb.append("memberIds=").append(memberIds);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
