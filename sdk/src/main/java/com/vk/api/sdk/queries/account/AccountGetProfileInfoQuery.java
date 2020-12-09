package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.responses.GetProfileInfoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getProfileInfo method
 */
public class AccountGetProfileInfoQuery extends AbstractQueryBuilder<AccountGetProfileInfoQuery, GetProfileInfoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AccountGetProfileInfoQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getProfileInfo", GetProfileInfoResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected AccountGetProfileInfoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
