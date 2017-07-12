package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.MutualFriend;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getMutual method
 */
public class FriendsGetMutualQueryWithTargetUids extends AbstractQueryBuilder<FriendsGetMutualQueryWithTargetUids, List<MutualFriend>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetMutualQueryWithTargetUids(VkApiClient client, UserActor actor, List<Integer> targetUids) {
        super(client, "friends.getMutual", Utils.buildParametrizedType(List.class, MutualFriend.class));
        accessToken(actor.getAccessToken());
        targetUids(targetUids);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetMutualQueryWithTargetUids(VkApiClient client, UserActor actor, Integer... targetUids) {
        super(client, "friends.getMutual", Utils.buildParametrizedType(List.class, MutualFriend.class));
        accessToken(actor.getAccessToken());
        targetUids(targetUids);
    }

    /**
     * ID of the user whose friends will be checked against the friends of the user specified in "target_uid".
     *
     * @param value value of "source uid" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetMutualQueryWithTargetUids sourceUid(Integer value) {
        return unsafeParam("source_uid", value);
    }

    /**
     * Set target uids
     *
     * @param value value of "target uids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetMutualQueryWithTargetUids targetUids(Integer... value) {
        return unsafeParam("target_uids", value);
    }

    /**
     * Set target uids
     *
     * @param value value of "target uids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsGetMutualQueryWithTargetUids targetUids(List<Integer> value) {
        return unsafeParam("target_uids", value);
    }

    /**
     * Sort order
     *
     * @param value value of "order" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetMutualQueryWithTargetUids order(FriendsGetMutualOrder value) {
        return unsafeParam("order", value);
    }

    /**
     * Number of mutual friends to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetMutualQueryWithTargetUids count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of mutual friends.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetMutualQueryWithTargetUids offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected FriendsGetMutualQueryWithTargetUids getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
