package com.vk.api.sdk.objects.messages;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.base.Sticker;
import com.vk.api.sdk.objects.calls.Call;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.gifts.Layout;
import com.vk.api.sdk.objects.market.MarketAlbum;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.polls.Poll;
import com.vk.api.sdk.objects.stories.Story;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.WallpostFull;
import java.util.Objects;

/**
 * MessageAttachment object
 */
public class MessageAttachment implements Validable {
    @SerializedName("audio")
    private Audio audio;

    @SerializedName("audio_message")
    private AudioMessage audioMessage;

    @SerializedName("call")
    private Call call;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("gift")
    private Layout gift;

    @SerializedName("graffiti")
    private Graffiti graffiti;

    @SerializedName("link")
    private Link link;

    @SerializedName("market")
    private MarketItem market;

    @SerializedName("market_market_album")
    private MarketAlbum marketMarketAlbum;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("sticker")
    private Sticker sticker;

    @SerializedName("story")
    private Story story;

    @SerializedName("type")
    @Required
    private MessageAttachmentType type;

    @SerializedName("video")
    private Video video;

    @SerializedName("wall")
    private WallpostFull wall;

    @SerializedName("wall_reply")
    private WallComment wallReply;

    @SerializedName("poll")
    private Poll poll;

    public Audio getAudio() {
        return audio;
    }

    public MessageAttachment setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public MessageAttachment setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
        return this;
    }

    public Call getCall() {
        return call;
    }

    public MessageAttachment setCall(Call call) {
        this.call = call;
        return this;
    }

    public Doc getDoc() {
        return doc;
    }

    public MessageAttachment setDoc(Doc doc) {
        this.doc = doc;
        return this;
    }

    public Layout getGift() {
        return gift;
    }

    public MessageAttachment setGift(Layout gift) {
        this.gift = gift;
        return this;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public MessageAttachment setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public MessageAttachment setLink(Link link) {
        this.link = link;
        return this;
    }

    public MarketItem getMarket() {
        return market;
    }

    public MessageAttachment setMarket(MarketItem market) {
        this.market = market;
        return this;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public MessageAttachment setMarketMarketAlbum(MarketAlbum marketMarketAlbum) {
        this.marketMarketAlbum = marketMarketAlbum;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public MessageAttachment setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public MessageAttachment setSticker(Sticker sticker) {
        this.sticker = sticker;
        return this;
    }

    public Story getStory() {
        return story;
    }

    public MessageAttachment setStory(Story story) {
        this.story = story;
        return this;
    }

    public MessageAttachmentType getType() {
        return type;
    }

    public MessageAttachment setType(MessageAttachmentType type) {
        this.type = type;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public MessageAttachment setVideo(Video video) {
        this.video = video;
        return this;
    }

    public WallpostFull getWall() {
        return wall;
    }

    public MessageAttachment setWall(WallpostFull wall) {
        this.wall = wall;
        return this;
    }

    public WallComment getWallReply() {
        return wallReply;
    }

    public MessageAttachment setWallReply(WallComment wallReply) {
        this.wallReply = wallReply;
        return this;
    }

    public Poll getPoll() {
        return poll;
    }

    public MessageAttachment setPoll(Poll poll) {
        this.poll = poll;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gift, wallReply, marketMarketAlbum, link, sticker, photo, video, poll, audioMessage, type, call, market, doc, graffiti, audio, wall, story);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageAttachment messageAttachment = (MessageAttachment) o;
        return Objects.equals(gift, messageAttachment.gift) &&
                Objects.equals(link, messageAttachment.link) &&
                Objects.equals(marketMarketAlbum, messageAttachment.marketMarketAlbum) &&
                Objects.equals(sticker, messageAttachment.sticker) &&
                Objects.equals(photo, messageAttachment.photo) &&
                Objects.equals(video, messageAttachment.video) &&
                Objects.equals(poll, messageAttachment.poll) &&
                Objects.equals(audioMessage, messageAttachment.audioMessage) &&
                Objects.equals(type, messageAttachment.type) &&
                Objects.equals(call, messageAttachment.call) &&
                Objects.equals(market, messageAttachment.market) &&
                Objects.equals(wallReply, messageAttachment.wallReply) &&
                Objects.equals(doc, messageAttachment.doc) &&
                Objects.equals(graffiti, messageAttachment.graffiti) &&
                Objects.equals(audio, messageAttachment.audio) &&
                Objects.equals(wall, messageAttachment.wall) &&
                Objects.equals(story, messageAttachment.story);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageAttachment{");
        sb.append("gift=").append(gift);
        sb.append(", link=").append(link);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", sticker=").append(sticker);
        sb.append(", photo=").append(photo);
        sb.append(", video=").append(video);
        sb.append(", poll=").append(poll);
        sb.append(", audioMessage=").append(audioMessage);
        sb.append(", type=").append(type);
        sb.append(", call=").append(call);
        sb.append(", market=").append(market);
        sb.append(", wallReply=").append(wallReply);
        sb.append(", doc=").append(doc);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", audio=").append(audio);
        sb.append(", wall=").append(wall);
        sb.append(", story=").append(story);
        sb.append('}');
        return sb.toString();
    }
}
