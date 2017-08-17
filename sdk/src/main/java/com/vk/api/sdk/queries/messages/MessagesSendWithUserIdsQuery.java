package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.messages.MultiSend;

import java.util.Arrays;
import java.util.List;

/**
 * Query for messages.send method
 */
public class MessagesSendWithUserIdsQuery extends AbstractQueryBuilder<MessagesSendWithUserIdsQuery, List<MultiSend>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesSendWithUserIdsQuery(VkApiClient client, GroupActor actor, List<Integer> userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, MultiSend.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesSendWithUserIdsQuery(VkApiClient client, GroupActor actor, Integer... userIds) {
        super(client, "messages.send", Utils.buildParametrizedType(List.class, MultiSend.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Set random id
     *
     * @param value value of "random id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery randomId(Integer value) {
        return unsafeParam("random_id", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendWithUserIdsQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of message recipients.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSendWithUserIdsQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Text of the message.
     * Required if "attachments" is not set.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Geographical latitude of a check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery lat(Float value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of a check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery lng(Float value) {
        return unsafeParam("long", value);
    }

    /**
     * List of objects attached to the message, separated by commas, in the following format:
     * "type""owner_id"_"media_id"
     * <p>
     * If the attached object belonging to another owner should be added access_key, in the following format:
     * "type""owner_id"_"media_id"_"access_key"
     * <p>
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * "wall" - wall post
     * <p>
     * ""owner_id"" - ID of the media attachment owner.
     * ""media_id"" - media attachment ID.
     * "access_key" - object access key.
     * <p>
     * Example:
     * photo100172_166443618
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery attachment(String... value) {
        return unsafeParam("attachment", value);
    }

    /**
     * Required if "message" is not set.
     * <p>
     * List of objects attached to the message, separated by commas, in the following format:
     * "type""owner_id"_"media_id"
     * <p>
     * If the attached object belonging to another owner should be added access_key, in the following format:
     * "type""owner_id"_"media_id"_"access_key"
     * <p>
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * "wall" - wall post
     * <p>
     * "owner_id" - ID of the media attachment owner.
     * "media_id" - media attachment ID.
     * "access_key" - object access key.
     * <p>
     * Example:
     * photo100172_166443618
     *
     * @param value value of "attachment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery attachment(List<String> value) {
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
    public MessagesSendWithUserIdsQuery forwardMessages(String... value) {
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
    public MessagesSendWithUserIdsQuery forwardMessages(List<String> value) {
        return unsafeParam("forward_messages", value);
    }

    /**
     * Sticker id.
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSendWithUserIdsQuery stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }


    @Override
    protected MessagesSendWithUserIdsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
