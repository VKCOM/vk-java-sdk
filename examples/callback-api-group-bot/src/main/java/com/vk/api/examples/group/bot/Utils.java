package com.vk.api.examples.group.bot;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.groups.responses.GetLongPollServerResponse;

import java.util.Properties;

public class Utils {

    public static GetLongPollServerResponse getLongPollServer(VkApiClient vk, UserActor actor, String groupId) throws ClientException, ApiException {
        return vk.groups().getLongPollServer(actor, groupId).execute();
    }

    public static GetLongPollServerResponse getLongPollServer(VkApiClient vk, GroupActor actor, String groupId) throws ClientException, ApiException {
        return vk.groups().getLongPollServer(actor, groupId).execute();
    }

    public static GroupActor createGroupActor(Properties properties) {
        String groupId = properties.getProperty("groupId");
        String accessToken = properties.getProperty("token");
        return new GroupActor(Integer.parseInt(groupId), accessToken);
    }
}
