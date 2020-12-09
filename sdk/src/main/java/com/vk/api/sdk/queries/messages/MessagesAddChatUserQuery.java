package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.addChatUser method
 */
public class MessagesAddChatUserQuery extends AbstractQueryBuilder<MessagesAddChatUserQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param chatId value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     */
    public MessagesAddChatUserQuery(VkApiClient client, UserActor actor, int chatId) {
        super(client, "messages.addChatUser", OkResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Chat ID.
     *
     * @param value value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesAddChatUserQuery chatId(int value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * ID of the user to be added to the chat.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesAddChatUserQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set visible messages count
     *
     * @param value value of "visible messages count" parameter. Maximum is 1000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesAddChatUserQuery visibleMessagesCount(Integer value) {
        return unsafeParam("visible_messages_count", value);
    }

    @Override
    protected MessagesAddChatUserQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "access_token");
    }
}
