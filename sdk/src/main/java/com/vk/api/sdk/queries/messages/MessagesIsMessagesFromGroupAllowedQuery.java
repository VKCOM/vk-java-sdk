package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.IsMessagesFromGroupAllowedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.isMessagesFromGroupAllowed method
 */
public class MessagesIsMessagesFromGroupAllowedQuery extends AbstractQueryBuilder<MessagesIsMessagesFromGroupAllowedQuery, IsMessagesFromGroupAllowedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param userId  value of "user id" parameter. Minimum is 0.
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, UserActor actor, int groupId, int userId) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userId  value of "user id" parameter. Minimum is 0.
     */
    public MessagesIsMessagesFromGroupAllowedQuery(VkApiClient client, GroupActor actor, int userId) {
        super(client, "messages.isMessagesFromGroupAllowed", IsMessagesFromGroupAllowedResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        userId(userId);
    }

    /**
     * Group ID.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesIsMessagesFromGroupAllowedQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesIsMessagesFromGroupAllowedQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected MessagesIsMessagesFromGroupAllowedQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
