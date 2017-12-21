package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetChatPreviewResponse;

import java.util.Arrays;
import java.util.List;

public class MessagesGetChatPreviewQuery extends AbstractQueryBuilder<MessagesGetChatPreviewQuery, GetChatPreviewResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param link    value of "link" parameter.
     */
    public MessagesGetChatPreviewQuery(VkApiClient client, UserActor actor, String link) {
        super(client, "messages.getChatPreview", GetChatPreviewResponse.class);
        accessToken(actor.getAccessToken());
        link(link);
    }

    /**
     * Set link parameter
     *
     * @param link value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatPreviewQuery link(String link) {
        return unsafeParam("link", link);
    }

    /**
     * Set fields parameter
     *
     * @param fields value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatPreviewQuery fields(List<String> fields) {
        return unsafeParam("fields", fields);
    }

    /**
     * Set fields parameter
     *
     * @param fields value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatPreviewQuery fields(String... fields) {
        return unsafeParam("fields", fields);
    }

    @Override
    protected MessagesGetChatPreviewQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link", "access_token");
    }
}
