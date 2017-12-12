package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.JoinChatResponse;

import java.util.Arrays;
import java.util.List;

public class MessagesJoinChatByInviteLinkQuery extends AbstractQueryBuilder<MessagesJoinChatByInviteLinkQuery, JoinChatResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param link    value of "link" parameter.
     */
    public MessagesJoinChatByInviteLinkQuery(VkApiClient client, UserActor actor, String link) {
        super(client, "messages.joinChatByInviteLink", JoinChatResponse.class);
        accessToken(actor.getAccessToken());
        link(link);
    }

    /**
     * Set link parameter
     *
     * @param link value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesJoinChatByInviteLinkQuery link(String link) {
        return unsafeParam("link", link);
    }

    @Override
    protected MessagesJoinChatByInviteLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link", "access_token");
    }
}
