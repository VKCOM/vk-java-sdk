package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.removeChatUser method
 */
public class MessagesRemoveChatUserQuery extends AbstractQueryBuilder<MessagesRemoveChatUserQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param chatId value of "chat id" parameter.
     * @param userId value of "user id" parameter.
     */
    public MessagesRemoveChatUserQuery(VkApiClient client, UserActor actor, int chatId, String userId) {
        super(client, "messages.removeChatUser", OkResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
        userId(userId);
    }

    /**
     * Chat ID.
     *
     * @param value value of "chat id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesRemoveChatUserQuery chatId(int value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * ID of the user to be removed from the chat.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesRemoveChatUserQuery userId(String value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected MessagesRemoveChatUserQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "user_id", "access_token");
    }
}
