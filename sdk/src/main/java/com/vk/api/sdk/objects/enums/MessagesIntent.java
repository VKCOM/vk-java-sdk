package com.vk.api.sdk.objects.enums;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum MessagesIntent implements EnumParam {
    @SerializedName("account_update")
    ACCOUNT_UPDATE("account_update"),

    @SerializedName("bot_ad_invite")
    BOT_AD_INVITE("bot_ad_invite"),

    @SerializedName("bot_ad_promo")
    BOT_AD_PROMO("bot_ad_promo"),

    @SerializedName("confirmed_notification")
    CONFIRMED_NOTIFICATION("confirmed_notification"),

    @SerializedName("customer_support")
    CUSTOMER_SUPPORT("customer_support"),

    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("game_notification")
    GAME_NOTIFICATION("game_notification"),

    @SerializedName("moderated_newsletter")
    MODERATED_NEWSLETTER("moderated_newsletter"),

    @SerializedName("non_promo_newsletter")
    NON_PROMO_NEWSLETTER("non_promo_newsletter"),

    @SerializedName("promo_newsletter")
    PROMO_NEWSLETTER("promo_newsletter"),

    @SerializedName("purchase_update")
    PURCHASE_UPDATE("purchase_update");

    private final String value;

    MessagesIntent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
