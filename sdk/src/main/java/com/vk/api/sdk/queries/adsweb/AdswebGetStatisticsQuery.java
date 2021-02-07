package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetStatisticsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getStatistics method
 */
public class AdswebGetStatisticsQuery extends AbstractQueryBuilder<AdswebGetStatisticsQuery, GetStatisticsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param officeId value of "office id" parameter.
     * @param idsType value of "ids type" parameter.
     * @param ids value of "ids" parameter.
     * @param period value of "period" parameter.
     * @param dateFrom value of "date from" parameter.
     * @param dateTo value of "date to" parameter.
     */
    public AdswebGetStatisticsQuery(VkApiClient client, UserActor actor, int officeId,
            String idsType, String ids, String period, String dateFrom, String dateTo) {
        super(client, "adsweb.getStatistics", GetStatisticsResponse.class);
        accessToken(actor.getAccessToken());
        officeId(officeId);
        idsType(idsType);
        ids(ids);
        period(period);
        dateFrom(dateFrom);
        dateTo(dateTo);
    }

    /**
     * Set office id
     *
     * @param value value of "office id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery officeId(int value) {
        return unsafeParam("office_id", value);
    }

    /**
     * Set ids type
     *
     * @param value value of "ids type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery idsType(String value) {
        return unsafeParam("ids_type", value);
    }

    /**
     * Set ids
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery ids(String value) {
        return unsafeParam("ids", value);
    }

    /**
     * Set period
     *
     * @param value value of "period" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery period(String value) {
        return unsafeParam("period", value);
    }

    /**
     * Set date from
     *
     * @param value value of "date from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery dateFrom(String value) {
        return unsafeParam("date_from", value);
    }

    /**
     * Set date to
     *
     * @param value value of "date to" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetStatisticsQuery dateTo(String value) {
        return unsafeParam("date_to", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetStatisticsQuery fields(String value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set limit
     *
     * @param value value of "limit" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetStatisticsQuery limit(Integer value) {
        return unsafeParam("limit", value);
    }

    /**
     * Set page id
     *
     * @param value value of "page id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdswebGetStatisticsQuery pageId(String value) {
        return unsafeParam("page_id", value);
    }

    @Override
    protected AdswebGetStatisticsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ids_type", "date_from", "office_id", "period", "ids", "access_token", "date_to");
    }
}
