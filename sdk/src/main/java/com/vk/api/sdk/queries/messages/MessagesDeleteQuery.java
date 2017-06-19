package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Query for Messages.delete method
 */
public class MessagesDeleteQuery extends AbstractQueryBuilder<MessagesDeleteQuery, Map<Integer, BoolInt>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param messageIds messages ids
     */
    public MessagesDeleteQuery(VkApiClient client, UserActor actor, Integer... messageIds) {
        super(client, "messages.delete", Utils.buildParametrizedType(Map.class, Integer.class, BoolInt.class));
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param messageIds messages ids
     */
    public MessagesDeleteQuery(VkApiClient client, UserActor actor, List<Integer> messageIds) {
        super(client, "messages.delete", Utils.buildParametrizedType(Map.class, Integer.class, BoolInt.class));
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param messageIds messages ids
     */
    public MessagesDeleteQuery(VkApiClient client, GroupActor actor, List<Integer> messageIds) {
        super(client, "messages.delete", Utils.buildParametrizedType(Map.class, Integer.class, BoolInt.class));
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param messageIds messages ids
     */
    public MessagesDeleteQuery(VkApiClient client, GroupActor actor, Integer... messageIds) {
        super(client, "messages.delete", Utils.buildParametrizedType(Map.class, Integer.class, BoolInt.class));
        accessToken(actor.getAccessToken());
        messageIds(messageIds);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesDeleteQuery messageIds(Integer... value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Message IDs.
     *
     * @param value value of "message ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesDeleteQuery messageIds(List<Integer> value) {
        return unsafeParam("message_ids", value);
    }

    /**
     * Set spam
     *
     * @param value value of "spam" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteQuery spam(Boolean value) {
        return unsafeParam("spam", value);
    }

    @Override
    protected MessagesDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("message_ids", "access_token");
    }
}
