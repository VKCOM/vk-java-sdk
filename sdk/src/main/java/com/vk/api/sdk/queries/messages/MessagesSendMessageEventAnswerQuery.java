package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.sendMessageEventAnswer method
 */
public class MessagesSendMessageEventAnswerQuery extends AbstractQueryBuilder<MessagesSendMessageEventAnswerQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param eventId value of "event id" parameter.
     * @param userId value of "user id" parameter.
     * @param peerId value of "peer id" parameter.
     */
    public MessagesSendMessageEventAnswerQuery(VkApiClient client, GroupActor actor, String eventId,
            int userId, int peerId) {
        super(client, "messages.sendMessageEventAnswer", OkResponse.class);
        accessToken(actor.getAccessToken());
        eventId(eventId);
        userId(userId);
        peerId(peerId);
    }

    /**
     * Set event id
     *
     * @param value value of "event id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendMessageEventAnswerQuery eventId(String value) {
        return unsafeParam("event_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendMessageEventAnswerQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendMessageEventAnswerQuery peerId(int value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set event data
     *
     * @param value value of "event data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendMessageEventAnswerQuery eventData(String value) {
        return unsafeParam("event_data", value);
    }

    @Override
    protected MessagesSendMessageEventAnswerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "event_id", "user_id", "access_token");
    }
}
