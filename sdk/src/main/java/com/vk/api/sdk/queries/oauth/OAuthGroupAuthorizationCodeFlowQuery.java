package com.vk.api.sdk.queries.oauth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.GroupAuthResponse;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by tsivarev on 22.07.16.
 */
public class OAuthGroupAuthorizationCodeFlowQuery extends AbstractQueryBuilder<OAuthGroupAuthorizationCodeFlowQuery, GroupAuthResponse> {

    public OAuthGroupAuthorizationCodeFlowQuery(VkApiClient client, String endpoint, Integer clientId, String clientSecret, String redirectUri, String code) {
        super(client, endpoint, "access_token", GroupAuthResponse.class);
        clientId(clientId);
        clientSecret(clientSecret);
        redirectUri(redirectUri);
        code(code);
    }

    public OAuthGroupAuthorizationCodeFlowQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    public OAuthGroupAuthorizationCodeFlowQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    public OAuthGroupAuthorizationCodeFlowQuery redirectUri(String value) {
        return unsafeParam("redirect_uri", value);
    }

    public OAuthGroupAuthorizationCodeFlowQuery code(String value) {
        return unsafeParam("code", value);
    }

    @Override
    protected OAuthGroupAuthorizationCodeFlowQuery getThis() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("client_id", "client_secret", "redirect_uri", "code");
    }
}
