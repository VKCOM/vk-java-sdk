package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.addBan method
 */
public class NewsfeedAddBanQuery extends AbstractQueryBuilder<NewsfeedAddBanQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedAddBanQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.addBan", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedAddBanQuery userIds(Integer... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Set user ids
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedAddBanQuery userIds(List<Integer> value) {
        return unsafeParam("user_ids", value);
    }


    /**
     * Set group ids
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedAddBanQuery groupIds(Integer... value) {
        return unsafeParam("group_ids", value);
    }

    /**
     * Set group ids
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedAddBanQuery groupIds(List<Integer> value) {
        return unsafeParam("group_ids", value);
    }

    @Override
    protected NewsfeedAddBanQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
