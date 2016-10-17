package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.ServiceClientCredentialsFlowResponse;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by tsivarev on 22.07.16.
 */
public class OAuthServiceClientCredentialsFlowQuery extends AbstractQueryBuilder<OAuthServiceClientCredentialsFlowQuery, ServiceClientCredentialsFlowResponse> {

    public OAuthServiceClientCredentialsFlowQuery(VkApiClient client, String endpoint, Integer clientId, String clientSecret) {
        super(client, endpoint, "access_token", ServiceClientCredentialsFlowResponse.class);
        clientId(clientId);
        clientSecret(clientSecret);
        grantType("client_credentials");
    }

    public OAuthServiceClientCredentialsFlowQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    public OAuthServiceClientCredentialsFlowQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    OAuthServiceClientCredentialsFlowQuery grantType(String value) {
        return unsafeParam("grant_type", value);
    }

    @Override
    protected OAuthServiceClientCredentialsFlowQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("client_id", "client_secret");
    }
}
