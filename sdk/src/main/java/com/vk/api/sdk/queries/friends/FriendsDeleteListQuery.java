package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.deleteList method
 */
public class FriendsDeleteListQuery extends AbstractQueryBuilder<FriendsDeleteListQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param listId value of "list id" parameter. Minimum is 0.
     */
    public FriendsDeleteListQuery(VkApiClient client, UserActor actor, int listId) {
        super(client, "friends.deleteList", OkResponse.class);
        accessToken(actor.getAccessToken());
        listId(listId);
    }

    /**
     * ID of the friend list to delete.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsDeleteListQuery listId(int value) {
        return unsafeParam("list_id", value);
    }

    @Override
    protected FriendsDeleteListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("list_id", "access_token");
    }
}
