package com.vk.api.sdk.objects.stories;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum ClickableStickerSubtype implements EnumParam {
    @SerializedName("market_item")
    MARKET_ITEM("market_item"),

    @SerializedName("aliexpress_product")
    ALIEXPRESS_PRODUCT("aliexpress_product");

    private final String value;

    ClickableStickerSubtype(String value) {
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
