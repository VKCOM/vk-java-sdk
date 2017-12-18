package com.vk.api.examples.group.bot;

import com.vk.api.sdk.client.actors.GroupActor;

import java.util.Properties;

public class Utils {

    public static GroupActor createGroupActor(Properties properties) {
        String groupId = properties.getProperty("groupId");
        String accessToken = properties.getProperty("token");
        return new GroupActor(Integer.parseInt(groupId), accessToken);
    }
}
