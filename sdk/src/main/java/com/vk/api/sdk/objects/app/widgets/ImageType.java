package com.vk.api.sdk.objects.app.widgets;

public enum ImageType {

    WIDTH_160_HEIGHT_160("160x160"),
    WIDTH_160_HEIGHT_240("160x240"),
    WIDTH_24_HEIGHT_24("24x24"),
    WIDTH_510_HEIGHT_128("510x128"),
    WIDTH_50_HEIGHT_50("50x50");

    private String type;

    ImageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
