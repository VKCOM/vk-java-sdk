package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.DemoStats;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getDemographics method
 */
public class AdsGetDemographicsQuery extends AbstractQueryBuilder<AdsGetDemographicsQuery, List<DemoStats>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param accountId value of "account id" parameter.
     * @param idsType   value of "ids type" parameter.
     * @param ids       value of "ids" parameter.
     * @param period    value of "period" parameter.
     * @param dateFrom  value of "date from" parameter.
     * @param dateTo    value of "date to" parameter.
     */
    public AdsGetDemographicsQuery(VkApiClient client, UserActor actor, int accountId, AdsGetDemographicsIdsType idsType, String ids, String period, String dateFrom, String dateTo) {
        super(client, "ads.getDemographics", Utils.buildParametrizedType(List.class, DemoStats.class));
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
    protected AdsGetDemographicsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * Type of requested objects listed in "ids" parameter.
     *
     * @param value value of "ids type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetDemographicsQuery idsType(AdsGetDemographicsIdsType value) {
        return unsafeParam("ids_type", value);
    }

    /**
     * IDs requested ads or campaigns, separated with a comma, depending on the value set in "ids_type". Maximum 2000 objects.
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetDemographicsQuery ids(String value) {
        return unsafeParam("ids", value);
    }

    /**
     * Data grouping by dates:
     * 'day' - statistics by days;
     * 'month' - statistics by months;
     * 'overall' - overall statistics.
     * "date_from" and "date_to" parameters set temporary limits.
     *
     * @param value value of "period" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetDemographicsQuery period(String value) {
        return unsafeParam("period", value);
    }

    /**
     * Date to show statistics from. For different value of "period" different date format is used:
     * 'day': 'YYYY-MM-DD', example: 2011-09-27 - September 27, 2011
     * '0' - day it was created on;
     * 'month': 'YYYY-MM', example: 2011-09 - September 2011
     * '0' - month it was created in;
     * 'overall': 0.
     *
     * @param value value of "date from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetDemographicsQuery dateFrom(String value) {
        return unsafeParam("date_from", value);
    }

    /**
     * Date to show statistics to. For different value of "period" different date format is used:
     * 'day': 'YYYY-MM-DD', example: 2011-09-27 - September 27, 2011
     * '0' - current day;
     * 'month': 'YYYY-MM', example: 2011-09 - September 2011
     * '0' - current month;
     * 'overall': 0.
     *
     * @param value value of "date to" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetDemographicsQuery dateTo(String value) {
        return unsafeParam("date_to", value);
    }

    @Override
    protected AdsGetDemographicsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("ids_type", "date_from", "period", "ids", "account_id", "access_token", "date_to");
    }
}
