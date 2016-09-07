package com.vk.api.examples.hellobot;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

class BotRequestHandler {

    private static final Logger LOG = LogManager.getLogger(BotRequestHandler.class);

    private final VkApiClient apiClient;

    private final GroupActor actor;
    private final Random random = new Random();

    BotRequestHandler(VkApiClient apiClient, GroupActor actor) {
        this.apiClient = apiClient;
        this.actor = actor;
    }

    void handle(int userId) {
        try {
            String name = apiClient.users().get().userIds(String.valueOf(userId)).execute().get(0).getFirstName();
            apiClient.messages().send(actor).message("Hello, " + name + "!").userId(userId).randomId(random.nextInt()).execute();
        } catch (ApiException e) {
            LOG.error("INVALID REQUEST", e);
        } catch (ClientException e) {
            LOG.error("NETWORK ERROR", e);
        }
    }
}
