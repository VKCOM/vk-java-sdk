package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.GetCommentsExtendedResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.getComments method
 */
public class WallGetCommentsQueryWithExtended extends AbstractQueryBuilder<WallGetCommentsQueryWithExtended, GetCommentsExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallGetCommentsQueryWithExtended(VkApiClient client, UserActor actor, int postId) {
        super(client, "wall.getComments", GetCommentsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        postId(postId);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallGetCommentsQueryWithExtended(VkApiClient client, ServiceActor actor, int postId) {
        super(client, "wall.getComments", GetCommentsExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        postId(postId);
        extended(true);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Post ID.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetCommentsQueryWithExtended postId(int value) {
        return unsafeParam("post_id", value);
    }

    /**
     * Return the "likes" field
     *
     * @param value value of "need likes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended needLikes(Boolean value) {
        return unsafeParam("need_likes", value);
    }

    /**
     * Set allow group comments
     *
     * @param value value of "allow group comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended allowGroupComments(Boolean value) {
        return unsafeParam("allow_group_comments", value);
    }

    /**
     * Set start comment id
     *
     * @param value value of "start comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended startCommentId(Integer value) {
        return unsafeParam("start_comment_id", value);
    }

    /**
     * Offset needed to return a specific subset of comments.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of comments to return (maximum 100).
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended sort(WallGetCommentsSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Number of characters at which to truncate comments when previewed. By default, "90". Specify "0" if you do not want to truncate comments.
     *
     * @param value value of "preview length" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended previewLength(Integer value) {
        return unsafeParam("preview_length", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetCommentsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentsQueryWithExtended fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected WallGetCommentsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id");
    }
}
