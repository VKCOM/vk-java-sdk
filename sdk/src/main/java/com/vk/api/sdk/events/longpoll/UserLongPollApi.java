package com.vk.api.sdk.events.longpoll;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

public abstract class UserLongPollApi extends LongPollApi {

    private final UserActor actor;

    private final int groupId;

    public UserLongPollApi(VkApiClient client, UserActor actor, int groupId, int waitTime) {
        super(client, waitTime);
        this.actor = actor;
        this.groupId = groupId;
    }

    public void run() {
        super.run(actor, groupId);
    }
}
