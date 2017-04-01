package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.utils.responces.GetLastShortenedLinksResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.getLastShortenedLinks method
 */
public class UtilsGetLastShortenedLinksQuery extends AbstractQueryBuilder<UtilsGetLastShortenedLinksQuery, GetLastShortenedLinksResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UtilsGetLastShortenedLinksQuery(VkApiClient client, UserActor actor) {
        super(client, "utils.getLastShortenedLinks", GetLastShortenedLinksResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Number of links to return.
     *
     * @param value value of "count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLastShortenedLinksQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of links.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLastShortenedLinksQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected UtilsGetLastShortenedLinksQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
