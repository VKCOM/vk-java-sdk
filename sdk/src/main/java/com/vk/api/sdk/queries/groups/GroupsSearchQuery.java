package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.SearchResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.search method
 */
public class GroupsSearchQuery extends AbstractQueryBuilder<GroupsSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param q      value of "q" parameter.
     */
    public GroupsSearchQuery(VkApiClient client, UserActor actor, String q) {
        super(client, "groups.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        q(q);
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Community type. Possible values: "group, page, event."
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * Country ID.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery countryId(Integer value) {
        return unsafeParam("country_id", value);
    }

    /**
     * City ID. If this parameter is transmitted, country_id is ignored.
     *
     * @param value value of "city id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery cityId(Integer value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Only upcoming events will be returned.
     * Works with the "event" type only.
     *
     * @param value value of "future" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery future(Boolean value) {
        return unsafeParam("future", value);
    }

    /**
     * Set market
     *
     * @param value value of "market" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery market(Boolean value) {
        return unsafeParam("market", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery sort(GroupsSearchSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * Offset needed to return a specific subset of search results.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of communities to return.
     * Note that you can not receive more than first thousand of results, regardless of "count" and "offset" values.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected GroupsSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("q", "access_token");
    }
}
