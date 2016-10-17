package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.DeleteChatPhotoResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.deleteChatPhoto method
 */
public class MessagesDeleteChatPhotoQuery extends AbstractQueryBuilder<MessagesDeleteChatPhotoQuery, DeleteChatPhotoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param chatId value of "chat id" parameter. Minimum is 0.
     */
    public MessagesDeleteChatPhotoQuery(VkApiClient client, UserActor actor, int chatId) {
        super(client, "messages.deleteChatPhoto", DeleteChatPhotoResponse.class);
        accessToken(actor.getAccessToken());
        chatId(chatId);
    }

    /**
     * Chat ID.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesDeleteChatPhotoQuery chatId(int value) {
        return unsafeParam("chat_id", value);
    }

    @Override
    protected MessagesDeleteChatPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("chat_id", "access_token");
    }
}
