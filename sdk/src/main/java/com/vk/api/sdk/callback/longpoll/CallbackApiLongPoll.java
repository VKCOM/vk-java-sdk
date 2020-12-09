package com.vk.api.sdk.callback.longpoll;

import com.google.gson.JsonObject;
import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.objects.callback.longpoll.responses.GetLongPollEventsResponse;
import com.vk.api.sdk.objects.groups.LongPollServer;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CallbackApiLongPoll extends CallbackApi {

    private static final Logger LOG = LogManager.getLogger(CallbackApiLongPoll.class);

    private static final int DEFAULT_WAIT = 10;

    private VkApiClient client;
    private UserActor userActor;
    private GroupActor groupActor;

    private final Integer groupId;

    private final Integer waitTime;

    public CallbackApiLongPoll(VkApiClient client, UserActor actor, int groupId) {
        this.client = client;
        this.userActor = actor;
        this.groupId = groupId;
        waitTime = DEFAULT_WAIT;
    }

    public CallbackApiLongPoll(VkApiClient client, GroupActor actor) {
        this.client = client;
        this.groupActor = actor;
        this.groupId = actor.getGroupId();
        waitTime = DEFAULT_WAIT;
    }

    public CallbackApiLongPoll(VkApiClient client, UserActor actor, int groupId, int waitTime) {
        this.client = client;
        this.userActor = actor;
        this.groupId = groupId;
        this.waitTime = waitTime;
    }

    public CallbackApiLongPoll(VkApiClient client, GroupActor actor, int waitTime) {
        this.client = client;
        this.groupActor = actor;
        this.groupId = actor.getGroupId();
        this.waitTime = waitTime;
    }

    public void run() throws ClientException, ApiException {
        GetLongPollServerResponse longPollServer = getLongPollServer();
        int lastTimeStamp = Integer.parseInt(longPollServer.getTs());
        while (true) {
            try {
                GetLongPollEventsResponse eventsResponse = client.longPoll().getEvents(longPollServer.getServer(), longPollServer.getKey(), lastTimeStamp).waitTime(waitTime).execute();
                for (JsonObject jsonObject: eventsResponse.getUpdates()) {
                    parse(jsonObject);
                }
                lastTimeStamp = eventsResponse.getTs();
            } catch (LongPollServerKeyExpiredException e) {
                longPollServer = getLongPollServer();
                LOG.info(longPollServer.toString());
            }
        }
    }

    private GetLongPollServerResponse getLongPollServer() throws ClientException, ApiException {
        if (groupActor != null) {
            return client.groupsLongPoll().getLongPollServer(groupActor, groupActor.getGroupId()).execute();
        }

        return client.groupsLongPoll().getLongPollServer(userActor, groupId).execute();
    }

    protected VkApiClient getClient() {
        return client;
    }
}
