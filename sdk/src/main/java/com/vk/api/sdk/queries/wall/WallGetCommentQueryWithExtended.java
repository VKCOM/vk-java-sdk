package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.wall.responses.GetCommentExtendedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.getComment method
 */
public class WallGetCommentQueryWithExtended extends AbstractQueryBuilder<WallGetCommentQueryWithExtended, GetCommentExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param commentId value of "comment id" parameter. Minimum is 0.
     */
    public WallGetCommentQueryWithExtended(VkApiClient client, UserActor actor, int commentId) {
        super(client, "wall.getComment", GetCommentExtendedResponse.class);
        accessToken(actor.getAccessToken());
        commentId(commentId);
        extended(true);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentQueryWithExtended ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Comment ID.
     *
     * @param value value of "comment id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetCommentQueryWithExtended commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetCommentQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentQueryWithExtended fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetCommentQueryWithExtended fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected WallGetCommentQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("comment_id", "access_token");
    }
}
