package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * RepostsInfo object
 */
public class RepostsInfo implements Validable {
    /**
     * Reposts number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Information whether current user has reposted the post
     */
    @SerializedName("user_reposted")
    private Integer userReposted;

    public Integer getCount() {
        return count;
    }

    public RepostsInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getUserReposted() {
        return userReposted;
    }

    public RepostsInfo setUserReposted(Integer userReposted) {
        this.userReposted = userReposted;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userReposted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepostsInfo repostsInfo = (RepostsInfo) o;
        return Objects.equals(count, repostsInfo.count) &&
                Objects.equals(userReposted, repostsInfo.userReposted);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("RepostsInfo{");
        sb.append("count=").append(count);
        sb.append(", userReposted=").append(userReposted);
        sb.append('}');
        return sb.toString();
    }
}
