package com.vk.api.examples.youtrack;

import com.google.gson.Gson;
import com.vk.api.sdk.callback.objects.CallbackMessageBase;
import com.vk.api.sdk.callback.objects.CallbackMessageType;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Anton Tsivarev on 10.09.16.
 */
public class ParseJsonTest {

    @Test
    public void testCallback() {
        Gson gson = new Gson();
        String json = "{\"type\":\"confirmation\",\"group_id\":1}";
        CallbackMessageBase callback = gson.fromJson(json, CallbackMessageBase.class);
        Assert.assertNotNull(callback);
        Assert.assertEquals(callback.getType(), CallbackMessageType.CONFIRMATION);
        Assert.assertEquals(callback.getGroupId(), new Integer(1));
    }
}
