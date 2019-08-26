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
     * Checks if the user can start the lead.
     *
     * @param actor vk actor
     * @param leadId Lead ID.
     * @return query
     */
    public LeadsCheckUserQuery checkUser(UserActor actor, int leadId) {
        return new LeadsCheckUserQuery(getClient(), actor, leadId);
    }

    /**
     * Completes the lead started by user.
     *
     * @param actor vk actor
     * @param vkSid Session obtained as GET parameter when session started.
     * @param secret Secret key from the lead testing interface.
     * @return query
     */
    public LeadsCompleteQuery complete(UserActor actor, String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), actor, vkSid, secret);
    }

    /**
     * Completes the lead started by user.
     *
     * @param actor vk actor
     * @param vkSid Session obtained as GET parameter when session started.
     * @param secret Secret key from the lead testing interface.
     * @return query
     */
    public LeadsCompleteQuery complete(ServiceActor actor, String vkSid, String secret) {
        return new LeadsCompleteQuery(getClient(), actor, vkSid, secret);
    }

    /**
     * Returns lead stats data.
     *
     * @param actor vk actor
     * @param leadId Lead ID.
     * @return query
     */
    public LeadsGetStatsQuery getStats(UserActor actor, int leadId) {
        return new LeadsGetStatsQuery(getClient(), actor, leadId);
    }

    /**
     * Returns a list of last user actions for the offer.
     *
     * @param actor vk actor
     * @param offerId Offer ID.
     * @param secret Secret key obtained in the lead testing interface.
     * @return query
     */
    public LeadsGetUsersQuery getUsers(UserActor actor, int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), actor, offerId, secret);
    }

    /**
     * Returns a list of last user actions for the offer.
     *
     * @param actor vk actor
     * @param offerId Offer ID.
     * @param secret Secret key obtained in the lead testing interface.
     * @return query
     */
    public LeadsGetUsersQuery getUsers(ServiceActor actor, int offerId, String secret) {
        return new LeadsGetUsersQuery(getClient(), actor, offerId, secret);
    }

    /**
     * Counts the metric event.
     *
     * @param actor vk actor
     * @param data Metric data obtained in the lead interface.
     * @return query
     */
    public LeadsMetricHitQuery metricHit(UserActor actor, String data) {
        return new LeadsMetricHitQuery(getClient(), actor, data);
    }

    /**
     * Creates new session for the user passing the offer.
     *
     * @param actor vk actor
     * @param leadId Lead ID.
     * @param secret Secret key from the lead testing interface.
     * @return query
     */
    public LeadsStartQuery start(UserActor actor, int leadId, String secret) {
        return new LeadsStartQuery(getClient(), actor, leadId, secret);
    }

    /**
     * Creates new session for the user passing the offer.
     *
     * @param actor vk actor
     * @param leadId Lead ID.
     * @param secret Secret key from the lead testing interface.
     * @return query
     */
    public LeadsStartQuery start(ServiceActor actor, int leadId, String secret) {
        return new LeadsStartQuery(getClient(), actor, leadId, secret);
    }
}
