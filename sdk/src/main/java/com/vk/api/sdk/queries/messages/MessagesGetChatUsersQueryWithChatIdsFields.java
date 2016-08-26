package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.responses.GetChatUsersChatIdsFieldsResponse;
import com.vk.api.sdk.queries.Field;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getChatUsers method
 */
public class MessagesGetChatUsersQueryWithChatIdsFields extends AbstractQueryBuilder<MessagesGetChatUsersQueryWithChatIdsFields, GetChatUsersChatIdsFieldsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetChatUsersQueryWithChatIdsFields(VkApiClient client, Actor actor, Integer[] chatIds, Field... fields) {
        super(client, "messages.getChatUsers", GetChatUsersChatIdsFieldsResponse.class);
        accessToken(actor.getAccessToken());
        chatIds(chatIds);
        fields(fields);
    }

    /**
     * Chat IDs.
     *
     * @param value value of "chat ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatUsersQueryWithChatIdsFields chatIds(Integer... value) {
        return unsafeParam("chat_ids", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatUsersQueryWithChatIdsFields fields(Field... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatUsersQueryWithChatIdsFields nameCase(String value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected MessagesGetChatUsersQueryWithChatIdsFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
