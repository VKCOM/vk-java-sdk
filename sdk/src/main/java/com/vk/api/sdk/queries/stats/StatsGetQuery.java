package com.vk.api.sdk.queries.stats;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.stats.Period;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stats.get method
 */
public class StatsGetQuery extends AbstractQueryBuilder<StatsGetQuery, List<Period>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public StatsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "stats.get", Utils.buildParametrizedType(List.class, Period.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatsGetQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Application ID.
     *
     * @param value value of "app id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatsGetQuery appId(Integer value) {
        return unsafeParam("app_id", value);
    }

    /**
     * Latest datestamp (in Unix time) of statistics to return.
     *
     * @param value value of "date from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatsGetQuery dateFrom(String value) {
        return unsafeParam("date_from", value);
    }

    /**
     * End datestamp (in Unix time) of statistics to return.
     *
     * @param value value of "date to" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatsGetQuery dateTo(String value) {
        return unsafeParam("date_to", value);
    }

    @Override
    protected StatsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
