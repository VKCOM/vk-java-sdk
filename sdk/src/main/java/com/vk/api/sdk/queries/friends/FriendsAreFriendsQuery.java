package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.FriendStatus;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.areFriends method
 */
public class FriendsAreFriendsQuery extends AbstractQueryBuilder<FriendsAreFriendsQuery, List<FriendStatus>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public FriendsAreFriendsQuery(VkApiClient client, UserActor actor, int... userIds) {
        super(client, "friends.areFriends", Utils.buildParametrizedType(List.class, FriendStatus.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public FriendsAreFriendsQuery(VkApiClient client, UserActor actor, List<Integer> userIds) {
        super(client, "friends.areFriends", Utils.buildParametrizedType(List.class, FriendStatus.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
    }

    /**
     * IDs of the users whose friendship status to check.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsAreFriendsQuery userIds(int... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of the users whose friendship status to check.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsAreFriendsQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set need sign
     *
     * @param value value of "need sign" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsAreFriendsQuery needSign(Boolean value) {
        return unsafeParam("need_sign", value);
    }

    @Override
    protected FriendsAreFriendsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "access_token");
    }
}
