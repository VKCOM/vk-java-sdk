package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetOnlineMobileResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getOnline method
 */
public class FriendsGetOnlineQueryWithMobile extends AbstractQueryBuilder<FriendsGetOnlineQueryWithMobile, GetOnlineMobileResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetOnlineQueryWithMobile(VkApiClient client, UserActor actor) {
        super(client, "friends.getOnline", GetOnlineMobileResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Friend list ID. If this parameter is not set, information about all online friends is returned.
     *
     * @param value value of "list id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile listId(Integer value) {
        return unsafeParam("list_id", value);
    }

    /**
     * Return an additional "online_mobile" field
     *
     * @param value value of "online mobile" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile onlineMobile(Boolean value) {
        return unsafeParam("online_mobile", value);
    }

    /**
     * Sort order
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile order(FriendsGetOnlineOrder value) {
        return unsafeParam("order", value);
    }

    /**
     * Number of friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetOnlineQueryWithMobile offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected FriendsGetOnlineQueryWithMobile getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
