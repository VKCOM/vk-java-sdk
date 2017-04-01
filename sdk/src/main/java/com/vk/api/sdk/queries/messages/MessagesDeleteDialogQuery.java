package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.deleteDialog method
 */
public class MessagesDeleteDialogQuery extends AbstractQueryBuilder<MessagesDeleteDialogQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesDeleteDialogQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.deleteDialog", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesDeleteDialogQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.deleteDialog", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID. To clear a chat history use "chat_id"
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteDialogQuery userId(String value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteDialogQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Offset needed to return a specific subset of messages.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteDialogQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of messages to delete.
     * NOTE: If the number of messages exceeds the maximum, the method shall be called several times.
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesDeleteDialogQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected MessagesDeleteDialogQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
