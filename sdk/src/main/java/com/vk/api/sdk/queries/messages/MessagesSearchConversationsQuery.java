package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.SearchConversationsResponse;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.searchConversations method
 */
public class MessagesSearchConversationsQuery extends AbstractQueryBuilder<MessagesSearchConversationsQuery, SearchConversationsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSearchConversationsQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSearchConversationsQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Maximum number of results.
     *
     * @param value value of "count" parameter. Maximum is 255. Minimum is 1. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * '1' — return extra information about users and communities
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * fields
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesSearchConversationsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
