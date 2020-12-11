package com.vk.api.examples.youtrack;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.callback.objects.messages.CallbackMessage;
import com.vk.api.sdk.objects.callback.MessageType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;

public class ParseJsonTest {

    @Test
    public void testCallback() {
        Gson gson = new Gson();
        String json = "{\"type\":\"confirmation\",\"group_id\":1}";
        Type typeOfClass = new TypeToken<CallbackMessage<JsonObject>>() {
        }.getType();
        CallbackMessage<JsonObject> callback = gson.fromJson(json, typeOfClass);
        Assert.assertNotNull(callback);
        Assert.assertEquals(callback.getType(), MessageType.CONFIRMATION);
        Assert.assertEquals(callback.getGroupId(), new Integer(1));
    }
}
