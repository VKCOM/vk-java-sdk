package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.edit method
 */
public class MessagesEditQuery extends AbstractQueryBuilder<MessagesEditQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     * @param messageId value of "message id" parameter. Minimum is 0.
     */
    public MessagesEditQuery(VkApiClient client, UserActor actor, int peerId, int messageId) {
        super(client, "messages.edit", BoolInt.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        messageId(messageId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter.
     * @param messageId value of "message id" parameter. Minimum is 0.
     */
    public MessagesEditQuery(VkApiClient client, GroupActor actor, int peerId, int messageId) {
        super(client, "messages.edit", BoolInt.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        peerId(peerId);
        messageId(messageId);
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesEditQuery peerId(int value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * (Required if 'attachments' is not set.) Text of the message.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set message id
     *
     * @param value value of "message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesEditQuery messageId(int value) {
        return unsafeParam("message_id", value);
    }

    /**
     * Geographical latitude of a check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery lat(Number value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of a check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery lng(Number value) {
        return unsafeParam("long", value);
    }

    /**
     * (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery attachment(String value) {
        return unsafeParam("attachment", value);
    }

    /**
     * '1' — to keep forwarded, messages.
     *
     * @param value value of "keep forward messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery keepForwardMessages(Boolean value) {
        return unsafeParam("keep_forward_messages", value);
    }

    /**
     * '1' — to keep attached snippets.
     *
     * @param value value of "keep snippets" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery keepSnippets(Boolean value) {
        return unsafeParam("keep_snippets", value);
    }

    /**
     * Group ID (for group messages with user access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set dont parse links
     *
     * @param value value of "dont parse links" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesEditQuery dontParseLinks(Boolean value) {
        return unsafeParam("dont_parse_links", value);
    }

    @Override
    protected MessagesEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token", "message_id");
    }
}
