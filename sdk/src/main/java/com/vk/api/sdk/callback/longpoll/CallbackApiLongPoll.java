package com.vk.api.sdk.callback.longpoll;

import com.google.gson.JsonObject;
import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.objects.groups.longpoll.GetEventsResponse;
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
        GetLongPollServerResponse credentials = getCredentials();
        int lastTs = credentials.getTs();
        while (true) {
            try {
                GetEventsResponse eventsResponse = client.groups().getEventsLongPoll(credentials.getServer(), credentials.getKey(), lastTs).waitParam(DEFAULT_WAIT).execute();
                System.out.println(eventsResponse);
                for (JsonObject jsonObject: eventsResponse.getUpdates()) {
                    parse(jsonObject);
                }
            } catch (ApiException e) {
                if (e instanceof LongPollServerKeyExpiredException) {
                    credentials = getCredentials();
                } else {
                    throw e;
                }
            }
        }
    }

    private GetLongPollServerResponse getCredentials() throws ClientException, ApiException {
        return client.groups().getLongPollServer(actor, groupId).execute();
    }

    protected VkApiClient getClient() {
        return client;
    }
}
