package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * List object
 */
public class NewsfeedListExtended {
    /**
     * List ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * List title
     */
    @SerializedName("title")
    private String title;

    /**
     * Information whether reposts hiding is enabled
     */
    @SerializedName("no_reposts")
    private BoolInt noReposts;

    @SerializedName("source_ids")
    private List<Integer> sourceIds;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isNoReposts() {
        return noReposts == BoolInt.YES;
    }

    public List<Integer> getSourceIds() {
        return sourceIds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, noReposts, sourceIds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedListExtended list = (NewsfeedListExtended) o;
        return Objects.equals(id, list.id) &&
                Objects.equals(title, list.title) &&
                Objects.equals(noReposts, list.noReposts) &&
                Objects.equals(sourceIds, list.sourceIds);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedList{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", noReposts=").append(noReposts);
        sb.append(", sourceIds=").append(sourceIds);
        sb.append('}');
        return sb.toString();
    }
}
