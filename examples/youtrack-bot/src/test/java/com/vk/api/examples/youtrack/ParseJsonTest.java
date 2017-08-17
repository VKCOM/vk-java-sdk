package com.vk.api.examples.youtrack;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.vk.api.sdk.callback.objects.messages.CallbackMessage;
import com.vk.api.sdk.callback.objects.messages.CallbackMessageType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class ParseJsonTest {

    @Test
    public void testCallback() {
        Gson gson = new Gson();
        String json = "{\"type\":\"confirmation\",\"group_id\":1}";
        Type typeOfClass = new TypeToken<CallbackMessage<JsonObject>>() {
        }.getType();
        CallbackMessage<JsonObject> callback = gson.fromJson(json, typeOfClass);
        Assert.assertNotNull(callback);
        Assert.assertEquals(callback.getType(), CallbackMessageType.CONFIRMATION);
        Assert.assertEquals(callback.getGroupId(), new Integer(1));
    }
}
