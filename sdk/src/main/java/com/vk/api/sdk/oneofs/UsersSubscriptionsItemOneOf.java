package com.vk.api.sdk.oneofs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.users.UserXtrType;

public class UsersSubscriptionsItemOneOf {
    private JsonObject data;

    private Gson gson;

    public UsersSubscriptionsItemOneOf(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public UserXtrType getOneOf0() {
        return gson.fromJson(data.toString(), UserXtrType.class);
    }

    public GroupFull getOneOf1() {
        return gson.fromJson(data.toString(), GroupFull.class);
    }
}
