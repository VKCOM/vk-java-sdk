package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.utils.LinkStats;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.getLinkStats method
 */
public class UtilsGetLinkStatsQuery extends AbstractQueryBuilder<UtilsGetLinkStatsQuery, LinkStats> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param key    value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, UserActor actor, String key) {
        super(client, "utils.getShortLink", LinkStats.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param key    value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, GroupActor actor, String key) {
        super(client, "utils.getShortLink", LinkStats.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param key    value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, ServiceActor actor, String key) {
        super(client, "utils.getShortLink", LinkStats.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        key(key);
    }

    /**
     * Part of the link after "vk.cc/".
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsGetLinkStatsQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Access key for private link stats.
     *
     * @param value value of "access_key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    /**
     * Interval. Possible values: hour, day, week, month, forever.
     *
     * @param value value of "interval" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery interval(UtilsLinkStatsInterval value) {
        return unsafeParam("interval", value);
    }

    /**
     * Number of intervals to return.
     *
     * @param value value of "intervals_count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery intervalsCount(Integer value) {
        return unsafeParam("intervals_count", value);
    }

    @Override
    protected UtilsGetLinkStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("key");
    }
}
