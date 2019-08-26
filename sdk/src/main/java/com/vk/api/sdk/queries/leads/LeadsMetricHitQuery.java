package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leads.responses.MetricHitResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Leads.metricHit method
 */
public class LeadsMetricHitQuery extends AbstractQueryBuilder<LeadsMetricHitQuery, MetricHitResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param data value of "data" parameter.
     */
    public LeadsMetricHitQuery(VkApiClient client, UserActor actor, String data) {
        super(client, "leads.metricHit", MetricHitResponse.class);
        accessToken(actor.getAccessToken());
        data(data);
    }

    /**
     * Metric data obtained in the lead interface.
     *
     * @param value value of "data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsMetricHitQuery data(String value) {
        return unsafeParam("data", value);
    }

    @Override
    protected LeadsMetricHitQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("data", "access_token");
    }
}
