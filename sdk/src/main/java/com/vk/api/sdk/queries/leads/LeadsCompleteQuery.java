package com.vk.api.sdk.queries.leads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leads.Complete;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Leads.complete method
 */
public class LeadsCompleteQuery extends AbstractQueryBuilder<LeadsCompleteQuery, Complete> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param vkSid value of "vk sid" parameter.
     * @param secret value of "secret" parameter.
     */
    public LeadsCompleteQuery(VkApiClient client, UserActor actor, String vkSid, String secret) {
        super(client, "leads.complete", Complete.class);
        accessToken(actor.getAccessToken());
        vkSid(vkSid);
        secret(secret);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param vkSid value of "vk sid" parameter.
     * @param secret value of "secret" parameter.
     */
    public LeadsCompleteQuery(VkApiClient client, ServiceActor actor, String vkSid, String secret) {
        super(client, "leads.complete", Complete.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        vkSid(vkSid);
        secret(secret);
    }

    /**
     * Session obtained as GET parameter when session started.
     *
     * @param value value of "vk sid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsCompleteQuery vkSid(String value) {
        return unsafeParam("vk_sid", value);
    }

    /**
     * Secret key from the lead testing interface.
     *
     * @param value value of "secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadsCompleteQuery secret(String value) {
        return unsafeParam("secret", value);
    }

    /**
     * Comment text.
     *
     * @param value value of "comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadsCompleteQuery comment(String value) {
        return unsafeParam("comment", value);
    }

    @Override
    protected LeadsCompleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("vk_sid", "secret", "access_token");
    }
}
