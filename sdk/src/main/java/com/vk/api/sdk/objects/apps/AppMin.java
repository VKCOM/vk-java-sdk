package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * AppMin object
 */
public class AppMin implements Validable {
    @SerializedName("type")
    @Required
    private AppType type;

    /**
     * Application ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Application title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Application author's ID
     */
    @SerializedName("author_owner_id")
    private Integer authorOwnerId;

    /**
     * Is application installed
     */
    @SerializedName("is_installed")
    private Boolean isInstalled;

    /**
     * URL of the app icon with 139 px in width
     */
    @SerializedName("icon_139")
    private URI icon139;

    /**
     * URL of the app icon with 150 px in width
     */
    @SerializedName("icon_150")
    private URI icon150;

    /**
     * URL of the app icon with 278 px in width
     */
    @SerializedName("icon_278")
    private URI icon278;

    /**
     * URL of the app icon with 576 px in width
     */
    @SerializedName("icon_576")
    private URI icon576;

    /**
     * Hex color code without hash sign
     */
    @SerializedName("background_loader_color")
    private String backgroundLoaderColor;

    /**
     * SVG data
     */
    @SerializedName("loader_icon")
    private String loaderIcon;

    /**
     * URL of the app icon with 75 px in width
     */
    @SerializedName("icon_75")
    private URI icon75;

    public AppType getType() {
        return type;
    }

    public AppMin setType(AppType type) {
        this.type = type;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AppMin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AppMin setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getAuthorOwnerId() {
        return authorOwnerId;
    }

    public AppMin setAuthorOwnerId(Integer authorOwnerId) {
        this.authorOwnerId = authorOwnerId;
        return this;
    }

    public Boolean getIsInstalled() {
        return isInstalled;
    }

    public AppMin setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
        return this;
    }

    public URI getIcon139() {
        return icon139;
    }

    public AppMin setIcon139(URI icon139) {
        this.icon139 = icon139;
        return this;
    }

    public URI getIcon150() {
        return icon150;
    }

    public AppMin setIcon150(URI icon150) {
        this.icon150 = icon150;
        return this;
    }

    public URI getIcon278() {
        return icon278;
    }

    public AppMin setIcon278(URI icon278) {
        this.icon278 = icon278;
        return this;
    }

    public URI getIcon576() {
        return icon576;
    }

    public AppMin setIcon576(URI icon576) {
        this.icon576 = icon576;
        return this;
    }

    public String getBackgroundLoaderColor() {
        return backgroundLoaderColor;
    }

    public AppMin setBackgroundLoaderColor(String backgroundLoaderColor) {
        this.backgroundLoaderColor = backgroundLoaderColor;
        return this;
    }

    public String getLoaderIcon() {
        return loaderIcon;
    }

    public AppMin setLoaderIcon(String loaderIcon) {
        this.loaderIcon = loaderIcon;
        return this;
    }

    public URI getIcon75() {
        return icon75;
    }

    public AppMin setIcon75(URI icon75) {
        this.icon75 = icon75;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon139, icon75, icon576, icon278, loaderIcon, isInstalled, authorOwnerId, id, type, title, backgroundLoaderColor, icon150);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppMin appMin = (AppMin) o;
        return Objects.equals(isInstalled, appMin.isInstalled) &&
                Objects.equals(authorOwnerId, appMin.authorOwnerId) &&
                Objects.equals(icon278, appMin.icon278) &&
                Objects.equals(loaderIcon, appMin.loaderIcon) &&
                Objects.equals(icon576, appMin.icon576) &&
                Objects.equals(backgroundLoaderColor, appMin.backgroundLoaderColor) &&
                Objects.equals(icon139, appMin.icon139) &&
                Objects.equals(icon75, appMin.icon75) &&
                Objects.equals(id, appMin.id) &&
                Objects.equals(type, appMin.type) &&
                Objects.equals(title, appMin.title) &&
                Objects.equals(icon150, appMin.icon150);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AppMin{");
        sb.append("isInstalled=").append(isInstalled);
        sb.append(", authorOwnerId=").append(authorOwnerId);
        sb.append(", icon278=").append(icon278);
        sb.append(", loaderIcon='").append(loaderIcon).append("'");
        sb.append(", icon576=").append(icon576);
        sb.append(", backgroundLoaderColor='").append(backgroundLoaderColor).append("'");
        sb.append(", icon139=").append(icon139);
        sb.append(", icon75=").append(icon75);
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", title='").append(title).append("'");
        sb.append(", icon150=").append(icon150);
        sb.append('}');
        return sb.toString();
    }
}
