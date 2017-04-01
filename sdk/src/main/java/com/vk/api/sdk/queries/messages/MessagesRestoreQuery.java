package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.restore method
 */
public class MessagesRestoreQuery extends AbstractQueryBuilder<MessagesRestoreQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param messageId value of "message id" parameter. Minimum is 0.
     */
    public MessagesRestoreQuery(VkApiClient client, UserActor actor, int messageId) {
        super(client, "messages.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
        messageId(messageId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param messageId value of "message id" parameter. Minimum is 0.
     */
    public MessagesRestoreQuery(VkApiClient client, GroupActor actor, int messageId) {
        super(client, "messages.restore", OkResponse.class);
        accessToken(actor.getAccessToken());
        messageId(messageId);
    }

    /**
     * ID of a previously-deleted message to restore.
     *
     * @param value value of "message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesRestoreQuery messageId(int value) {
        return unsafeParam("message_id", value);
    }

    @Override
    protected MessagesRestoreQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "message_id");
    }
}
