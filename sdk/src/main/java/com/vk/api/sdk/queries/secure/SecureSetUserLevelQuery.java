package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.setUserLevel method
 */
public class SecureSetUserLevelQuery extends AbstractSecureQueryBuilder<SecureSetUserLevelQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public SecureSetUserLevelQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.setUserLevel", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Set levels
     *
     * @param value value of "levels" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureSetUserLevelQuery levels(String... value) {
        return unsafeParam("levels", value);
    }

    /**
     * Set levels
     *
     * @param value value of "levels" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureSetUserLevelQuery levels(List<String> value) {
        return unsafeParam("levels", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureSetUserLevelQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Level value.
     *
     * @param value value of "level" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureSetUserLevelQuery level(Integer value) {
        return unsafeParam("level", value);
    }

    @Override
    protected SecureSetUserLevelQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "client_secret");
    }
}
