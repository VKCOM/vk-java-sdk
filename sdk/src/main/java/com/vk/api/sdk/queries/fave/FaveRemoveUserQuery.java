package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.removeUser method
 */
public class FaveRemoveUserQuery extends AbstractQueryBuilder<FaveRemoveUserQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public FaveRemoveUserQuery(VkApiClient client, UserActor actor, int userId) {
        super(client, "fave.removeUser", OkResponse.class);
        accessToken(actor.getAccessToken());
        userId(userId);
    }

    /**
     * Profile ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveRemoveUserQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected FaveRemoveUserQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("user_id", "access_token");
    }
}
