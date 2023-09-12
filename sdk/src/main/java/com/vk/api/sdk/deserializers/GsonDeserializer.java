package com.vk.api.sdk.deserializers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.Map;

public class GsonDeserializer {
    private static final Gson mapper = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public static <T> T deserialize(String json, Type modelType) {
        return mapper.fromJson(json, modelType);
    }
}
