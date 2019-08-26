package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.Keyboard;
import com.vk.api.sdk.objects.messages.responses.SendUserIdsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.send method
 */
public class MessagesSendQueryWithUserIds extends AbstractQueryBuilder<MessagesSendQueryWithUserIds, List<SendUserIdsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSendQueryWithUserIds(VkApiClient client, UserActor actor, Integer... userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, SendUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSendQueryWithUserIds(VkApiClient client, UserActor actor,
            List<Integer> userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, SendUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSendQueryWithUserIds(VkApiClient client, GroupActor actor, Integer... userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, SendUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSendQueryWithUserIds(VkApiClient client, GroupActor actor,
            List<Integer> userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, SendUserIdsResponse.class));
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        userIds(userIds);
    }

    /**
     * User ID (by default — current user).
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Unique identifier to avoid resending the message.
     *
     * @param value value of "random id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds randomId(Integer value) {
        return unsafeParam("random_id", value);
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * User's short address (for example, 'illarionov').
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * ID of conversation the message will relate to.
     *
     * @param value value of "chat id" parameter. Maximum is 100000000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds chatId(Integer value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * (Required if 'attachments' is not set.) Text of the message.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Geographical latitude of a check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds lat(Number value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of a check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds lng(Number value) {
        return unsafeParam("long", value);
    }

    /**
     * (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", ' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds attachment(String value) {
        return unsafeParam("attachment", value);
    }

    /**
     * Set reply to
     *
     * @param value value of "reply to" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds replyTo(Integer value) {
        return unsafeParam("reply_to", value);
    }

    /**
     * Set forward
     *
     * @param value value of "forward" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds forward(String value) {
        return unsafeParam("forward", value);
    }

    /**
     * Sticker id.
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }

    /**
     * Group ID (for group messages with group access token)
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set keyboard
     *
     * @param value value of "keyboard" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds keyboard(Keyboard value) {
        return unsafeParam("keyboard", value);
    }

    /**
     * Set payload
     *
     * @param value value of "payload" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds payload(String value) {
        return unsafeParam("payload", value);
    }

    /**
     * Set dont parse links
     *
     * @param value value of "dont parse links" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds dontParseLinks(Boolean value) {
        return unsafeParam("dont_parse_links", value);
    }

    /**
     * Set disable mentions
     *
     * @param value value of "disable mentions" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds disableMentions(Boolean value) {
        return unsafeParam("disable_mentions", value);
    }

    /**
     * user_ids
     * IDs of message recipients (if new conversation shall be started).
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendQueryWithUserIds userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of message recipients (if new conversation shall be started).
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendQueryWithUserIds userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * forward_messages
     * ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's. Example: "123,431,544"
     *
     * @param value value of "forward messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds forwardMessages(Integer... value) {
        return unsafeParam("forward_messages", value);
    }

    /**
     * ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's. Example: "123,431,544"
     *
     * @param value value of "forward messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQueryWithUserIds forwardMessages(List<Integer> value) {
        return unsafeParam("forward_messages", value);
    }

    @Override
    protected MessagesSendQueryWithUserIds getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
