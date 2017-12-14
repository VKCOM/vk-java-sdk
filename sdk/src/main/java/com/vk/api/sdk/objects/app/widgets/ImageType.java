package com.vk.api.sdk.objects.app.widgets;

import com.google.gson.annotations.SerializedName;

public enum ImageType {

    @SerializedName("160x160")
    WIDTH_160_HEIGHT_160("160x160"),

    @SerializedName("160x240")
    WIDTH_160_HEIGHT_240("160x240"),

    @SerializedName("24x24")
    WIDTH_24_HEIGHT_24("24x24"),

    @SerializedName("510x128")
    WIDTH_510_HEIGHT_128("510x128"),

    @SerializedName("50x50")
    WIDTH_50_HEIGHT_50("50x50");

    private String type;

    ImageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
