package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.utils.ShortLink;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.getShortLink method
 */
public class UtilsGetShortLinkQuery extends AbstractQueryBuilder<UtilsGetShortLinkQuery, ShortLink> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param url    value of "url" parameter.
     */
    public UtilsGetShortLinkQuery(VkApiClient client, UserActor actor, String url) {
        super(client, "utils.getShortLink", ShortLink.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param url    value of "url" parameter.
     */
    public UtilsGetShortLinkQuery(VkApiClient client, GroupActor actor, String url) {
        super(client, "utils.getShortLink", ShortLink.class);
        accessToken(actor.getAccessToken());
        url(url);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param url    value of "url" parameter.
     */
    public UtilsGetShortLinkQuery(VkApiClient client, ServiceActor actor, String url) {
        super(client, "utils.getShortLink", ShortLink.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        url(url);
    }

    /**
     * URL to be shortened.
     *
     * @param value value of "url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsGetShortLinkQuery url(String value) {
        return unsafeParam("url", value);
    }

    /**
     * Flag of privacy: 1 — private stats, 0 — public stats.
     *
     * @param value value of "private" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetShortLinkQuery privateFlag(Boolean value) {
        return unsafeParam("private", value);
    }

    @Override
    protected UtilsGetShortLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("url");
    }
}
