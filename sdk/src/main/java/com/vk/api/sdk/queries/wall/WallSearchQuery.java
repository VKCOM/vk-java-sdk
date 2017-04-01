package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.SearchResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Collections;
import java.util.List;

/**
 * Query for Wall.search method
 */
public class WallSearchQuery extends AbstractQueryBuilder<WallSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public WallSearchQuery(VkApiClient client, UserActor actor) {
        super(client, "wall.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public WallSearchQuery(VkApiClient client, ServiceActor actor) {
        super(client, "wall.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * User or community id.
     * Remember that for a community "owner_id" must be negative.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * User or community screen name.
     *
     * @param value value of "domain" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery domain(String value) {
        return unsafeParam("domain", value);
    }

    /**
     * Search query string.
     *
     * @param value value of "query" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery query(String value) {
        return unsafeParam("query", value);
    }

    /**
     * Returns only page owner's posts.
     *
     * @param value value of "owners only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery ownersOnly(Boolean value) {
        return unsafeParam("owners_only", value);
    }

    /**
     * Count of posts to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Results offset.
     *
     * @param value value of "offset" parameter. Default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Show extended post info.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallSearchQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected WallSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
