package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Objects;

/**
 * Info object
 */
public class Info {
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
     * Information whether only owners posts should be shown
     */
    @SerializedName("own_posts_default")
    private BoolInt ownPostsDefault;

    /**
     * Information whether wall comments should be hidden
     */
    @SerializedName("no_wall_replies")
    private BoolInt noWallReplies;

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
     * Two factor authentication is required
     */
    @SerializedName("2fa_required")
    private BoolInt twoFactorAuthRequired;

    public String getCountry() {
        return country;
    }

    public boolean isHttpsRequired() {
        return httpsRequired == BoolInt.YES;
    }

    public boolean isOwnPostsDefault() {
        return ownPostsDefault == BoolInt.YES;
    }

    public boolean isNoWallReplies() {
        return noWallReplies == BoolInt.YES;
    }

    public boolean isIntro() {
        return intro == BoolInt.YES;
    }

    public Integer getLang() {
        return lang;
    }

    public boolean isTwoFactorAuthRequired() {
        return twoFactorAuthRequired == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, intro, lang, ownPostsDefault, noWallReplies, httpsRequired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(country, info.country) &&
                Objects.equals(httpsRequired, info.httpsRequired) &&
                Objects.equals(ownPostsDefault, info.ownPostsDefault) &&
                Objects.equals(noWallReplies, info.noWallReplies) &&
                Objects.equals(intro, info.intro) &&
                Objects.equals(lang, info.lang) &&
                Objects.equals(twoFactorAuthRequired, info.twoFactorAuthRequired);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("country='").append(country).append("'");
        sb.append(", httpsRequired=").append(httpsRequired);
        sb.append(", ownPostsDefault=").append(ownPostsDefault);
        sb.append(", noWallReplies=").append(noWallReplies);
        sb.append(", intro=").append(intro);
        sb.append(", lang=").append(lang);
        sb.append(", twoFactorAuthRequired=").append(twoFactorAuthRequired);
        sb.append('}');
        return sb.toString();
    }
}
