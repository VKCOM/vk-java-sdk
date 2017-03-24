package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.GetByIdExtendedResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.getById method
 */
public class WallGetByIdQueryWithExtended extends AbstractQueryBuilder<WallGetByIdQueryWithExtended, GetByIdExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, UserActor actor, String... posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, UserActor actor, List<String> posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, ServiceActor actor, String... posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param posts  value of "posts" parameter.
     */
    public WallGetByIdQueryWithExtended(VkApiClient client, ServiceActor actor, List<String> posts) {
        super(client, "wall.getById", GetByIdExtendedResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        posts(posts);
        extended(true);
    }

    /**
     * User or community IDs and post IDs, separated by underscores.  Use a negative value to designate a community ID.  Example:
     * 93388_21539,93388_20904,2943_4276,-1_1
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetByIdQueryWithExtended posts(String... value) {
        return unsafeParam("posts", value);
    }

    /**
     * User or community IDs and post IDs, separated by underscores.  Use a negative value to designate a community ID.  Example:
     * 93388_21539,93388_20904,2943_4276,-1_1
     *
     * @param value value of "posts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetByIdQueryWithExtended posts(List<String> value) {
        return unsafeParam("posts", value);
    }

    /**
     * Return user and community objects needed to display posts
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallGetByIdQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Sets the number of parent elements to include in the array "copy_history" that is returned if the post is a repost from another wall.
     *
     * @param value value of "copy history depth" parameter. By default 2.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetByIdQueryWithExtended copyHistoryDepth(Integer value) {
        return unsafeParam("copy_history_depth", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetByIdQueryWithExtended fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetByIdQueryWithExtended fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }


    @Override
    protected WallGetByIdQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("posts");
    }
}
