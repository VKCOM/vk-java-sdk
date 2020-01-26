package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * ListFull object
 */
public class ListFull extends List implements Validable {
    /**
     * Information whether reposts hiding is enabled
     */
    @SerializedName("no_reposts")
    private BoolInt noReposts;

    @SerializedName("source_ids")
    private java.util.List<Integer> sourceIds;

    public boolean isNoReposts() {
        return noReposts == BoolInt.YESBOOL;
    }

    public BoolInt getNoReposts() {
        return noReposts;
    }

    public java.util.List<Integer> getSourceIds() {
        return sourceIds;
    }

    public ListFull setSourceIds(java.util.List<Integer> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceIds, noReposts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListFull listFull = (ListFull) o;
        return Objects.equals(sourceIds, listFull.sourceIds) &&
                Objects.equals(noReposts, listFull.noReposts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ListFull{");
        sb.append("sourceIds=").append(sourceIds);
        sb.append(", noReposts=").append(noReposts);
        sb.append('}');
        return sb.toString();
    }
}
