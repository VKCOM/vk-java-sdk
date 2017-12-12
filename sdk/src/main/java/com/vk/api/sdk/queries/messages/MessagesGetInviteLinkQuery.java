package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetInviteLinkResponse;

import java.util.Arrays;
import java.util.List;

public class MessagesGetInviteLinkQuery extends AbstractQueryBuilder<MessagesGetInviteLinkQuery, GetInviteLinkResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  user actor with access token
     */
    public MessagesGetInviteLinkQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getInviteLink", GetInviteLinkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetInviteLinkQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set reset parameter
     *
     * @param value value of "reset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetInviteLinkQuery reset(Integer value) {
        return unsafeParam("reset", value);
    }

    @Override
    protected MessagesGetInviteLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
