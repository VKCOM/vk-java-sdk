package com.vk.api.sdk.objects.app.widgets;

public enum ImageType {

    W_160_H_160("160x160"),
    W_160_H_240("160x240"),
    W_24_H_24("24x24"),
    W_510_H_128("510x128"),
    W_50_H_50("50x50");

    private String type;

    ImageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
