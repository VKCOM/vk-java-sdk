package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
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

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Leads(VkApiClient client) {
        super(client);
    }

    /**
     * Completes the lead started by user.
     */
    public LeadsCompleteQuery complete(ServiceActor actor, String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), actor, vkSid, secret);
    }

    /**
     * Completes the lead started by user.
     */
    public LeadsCompleteQuery complete(UserActor actor, String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), actor, vkSid, secret);
    }

    /**
     * Creates new session for the user passing the offer.
     */
    public LeadsStartQuery start(ServiceActor actor, int leadId, String secret) {
        return new LeadsStartQuery(getClient(), actor, leadId, secret);
    }

    /**
     * Creates new session for the user passing the offer.
     */
    public LeadsStartQuery start(UserActor actor, int leadId, String secret) {
        return new LeadsStartQuery(getClient(), actor, leadId, secret);
    }

    /**
     * Returns lead stats data.
     */
    public LeadsGetStatsQuery getStats(UserActor actor, int leadId) {
        return new LeadsGetStatsQuery(getClient(), actor, leadId);
    }

    /**
     * Returns a list of last user actions for the offer.
     */
    public LeadsGetUsersQuery getUsers(ServiceActor actor, int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), actor, offerId, secret);
    }

    /**
     * Returns a list of last user actions for the offer.
     */
    public LeadsGetUsersQuery getUsers(UserActor actor, int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), actor, offerId, secret);
    }

    public LeadsCheckUserQuery checkUser(UserActor actor, int leadId) {
        return new LeadsCheckUserQuery(getClient(), actor, leadId);
    }

    public LeadsMetricHitQuery metricHit(ServiceActor actor, String data) {
        return new LeadsMetricHitQuery(getClient(), actor, data);
    }

    public LeadsMetricHitQuery metricHit(UserActor actor, String data) {
        return new LeadsMetricHitQuery(getClient(), actor, data);
    }
}
