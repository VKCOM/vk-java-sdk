package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.LeadsStatus;
import com.vk.api.sdk.objects.leads.Entry;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Leads.getUsers method
 */
public class LeadsGetUsersQuery extends AbstractQueryBuilder<LeadsGetUsersQuery, List<Entry>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param offerId value of "offer id" parameter. Minimum is 0.
     * @param secret value of "secret" parameter.
     */
    public LeadsGetUsersQuery(VkApiClient client, UserActor actor, int offerId, String secret) {
        super(client, "leads.getUsers", Utils.buildParametrizedType(List.class, Entry.class));
        accessToken(actor.getAccessToken());
        offerId(offerId);
        secret(secret);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param offerId value of "offer id" parameter. Minimum is 0.
     * @param secret value of "secret" parameter.
     */
    public LeadsGetUsersQuery(VkApiClient client, ServiceActor actor, int offerId, String secret) {
        super(client, "leads.getUsers", Utils.buildParametrizedType(List.class, Entry.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        offerId(offerId);
        secret(secret);
    }

    /**
     * Offer ID.
     *
     * @param value value of "offer id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsGetUsersQuery offerId(int value) {
        return unsafeParam("offer_id", value);
    }

    /**
     * Secret key obtained in the lead testing interface.
     *
     * @param value value of "secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsGetUsersQuery secret(String value) {
        return unsafeParam("secret", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetUsersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of results to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetUsersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Action type. Possible values: *'0' — start,, *'1' — finish,, *'2' — blocking users,, *'3' — start in a test mode,, *'4' — finish in a test mode.
     *
     * @param value value of "status" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetUsersQuery status(LeadsStatus value) {
        return unsafeParam("status", value);
    }

    /**
     * Sort order. Possible values: *'1' — chronological,, *'0' — reverse chronological.
     *
     * @param value value of "reverse" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsGetUsersQuery reverse(Boolean value) {
        return unsafeParam("reverse", value);
    }

    @Override
    protected LeadsGetUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("secret", "access_token", "offer_id");
    }
}
