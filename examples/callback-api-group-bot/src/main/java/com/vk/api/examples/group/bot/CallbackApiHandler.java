package com.vk.api.examples.group.bot;

import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.wall.WallPost;

public class CallbackApiHandler extends CallbackApi {

    private VkApiClient vk;
    private GroupActor actor;

    public CallbackApiHandler(VkApiClient vk, GroupActor actor) {
        this.vk = vk;
        this.actor = actor;
    }

    @Override
    public void wallPostNew(Integer groupId, WallPost message) {
        try {
            vk.messages().send(actor).userId(message.getFromId()).message("Hello! You just published this message in my community: \'" + message.getText() + "\'").execute();
        } catch (ApiException | ClientException e) {
            e.printStackTrace();
        }
    }
}
