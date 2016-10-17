package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetLinksResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getLinks method
 */
public class FaveGetLinksQuery extends AbstractQueryBuilder<FaveGetLinksQuery, GetLinksResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FaveGetLinksQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getLinks", GetLinksResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetLinksQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetLinksQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected FaveGetLinksQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
