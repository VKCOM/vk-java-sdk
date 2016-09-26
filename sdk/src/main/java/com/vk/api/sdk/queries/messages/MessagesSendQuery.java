package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.send method
 */
public class MessagesSendQuery extends AbstractQueryBuilder<MessagesSendQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesSendQuery(VkApiClient client, Actor actor) {
        super(client, "messages.send", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID (by default - current user).
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set random id
     *
     * @param value value of "random id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery randomId(Integer value) {
        return unsafeParam("random_id", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * User's short address (for example, "illarionov").
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * ID of conversation the message will relate to.
     *
     * @param value value of "chat id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery chatId(Integer value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * IDs of message recipients (if new conversation shall be started).
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of message recipients (if new conversation shall be started).
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Text of the message.
     * Required if "attachments" is not set.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Geographical latitude of a check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery lat(Float value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of a check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery lng(Float value) {
        return unsafeParam("long", value);
    }

    /**
     * (Required if "message" is not set.) List of objects attached to the message, separated by commas, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * "wall" - wall post
     * ""owner_id"" - ID of the media attachment owner.
     * ""media_id"" - media attachment ID.
     * <p>
     * Example:
     * photo100172_166443618
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery attachment(String... value) {
        return unsafeParam("attachment", value);
    }

    /**
     * (Required if "message" is not set.) List of objects attached to the message, separated by commas, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * "wall" - wall post
     * ""owner_id"" - ID of the media attachment owner.
     * ""media_id"" - media attachment ID.
     * <p>
     * Example:
     * photo100172_166443618
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery attachment(List<String> value) {
        return unsafeParam("attachment", value);
    }

    /**
     * ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's.
     * <p>
     * Example:
     * 123,431,544
     *
     * @param value value of "forward messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery forwardMessages(String... value) {
        return unsafeParam("forward_messages", value);
    }

    /**
     * ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's.
     * <p>
     * Example:
     * 123,431,544
     *
     * @param value value of "forward messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery forwardMessages(List<String> value) {
        return unsafeParam("forward_messages", value);
    }

    /**
     * Sticker id.
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }

    /**
     * Set notification
     *
     * @param value value of "notification" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendQuery notification(Boolean value) {
        return unsafeParam("notification", value);
    }

    @Override
    protected MessagesSendQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
