package com.vk.api.sdk.deserializers;

import com.google.gson.*;

import java.lang.reflect.Type;
import com.vk.api.sdk.objects.base.BoolInt;

public class BoolIntDeserializer implements JsonDeserializer<BoolInt> {

    @Override
    public BoolInt deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (json.isJsonPrimitive()) {
            JsonPrimitive primitive = json.getAsJsonPrimitive();
            if (primitive.isBoolean()) {
                return BoolInt.valueOf(primitive.getAsBoolean() ? "YES": "NO");
            }
            if (primitive.isNumber()) {
                return BoolInt.valueOf(primitive.getAsNumber().equals(1) ? "YES" : "NO");
            }
        }
        throw new JsonParseException("Wrong BoolInt field");
    }
}
