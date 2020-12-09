package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.adsweb.AdswebGetAdCategoriesQuery;
import com.vk.api.sdk.queries.adsweb.AdswebGetAdUnitCodeQuery;
import com.vk.api.sdk.queries.adsweb.AdswebGetAdUnitsQuery;
import com.vk.api.sdk.queries.adsweb.AdswebGetFraudHistoryQuery;
import com.vk.api.sdk.queries.adsweb.AdswebGetSitesQuery;
import com.vk.api.sdk.queries.adsweb.AdswebGetStatisticsQuery;

/**
 * List of Adsweb methods
 */
public class Adsweb extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Adsweb(VkApiClient client) {
        super(client);
    }

    /**
     * @param actor vk actor
     * @param officeId
     * @return query
     */
    public AdswebGetAdCategoriesQuery getAdCategories(UserActor actor, int officeId) {
        return new AdswebGetAdCategoriesQuery(getClient(), actor, officeId);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public AdswebGetAdUnitCodeQuery getAdUnitCode(UserActor actor) {
        return new AdswebGetAdUnitCodeQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param officeId
     * @return query
     */
    public AdswebGetAdUnitsQuery getAdUnits(UserActor actor, int officeId) {
        return new AdswebGetAdUnitsQuery(getClient(), actor, officeId);
    }

    /**
     * @param actor vk actor
     * @param officeId
     * @return query
     */
    public AdswebGetFraudHistoryQuery getFraudHistory(UserActor actor, int officeId) {
        return new AdswebGetFraudHistoryQuery(getClient(), actor, officeId);
    }

    /**
     * @param actor vk actor
     * @param officeId
     * @return query
     */
    public AdswebGetSitesQuery getSites(UserActor actor, int officeId) {
        return new AdswebGetSitesQuery(getClient(), actor, officeId);
    }

    /**
     * @param actor vk actor
     * @param officeId
     * @param idsType
     * @param ids
     * @param period
     * @param dateFrom
     * @param dateTo
     * @return query
     */
    public AdswebGetStatisticsQuery getStatistics(UserActor actor, int officeId, String idsType,
            String ids, String period, String dateFrom, String dateTo) {
        return new AdswebGetStatisticsQuery(getClient(), actor, officeId, idsType, ids, period, dateFrom, dateTo);
    }
}
