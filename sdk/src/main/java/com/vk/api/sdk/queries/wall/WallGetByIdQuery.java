package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.WallPostFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.getById method
 */
public class WallGetByIdQuery extends AbstractQueryBuilder<WallGetByIdQuery, List<WallPostFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQuery(VkApiClient client, UserActor actor, String... posts) {
        super(client, "wall.getById", Utils.buildParametrizedType(List.class, WallPostFull.class));
        accessToken(actor.getAccessToken());
        posts(posts);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQuery(VkApiClient client, UserActor actor, List<String> posts) {
        super(client, "wall.getById", Utils.buildParametrizedType(List.class, WallPostFull.class));
        accessToken(actor.getAccessToken());
        posts(posts);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQuery(VkApiClient client, ServiceActor actor, String... posts) {
        super(client, "wall.getById", Utils.buildParametrizedType(List.class, WallPostFull.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQuery(VkApiClient client, ServiceActor actor, List<String> posts) {
        super(client, "wall.getById", Utils.buildParametrizedType(List.class, WallPostFull.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
    }

    /**
     * User or community IDs and post IDs, separated by underscores.  Use a negative value to designate a community ID.  Example:
     * 93388_21539,93388_20904,2943_4276,-1_1
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetByIdQuery posts(String... value) {
        return unsafeParam("posts", value);
    }

    /**
     * User or community IDs and post IDs, separated by underscores.  Use a negative value to designate a community ID.  Example:
     * 93388_21539,93388_20904,2943_4276,-1_1
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetByIdQuery posts(List<String> value) {
        return unsafeParam("posts", value);
    }

    /**
     * Sets the number of parent elements to include in the array "copy_history" that is returned if the post is a repost from another wall.
     *
     * @param value value of "copy history depth" parameter. By default 2.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetByIdQuery copyHistoryDepth(Integer value) {
        return unsafeParam("copy_history_depth", value);
    }

    @Override
    protected WallGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("posts");
    }
}
