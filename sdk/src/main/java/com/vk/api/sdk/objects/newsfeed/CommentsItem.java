// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CommentsItem {
    private JsonObject data;

    private Gson gson;

    public CommentsItem(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public CommentsItemTypeTopic getOneOf0() {
        return gson.fromJson(data.toString(), CommentsItemTypeTopic.class);
    }

    public CommentsItemTypePhoto getOneOf1() {
        return gson.fromJson(data.toString(), CommentsItemTypePhoto.class);
    }

    public CommentsItemTypeVideo getOneOf2() {
        return gson.fromJson(data.toString(), CommentsItemTypeVideo.class);
    }

    public CommentsItemTypeNotes getOneOf3() {
        return gson.fromJson(data.toString(), CommentsItemTypeNotes.class);
    }

    public CommentsItemTypePost getOneOf4() {
        return gson.fromJson(data.toString(), CommentsItemTypePost.class);
    }

    public CommentsItemTypeMarket getOneOf5() {
        return gson.fromJson(data.toString(), CommentsItemTypeMarket.class);
    }
}