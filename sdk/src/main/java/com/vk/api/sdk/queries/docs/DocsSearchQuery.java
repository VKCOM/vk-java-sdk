package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.responses.SearchResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.search method
 */
public class DocsSearchQuery extends AbstractQueryBuilder<DocsSearchQuery, SearchResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param q value of "q" parameter.
     */
    public DocsSearchQuery(VkApiClient client, UserActor actor, String q) {
        super(client, "docs.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        q(q);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param q value of "q" parameter.
     */
    public DocsSearchQuery(VkApiClient client, GroupActor actor, String q) {
        super(client, "docs.search", SearchResponse.class);
        accessToken(actor.getAccessToken());
        q(q);
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DocsSearchQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Set search own
     *
     * @param value value of "search own" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSearchQuery searchOwn(Boolean value) {
        return unsafeParam("search_own", value);
    }

    /**
     * Number of results to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSearchQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSearchQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set return tags
     *
     * @param value value of "return tags" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsSearchQuery returnTags(Boolean value) {
        return unsafeParam("return_tags", value);
    }

    @Override
    protected DocsSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("q", "access_token");
    }
}
