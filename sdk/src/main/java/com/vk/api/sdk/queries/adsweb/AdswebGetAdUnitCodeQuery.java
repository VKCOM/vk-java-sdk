package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetAdUnitCodeResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getAdUnitCode method
 */
public class AdswebGetAdUnitCodeQuery extends AbstractQueryBuilder<AdswebGetAdUnitCodeQuery, GetAdUnitCodeResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AdswebGetAdUnitCodeQuery(VkApiClient client, UserActor actor) {
        super(client, "adsweb.getAdUnitCode", GetAdUnitCodeResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected AdswebGetAdUnitCodeQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
