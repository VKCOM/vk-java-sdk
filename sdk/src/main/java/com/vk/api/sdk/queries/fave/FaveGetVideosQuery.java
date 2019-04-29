package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetVideosResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getVideos method
 */
public class FaveGetVideosQuery extends AbstractQueryBuilder<FaveGetVideosQuery, GetVideosResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetVideosQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getVideos", GetVideosResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of videos.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetVideosQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of videos to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetVideosQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Return an additional information about videos. Also returns all owners profiles and groups.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetVideosQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected FaveGetVideosQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
