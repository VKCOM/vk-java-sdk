package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.newsfeed.responses.GetMentionsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.getMentions method
 */
public class NewsfeedGetMentionsQuery extends AbstractQueryBuilder<NewsfeedGetMentionsQuery, GetMentionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedGetMentionsQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.getMentions", GetMentionsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetMentionsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Earliest timestamp (in Unix time) of a post to return. By default, 24 hours ago.
     * If the parameter is not set, all mentions about the user will be returned if end_time parameter is not set,
     * otherwise - mentions considering "end_time" parameter."
     *
     * @param value value of "start time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetMentionsQuery startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * Latest timestamp (in Unix time) of a post to return. By default, the current time.
     * If the parameter is not set, all mentions about the user will be returned if "start_time" parameter is not set, otherwise - mentions considering "start_time" parameter."
     *
     * @param value value of "end time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetMentionsQuery endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    /**
     * Offset needed to return a specific subset of posts.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetMentionsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of posts to return.
     *
     * @param value value of "count" parameter. Maximum is 50. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetMentionsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected NewsfeedGetMentionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
