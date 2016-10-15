package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.queries.oauth.OAuthAuthorizationCodeFlowQuery;
import com.vk.api.sdk.queries.oauth.OAuthServerClientCredentialsFlowQuery;

/**
 * Created by Anton Tsivarev on 25.07.16.
 */
public class OAuth extends AbstractAction {

    private static final String OAUTH_ENDPOINT = "https://oauth.vk.com/";

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public OAuth(VkApiClient client) {
        super(client);
    }

    public OAuthAuthorizationCodeFlowQuery authorizationCodeFlow(Integer clientId, String clientSecret, String redirectUri, String code) {
        return new OAuthAuthorizationCodeFlowQuery(getClient(), OAUTH_ENDPOINT, clientId, clientSecret, redirectUri, code);
    }

    public OAuthServerClientCredentialsFlowQuery serverClientCredentialsFlow(Integer clientId, String clientSecret) {
        return new OAuthServerClientCredentialsFlowQuery(getClient(), OAUTH_ENDPOINT, clientId, clientSecret);
    }
}
