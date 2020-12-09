package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetStatisticsResponse;
import com.vk.api.sdk.objects.enums.AdsIdsType;
import com.vk.api.sdk.objects.enums.AdsPeriod;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getStatistics method
 */
public class AdsGetStatisticsQuery extends AbstractQueryBuilder<AdsGetStatisticsQuery, List<GetStatisticsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accountId value of "account id" parameter.
     * @param idsType value of "ids type" parameter.
     * @param ids value of "ids" parameter.
     * @param period value of "period" parameter.
     * @param dateFrom value of "date from" parameter.
     * @param dateTo value of "date to" parameter.
     */
    public AdsGetStatisticsQuery(VkApiClient client, UserActor actor, int accountId,
            AdsIdsType idsType, String ids, AdsPeriod period, String dateFrom, String dateTo) {
        super(client, "ads.getStatistics", Utils.buildParametrizedType(List.class, GetStatisticsResponse.class));
        accessToken(actor.getAccessToken());
        accountId(accountId);
        idsType(idsType);
        ids(ids);
        period(period);
        dateFrom(dateFrom);
        dateTo(dateTo);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns,, *client — clients,, *office — account.
     *
     * @param value value of "ids type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery idsType(AdsIdsType value) {
        return unsafeParam("ids_type", value);
    }

    /**
     * IDs requested ads, campaigns, clients or account, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery ids(String value) {
        return unsafeParam("ids", value);
    }

    /**
     * Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
     *
     * @param value value of "period" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery period(AdsPeriod value) {
        return unsafeParam("period", value);
    }

    /**
     * Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
     *
     * @param value value of "date from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery dateFrom(String value) {
        return unsafeParam("date_from", value);
    }

    /**
     * Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
     *
     * @param value value of "date to" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetStatisticsQuery dateTo(String value) {
        return unsafeParam("date_to", value);
    }

    /**
     * stats_fields
     * Additional fields to add to statistics
     *
     * @param value value of "stats fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetStatisticsQuery statsFields(String... value) {
        return unsafeParam("stats_fields", value);
    }

    /**
     * Additional fields to add to statistics
     *
     * @param value value of "stats fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetStatisticsQuery statsFields(List<String> value) {
        return unsafeParam("stats_fields", value);
    }

    @Override
    protected AdsGetStatisticsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ids_type", "date_from", "period", "ids", "account_id", "access_token", "date_to");
    }
}
