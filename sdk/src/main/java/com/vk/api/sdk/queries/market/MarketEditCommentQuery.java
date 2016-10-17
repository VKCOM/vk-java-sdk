package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.editComment method
 */
public class MarketEditCommentQuery extends AbstractQueryBuilder<MarketEditCommentQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param ownerId   value of "owner id" parameter.
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public MarketEditCommentQuery(VkApiClient client, UserActor actor, int ownerId, int commentId) {
        super(client, "market.editComment", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        commentId(commentId);
    }

    /**
     * Identifier of an item owner community
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditCommentQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Comment id
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * New comment text (required if "attachments" are not specified)
     * <p>
     * 2048 symbols max
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditCommentQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Comma-separated list of objects attached to a comment. The field is submitted the following way:
     * "type""owner_id"_"media_id"
     *
     * "type" - media attachment type:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     *
     * "owner_id" - media owner id
     * "media_id" - media attachment id
     *
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditCommentQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * Comma-separated list of objects attached to a comment. The field is submitted the following way:
     * "type""owner_id"_"media_id"
     *
     * ""type"" - media attachment type:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     *
     * "owner_id" - media owner id
     * "media_id" - media attachment id
     *
     * For example:
     * photo100172_166443618,photo66748_265827614
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditCommentQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    @Override
    protected MarketEditCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "comment_id", "access_token");
    }
}
