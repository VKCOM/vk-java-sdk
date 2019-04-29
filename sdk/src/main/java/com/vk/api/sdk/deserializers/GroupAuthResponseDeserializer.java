package com.vk.api.sdk.deserializers;

import com.google.gson.*;
import com.vk.api.sdk.objects.GroupAuthResponse;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton Tsivarev on 17.10.16.
 */
public class GroupAuthResponseDeserializer implements JsonDeserializer {

    private static final String ACCESS_TOKEN_PREFIX = "access_token_";

    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonObject()) {
            throw new JsonParseException("invalid json");
        }

        JsonObject jsonObject = json.getAsJsonObject();
        Map<Integer, String> accessTokens = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (!entry.getKey().startsWith(ACCESS_TOKEN_PREFIX)) {
                continue;
            }

            Integer groupId = Integer.parseInt(entry.getKey().substring(ACCESS_TOKEN_PREFIX.length()));
            accessTokens.put(groupId, entry.getValue().getAsString());
        }

        String error = null;
        if (jsonObject.has("error")) {
            error = jsonObject.get("error").getAsString();
        }

        return new GroupAuthResponse(accessTokens, jsonObject.get("expires_in").getAsInt(), error);
    }
}
