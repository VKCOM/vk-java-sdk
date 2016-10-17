package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.GetRequestsNeedMutualResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getRequests method
 */
public class FriendsGetRequestsQueryWithNeedMutual extends AbstractQueryBuilder<FriendsGetRequestsQueryWithNeedMutual, GetRequestsNeedMutualResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetRequestsQueryWithNeedMutual(VkApiClient client, UserActor actor, Boolean needMutual) {
        super(client, "friends.getRequests", GetRequestsNeedMutualResponse.class);
        accessToken(actor.getAccessToken());
        needMutual(needMutual);
    }

    /**
     * Offset needed to return a specific subset of friend requests.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of friend requests to return (default 100, maximum 1000).
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * true - to return response messages from users who have sent a friend request or, if "suggested" is set to true, to return a list of suggested friends
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * true - to return a list of mutual friends (up to 20), if any
     *
     * @param value value of "need mutual" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetRequestsQueryWithNeedMutual needMutual(Boolean value) {
        return unsafeParam("need_mutual", value);
    }

    /**
     * true - to return outgoing requests
     * false - to return incoming requests (default)
     *
     * @param value value of "out" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual out(Boolean value) {
        return unsafeParam("out", value);
    }

    /**
     * Sort order
     *
     * @param value value of "sort" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual sort(FriendsGetRequestsSort value) {
        return unsafeParam("sort", value);
    }

    /**
     * true - to return a list of suggested friends
     * false - to return friend requests (default)
     *
     * @param value value of "suggested" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetRequestsQueryWithNeedMutual suggested(Boolean value) {
        return unsafeParam("suggested", value);
    }

    @Override
    protected FriendsGetRequestsQueryWithNeedMutual getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
