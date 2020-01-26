package com.vk.api.sdk.objects.account;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Info object
 */
public class Info implements Validable {
    /**
     * Two factor authentication is enabled
     */
    @SerializedName("2fa_required")
    private BoolInt _2faRequired;

    /**
     * Country code
     */
    @SerializedName("country")
    private String country;

    /**
     * Information whether HTTPS-only is enabled
     */
    @SerializedName("https_required")
    private BoolInt httpsRequired;

    /**
     * Information whether user has been processed intro
     */
    @SerializedName("intro")
    private BoolInt intro;

    /**
     * Language ID
     */
    @SerializedName("lang")
    private Integer lang;

    /**
     * Information whether wall comments should be hidden
     */
    @SerializedName("no_wall_replies")
    private BoolInt noWallReplies;

    /**
     * Information whether only owners posts should be shown
     */
    @SerializedName("own_posts_default")
    private BoolInt ownPostsDefault;

    public boolean is_2faRequired() {
        return _2faRequired == BoolInt.YESBOOL;
    }

    public BoolInt get_2faRequired() {
        return _2faRequired;
    }

    public String getCountry() {
        return country;
    }

    public Info setCountry(String country) {
        this.country = country;
        return this;
    }

    public boolean isHttpsRequired() {
        return httpsRequired == BoolInt.YESBOOL;
    }

    public BoolInt getHttpsRequired() {
        return httpsRequired;
    }

    public boolean isIntro() {
        return intro == BoolInt.YESBOOL;
    }

    public BoolInt getIntro() {
        return intro;
    }

    public Integer getLang() {
        return lang;
    }

    public Info setLang(Integer lang) {
        this.lang = lang;
        return this;
    }

    public boolean isNoWallReplies() {
        return noWallReplies == BoolInt.YESBOOL;
    }

    public BoolInt getNoWallReplies() {
        return noWallReplies;
    }

    public boolean isOwnPostsDefault() {
        return ownPostsDefault == BoolInt.YESBOOL;
    }

    public BoolInt getOwnPostsDefault() {
        return ownPostsDefault;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, intro, lang, ownPostsDefault, noWallReplies, _2faRequired, httpsRequired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(country, info.country) &&
                Objects.equals(noWallReplies, info.noWallReplies) &&
                Objects.equals(ownPostsDefault, info.ownPostsDefault) &&
                Objects.equals(intro, info.intro) &&
                Objects.equals(httpsRequired, info.httpsRequired) &&
                Objects.equals(_2faRequired, info._2faRequired) &&
                Objects.equals(lang, info.lang);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("country='").append(country).append("'");
        sb.append(", noWallReplies=").append(noWallReplies);
        sb.append(", ownPostsDefault=").append(ownPostsDefault);
        sb.append(", intro=").append(intro);
        sb.append(", httpsRequired=").append(httpsRequired);
        sb.append(", _2faRequired=").append(_2faRequired);
        sb.append(", lang=").append(lang);
        sb.append('}');
        return sb.toString();
    }
}
