package com.vk.api.sdk.oneofs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class PhotosPhotoFalseableOneOf {
    private JsonObject data;

    private Gson gson;

    public PhotosPhotoFalseableOneOf(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }
}
