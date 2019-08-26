package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
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

    /**
     * URL of the app icon with 16 px in width
     */
    @SerializedName("icon_16")
    private URL icon16;

    /**
     * Is new flag
     */
    @SerializedName("is_new")
    private BoolInt isNew;

    /**
     * Is new flag
     */
    @SerializedName("new")
    private BoolInt _new;

    /**
     * Is push enabled
     */
    @SerializedName("push_enabled")
    private BoolInt pushEnabled;

    /**
     * Screen orientation
     */
    @SerializedName("screen_orientation")
    private Integer screenOrientation;

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
    private Boolean international;

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
    private String platformId;

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

    public URL getIcon16() {
        return icon16;
    }

    public App setIcon16(URL icon16) {
        this.icon16 = icon16;
        return this;
    }

    public boolean isNew() {
        return isNew == BoolInt.YES;
    }

    public BoolInt getIsNew() {
        return isNew;
    }

    public boolean is_new() {
        return _new == BoolInt.YES;
    }

    public BoolInt get_new() {
        return _new;
    }

    public boolean isPushEnabled() {
        return pushEnabled == BoolInt.YES;
    }

    public BoolInt getPushEnabled() {
        return pushEnabled;
    }

    public Integer getScreenOrientation() {
        return screenOrientation;
    }

    public App setScreenOrientation(Integer screenOrientation) {
        this.screenOrientation = screenOrientation;
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

    public Boolean getInternational() {
        return international;
    }

    public App setInternational(Boolean international) {
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

    public String getPlatformId() {
        return platformId;
    }

    public App setPlatformId(String platformId) {
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

    public String getSection() {
        return section;
    }

    public App setSection(String section) {
        this.section = section;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, isInCatalog, membersCount, description, banner560, icon16, section, isNew, screenName, platformId, authorId, _new, friends, screenOrientation, authorUrl, pushEnabled, genre, catalogPosition, leaderboardType, authorGroup, banner1120, publishedDate, international);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(_new, app._new) &&
                Objects.equals(authorGroup, app.authorGroup) &&
                Objects.equals(leaderboardType, app.leaderboardType) &&
                Objects.equals(isNew, app.isNew) &&
                Objects.equals(icon16, app.icon16) &&
                Objects.equals(banner1120, app.banner1120) &&
                Objects.equals(description, app.description) &&
                Objects.equals(section, app.section) &&
                Objects.equals(isInCatalog, app.isInCatalog) &&
                Objects.equals(friends, app.friends) &&
                Objects.equals(genreId, app.genreId) &&
                Objects.equals(authorUrl, app.authorUrl) &&
                Objects.equals(pushEnabled, app.pushEnabled) &&
                Objects.equals(screenName, app.screenName) &&
                Objects.equals(screenOrientation, app.screenOrientation) &&
                Objects.equals(genre, app.genre) &&
                Objects.equals(platformId, app.platformId) &&
                Objects.equals(banner560, app.banner560) &&
                Objects.equals(membersCount, app.membersCount) &&
                Objects.equals(authorId, app.authorId) &&
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
        sb.append("_new=").append(_new);
        sb.append(", authorGroup=").append(authorGroup);
        sb.append(", leaderboardType=").append(leaderboardType);
        sb.append(", isNew=").append(isNew);
        sb.append(", icon16=").append(icon16);
        sb.append(", banner1120=").append(banner1120);
        sb.append(", description='").append(description).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", isInCatalog=").append(isInCatalog);
        sb.append(", friends=").append(friends);
        sb.append(", genreId=").append(genreId);
        sb.append(", authorUrl=").append(authorUrl);
        sb.append(", pushEnabled=").append(pushEnabled);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", screenOrientation=").append(screenOrientation);
        sb.append(", genre='").append(genre).append("'");
        sb.append(", platformId='").append(platformId).append("'");
        sb.append(", banner560=").append(banner560);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", authorId=").append(authorId);
        sb.append(", international=").append(international);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append(", catalogPosition=").append(catalogPosition);
        sb.append('}');
        return sb.toString();
    }
}
