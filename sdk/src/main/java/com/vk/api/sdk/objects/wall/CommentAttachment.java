package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.base.Sticker;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.market.MarketAlbum;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.pages.WikipageFull;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import java.util.Objects;

/**
 * CommentAttachment object
 */
public class CommentAttachment implements Validable {
    @SerializedName("audio")
    private Audio audio;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("link")
    private Link link;

    @SerializedName("market")
    private MarketItem market;

    @SerializedName("market_market_album")
    private MarketAlbum marketMarketAlbum;

    @SerializedName("note")
    private AttachedNote note;

    @SerializedName("page")
    private WikipageFull page;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("sticker")
    private Sticker sticker;

    @SerializedName("type")
    @Required
    private CommentAttachmentType type;

    @SerializedName("video")
    private Video video;

    public Audio getAudio() {
        return audio;
    }

    public CommentAttachment setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public Doc getDoc() {
        return doc;
    }

    public CommentAttachment setDoc(Doc doc) {
        this.doc = doc;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public CommentAttachment setLink(Link link) {
        this.link = link;
        return this;
    }

    public MarketItem getMarket() {
        return market;
    }

    public CommentAttachment setMarket(MarketItem market) {
        this.market = market;
        return this;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public CommentAttachment setMarketMarketAlbum(MarketAlbum marketMarketAlbum) {
        this.marketMarketAlbum = marketMarketAlbum;
        return this;
    }

    public AttachedNote getNote() {
        return note;
    }

    public CommentAttachment setNote(AttachedNote note) {
        this.note = note;
        return this;
    }

    public WikipageFull getPage() {
        return page;
    }

    public CommentAttachment setPage(WikipageFull page) {
        this.page = page;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public CommentAttachment setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public CommentAttachment setSticker(Sticker sticker) {
        this.sticker = sticker;
        return this;
    }

    public CommentAttachmentType getType() {
        return type;
    }

    public CommentAttachment setType(CommentAttachmentType type) {
        this.type = type;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public CommentAttachment setVideo(Video video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, note, marketMarketAlbum, link, sticker, doc, photo, audio, page, video, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentAttachment commentAttachment = (CommentAttachment) o;
        return Objects.equals(market, commentAttachment.market) &&
                Objects.equals(note, commentAttachment.note) &&
                Objects.equals(link, commentAttachment.link) &&
                Objects.equals(marketMarketAlbum, commentAttachment.marketMarketAlbum) &&
                Objects.equals(sticker, commentAttachment.sticker) &&
                Objects.equals(doc, commentAttachment.doc) &&
                Objects.equals(photo, commentAttachment.photo) &&
                Objects.equals(audio, commentAttachment.audio) &&
                Objects.equals(page, commentAttachment.page) &&
                Objects.equals(video, commentAttachment.video) &&
                Objects.equals(type, commentAttachment.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentAttachment{");
        sb.append("market=").append(market);
        sb.append(", note=").append(note);
        sb.append(", link=").append(link);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", sticker=").append(sticker);
        sb.append(", doc=").append(doc);
        sb.append(", photo=").append(photo);
        sb.append(", audio=").append(audio);
        sb.append(", page=").append(page);
        sb.append(", video=").append(video);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
