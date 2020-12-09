package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * StoryStats object
 */
public class StoryStats implements Validable {
    @SerializedName("answer")
    @Required
    private StoryStatsStat answer;

    @SerializedName("bans")
    @Required
    private StoryStatsStat bans;

    @SerializedName("open_link")
    private StoryStatsStat openLink;

    @SerializedName("replies")
    @Required
    private StoryStatsStat replies;

    @SerializedName("shares")
    @Required
    private StoryStatsStat shares;

    @SerializedName("subscribers")
    @Required
    private StoryStatsStat subscribers;

    @SerializedName("views")
    @Required
    private StoryStatsStat views;

    @SerializedName("likes")
    @Required
    private StoryStatsStat likes;

    public StoryStatsStat getAnswer() {
        return answer;
    }

    public StoryStats setAnswer(StoryStatsStat answer) {
        this.answer = answer;
        return this;
    }

    public StoryStatsStat getBans() {
        return bans;
    }

    public StoryStats setBans(StoryStatsStat bans) {
        this.bans = bans;
        return this;
    }

    public StoryStatsStat getOpenLink() {
        return openLink;
    }

    public StoryStats setOpenLink(StoryStatsStat openLink) {
        this.openLink = openLink;
        return this;
    }

    public StoryStatsStat getReplies() {
        return replies;
    }

    public StoryStats setReplies(StoryStatsStat replies) {
        this.replies = replies;
        return this;
    }

    public StoryStatsStat getShares() {
        return shares;
    }

    public StoryStats setShares(StoryStatsStat shares) {
        this.shares = shares;
        return this;
    }

    public StoryStatsStat getSubscribers() {
        return subscribers;
    }

    public StoryStats setSubscribers(StoryStatsStat subscribers) {
        this.subscribers = subscribers;
        return this;
    }

    public StoryStatsStat getViews() {
        return views;
    }

    public StoryStats setViews(StoryStatsStat views) {
        this.views = views;
        return this;
    }

    public StoryStatsStat getLikes() {
        return likes;
    }

    public StoryStats setLikes(StoryStatsStat likes) {
        this.likes = likes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shares, answer, replies, subscribers, bans, openLink, views, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoryStats storyStats = (StoryStats) o;
        return Objects.equals(shares, storyStats.shares) &&
                Objects.equals(answer, storyStats.answer) &&
                Objects.equals(replies, storyStats.replies) &&
                Objects.equals(subscribers, storyStats.subscribers) &&
                Objects.equals(openLink, storyStats.openLink) &&
                Objects.equals(bans, storyStats.bans) &&
                Objects.equals(views, storyStats.views) &&
                Objects.equals(likes, storyStats.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StoryStats{");
        sb.append("shares=").append(shares);
        sb.append(", answer=").append(answer);
        sb.append(", replies=").append(replies);
        sb.append(", subscribers=").append(subscribers);
        sb.append(", openLink=").append(openLink);
        sb.append(", bans=").append(bans);
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
