package com.vk.api.sdk.objects.stories.responses;


import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.stories.StatsStat;

import java.util.Objects;

public class GetStatsResponse {

    @SerializedName("views")
    private StatsStat views;

    @SerializedName("replies")
    private StatsStat replies;

    @SerializedName("answer")
    private StatsStat answer;

    @SerializedName("shares")
    private StatsStat shares;

    @SerializedName("subscribers")
    private StatsStat subscribers;

    @SerializedName("bans")
    private StatsStat bans;

    @SerializedName("open_link")
    private StatsStat openLink;

    public StatsStat getViews() {
        return views;
    }

    public StatsStat getReplies() {
        return replies;
    }

    public StatsStat getAnswer() {
        return answer;
    }

    public StatsStat getShares() {
        return shares;
    }

    public StatsStat getSubscribers() {
        return subscribers;
    }

    public StatsStat getBans() {
        return bans;
    }

    public StatsStat getOpenLink() {
        return openLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetStatsResponse that = (GetStatsResponse) o;
        return Objects.equals(views, that.views) &&
            Objects.equals(replies, that.replies) &&
            Objects.equals(answer, that.answer) &&
            Objects.equals(shares, that.shares) &&
            Objects.equals(subscribers, that.subscribers) &&
            Objects.equals(bans, that.bans) &&
            Objects.equals(openLink, that.openLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(views, replies, answer, shares, subscribers, bans, openLink);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetStatsResponse{");
        sb.append("views=").append(views);
        sb.append(", replies=").append(replies);
        sb.append(", answer=").append(answer);
        sb.append(", shares=").append(shares);
        sb.append(", subscribers=").append(subscribers);
        sb.append(", bans=").append(bans);
        sb.append(", openLink=").append(openLink);
        sb.append('}');
        return sb.toString();
    }
}
