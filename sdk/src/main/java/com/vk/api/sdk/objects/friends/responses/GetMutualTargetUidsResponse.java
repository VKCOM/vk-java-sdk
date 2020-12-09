package com.vk.api.sdk.objects.friends.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.List;
import java.util.Objects;

/**
 * GetMutualTargetUidsResponse object
 */
public class GetMutualTargetUidsResponse implements Validable {
    /**
     * Total mutual friends number
     */
    @SerializedName("common_count")
    private Integer commonCount;

    @SerializedName("common_friends")
    private List<Integer> commonFriends;

    /**
     * User ID
     */
    @SerializedName("id")
    private Integer id;

    public Integer getCommonCount() {
        return commonCount;
    }

    public GetMutualTargetUidsResponse setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
        return this;
    }

    public List<Integer> getCommonFriends() {
        return commonFriends;
    }

    public GetMutualTargetUidsResponse setCommonFriends(List<Integer> commonFriends) {
        this.commonFriends = commonFriends;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GetMutualTargetUidsResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonFriends, id, commonCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMutualTargetUidsResponse getMutualTargetUidsResponse = (GetMutualTargetUidsResponse) o;
        return Objects.equals(commonCount, getMutualTargetUidsResponse.commonCount) &&
                Objects.equals(commonFriends, getMutualTargetUidsResponse.commonFriends) &&
                Objects.equals(id, getMutualTargetUidsResponse.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetMutualTargetUidsResponse{");
        sb.append("commonCount=").append(commonCount);
        sb.append(", commonFriends=").append(commonFriends);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
