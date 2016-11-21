package com.vk.api.examples.youtrack.callback;

import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.objects.messages.Message;

/**
 * Created by tsivarev on 07.09.16.
 */
public class CallbackApiHandler extends CallbackApi {

    @Override
    public void messageNew(Integer groupId, Message message) {
        MessagesHandler.parseMessage(groupId, message);
    }
}
