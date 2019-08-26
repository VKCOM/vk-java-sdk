package com.vk.api.sdk.objects.apps;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URL;
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
     * URL of the app icon with 278 px in width
     */
    @SerializedName("icon_278")
    private URL icon278;

    /**
     * URL of the app icon with 75 px in width
     */
    @SerializedName("icon_75")
    private URL icon75;

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

    public URL getIcon139() {
        return icon139;
    }

    public AppMin setIcon139(URL icon139) {
        this.icon139 = icon139;
        return this;
    }

    public URL getIcon150() {
        return icon150;
    }

    public AppMin setIcon150(URL icon150) {
        this.icon150 = icon150;
        return this;
    }

    public URL getIcon278() {
        return icon278;
    }

    public AppMin setIcon278(URL icon278) {
        this.icon278 = icon278;
        return this;
    }

    public URL getIcon75() {
        return icon75;
    }

    public AppMin setIcon75(URL icon75) {
        this.icon75 = icon75;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon139, icon75, icon278, id, type, title, icon150);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppMin appMin = (AppMin) o;
        return Objects.equals(icon278, appMin.icon278) &&
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
        sb.append("icon278=").append(icon278);
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
