package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetPostsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getPosts method
 */
public class FaveGetPostsQuery extends AbstractQueryBuilder<FaveGetPostsQuery, GetPostsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetPostsQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getPosts", GetPostsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of posts.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPostsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of posts to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPostsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * '1' — to return additional 'wall', 'profiles', and 'groups' fields. By default: '0'.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPostsQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected FaveGetPostsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
