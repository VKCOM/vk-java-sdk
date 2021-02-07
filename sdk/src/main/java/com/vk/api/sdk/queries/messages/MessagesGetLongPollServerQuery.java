package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetLongPollServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getLongPollServer method
 */
public class MessagesGetLongPollServerQuery extends AbstractQueryBuilder<MessagesGetLongPollServerQuery, GetLongPollServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetLongPollServerQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetLongPollServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getLongPollServer", GetLongPollServerResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * '1' — to return the 'pts' field, needed for the [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
     *
     * @param value value of "need pts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollServerQuery needPts(Boolean value) {
        return unsafeParam("need_pts", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Long poll version
     *
     * @param value value of "lp version" parameter. Minimum is 0. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetLongPollServerQuery lpVersion(Integer value) {
        return unsafeParam("lp_version", value);
    }

    @Override
    protected MessagesGetLongPollServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
