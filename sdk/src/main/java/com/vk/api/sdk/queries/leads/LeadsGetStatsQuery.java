package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leads.Lead;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Leads.getStats method
 */
public class LeadsGetStatsQuery extends AbstractQueryBuilder<LeadsGetStatsQuery, Lead> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param leadId value of "lead id" parameter. Minimum is 0.
     */
    public LeadsGetStatsQuery(VkApiClient client, UserActor actor, int leadId) {
        super(client, "leads.getStats", Lead.class);
        accessToken(actor.getAccessToken());
        leadId(leadId);
    }

    /**
     * Lead ID.
     *
     * @param value value of "lead id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsGetStatsQuery leadId(int value) {
        return unsafeParam("lead_id", value);
    }

    /**
     * Secret key obtained from the lead testing interface.
     *
     * @param value value of "secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetStatsQuery secret(String value) {
        return unsafeParam("secret", value);
    }

    /**
     * Day to start stats from (YYYY_MM_DD, e.g.2011-09-17).
     *
     * @param value value of "date start" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetStatsQuery dateStart(String value) {
        return unsafeParam("date_start", value);
    }

    /**
     * Day to finish stats (YYYY_MM_DD, e.g.2011-09-17).
     *
     * @param value value of "date end" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetStatsQuery dateEnd(String value) {
        return unsafeParam("date_end", value);
    }

    @Override
    protected LeadsGetStatsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("lead_id", "access_token");
    }
}
