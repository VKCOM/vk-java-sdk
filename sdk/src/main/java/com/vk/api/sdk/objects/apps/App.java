package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.photos.Photo;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * App object
 */
public class App extends AppMin implements Validable {
    /**
     * Official community's ID
     */
    @SerializedName("author_group")
    private Integer authorGroup;

    /**
     * Application author's URL
     */
    @SerializedName("author_url")
    private URL authorUrl;

    /**
     * URL of the app banner with 1120 px in width
     */
    @SerializedName("banner_1120")
    private URL banner1120;

    /**
     * URL of the app banner with 560 px in width
     */
    @SerializedName("banner_560")
    private URL banner560;

    @SerializedName("friends")
    private List<Integer> friends;

    /**
     * Catalog position
     */
    @SerializedName("catalog_position")
    private Integer catalogPosition;

    /**
     * Application description
     */
    @SerializedName("description")
    private String description;

    /**
     * Genre name
     */
    @SerializedName("genre")
    private String genre;

    /**
     * Genre ID
     */
    @SerializedName("genre_id")
    private Integer genreId;

    /**
     * Information whether the application is multilanguage
     */
    @SerializedName("international")
    private Integer international;

    /**
     * Information whether application is in mobile catalog
     */
    @SerializedName("is_in_catalog")
    private Integer isInCatalog;

    @SerializedName("leaderboard_type")
    private AppLeaderboardType leaderboardType;

    /**
     * Members number
     */
    @SerializedName("members_count")
    private Integer membersCount;

    /**
     * Application ID in store
     */
    @SerializedName("platform_id")
    private Integer platformId;

    /**
     * Date when the application has been published in Unixtime
     */
    @SerializedName("published_date")
    private Integer publishedDate;

    /**
     * Screen name
     */
    @SerializedName("screen_name")
    private String screenName;

    @SerializedName("screenshots")
    private List<Photo> screenshots;

    /**
     * Application section name
     */
    @SerializedName("section")
    private String section;

    public Integer getAuthorGroup() {
        return authorGroup;
    }

    public App setAuthorGroup(Integer authorGroup) {
        this.authorGroup = authorGroup;
        return this;
    }

    public URL getAuthorUrl() {
        return authorUrl;
    }

    public App setAuthorUrl(URL authorUrl) {
        this.authorUrl = authorUrl;
        return this;
    }

    public URL getBanner1120() {
        return banner1120;
    }

    public App setBanner1120(URL banner1120) {
        this.banner1120 = banner1120;
        return this;
    }

    public URL getBanner560() {
        return banner560;
    }

    public App setBanner560(URL banner560) {
        this.banner560 = banner560;
        return this;
    }

    public List<Integer> getFriends() {
        return friends;
    }

    public App setFriends(List<Integer> friends) {
        this.friends = friends;
        return this;
    }

    public Integer getCatalogPosition() {
        return catalogPosition;
    }

    public App setCatalogPosition(Integer catalogPosition) {
        this.catalogPosition = catalogPosition;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public App setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public App setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public App setGenreId(Integer genreId) {
        this.genreId = genreId;
        return this;
    }

    public Integer getInternational() {
        return international;
    }

    public App setInternational(Integer international) {
        this.international = international;
        return this;
    }

    public Integer getIsInCatalog() {
        return isInCatalog;
    }

    public App setIsInCatalog(Integer isInCatalog) {
        this.isInCatalog = isInCatalog;
        return this;
    }

    public AppLeaderboardType getLeaderboardType() {
        return leaderboardType;
    }

    public App setLeaderboardType(AppLeaderboardType leaderboardType) {
        this.leaderboardType = leaderboardType;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public App setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public App setPlatformId(Integer platformId) {
        this.platformId = platformId;
        return this;
    }

    public Integer getPublishedDate() {
        return publishedDate;
    }

    public App setPublishedDate(Integer publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public App setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public List<Photo> getScreenshots() {
        return screenshots;
    }

    public App setScreenshots(List<Photo> screenshots) {
        this.screenshots = screenshots;
        return this;
    }

    public String getSection() {
        return section;
    }

    public App setSection(String section) {
        this.section = section;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, isInCatalog, membersCount, description, banner560, section, screenName, platformId, friends, screenshots, authorUrl, genre, catalogPosition, leaderboardType, authorGroup, banner1120, publishedDate, international);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(authorGroup, app.authorGroup) &&
                Objects.equals(leaderboardType, app.leaderboardType) &&
                Objects.equals(banner1120, app.banner1120) &&
                Objects.equals(description, app.description) &&
                Objects.equals(section, app.section) &&
                Objects.equals(isInCatalog, app.isInCatalog) &&
                Objects.equals(friends, app.friends) &&
                Objects.equals(genreId, app.genreId) &&
                Objects.equals(screenshots, app.screenshots) &&
                Objects.equals(authorUrl, app.authorUrl) &&
                Objects.equals(screenName, app.screenName) &&
                Objects.equals(genre, app.genre) &&
                Objects.equals(platformId, app.platformId) &&
                Objects.equals(banner560, app.banner560) &&
                Objects.equals(membersCount, app.membersCount) &&
                Objects.equals(international, app.international) &&
                Objects.equals(publishedDate, app.publishedDate) &&
                Objects.equals(catalogPosition, app.catalogPosition);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("App{");
        sb.append("authorGroup=").append(authorGroup);
        sb.append(", leaderboardType=").append(leaderboardType);
        sb.append(", banner1120=").append(banner1120);
        sb.append(", description='").append(description).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", isInCatalog=").append(isInCatalog);
        sb.append(", friends=").append(friends);
        sb.append(", genreId=").append(genreId);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", authorUrl=").append(authorUrl);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", genre='").append(genre).append("'");
        sb.append(", platformId=").append(platformId);
        sb.append(", banner560=").append(banner560);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", international=").append(international);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append(", catalogPosition=").append(catalogPosition);
        sb.append('}');
        return sb.toString();
    }
}
