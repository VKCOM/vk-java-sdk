package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetCategoriesResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getCategories method
 */
public class AdsGetCategoriesQuery extends AbstractQueryBuilder<AdsGetCategoriesQuery, GetCategoriesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AdsGetCategoriesQuery(VkApiClient client, UserActor actor) {
        super(client, "ads.getCategories", GetCategoriesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Language. The full list of supported languages is here.
     *
     * @param value value of "lang" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetCategoriesQuery lang(String value) {
        return unsafeParam("lang", value);
    }

    @Override
    protected AdsGetCategoriesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
