package com.vk.api.sdk.queries.status;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.status.Status;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Status.get method
 */
public class StatusGetQuery extends AbstractQueryBuilder<StatusGetQuery, Status> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public StatusGetQuery(VkApiClient client, UserActor actor) {
        super(client, "status.get", Status.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "user id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatusGetQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StatusGetQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected StatusGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
