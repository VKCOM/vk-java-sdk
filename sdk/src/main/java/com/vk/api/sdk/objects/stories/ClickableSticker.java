package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.apps.AppMin;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.polls.Poll;
import java.util.List;
import java.util.Objects;

/**
 * ClickableSticker object
 */
public class ClickableSticker implements Validable {
    @SerializedName("clickable_area")
    private List<ClickableArea> clickableArea;

    /**
     * Clickable sticker ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("hashtag")
    private String hashtag;

    @SerializedName("link_object")
    private Link linkObject;

    @SerializedName("mention")
    private String mention;

    @SerializedName("tooltip_text")
    private String tooltipText;

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("story_id")
    private Integer storyId;

    @SerializedName("question")
    private String question;

    @SerializedName("question_button")
    private String questionButton;

    @SerializedName("place_id")
    private Integer placeId;

    @SerializedName("market_item")
    private MarketItem marketItem;

    @SerializedName("audio")
    private Audio audio;

    @SerializedName("audio_start_time")
    private Integer audioStartTime;

    @SerializedName("style")
    private ClickableStickerStyle style;

    @SerializedName("type")
    @Required
    private ClickableStickerType type;

    @SerializedName("subtype")
    private ClickableStickerSubtype subtype;

    @SerializedName("post_owner_id")
    private Integer postOwnerId;

    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("poll")
    private Poll poll;

    /**
     * Color, hex format
     */
    @SerializedName("color")
    private String color;

    /**
     * Sticker ID
     */
    @SerializedName("sticker_id")
    private Integer stickerId;

    /**
     * Sticker pack ID
     */
    @SerializedName("sticker_pack_id")
    private Integer stickerPackId;

    @SerializedName("app")
    private AppMin app;

    /**
     * Additional context for app sticker
     */
    @SerializedName("app_context")
    private String appContext;

    /**
     * Whether current user has unread interaction with this app
     */
    @SerializedName("has_new_interactions")
    private Boolean hasNewInteractions;

    /**
     * Whether current user allowed broadcast notify from this app
     */
    @SerializedName("is_broadcast_notify_allowed")
    private Boolean isBroadcastNotifyAllowed;

    @SerializedName("situational_theme_id")
    private Integer situationalThemeId;

    @SerializedName("situational_app_url")
    private String situationalAppUrl;

    public List<ClickableArea> getClickableArea() {
        return clickableArea;
    }

    public ClickableSticker setClickableArea(List<ClickableArea> clickableArea) {
        this.clickableArea = clickableArea;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ClickableSticker setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getHashtag() {
        return hashtag;
    }

    public ClickableSticker setHashtag(String hashtag) {
        this.hashtag = hashtag;
        return this;
    }

    public Link getLinkObject() {
        return linkObject;
    }

    public ClickableSticker setLinkObject(Link linkObject) {
        this.linkObject = linkObject;
        return this;
    }

    public String getMention() {
        return mention;
    }

    public ClickableSticker setMention(String mention) {
        this.mention = mention;
        return this;
    }

    public String getTooltipText() {
        return tooltipText;
    }

    public ClickableSticker setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public ClickableSticker setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getStoryId() {
        return storyId;
    }

    public ClickableSticker setStoryId(Integer storyId) {
        this.storyId = storyId;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public ClickableSticker setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getQuestionButton() {
        return questionButton;
    }

    public ClickableSticker setQuestionButton(String questionButton) {
        this.questionButton = questionButton;
        return this;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public ClickableSticker setPlaceId(Integer placeId) {
        this.placeId = placeId;
        return this;
    }

    public MarketItem getMarketItem() {
        return marketItem;
    }

    public ClickableSticker setMarketItem(MarketItem marketItem) {
        this.marketItem = marketItem;
        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public ClickableSticker setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public Integer getAudioStartTime() {
        return audioStartTime;
    }

    public ClickableSticker setAudioStartTime(Integer audioStartTime) {
        this.audioStartTime = audioStartTime;
        return this;
    }

    public ClickableStickerStyle getStyle() {
        return style;
    }

    public ClickableSticker setStyle(ClickableStickerStyle style) {
        this.style = style;
        return this;
    }

    public ClickableStickerType getType() {
        return type;
    }

    public ClickableSticker setType(ClickableStickerType type) {
        this.type = type;
        return this;
    }

    public ClickableStickerSubtype getSubtype() {
        return subtype;
    }

    public ClickableSticker setSubtype(ClickableStickerSubtype subtype) {
        this.subtype = subtype;
        return this;
    }

    public Integer getPostOwnerId() {
        return postOwnerId;
    }

    public ClickableSticker setPostOwnerId(Integer postOwnerId) {
        this.postOwnerId = postOwnerId;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public ClickableSticker setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Poll getPoll() {
        return poll;
    }

    public ClickableSticker setPoll(Poll poll) {
        this.poll = poll;
        return this;
    }

    public String getColor() {
        return color;
    }

    public ClickableSticker setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getStickerId() {
        return stickerId;
    }

    public ClickableSticker setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
        return this;
    }

    public Integer getStickerPackId() {
        return stickerPackId;
    }

    public ClickableSticker setStickerPackId(Integer stickerPackId) {
        this.stickerPackId = stickerPackId;
        return this;
    }

    public AppMin getApp() {
        return app;
    }

    public ClickableSticker setApp(AppMin app) {
        this.app = app;
        return this;
    }

    public String getAppContext() {
        return appContext;
    }

    public ClickableSticker setAppContext(String appContext) {
        this.appContext = appContext;
        return this;
    }

    public Boolean getHasNewInteractions() {
        return hasNewInteractions;
    }

    public ClickableSticker setHasNewInteractions(Boolean hasNewInteractions) {
        this.hasNewInteractions = hasNewInteractions;
        return this;
    }

    public Boolean getIsBroadcastNotifyAllowed() {
        return isBroadcastNotifyAllowed;
    }

    public ClickableSticker setIsBroadcastNotifyAllowed(Boolean isBroadcastNotifyAllowed) {
        this.isBroadcastNotifyAllowed = isBroadcastNotifyAllowed;
        return this;
    }

    public Integer getSituationalThemeId() {
        return situationalThemeId;
    }

    public ClickableSticker setSituationalThemeId(Integer situationalThemeId) {
        this.situationalThemeId = situationalThemeId;
        return this;
    }

    public String getSituationalAppUrl() {
        return situationalAppUrl;
    }

    public ClickableSticker setSituationalAppUrl(String situationalAppUrl) {
        this.situationalAppUrl = situationalAppUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyId, hasNewInteractions, color, placeId, poll, ownerId, type, situationalAppUrl, mention, stickerId, subtype, clickableArea, id, audio, hashtag, situationalThemeId, app, isBroadcastNotifyAllowed, question, tooltipText, audioStartTime, postOwnerId, postId, questionButton, linkObject, appContext, style, marketItem, stickerPackId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClickableSticker clickableSticker = (ClickableSticker) o;
        return Objects.equals(stickerPackId, clickableSticker.stickerPackId) &&
                Objects.equals(isBroadcastNotifyAllowed, clickableSticker.isBroadcastNotifyAllowed) &&
                Objects.equals(color, clickableSticker.color) &&
                Objects.equals(postOwnerId, clickableSticker.postOwnerId) &&
                Objects.equals(ownerId, clickableSticker.ownerId) &&
                Objects.equals(storyId, clickableSticker.storyId) &&
                Objects.equals(marketItem, clickableSticker.marketItem) &&
                Objects.equals(poll, clickableSticker.poll) &&
                Objects.equals(tooltipText, clickableSticker.tooltipText) &&
                Objects.equals(type, clickableSticker.type) &&
                Objects.equals(mention, clickableSticker.mention) &&
                Objects.equals(appContext, clickableSticker.appContext) &&
                Objects.equals(subtype, clickableSticker.subtype) &&
                Objects.equals(situationalAppUrl, clickableSticker.situationalAppUrl) &&
                Objects.equals(clickableArea, clickableSticker.clickableArea) &&
                Objects.equals(id, clickableSticker.id) &&
                Objects.equals(audio, clickableSticker.audio) &&
                Objects.equals(questionButton, clickableSticker.questionButton) &&
                Objects.equals(placeId, clickableSticker.placeId) &&
                Objects.equals(audioStartTime, clickableSticker.audioStartTime) &&
                Objects.equals(hashtag, clickableSticker.hashtag) &&
                Objects.equals(app, clickableSticker.app) &&
                Objects.equals(hasNewInteractions, clickableSticker.hasNewInteractions) &&
                Objects.equals(stickerId, clickableSticker.stickerId) &&
                Objects.equals(question, clickableSticker.question) &&
                Objects.equals(situationalThemeId, clickableSticker.situationalThemeId) &&
                Objects.equals(linkObject, clickableSticker.linkObject) &&
                Objects.equals(postId, clickableSticker.postId) &&
                Objects.equals(style, clickableSticker.style);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ClickableSticker{");
        sb.append("stickerPackId=").append(stickerPackId);
        sb.append(", isBroadcastNotifyAllowed=").append(isBroadcastNotifyAllowed);
        sb.append(", color='").append(color).append("'");
        sb.append(", postOwnerId=").append(postOwnerId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", storyId=").append(storyId);
        sb.append(", marketItem=").append(marketItem);
        sb.append(", poll=").append(poll);
        sb.append(", tooltipText='").append(tooltipText).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", mention='").append(mention).append("'");
        sb.append(", appContext='").append(appContext).append("'");
        sb.append(", subtype='").append(subtype).append("'");
        sb.append(", situationalAppUrl='").append(situationalAppUrl).append("'");
        sb.append(", clickableArea=").append(clickableArea);
        sb.append(", id=").append(id);
        sb.append(", audio=").append(audio);
        sb.append(", questionButton='").append(questionButton).append("'");
        sb.append(", placeId=").append(placeId);
        sb.append(", audioStartTime=").append(audioStartTime);
        sb.append(", hashtag='").append(hashtag).append("'");
        sb.append(", app=").append(app);
        sb.append(", hasNewInteractions=").append(hasNewInteractions);
        sb.append(", stickerId=").append(stickerId);
        sb.append(", question='").append(question).append("'");
        sb.append(", situationalThemeId=").append(situationalThemeId);
        sb.append(", linkObject=").append(linkObject);
        sb.append(", postId=").append(postId);
        sb.append(", style='").append(style).append("'");
        sb.append('}');
        return sb.toString();
    }
}
