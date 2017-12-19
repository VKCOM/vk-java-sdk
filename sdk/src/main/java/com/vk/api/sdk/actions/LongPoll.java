package com.vk.api.sdk.actions;

import com.vk.api.sdk.callback.longpoll.queries.GetLongPollGroupEventsQuery;
import com.vk.api.sdk.callback.longpoll.queries.GetLongPollServerQuery;
import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;

public class LongPoll extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public LongPoll(VkApiClient client) {
        super(client);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GetLongPollServerQuery getLongPollServer(UserActor actor, Integer groupId) {
        return new GetLongPollServerQuery(getClient(), actor, groupId);
    }

    /**
     * Retrieves server info needed to use long polling.
     */
    public GetLongPollServerQuery getLongPollServer(GroupActor actor) {
        return new GetLongPollServerQuery(getClient(), actor);
    }

    /**
     * Retrieves events from long poll server starting from the specified timestamp.
     */
    public GetLongPollGroupEventsQuery getEventsLongPoll(String url, String key, Integer ts) {
        return new GetLongPollGroupEventsQuery(getClient(), url, key, ts);
    }
}
