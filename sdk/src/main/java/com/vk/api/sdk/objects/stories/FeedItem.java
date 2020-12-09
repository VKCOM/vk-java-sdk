package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.apps.AppMin;
import java.util.List;
import java.util.Objects;

/**
 * FeedItem object
 */
public class FeedItem implements Validable {
    /**
     * Type of Feed Item
     */
    @SerializedName("type")
    @Required
    private FeedItemType type;

    @SerializedName("id")
    private String id;

    /**
     * Author stories
     */
    @SerializedName("stories")
    private List<Story> stories;

    /**
     * Grouped stories of various authors (for types community_grouped_stories/app_grouped_stories type)
     */
    @SerializedName("grouped")
    private List<FeedItem> grouped;

    /**
     * App, which stories has been grouped (for type app_grouped_stories)
     */
    @SerializedName("app")
    private AppMin app;

    /**
     * Additional data for promo stories (for type promo_stories)
     */
    @SerializedName("promo_data")
    private PromoBlock promoData;

    @SerializedName("birthday_user_id")
    private Integer birthdayUserId;

    public FeedItemType getType() {
        return type;
    }

    public FeedItem setType(FeedItemType type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public FeedItem setId(String id) {
        this.id = id;
        return this;
    }

    public List<Story> getStories() {
        return stories;
    }

    public FeedItem setStories(List<Story> stories) {
        this.stories = stories;
        return this;
    }

    public List<FeedItem> getGrouped() {
        return grouped;
    }

    public FeedItem setGrouped(List<FeedItem> grouped) {
        this.grouped = grouped;
        return this;
    }

    public AppMin getApp() {
        return app;
    }

    public FeedItem setApp(AppMin app) {
        this.app = app;
        return this;
    }

    public PromoBlock getPromoData() {
        return promoData;
    }

    public FeedItem setPromoData(PromoBlock promoData) {
        this.promoData = promoData;
        return this;
    }

    public Integer getBirthdayUserId() {
        return birthdayUserId;
    }

    public FeedItem setBirthdayUserId(Integer birthdayUserId) {
        this.birthdayUserId = birthdayUserId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, stories, grouped, birthdayUserId, id, type, promoData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedItem feedItem = (FeedItem) o;
        return Objects.equals(app, feedItem.app) &&
                Objects.equals(promoData, feedItem.promoData) &&
                Objects.equals(stories, feedItem.stories) &&
                Objects.equals(grouped, feedItem.grouped) &&
                Objects.equals(id, feedItem.id) &&
                Objects.equals(type, feedItem.type) &&
                Objects.equals(birthdayUserId, feedItem.birthdayUserId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("FeedItem{");
        sb.append("app=").append(app);
        sb.append(", promoData=").append(promoData);
        sb.append(", stories=").append(stories);
        sb.append(", grouped=").append(grouped);
        sb.append(", id='").append(id).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", birthdayUserId=").append(birthdayUserId);
        sb.append('}');
        return sb.toString();
    }
}
