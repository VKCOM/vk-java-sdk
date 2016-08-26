package com.vk.api.sdk.queries.search;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.search.Hint;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Search.getHints method
 */
public class SearchGetHintsQuery extends AbstractQueryBuilder<SearchGetHintsQuery, List<Hint>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public SearchGetHintsQuery(VkApiClient client, Actor actor) {
        super(client, "search.getHints", Utils.buildParametrizedType(List.class, Hint.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Search query string.
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SearchGetHintsQuery q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Maximum number of results to return.
     *
     * @param value value of "limit" parameter. Maximum is 200. Minimum is 0. By default 9.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SearchGetHintsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SearchGetHintsQuery filters(String... value) {
        return unsafeParam("filters", value);
    }

    /**
     * :
     * The default search results are added to the results of a global search for all users and groups, it can be disabled by passing 0 --&gt;
     *
     * @param value value of "search global" parameter. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SearchGetHintsQuery searchGlobal(Boolean value) {
        return unsafeParam("search_global", value);
    }

    @Override
    protected SearchGetHintsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
