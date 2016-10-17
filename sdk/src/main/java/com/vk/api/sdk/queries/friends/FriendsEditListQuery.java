package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.editList method
 */
public class FriendsEditListQuery extends AbstractQueryBuilder<FriendsEditListQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param listId value of "list id" parameter. Minimum is 0.
     */
    public FriendsEditListQuery(VkApiClient client, UserActor actor, int listId) {
        super(client, "friends.editList", OkResponse.class);
        accessToken(actor.getAccessToken());
        listId(listId);
    }

    /**
     * Name of the friend list.
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Friend list ID.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsEditListQuery listId(int value) {
        return unsafeParam("list_id", value);
    }

    /**
     * IDs of users in the friend list.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of users in the friend list.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * (Applies if "user_ids" parameter is not set.)
     * User IDs to add to the friend list.
     *
     * @param value value of "add user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery addUserIds(Integer... value) {
        return unsafeParam("add_user_ids", value);
    }

    /**
     * (Applies if "user_ids" parameter is not set.)
     * User IDs to add to the friend list.
     *
     * @param value value of "add user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery addUserIds(List<Integer> value) {
        return unsafeParam("add_user_ids", value);
    }

    /**
     * (Applies if "user_ids" parameter is not set.)
     * User IDs to delete from the friend list.
     *
     * @param value value of "delete user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery deleteUserIds(Integer... value) {
        return unsafeParam("delete_user_ids", value);
    }

    /**
     * (Applies if "user_ids" parameter is not set.)
     * User IDs to delete from the friend list.
     *
     * @param value value of "delete user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsEditListQuery deleteUserIds(List<Integer> value) {
        return unsafeParam("delete_user_ids", value);
    }


    @Override
    protected FriendsEditListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("list_id", "access_token");
    }
}
