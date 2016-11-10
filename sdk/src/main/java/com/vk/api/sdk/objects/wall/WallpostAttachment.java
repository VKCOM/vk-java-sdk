package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.market.MarketAlbum;
import com.vk.api.sdk.objects.market.MarketItem;
import com.vk.api.sdk.objects.pages.WikipageFull;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.photos.PhotoAlbum;
import com.vk.api.sdk.objects.polls.Poll;
import com.vk.api.sdk.objects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * WallpostAttachment object
 */
public class WallpostAttachment {
    @SerializedName("photo")
    private Photo photo;

    @SerializedName("posted_photo")
    private PostedPhoto postedPhoto;

    @SerializedName("audio")
    private AudioFull audio;

    @SerializedName("video")
    private Video video;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("link")
    private Link link;

    @SerializedName("graffiti")
    private Graffiti graffiti;

    @SerializedName("note")
    private AttachedNote note;

    @SerializedName("app")
    private AppPost app;

    @SerializedName("poll")
    private Poll poll;

    @SerializedName("page")
    private WikipageFull page;

    @SerializedName("album")
    private PhotoAlbum album;

    @SerializedName("photos_list")
    private List<String> photosList;

    @SerializedName("market_market_album")
    private MarketAlbum marketMarketAlbum;

    @SerializedName("market")
    private MarketItem market;

    /**
     * Attachment type
     */
    @SerializedName("type")
    private WallpostAttachmentType type;

    public Photo getPhoto() {
        return photo;
    }

    public PostedPhoto getPostedPhoto() {
        return postedPhoto;
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

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public AttachedNote getNote() {
        return note;
    }

    public AppPost getApp() {
        return app;
    }

    public Poll getPoll() {
        return poll;
    }

    public WikipageFull getPage() {
        return page;
    }

    public PhotoAlbum getAlbum() {
        return album;
    }

    public List<String> getPhotosList() {
        return photosList;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public MarketItem getMarket() {
        return market;
    }

    public WallpostAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, note, marketMarketAlbum, album, link, photo, video, poll, type, postedPhoto, market, doc, photosList, graffiti, audio, page);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostAttachment wallpostAttachment = (WallpostAttachment) o;
        return Objects.equals(photo, wallpostAttachment.photo) &&
                Objects.equals(postedPhoto, wallpostAttachment.postedPhoto) &&
                Objects.equals(audio, wallpostAttachment.audio) &&
                Objects.equals(video, wallpostAttachment.video) &&
                Objects.equals(doc, wallpostAttachment.doc) &&
                Objects.equals(link, wallpostAttachment.link) &&
                Objects.equals(graffiti, wallpostAttachment.graffiti) &&
                Objects.equals(note, wallpostAttachment.note) &&
                Objects.equals(app, wallpostAttachment.app) &&
                Objects.equals(poll, wallpostAttachment.poll) &&
                Objects.equals(page, wallpostAttachment.page) &&
                Objects.equals(album, wallpostAttachment.album) &&
                Objects.equals(photosList, wallpostAttachment.photosList) &&
                Objects.equals(marketMarketAlbum, wallpostAttachment.marketMarketAlbum) &&
                Objects.equals(market, wallpostAttachment.market) &&
                Objects.equals(type, wallpostAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", postedPhoto=").append(postedPhoto);
        sb.append(", audio=").append(audio);
        sb.append(", video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", note=").append(note);
        sb.append(", app=").append(app);
        sb.append(", poll=").append(poll);
        sb.append(", page=").append(page);
        sb.append(", album=").append(album);
        sb.append(", photosList='").append(photosList).append("'");
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", market=").append(market);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
