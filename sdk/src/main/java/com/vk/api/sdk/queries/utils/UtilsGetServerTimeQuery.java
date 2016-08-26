package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;

import java.util.Collections;
import java.util.List;

/**
 * Query for Utils.getServerTime method
 */
public class UtilsGetServerTimeQuery extends AbstractQueryBuilder<UtilsGetServerTimeQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UtilsGetServerTimeQuery(VkApiClient client, Actor actor) {
        super(client, "utils.getServerTime", Integer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UtilsGetServerTimeQuery(VkApiClient client) {
        super(client, "utils.getServerTime", Integer.class);
    }

    @Override
    protected UtilsGetServerTimeQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
