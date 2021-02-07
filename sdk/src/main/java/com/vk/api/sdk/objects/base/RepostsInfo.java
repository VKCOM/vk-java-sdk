package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Count of views
 */
public class RepostsInfo implements Validable {
    /**
     * Total reposts counter. Sum of wall and mail reposts counters
     */
    @SerializedName("count")
    @Required
    private Integer count;

    /**
     * Wall reposts counter
     */
    @SerializedName("wall_count")
    private Integer wallCount;

    /**
     * Mail reposts counter
     */
    @SerializedName("mail_count")
    private Integer mailCount;

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

    public Integer getWallCount() {
        return wallCount;
    }

    public RepostsInfo setWallCount(Integer wallCount) {
        this.wallCount = wallCount;
        return this;
    }

    public Integer getMailCount() {
        return mailCount;
    }

    public RepostsInfo setMailCount(Integer mailCount) {
        this.mailCount = mailCount;
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
        return Objects.hash(wallCount, count, mailCount, userReposted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepostsInfo repostsInfo = (RepostsInfo) o;
        return Objects.equals(mailCount, repostsInfo.mailCount) &&
                Objects.equals(count, repostsInfo.count) &&
                Objects.equals(userReposted, repostsInfo.userReposted) &&
                Objects.equals(wallCount, repostsInfo.wallCount);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("RepostsInfo{");
        sb.append("mailCount=").append(mailCount);
        sb.append(", count=").append(count);
        sb.append(", userReposted=").append(userReposted);
        sb.append(", wallCount=").append(wallCount);
        sb.append('}');
        return sb.toString();
    }
}
