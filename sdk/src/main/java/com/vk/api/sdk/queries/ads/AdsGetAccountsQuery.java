package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetAccountsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getAccounts method
 */
public class AdsGetAccountsQuery extends AbstractQueryBuilder<AdsGetAccountsQuery, List<GetAccountsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdsGetAccountsQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.getAccounts", Utils.buildParametrizedType(List.class, GetAccountsResponse.class));
        accessToken(actor.getAccessToken());
    }

    @Override
    protected AdsGetAccountsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
