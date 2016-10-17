package com.vk.api.sdk.queries.places;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.places.Types;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Places.getTypes method
 */
public class PlacesGetTypesQuery extends AbstractQueryBuilder<PlacesGetTypesQuery, List<Types>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PlacesGetTypesQuery(VkApiClient client, UserActor actor) {
        super(client, "places.getTypes", Utils.buildParametrizedType(List.class, Types.class));
        accessToken(actor.getAccessToken());
    }

    @Override
    protected PlacesGetTypesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
