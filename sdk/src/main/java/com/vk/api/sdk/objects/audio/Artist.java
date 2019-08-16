package com.vk.api.sdk.objects.audio;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.Image;
import java.util.List;
import java.util.Objects;

/**
 * Artist object
 */
public class Artist implements Validable {
    /**
     * Artist domain
     */
    @SerializedName("domain")
    private String domain;

    /**
     * Artist ID
     */
    @SerializedName("id")
    private String id;

    /**
     * Mark shows that artist has no official cover, last album thumb is used instead
     */
    @SerializedName("is_album_cover")
    private Boolean isAlbumCover;

    /**
     * Artist name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Artist photos
     */
    @SerializedName("photo")
    private List<Image> photo;

    /**
     * Artist photos by type
     */
    @SerializedName("photos")
    private List<PhotosByType> photos;

    /**
     * Is user follow this artist
     */
    @SerializedName("is_followed")
    private Boolean isFollowed;

    /**
     * Can be this artist followed by user
     */
    @SerializedName("can_follow")
    private Boolean canFollow;

    /**
     * Artist genres
     */
    @SerializedName("genres")
    private List<Genre> genres;

    /**
     * Artist bio
     */
    @SerializedName("bio")
    private String bio;

    /**
     * Artist pages
     */
    @SerializedName("pages")
    private List<Integer> pages;

    public String getDomain() {
        return domain;
    }

    public Artist setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getId() {
        return id;
    }

    public Artist setId(String id) {
        this.id = id;
        return this;
    }

    public Boolean getIsAlbumCover() {
        return isAlbumCover;
    }

    public Artist setIsAlbumCover(Boolean isAlbumCover) {
        this.isAlbumCover = isAlbumCover;
        return this;
    }

    public String getName() {
        return name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }

    public List<Image> getPhoto() {
        return photo;
    }

    public Artist setPhoto(List<Image> photo) {
        this.photo = photo;
        return this;
    }

    public List<PhotosByType> getPhotos() {
        return photos;
    }

    public Artist setPhotos(List<PhotosByType> photos) {
        this.photos = photos;
        return this;
    }

    public Boolean getIsFollowed() {
        return isFollowed;
    }

    public Artist setIsFollowed(Boolean isFollowed) {
        this.isFollowed = isFollowed;
        return this;
    }

    public Boolean getCanFollow() {
        return canFollow;
    }

    public Artist setCanFollow(Boolean canFollow) {
        this.canFollow = canFollow;
        return this;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public Artist setGenres(List<Genre> genres) {
        this.genres = genres;
        return this;
    }

    public String getBio() {
        return bio;
    }

    public Artist setBio(String bio) {
        this.bio = bio;
        return this;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public Artist setPages(List<Integer> pages) {
        this.pages = pages;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, genres, domain, name, canFollow, photo, bio, id, isAlbumCover, photos, isFollowed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(canFollow, artist.canFollow) &&
                Objects.equals(pages, artist.pages) &&
                Objects.equals(genres, artist.genres) &&
                Objects.equals(domain, artist.domain) &&
                Objects.equals(isAlbumCover, artist.isAlbumCover) &&
                Objects.equals(name, artist.name) &&
                Objects.equals(isFollowed, artist.isFollowed) &&
                Objects.equals(photo, artist.photo) &&
                Objects.equals(bio, artist.bio) &&
                Objects.equals(id, artist.id) &&
                Objects.equals(photos, artist.photos);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("canFollow=").append(canFollow);
        sb.append(", pages=").append(pages);
        sb.append(", genres=").append(genres);
        sb.append(", domain='").append(domain).append("'");
        sb.append(", isAlbumCover=").append(isAlbumCover);
        sb.append(", name='").append(name).append("'");
        sb.append(", isFollowed=").append(isFollowed);
        sb.append(", photo=").append(photo);
        sb.append(", bio='").append(bio).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", photos=").append(photos);
        sb.append('}');
        return sb.toString();
    }
}
