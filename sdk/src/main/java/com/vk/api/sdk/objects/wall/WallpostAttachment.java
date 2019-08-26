package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.Link;
import com.vk.api.sdk.objects.docs.Doc;
import com.vk.api.sdk.objects.events.EventAttach;
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
public class WallpostAttachment implements Validable {
    /**
     * Access key for the audio
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("album")
    private PhotoAlbum album;

    @SerializedName("app")
    private AppPost app;

    @SerializedName("audio")
    private Audio audio;

    @SerializedName("doc")
    private Doc doc;

    @SerializedName("event")
    private EventAttach event;

    @SerializedName("graffiti")
    private Graffiti graffiti;

    @SerializedName("link")
    private Link link;

    @SerializedName("market")
    private MarketItem market;

    @SerializedName("market_album")
    private MarketAlbum marketAlbum;

    @SerializedName("note")
    private AttachedNote note;

    @SerializedName("page")
    private WikipageFull page;

    @SerializedName("photo")
    private Photo photo;

    @SerializedName("photos_list")
    private List<String> photosList;

    @SerializedName("poll")
    private Poll poll;

    @SerializedName("posted_photo")
    private PostedPhoto postedPhoto;

    @SerializedName("type")
    @Required
    private WallpostAttachmentType type;

    @SerializedName("video")
    private Video video;

    public String getAccessKey() {
        return accessKey;
    }

    public WallpostAttachment setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public PhotoAlbum getAlbum() {
        return album;
    }

    public WallpostAttachment setAlbum(PhotoAlbum album) {
        this.album = album;
        return this;
    }

    public AppPost getApp() {
        return app;
    }

    public WallpostAttachment setApp(AppPost app) {
        this.app = app;
        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public WallpostAttachment setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public Doc getDoc() {
        return doc;
    }

    public WallpostAttachment setDoc(Doc doc) {
        this.doc = doc;
        return this;
    }

    public EventAttach getEvent() {
        return event;
    }

    public WallpostAttachment setEvent(EventAttach event) {
        this.event = event;
        return this;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public WallpostAttachment setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
        return this;
    }

    public Link getLink() {
        return link;
    }

    public WallpostAttachment setLink(Link link) {
        this.link = link;
        return this;
    }

    public MarketItem getMarket() {
        return market;
    }

    public WallpostAttachment setMarket(MarketItem market) {
        this.market = market;
        return this;
    }

    public MarketAlbum getMarketAlbum() {
        return marketAlbum;
    }

    public WallpostAttachment setMarketAlbum(MarketAlbum marketAlbum) {
        this.marketAlbum = marketAlbum;
        return this;
    }

    public AttachedNote getNote() {
        return note;
    }

    public WallpostAttachment setNote(AttachedNote note) {
        this.note = note;
        return this;
    }

    public WikipageFull getPage() {
        return page;
    }

    public WallpostAttachment setPage(WikipageFull page) {
        this.page = page;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public WallpostAttachment setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public List<String> getPhotosList() {
        return photosList;
    }

    public WallpostAttachment setPhotosList(List<String> photosList) {
        this.photosList = photosList;
        return this;
    }

    public Poll getPoll() {
        return poll;
    }

    public WallpostAttachment setPoll(Poll poll) {
        this.poll = poll;
        return this;
    }

    public PostedPhoto getPostedPhoto() {
        return postedPhoto;
    }

    public WallpostAttachment setPostedPhoto(PostedPhoto postedPhoto) {
        this.postedPhoto = postedPhoto;
        return this;
    }

    public WallpostAttachmentType getType() {
        return type;
    }

    public WallpostAttachment setType(WallpostAttachmentType type) {
        this.type = type;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public WallpostAttachment setVideo(Video video) {
        this.video = video;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, note, album, link, photo, marketAlbum, poll, video, type, postedPhoto, market, accessKey, photosList, doc, graffiti, audio, page, event);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostAttachment wallpostAttachment = (WallpostAttachment) o;
        return Objects.equals(app, wallpostAttachment.app) &&
                Objects.equals(note, wallpostAttachment.note) &&
                Objects.equals(marketAlbum, wallpostAttachment.marketAlbum) &&
                Objects.equals(album, wallpostAttachment.album) &&
                Objects.equals(link, wallpostAttachment.link) &&
                Objects.equals(photo, wallpostAttachment.photo) &&
                Objects.equals(photosList, wallpostAttachment.photosList) &&
                Objects.equals(poll, wallpostAttachment.poll) &&
                Objects.equals(video, wallpostAttachment.video) &&
                Objects.equals(type, wallpostAttachment.type) &&
                Objects.equals(postedPhoto, wallpostAttachment.postedPhoto) &&
                Objects.equals(market, wallpostAttachment.market) &&
                Objects.equals(accessKey, wallpostAttachment.accessKey) &&
                Objects.equals(doc, wallpostAttachment.doc) &&
                Objects.equals(graffiti, wallpostAttachment.graffiti) &&
                Objects.equals(audio, wallpostAttachment.audio) &&
                Objects.equals(page, wallpostAttachment.page) &&
                Objects.equals(event, wallpostAttachment.event);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallpostAttachment{");
        sb.append("app=").append(app);
        sb.append(", note=").append(note);
        sb.append(", marketAlbum=").append(marketAlbum);
        sb.append(", album=").append(album);
        sb.append(", link=").append(link);
        sb.append(", photo=").append(photo);
        sb.append(", photosList='").append(photosList).append("'");
        sb.append(", poll=").append(poll);
        sb.append(", video=").append(video);
        sb.append(", type=").append(type);
        sb.append(", postedPhoto=").append(postedPhoto);
        sb.append(", market=").append(market);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", doc=").append(doc);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", audio=").append(audio);
        sb.append(", page=").append(page);
        sb.append(", event=").append(event);
        sb.append('}');
        return sb.toString();
    }
}
