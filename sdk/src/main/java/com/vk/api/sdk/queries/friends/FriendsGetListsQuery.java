package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetListsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getLists method
 */
public class FriendsGetListsQuery extends AbstractQueryBuilder<FriendsGetListsQuery, GetListsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetListsQuery(VkApiClient client, UserActor actor) {
        super(client, "friends.getLists", GetListsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetListsQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set return system
     *
     * @param value value of "return system" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetListsQuery returnSystem(Boolean value) {
        return unsafeParam("return_system", value);
    }

    @Override
    protected FriendsGetListsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
