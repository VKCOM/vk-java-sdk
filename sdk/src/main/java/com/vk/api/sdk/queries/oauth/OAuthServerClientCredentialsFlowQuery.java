package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.ClientCredentialsFlowResponse;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by tsivarev on 22.07.16.
 */
public class OAuthServerClientCredentialsFlowQuery extends AbstractQueryBuilder<OAuthServerClientCredentialsFlowQuery, ClientCredentialsFlowResponse> {

    public OAuthServerClientCredentialsFlowQuery(VkApiClient client, String endpoint, Integer clientId, String clientSecret) {
        super(client, endpoint, "access_token", ClientCredentialsFlowResponse.class);
        clientId(clientId);
        clientSecret(clientSecret);
        grantType("client_credentials");
    }

    public OAuthServerClientCredentialsFlowQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    public OAuthServerClientCredentialsFlowQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    OAuthServerClientCredentialsFlowQuery grantType(String value) {
        return unsafeParam("grant_type", value);
    }

    @Override
    protected OAuthServerClientCredentialsFlowQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("client_id", "client_secret");
    }
}
