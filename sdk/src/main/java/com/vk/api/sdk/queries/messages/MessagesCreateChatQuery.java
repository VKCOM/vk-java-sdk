package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.createChat method
 */
public class MessagesCreateChatQuery extends AbstractQueryBuilder<MessagesCreateChatQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public MessagesCreateChatQuery(VkApiClient client, UserActor actor, int... userIds) {
        super(client, "messages.createChat", Integer.class);
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public MessagesCreateChatQuery(VkApiClient client, UserActor actor, List<Integer> userIds) {
        super(client, "messages.createChat", Integer.class);
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * IDs of the users to be added to the chat.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesCreateChatQuery userIds(int... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of the users to be added to the chat.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesCreateChatQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Chat title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesCreateChatQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected MessagesCreateChatQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "access_token");
    }
}
