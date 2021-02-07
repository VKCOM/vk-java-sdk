package com.vk.api.sdk.queries.utils;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.UtilsInterval;
import com.vk.api.sdk.objects.enums.UtilsSource;
import com.vk.api.sdk.objects.utils.responses.GetLinkStatsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Utils.getLinkStats method
 */
public class UtilsGetLinkStatsQuery extends AbstractQueryBuilder<UtilsGetLinkStatsQuery, GetLinkStatsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, UserActor actor, String key) {
        super(client, "utils.getLinkStats", GetLinkStatsResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, GroupActor actor, String key) {
        super(client, "utils.getLinkStats", GetLinkStatsResponse.class);
        accessToken(actor.getAccessToken());
        key(key);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param key value of "key" parameter.
     */
    public UtilsGetLinkStatsQuery(VkApiClient client, ServiceActor actor, String key) {
        super(client, "utils.getLinkStats", GetLinkStatsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        key(key);
    }

    /**
     * Link key (characters after vk.cc/).
     *
     * @param value value of "key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected UtilsGetLinkStatsQuery key(String value) {
        return unsafeParam("key", value);
    }

    /**
     * Source of scope
     *
     * @param value value of "source" parameter. By default vk_cc.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery source(UtilsSource value) {
        return unsafeParam("source", value);
    }

    /**
     * Access key for private link stats.
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    /**
     * Interval.
     *
     * @param value value of "interval" parameter. By default day.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery interval(UtilsInterval value) {
        return unsafeParam("interval", value);
    }

    /**
     * Number of intervals to return.
     *
     * @param value value of "intervals count" parameter. Maximum is 100. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery intervalsCount(Integer value) {
        return unsafeParam("intervals_count", value);
    }

    /**
     * 1 — to return extended stats data (sex, age, geo). 0 — to return views number only.
     *
     * @param value value of "extended" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UtilsGetLinkStatsQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected UtilsGetLinkStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("key", "access_token");
    }
}
