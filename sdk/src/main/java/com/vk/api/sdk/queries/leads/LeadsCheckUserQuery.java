package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leads.Checked;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Leads.checkUser method
 */
public class LeadsCheckUserQuery extends AbstractQueryBuilder<LeadsCheckUserQuery, Checked> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param leadId value of "lead id" parameter. Minimum is 0.
     */
    public LeadsCheckUserQuery(VkApiClient client, UserActor actor, int leadId) {
        super(client, "leads.checkUser", Checked.class);
        accessToken(actor.getAccessToken());
        leadId(leadId);
    }

    /**
     * Lead ID.
     *
     * @param value value of "lead id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsCheckUserQuery leadId(int value) {
        return unsafeParam("lead_id", value);
    }

    /**
     * Value to be return in 'result' field when test mode is used.
     *
     * @param value value of "test result" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCheckUserQuery testResult(Integer value) {
        return unsafeParam("test_result", value);
    }

    /**
     * Set test mode
     *
     * @param value value of "test mode" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCheckUserQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    /**
     * Set auto start
     *
     * @param value value of "auto start" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCheckUserQuery autoStart(Boolean value) {
        return unsafeParam("auto_start", value);
    }

    /**
     * User age.
     *
     * @param value value of "age" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCheckUserQuery age(Integer value) {
        return unsafeParam("age", value);
    }

    /**
     * User country code.
     *
     * @param value value of "country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCheckUserQuery country(String value) {
        return unsafeParam("country", value);
    }

    @Override
    protected LeadsCheckUserQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("lead_id", "access_token");
    }
}
