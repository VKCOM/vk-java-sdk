package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.secure.TokenChecked;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.checkToken method
 */
public class SecureCheckTokenQuery extends AbstractSecureQueryBuilder<SecureCheckTokenQuery, TokenChecked> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public SecureCheckTokenQuery(VkApiClient client, ServiceActor actor) {
        super(client, "secure.checkToken", TokenChecked.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Client "access_token"
     *
     * @param value value of "token" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureCheckTokenQuery token(String value) {
        return unsafeParam("token", value);
    }

    /**
     * User "ip address". Note that user may access using the "ipv6" address, in this case it is required to transmit the "ipv6" address.
     * If not transmitted, the address will not be checked.
     *
     * @param value value of "ip" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureCheckTokenQuery ip(String value) {
        return unsafeParam("ip", value);
    }

    @Override
    protected SecureCheckTokenQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "client_secret");
    }
}
