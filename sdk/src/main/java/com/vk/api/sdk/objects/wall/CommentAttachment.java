package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
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
public class CommentAttachment {
    @SerializedName("photo")
    private Photo photo;

    @SerializedName("audio")
    private AudioFull audio;

    @SerializedName("video")
    private Video video;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("link")
    private Link link;

    @SerializedName("note")
    private AttachedNote note;

    @SerializedName("page")
    private WikipageFull page;

    @SerializedName("market_market_album")
    private MarketAlbum marketMarketAlbum;

    @SerializedName("market")
    private MarketItem market;

    @SerializedName("sticker")
    private Sticker sticker;

    /**
     * Attachment type
     */
    @SerializedName("type")
    private CommentAttachmentType type;

    public Photo getPhoto() {
        return photo;
    }

    public AudioFull getAudio() {
        return audio;
    }

    public Video getVideo() {
        return video;
    }

    public Doc getDoc() {
        return doc;
    }

    public Link getLink() {
        return link;
    }

    public AttachedNote getNote() {
        return note;
    }

    public WikipageFull getPage() {
        return page;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public MarketItem getMarket() {
        return market;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public CommentAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, note, marketMarketAlbum, link, sticker, photo, doc, audio, video, page, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentAttachment commentAttachment = (CommentAttachment) o;
        return Objects.equals(photo, commentAttachment.photo) &&
                Objects.equals(audio, commentAttachment.audio) &&
                Objects.equals(video, commentAttachment.video) &&
                Objects.equals(doc, commentAttachment.doc) &&
                Objects.equals(link, commentAttachment.link) &&
                Objects.equals(note, commentAttachment.note) &&
                Objects.equals(page, commentAttachment.page) &&
                Objects.equals(marketMarketAlbum, commentAttachment.marketMarketAlbum) &&
                Objects.equals(market, commentAttachment.market) &&
                Objects.equals(sticker, commentAttachment.sticker) &&
                Objects.equals(type, commentAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", audio=").append(audio);
        sb.append(", video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", note=").append(note);
        sb.append(", page=").append(page);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", market=").append(market);
        sb.append(", sticker=").append(sticker);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
