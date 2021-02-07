package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.PinResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.pin method
 */
public class MessagesPinQuery extends AbstractQueryBuilder<MessagesPinQuery, PinResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesPinQuery(VkApiClient client, UserActor actor, int peerId) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesPinQuery(VkApiClient client, GroupActor actor, int peerId) {
        super(client, "messages.pin", PinResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesPinQuery peerId(int value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Message ID
     *
     * @param value value of "message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesPinQuery messageId(Integer value) {
        return unsafeParam("message_id", value);
    }

    /**
     * Conversation message ID
     *
     * @param value value of "conversation message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesPinQuery conversationMessageId(Integer value) {
        return unsafeParam("conversation_message_id", value);
    }

    @Override
    protected MessagesPinQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}
