package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.AuthResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by tsivarev on 22.07.16.
 */
public class OAuthUserDirectAuthorizationQuery extends OAuthQueryBuilder<OAuthUserDirectAuthorizationQuery, AuthResponse> {

    public OAuthUserDirectAuthorizationQuery(VkApiClient client, String endpoint, Integer clientId, String clientSecret, String username, String password) {
        super(client, endpoint, "token", AuthResponse.class);
        grantType("password");
        clientId(clientId);
        clientSecret(clientSecret);
        username(username);
        password(password);
    }

    public OAuthUserDirectAuthorizationQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    public OAuthUserDirectAuthorizationQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    public OAuthUserDirectAuthorizationQuery username(String value) {
        return unsafeParam("username", value);
    }

    public OAuthUserDirectAuthorizationQuery password(String value) {
        return unsafeParam("password", value);
    }

    public OAuthUserDirectAuthorizationQuery scope(String... value) {
        return unsafeParam("scope", value);
    }

    public OAuthUserDirectAuthorizationQuery scope(OAuthUserScope... value) {
        List<String> scope = new ArrayList<>();
        for (OAuthUserScope scopeValue : value) {
            scope.add(scopeValue.getValue());
        }
        return unsafeParam("scope", scope);
    }


    public OAuthUserDirectAuthorizationQuery scope(Integer value) {
        return unsafeParam("scope", value);
    }


    public OAuthUserDirectAuthorizationQuery lang(String value) {
        return unsafeParam("lang", value);
    }

    OAuthUserDirectAuthorizationQuery grantType(String value) {
        return unsafeParam("grant_type", value);
    }

    @Override
    protected OAuthUserDirectAuthorizationQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("client_id", "client_secret", "username", "password", "grant_type");
    }
}
