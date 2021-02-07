package com.vk.api.sdk.queries.adsweb;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.adsweb.responses.GetAdCategoriesResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Adsweb.getAdCategories method
 */
public class AdswebGetAdCategoriesQuery extends AbstractQueryBuilder<AdswebGetAdCategoriesQuery, GetAdCategoriesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param officeId value of "office id" parameter.
     */
    public AdswebGetAdCategoriesQuery(VkApiClient client, UserActor actor, int officeId) {
        super(client, "adsweb.getAdCategories", GetAdCategoriesResponse.class);
        accessToken(actor.getAccessToken());
        officeId(officeId);
    }

    /**
     * Set office id
     *
     * @param value value of "office id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdswebGetAdCategoriesQuery officeId(int value) {
        return unsafeParam("office_id", value);
    }

    @Override
    protected AdswebGetAdCategoriesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("office_id", "access_token");
    }
}
