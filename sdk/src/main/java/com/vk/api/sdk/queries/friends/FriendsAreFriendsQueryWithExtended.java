package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.friends.responses.AreFriendsExtendedResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.areFriends method
 */
public class FriendsAreFriendsQueryWithExtended extends AbstractQueryBuilder<FriendsAreFriendsQueryWithExtended, List<AreFriendsExtendedResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public FriendsAreFriendsQueryWithExtended(VkApiClient client, UserActor actor,
            Integer... userIds) {
        super(client, "friends.areFriends", Utils.buildParametrizedType(List.class, AreFriendsExtendedResponse.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param userIds value of "user ids" parameter.
     */
    public FriendsAreFriendsQueryWithExtended(VkApiClient client, UserActor actor,
            List<Integer> userIds) {
        super(client, "friends.areFriends", Utils.buildParametrizedType(List.class, AreFriendsExtendedResponse.class));
        accessToken(actor.getAccessToken());
        userIds(userIds);
        extended(true);
    }

    /**
     * '1' — to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
     *
     * @param value value of "need sign" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsAreFriendsQueryWithExtended needSign(Boolean value) {
        return unsafeParam("need_sign", value);
    }

    /**
     * Return friend request read_state field
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsAreFriendsQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * user_ids
     * IDs of the users whose friendship status to check.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsAreFriendsQueryWithExtended userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * IDs of the users whose friendship status to check.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FriendsAreFriendsQueryWithExtended userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }

    @Override
    protected FriendsAreFriendsQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_ids", "access_token");
    }
}
