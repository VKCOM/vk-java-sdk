package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
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
     * @param actor  actor with access token
     * @param q      value of "q" parameter.
     */
    public DocsSearchQuery(VkApiClient client, UserActor actor, String q) {
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
     * Number of results to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
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

    @Override
    protected DocsSearchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("q", "access_token");
    }
}
