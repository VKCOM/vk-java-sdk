package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetHistoryAttachmentsResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getHistoryAttachments method
 */
public class MessagesGetHistoryAttachmentsQuery extends AbstractQueryBuilder<MessagesGetHistoryAttachmentsQuery, GetHistoryAttachmentsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesGetHistoryAttachmentsQuery(VkApiClient client, UserActor actor, int peerId) {
        super(client, "messages.getHistoryAttachments", GetHistoryAttachmentsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param peerId value of "peer id" parameter.
     */
    public MessagesGetHistoryAttachmentsQuery(VkApiClient client, GroupActor actor, int peerId) {
        super(client, "messages.getHistoryAttachments", GetHistoryAttachmentsResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Peer ID.
     * <p>
     * <p>
     * For group chat:
     * "2000000000 + chat ID"
     * <p>
     * For community:
     * "-community ID"
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetHistoryAttachmentsQuery peerId(int value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Type of media files to return
     *
     * @param value value of "media type" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery mediaType(MessagesGetHistoryAttachmentsType value) {
        return unsafeParam("media_type", value);
    }

    /**
     * Set start from
     *
     * @param value value of "start from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery startFrom(String value) {
        return unsafeParam("start_from", value);
    }

    /**
     * Number of objects to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 30.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Return photo sizes in a special format
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetHistoryAttachmentsQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected MessagesGetHistoryAttachmentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}
