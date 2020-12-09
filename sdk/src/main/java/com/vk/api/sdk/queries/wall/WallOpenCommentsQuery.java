package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.openComments method
 */
public class WallOpenCommentsQuery extends AbstractQueryBuilder<WallOpenCommentsQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallOpenCommentsQuery(VkApiClient client, UserActor actor, int ownerId, int postId) {
        super(client, "wall.openComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postId(postId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallOpenCommentsQuery(VkApiClient client, GroupActor actor, int ownerId, int postId) {
        super(client, "wall.openComments", BoolResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        postId(postId);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallOpenCommentsQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set post id
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallOpenCommentsQuery postId(int value) {
        return unsafeParam("post_id", value);
    }

    @Override
    protected WallOpenCommentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "owner_id", "access_token");
    }
}
