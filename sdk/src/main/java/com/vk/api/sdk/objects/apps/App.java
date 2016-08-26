package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.List;
import java.util.Objects;

/**
 * App object
 */
public class App {
    /**
     * Application ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Application title
     */
    @SerializedName("title")
    private String title;

    /**
     * Screen name
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * Application description
     */
    @SerializedName("description")
    private String description;

    /**
     * URL of the app icon with 100 px in width
     */
    @SerializedName("icon_100")
    private String icon100;

    /**
     * URL of the app icon with 200 px in width
     */
    @SerializedName("icon_200")
    private String icon200;

    /**
     * URL of the app icon with 75 px in width
     */
    @SerializedName("icon_75")
    private String icon75;

    /**
     * URL of the app icon with 50 px in width
     */
    @SerializedName("icon_50")
    private String icon50;

    /**
     * URL of the app icon with 16 px in width
     */
    @SerializedName("icon_16")
    private String icon16;

    /**
     * URL of the app banner with 186 px in width
     */
    @SerializedName("banner_186")
    private String banner186;

    /**
     * URL of the app banner with 896 px in width
     */
    @SerializedName("banner_896")
    private String banner896;

    /**
     * Application type
     */
    @SerializedName("type")
    private AppType type;

    /**
     * Application section name
     */
    @SerializedName("section")
    private String section;

    /**
     * Application author's URL
     */
    @SerializedName("author_url")
    private String authorUrl;

    /**
     * Application author's ID
     */
    @SerializedName("author_id")
    private Integer authorId;

    /**
     * Official community's ID
     */
    @SerializedName("author_group")
    private Integer authorGroup;

    /**
     * Members number
     */
    @SerializedName("members_count")
    private Integer membersCount;

    /**
     * Date when the application has been published in Unixtime
     */
    @SerializedName("published_date")
    private Integer publishedDate;

    /**
     * Catalog position
     */
    @SerializedName("catalog_position")
    private Integer catalogPosition;

    @SerializedName("screenshots")
    private List<Photo> screenshots;

    /**
     * Information whether the application is multilanguage
     */
    @SerializedName("international")
    private Integer international;

    /**
     * Leaderboard type
     */
    @SerializedName("leaderboard_type")
    private AppLeaderboardType leaderboardType;

    /**
     * Genre ID
     */
    @SerializedName("genre_id")
    private Integer genreId;

    /**
     * Genre name
     */
    @SerializedName("genre")
    private String genre;

    /**
     * Application ID in store
     */
    @SerializedName("platform_id")
    private Integer platformId;

    /**
     * Information whther application is in mobile catalog
     */
    @SerializedName("is_in_catalog")
    private Integer isInCatalog;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon100() {
        return icon100;
    }

    public String getIcon200() {
        return icon200;
    }

    public String getIcon75() {
        return icon75;
    }

    public String getIcon50() {
        return icon50;
    }

    public String getIcon16() {
        return icon16;
    }

    public String getBanner186() {
        return banner186;
    }

    public String getBanner896() {
        return banner896;
    }

    public AppType getType() {
        return type;
    }

    public String getSection() {
        return section;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Integer getAuthorGroup() {
        return authorGroup;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public Integer getPublishedDate() {
        return publishedDate;
    }

    public Integer getCatalogPosition() {
        return catalogPosition;
    }

    public List<Photo> getScreenshots() {
        return screenshots;
    }

    public Integer getInternational() {
        return international;
    }

    public AppLeaderboardType getLeaderboardType() {
        return leaderboardType;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public Integer getIsInCatalog() {
        return isInCatalog;
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon50, genreId, isInCatalog, icon75, banner896, description, icon16, section, screenName, title, type, screenshots, authorUrl, genre, leaderboardType, id, authorGroup, international, membersCount, banner186, platformId, authorId, icon200, icon100, catalogPosition, publishedDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(id, app.id) &&
                Objects.equals(title, app.title) &&
                Objects.equals(screenName, app.screenName) &&
                Objects.equals(description, app.description) &&
                Objects.equals(icon100, app.icon100) &&
                Objects.equals(icon200, app.icon200) &&
                Objects.equals(icon75, app.icon75) &&
                Objects.equals(icon50, app.icon50) &&
                Objects.equals(icon16, app.icon16) &&
                Objects.equals(banner186, app.banner186) &&
                Objects.equals(banner896, app.banner896) &&
                Objects.equals(type, app.type) &&
                Objects.equals(section, app.section) &&
                Objects.equals(authorUrl, app.authorUrl) &&
                Objects.equals(authorId, app.authorId) &&
                Objects.equals(authorGroup, app.authorGroup) &&
                Objects.equals(membersCount, app.membersCount) &&
                Objects.equals(publishedDate, app.publishedDate) &&
                Objects.equals(catalogPosition, app.catalogPosition) &&
                Objects.equals(screenshots, app.screenshots) &&
                Objects.equals(international, app.international) &&
                Objects.equals(leaderboardType, app.leaderboardType) &&
                Objects.equals(genreId, app.genreId) &&
                Objects.equals(genre, app.genre) &&
                Objects.equals(platformId, app.platformId) &&
                Objects.equals(isInCatalog, app.isInCatalog);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("App{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", icon100='").append(icon100).append("'");
        sb.append(", icon200='").append(icon200).append("'");
        sb.append(", icon75='").append(icon75).append("'");
        sb.append(", icon50='").append(icon50).append("'");
        sb.append(", icon16='").append(icon16).append("'");
        sb.append(", banner186='").append(banner186).append("'");
        sb.append(", banner896='").append(banner896).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", authorUrl='").append(authorUrl).append("'");
        sb.append(", authorId=").append(authorId);
        sb.append(", authorGroup=").append(authorGroup);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append(", catalogPosition=").append(catalogPosition);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", international=").append(international);
        sb.append(", leaderboardType=").append(leaderboardType);
        sb.append(", genreId=").append(genreId);
        sb.append(", genre='").append(genre).append("'");
        sb.append(", platformId=").append(platformId);
        sb.append(", isInCatalog=").append(isInCatalog);
        sb.append('}');
        return sb.toString();
    }
}
