package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.GetRepostsResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Wall.getReposts method
 */
public class WallGetRepostsQuery extends AbstractQueryBuilder<WallGetRepostsQuery, GetRepostsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WallGetRepostsQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.getReposts", GetRepostsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WallGetRepostsQuery(VkApiClient client, ServiceActor actor) {
        super(client, "wall.getReposts", GetRepostsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * User ID or community ID. By default, current user ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetRepostsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Post ID.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetRepostsQuery postId(Integer value) {
        return unsafeParam("post_id", value);
    }

    /**
     * Offset needed to return a specific subset of reposts.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetRepostsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of reposts to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetRepostsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected WallGetRepostsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
