package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.utils.LinkChecked;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.checkLink method
 */
public class UtilsCheckLinkQuery extends AbstractQueryBuilder<UtilsCheckLinkQuery, LinkChecked> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param url    value of "url" parameter.
     */
    public UtilsCheckLinkQuery(VkApiClient client, Actor actor, String url) {
        super(client, "utils.checkLink", LinkChecked.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param url    value of "url" parameter.
     */
    public UtilsCheckLinkQuery(VkApiClient client, String url) {
        super(client, "utils.checkLink", LinkChecked.class);
        url(url);
    }

    /**
     * Link to check (e.g., ''http://google.com'').
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsCheckLinkQuery url(String value) {
        return unsafeParam("url", value);
    }

    @Override
    protected UtilsCheckLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url");
    }
}
