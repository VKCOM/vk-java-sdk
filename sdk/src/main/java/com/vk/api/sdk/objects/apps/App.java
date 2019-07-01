package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.photos.Photo;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * App object
 */
public class App implements Validable {
    /**
     * Official community's ID
     */
    @SerializedName("author_group")
    private Integer authorGroup;

    /**
     * Application author's ID
     */
    @SerializedName("author_id")
    private Integer authorId;

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
     * URL of the app icon with 139 px in width
     */
    @SerializedName("icon_139")
    private URL icon139;

    /**
     * URL of the app icon with 150 px in width
     */
    @SerializedName("icon_150")
    private URL icon150;

    /**
     * URL of the app icon with 279 px in width
     */
    @SerializedName("icon_278")
    private URL icon278;

    /**
     * URL of the app icon with 75 px in width
     */
    @SerializedName("icon_75")
    private URL icon75;

    /**
     * Application ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

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

    /**
     * Application title
     */
    @SerializedName("title")
    @Required
    private String title;

    @SerializedName("type")
    @Required
    private AppType type;

    public Integer getAuthorGroup() {
        return authorGroup;
    }

    public App setAuthorGroup(Integer authorGroup) {
        this.authorGroup = authorGroup;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public App setAuthorId(Integer authorId) {
        this.authorId = authorId;
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

    public URL getIcon139() {
        return icon139;
    }

    public App setIcon139(URL icon139) {
        this.icon139 = icon139;
        return this;
    }

    public URL getIcon150() {
        return icon150;
    }

    public App setIcon150(URL icon150) {
        this.icon150 = icon150;
        return this;
    }

    public URL getIcon278() {
        return icon278;
    }

    public App setIcon278(URL icon278) {
        this.icon278 = icon278;
        return this;
    }

    public URL getIcon75() {
        return icon75;
    }

    public App setIcon75(URL icon75) {
        this.icon75 = icon75;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public App setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public App setTitle(String title) {
        this.title = title;
        return this;
    }

    public AppType getType() {
        return type;
    }

    public App setType(AppType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, isInCatalog, icon75, description, section, screenName, title, type, screenshots, icon139, icon278, authorUrl, genre, leaderboardType, authorGroup, id, international, icon150, membersCount, banner560, platformId, authorId, friends, catalogPosition, banner1120, publishedDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(authorGroup, app.authorGroup) &&
                Objects.equals(leaderboardType, app.leaderboardType) &&
                Objects.equals(icon278, app.icon278) &&
                Objects.equals(description, app.description) &&
                Objects.equals(icon75, app.icon75) &&
                Objects.equals(section, app.section) &&
                Objects.equals(title, app.title) &&
                Objects.equals(type, app.type) &&
                Objects.equals(genreId, app.genreId) &&
                Objects.equals(icon150, app.icon150) &&
                Objects.equals(screenshots, app.screenshots) &&
                Objects.equals(screenName, app.screenName) &&
                Objects.equals(genre, app.genre) &&
                Objects.equals(icon139, app.icon139) &&
                Objects.equals(banner560, app.banner560) &&
                Objects.equals(id, app.id) &&
                Objects.equals(international, app.international) &&
                Objects.equals(catalogPosition, app.catalogPosition) &&
                Objects.equals(banner1120, app.banner1120) &&
                Objects.equals(isInCatalog, app.isInCatalog) &&
                Objects.equals(friends, app.friends) &&
                Objects.equals(authorUrl, app.authorUrl) &&
                Objects.equals(platformId, app.platformId) &&
                Objects.equals(membersCount, app.membersCount) &&
                Objects.equals(authorId, app.authorId) &&
                Objects.equals(publishedDate, app.publishedDate);
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
        sb.append(", icon278=").append(icon278);
        sb.append(", description='").append(description).append("'");
        sb.append(", icon75=").append(icon75);
        sb.append(", section='").append(section).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", type=").append(type);
        sb.append(", genreId=").append(genreId);
        sb.append(", icon150=").append(icon150);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", genre='").append(genre).append("'");
        sb.append(", icon139=").append(icon139);
        sb.append(", banner560=").append(banner560);
        sb.append(", id=").append(id);
        sb.append(", international=").append(international);
        sb.append(", catalogPosition=").append(catalogPosition);
        sb.append(", banner1120=").append(banner1120);
        sb.append(", isInCatalog=").append(isInCatalog);
        sb.append(", friends=").append(friends);
        sb.append(", authorUrl=").append(authorUrl);
        sb.append(", platformId=").append(platformId);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", authorId=").append(authorId);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append('}');
        return sb.toString();
    }
}
