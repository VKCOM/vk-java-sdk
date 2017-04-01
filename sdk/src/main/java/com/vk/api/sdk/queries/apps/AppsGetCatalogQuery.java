package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.apps.responses.GetCatalogResponse;
import com.vk.api.sdk.queries.EnumParam;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.getCatalog method
 */
public class AppsGetCatalogQuery extends AbstractQueryBuilder<AppsGetCatalogQuery, GetCatalogResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param count  value of "count" parameter. Minimum is 0. By default 100.
     */
    public AppsGetCatalogQuery(VkApiClient client, UserActor actor, int count) {
        super(client, "apps.getCatalog", GetCatalogResponse.class);
        accessToken(actor.getAccessToken());
        count(count);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param count  value of "count" parameter. Minimum is 0. By default 100.
     */
    public AppsGetCatalogQuery(VkApiClient client, ServiceActor actor, int count) {
        super(client, "apps.getCatalog", GetCatalogResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        count(count);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery sort(AppsGetCatalogSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset required to return a specific subset of apps.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of apps to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsGetCatalogQuery count(int value) {
        return unsafeParam("count", value);
    }

    /**
     * Set platform
     *
     * @param value value of "platform" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery platform(AppsPlatform value) {
        return unsafeParam("platform", value);
    }

    /**
     * Return additional fields "screenshots", "MAU", "catalog_position", and "international". If set, "count" must be less than or equal to "100".
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set return friends
     *
     * @param value value of "return friends" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery returnFriends(Boolean value) {
        return unsafeParam("return_friends", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set name case
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set genre id
     *
     * @param value value of "genre id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery genreId(Integer value) {
        return unsafeParam("genre_id", value);
    }

    /**
     * Set filter
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetCatalogQuery filter(AppsGetCatalogFilter value) {
        return unsafeParam("filter", value);
    }

    @Override
    protected AppsGetCatalogQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("count");
    }
}
