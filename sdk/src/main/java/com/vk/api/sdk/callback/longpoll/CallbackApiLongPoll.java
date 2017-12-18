package com.vk.api.sdk.callback.longpoll;

import com.google.gson.JsonObject;
import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.callback.longpoll.responses.GetLongPollGroupEventsResponse;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

public class CallbackApiLongPoll extends CallbackApi {

    private static final int DEFAULT_WAIT = 10;

    private VkApiClient client;
    private Actor actor;

    private final String groupId;

    public CallbackApiLongPoll(VkApiClient client, Actor actor, String groupId) {
        this.client = client;
        this.actor = actor;
        this.groupId = groupId;
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
        return client.longPoll().getLongPollServer(actor, groupId).execute();
    }

    protected VkApiClient getClient() {
        return client;
    }
}
