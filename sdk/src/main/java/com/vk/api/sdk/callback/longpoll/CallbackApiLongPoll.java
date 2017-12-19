package com.vk.api.sdk.callback.longpoll;

import com.google.gson.JsonObject;
import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.callback.longpoll.responses.GetLongPollGroupEventsResponse;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

public class CallbackApiLongPoll extends CallbackApi {

    private final int DEFAULT_WAIT;

    private VkApiClient client;
    private Actor actor;

    private final Integer groupId;

    public CallbackApiLongPoll(VkApiClient client, UserActor actor, Integer groupId) {
        this.client = client;
        this.actor = actor;
        this.groupId = groupId;
        DEFAULT_WAIT = 10;
    }

    public CallbackApiLongPoll(VkApiClient client, GroupActor actor) {
        this.client = client;
        this.actor = actor;
        this.groupId = actor.getGroupId();
        DEFAULT_WAIT = 10;
    }


    public CallbackApiLongPoll(VkApiClient client, UserActor actor, Integer groupId, int waitTime) {
        this.client = client;
        this.actor = actor;
        this.groupId = groupId;
        DEFAULT_WAIT = waitTime;
    }

    public CallbackApiLongPoll(VkApiClient client, GroupActor actor, int waitTime) {
        this.client = client;
        this.actor = actor;
        this.groupId = actor.getGroupId();
        DEFAULT_WAIT = waitTime;
    }

    public void run() throws ClientException, ApiException {
        GetLongPollServerResponse longPollServer = getLongPollServer();
        int lastTimeStamp = longPollServer.getTs();
        while (true) {
            try {
                GetLongPollGroupEventsResponse eventsResponse = client.longPoll().getEventsLongPoll(longPollServer.getServer(), longPollServer.getKey(), lastTimeStamp).waitTime(DEFAULT_WAIT).execute();
                for (JsonObject jsonObject: eventsResponse.getUpdates()) {
                    parse(jsonObject);
                }
                lastTimeStamp = eventsResponse.getTimestamp();
            } catch (LongPollServerKeyExpiredException e) {
                longPollServer = getLongPollServer();
            }
        }
    }

    private GetLongPollServerResponse getLongPollServer() throws ClientException, ApiException {
        if (actor instanceof GroupActor) {
            return client.longPoll().getLongPollServer((GroupActor) actor).execute();
        }
        return client.longPoll().getLongPollServer((UserActor) actor, groupId).execute();
    }

    protected VkApiClient getClient() {
        return client;
    }
}
