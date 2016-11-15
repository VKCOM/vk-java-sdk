package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.base.Sticker;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.gifts.Layout;
import com.vk.api.sdk.objects.market.MarketAlbum;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.Video;
import com.vk.api.sdk.objects.wall.WallComment;
import com.vk.api.sdk.objects.wall.WallpostAttached;

import java.util.Objects;

/**
 * MessageAttachment object
 */
public class MessageAttachment {
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

    @SerializedName("market")
    private MarketItem market;

    @SerializedName("market_market_album")
    private MarketAlbum marketMarketAlbum;

    @SerializedName("gift")
    private Layout gift;

    @SerializedName("sticker")
    private Sticker sticker;

    @SerializedName("wall")
    private WallpostAttached wall;

    @SerializedName("wall_reply")
    private WallComment wallReply;

    /**
     * Attachment type
     */
    @SerializedName("type")
    private MessageAttachmentType type;

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

    public MarketItem getMarket() {
        return market;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public Layout getGift() {
        return gift;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public WallpostAttached getWall() {
        return wall;
    }

    public WallComment getWallReply() {
        return wallReply;
    }

    public MessageAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, gift, wallReply, marketMarketAlbum, link, sticker, photo, doc, audio, video, type, wall);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageAttachment messageAttachment = (MessageAttachment) o;
        return Objects.equals(photo, messageAttachment.photo) &&
                Objects.equals(audio, messageAttachment.audio) &&
                Objects.equals(video, messageAttachment.video) &&
                Objects.equals(doc, messageAttachment.doc) &&
                Objects.equals(link, messageAttachment.link) &&
                Objects.equals(market, messageAttachment.market) &&
                Objects.equals(marketMarketAlbum, messageAttachment.marketMarketAlbum) &&
                Objects.equals(gift, messageAttachment.gift) &&
                Objects.equals(sticker, messageAttachment.sticker) &&
                Objects.equals(wall, messageAttachment.wall) &&
                Objects.equals(wallReply, messageAttachment.wallReply) &&
                Objects.equals(type, messageAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", audio=").append(audio);
        sb.append(", video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", market=").append(market);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", gift=").append(gift);
        sb.append(", sticker=").append(sticker);
        sb.append(", wall=").append(wall);
        sb.append(", wallReply=").append(wallReply);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
