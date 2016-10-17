package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.newsfeed.responses.GetSuggestedSourcesResponse;
import com.vk.api.sdk.queries.EnumParam;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.getSuggestedSources method
 */
public class NewsfeedGetSuggestedSourcesQuery extends AbstractQueryBuilder<NewsfeedGetSuggestedSourcesQuery, GetSuggestedSourcesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedGetSuggestedSourcesQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.getSuggestedSources", GetSuggestedSourcesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset required to choose a particular subset of communities or users.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetSuggestedSourcesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Amount of communities or users to return.
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetSuggestedSourcesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Shuffle the returned list or not.
     *
     * @param value value of "shuffle" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetSuggestedSourcesQuery shuffle(Boolean value) {
        return unsafeParam("shuffle", value);
    }

    /**
     * List of extra fields to be returned. See communities.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetSuggestedSourcesQuery fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * List of extra fields to be returned. See communities.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetSuggestedSourcesQuery fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected NewsfeedGetSuggestedSourcesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
