package com.vk.api.sdk.longpolling;

import com.google.gson.JsonObject;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.LongPollServerKeyExpiredException;
import com.vk.api.sdk.objects.callback.longpoll.responses.GetLongPollEventsResponse;
import com.vk.api.sdk.objects.groups.LongPollServer;
import com.vk.api.sdk.objects.messages.LongpollParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class LongPollingListener {
    private final VkApiClient vk;
    private final Actor actor;
    private final int groupId;

    private String server;
    private String key;
    private int ts;

    private final Map<String, Consumer<JsonObject>> handlers;

    private static Logger logger = LoggerFactory.getLogger(LongPollingListener.class);

    public LongPollingListener(final VkApiClient vk, final GroupActor actor, int groupId) {
        this.vk = vk;
        this.actor = actor;
        this.groupId = groupId;
        this.handlers = new HashMap<>();
    }

    public LongPollingListener(final VkApiClient vk, final UserActor actor) {
        this.vk = vk;
        this.actor = actor;
        this.groupId = -1;
        this.handlers = new HashMap<>();
    }

    protected void connect() throws ClientException, ApiException {
        if (actor instanceof GroupActor) {
            final LongPollServer longPollServer = vk.groups()
                    .getLongPollServer((GroupActor) actor, groupId)
                    .execute();

            this.server = longPollServer.getServer();
            this.key = longPollServer.getKey();
            this.ts = Integer.parseInt(longPollServer.getTs());
        } else {
            final LongpollParams longPollServer = vk.messages()
                    .getLongPollServer((UserActor) actor)
                    .execute();

            this.server = longPollServer.getServer();
            this.key = longPollServer.getKey();
            this.ts = longPollServer.getTs();
        }

    }

    public void startListening() throws ClientException, ApiException {
        while (true) {
            try {
                GetLongPollEventsResponse response = vk.longPoll()
                        .getEvents(server, key, ts)
                        .waitTime(30)
                        .execute();

                ts = response.getTs();
                List<JsonObject> updates = response.getUpdates();


                updates.forEach(jsonObject -> {
                    final String type = jsonObject.get("type").getAsString();
                    Consumer<JsonObject> handler = handlers.get(type);
                    if(handler != null) {
                        handler.accept(jsonObject);
                    }
                });

            } catch (LongPollServerKeyExpiredException e) {
                logger.info("Key expired. Regeneration...");
                connect();
            } catch (ClientException e) {
                logger.error("Long poll error", e);
                connect();
            }

        }
    }


    public LongPollingListener addHandler(String event, Consumer<JsonObject> handler) {
        handlers.put(event, handler);
        return this;
    }
}
