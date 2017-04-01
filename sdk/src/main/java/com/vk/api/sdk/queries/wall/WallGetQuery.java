package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.GetResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Wall.get method
 */
public class WallGetQuery extends AbstractQueryBuilder<WallGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WallGetQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WallGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "wall.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * User or community short address.
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQuery domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * Offset needed to return a specific subset of posts.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of posts to return (maximum 100).
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set filter
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallGetQuery filter(WallGetFilter value) {
        return unsafeParam("filter", value);
    }

    @Override
    protected WallGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
