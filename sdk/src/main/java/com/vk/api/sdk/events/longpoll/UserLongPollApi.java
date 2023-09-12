package com.vk.api.sdk.events.longpoll;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

public abstract class UserLongPollApi extends LongPollApi {

    private final UserActor actor;

    private final Long groupId;

    protected UserLongPollApi(VkApiClient client, UserActor actor, Long groupId, int waitTime) {
        super(client, waitTime);
        this.actor = actor;
        this.groupId = groupId;
    }

    public void run() {
        super.run(actor, groupId);
    }
}
