package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.queries.oauth.OAuthGroupAuthorizationCodeFlowQuery;
import com.vk.api.sdk.queries.oauth.OAuthServiceClientCredentialsFlowQuery;
import com.vk.api.sdk.queries.oauth.OAuthUserAuthorizationCodeFlowQuery;

/**
 * Created by Anton Tsivarev on 25.07.16.
 */
public class OAuth extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public OAuth(VkApiClient client) {
        super(client);
    }

    public OAuthUserAuthorizationCodeFlowQuery userAuthorizationCodeFlow(Integer clientId, String clientSecret, String redirectUri, String code) {
        return new OAuthUserAuthorizationCodeFlowQuery(getClient(), getClient().getOAuthEndpoint(), clientId, clientSecret, redirectUri, code);
    }

    public OAuthGroupAuthorizationCodeFlowQuery groupAuthorizationCodeFlow(Integer clientId, String clientSecret, String redirectUri, String code) {
        return new OAuthGroupAuthorizationCodeFlowQuery(getClient(), getClient().getOAuthEndpoint(), clientId, clientSecret, redirectUri, code);
    }

    public OAuthServiceClientCredentialsFlowQuery serviceClientCredentialsFlow(Integer clientId, String clientSecret) {
        return new OAuthServiceClientCredentialsFlowQuery(getClient(), getClient().getOAuthEndpoint(), clientId, clientSecret);
    }
}
