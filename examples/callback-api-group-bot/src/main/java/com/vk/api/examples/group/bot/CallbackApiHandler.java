package com.vk.api.examples.group.bot;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.wall.WallPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallbackApiHandler extends CallbackApiLongPoll {

    private static final Logger LOG = LoggerFactory.getLogger(CallbackApiHandler.class);

    public CallbackApiHandler(VkApiClient client, Actor actor, String groupId) {
        super(client, actor, groupId);
    }


    @Override
    public void wallPostNew(Integer groupId, WallPost message) {
        LOG.info("wallPostNew: " + message.getText());
    }
}
