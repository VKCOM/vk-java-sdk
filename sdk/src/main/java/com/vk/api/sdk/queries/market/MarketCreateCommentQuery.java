package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.createComment method
 */
public class MarketCreateCommentQuery extends AbstractQueryBuilder<MarketCreateCommentQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param itemId  value of "item id" parameter. Minimum is 0.
     */
    public MarketCreateCommentQuery(VkApiClient client, UserActor actor, int ownerId, int itemId) {
        super(client, "market.createComment", Integer.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemId(itemId);
    }

    /**
     * Identifier of an item owner community
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketCreateCommentQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Item id
     *
     * @param value value of "item id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketCreateCommentQuery itemId(int value) {
        return unsafeParam("item_id", value);
    }

    /**
     * Comment text (required if "attachments" parameter is not specified)
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Comma-separated list of objects attached to a comment. The field is submitted the following way:
     * "type""owner_id"_"media_id""
     * <p>
     * ""type"" - media attachment type:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * <p>
     * ""owner_id"" - media owner id
     * ""media_id"" - media attachment id
     * <p>
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * Comma-separated list of objects attached to a comment. The field is submitted the following way:
     * "type""owner_id"_"media_id""
     * <p>
     * ""type"" - media attachment type:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * <p>
     * ""owner_id"" - media owner id
     * ""media_id"" - media attachment id
     * <p>
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    /**
     * true - comment will be published on behalf of a community,
     * false - on behalf of a user (by default)
     *
     * @param value value of "from group" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery fromGroup(Boolean value) {
        return unsafeParam("from_group", value);
    }

    /**
     * Id of a comment to reply with current comment to
     *
     * @param value value of "reply to comment" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery replyToComment(Integer value) {
        return unsafeParam("reply_to_comment", value);
    }

    /**
     * Sticker id
     *
     * @param value value of "sticker id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery stickerId(Integer value) {
        return unsafeParam("sticker_id", value);
    }

    /**
     * Set guid
     *
     * @param value value of "guid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketCreateCommentQuery guid(String value) {
        return unsafeParam("guid", value);
    }

    @Override
    protected MarketCreateCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_id", "owner_id", "access_token");
    }
}
