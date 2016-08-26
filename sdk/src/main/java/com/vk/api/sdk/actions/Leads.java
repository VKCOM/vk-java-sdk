package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.leads.LeadsCheckUserQuery;
import com.vk.api.sdk.queries.leads.LeadsCompleteQuery;
import com.vk.api.sdk.queries.leads.LeadsGetStatsQuery;
import com.vk.api.sdk.queries.leads.LeadsGetUsersQuery;
import com.vk.api.sdk.queries.leads.LeadsMetricHitQuery;
import com.vk.api.sdk.queries.leads.LeadsStartQuery;

/**
 * List of Leads methods
 */
public class Leads extends AbstractAction {
    public Leads(VkApiClient client) {
        super(client);
    }

    /**
     * Completes the lead started by user.
     */
    public LeadsCompleteQuery complete(String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), vkSid, secret);
    }

    /**
     * Completes the lead started by user.
     */
    public LeadsCompleteQuery complete(Actor actor, String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), actor, vkSid, secret);
    }

    /**
     * Creates new session for the user passing the offer.
     */
    public LeadsStartQuery start(int leadId, String secret) {
        return new LeadsStartQuery(getClient(), leadId, secret);
    }

    /**
     * Creates new session for the user passing the offer.
     */
    public LeadsStartQuery start(Actor actor, int leadId, String secret) {
        return new LeadsStartQuery(getClient(), actor, leadId, secret);
    }

    /**
     * Returns lead stats data.
     */
    public LeadsGetStatsQuery getStats(Actor actor, int leadId) {
        return new LeadsGetStatsQuery(getClient(), actor, leadId);
    }

    /**
     * Returns a list of last user actions for the offer.
     */
    public LeadsGetUsersQuery getUsers(int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), offerId, secret);
    }

    /**
     * Returns a list of last user actions for the offer.
     */
    public LeadsGetUsersQuery getUsers(Actor actor, int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), actor, offerId, secret);
    }

    public LeadsCheckUserQuery checkUser(Actor actor, int leadId) {
        return new LeadsCheckUserQuery(getClient(), actor, leadId);
    }

    public LeadsMetricHitQuery metricHit(String data) {
        return new LeadsMetricHitQuery(getClient(), data);
    }

    public LeadsMetricHitQuery metricHit(Actor actor, String data) {
        return new LeadsMetricHitQuery(getClient(), actor, data);
    }
}
