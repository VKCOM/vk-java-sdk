package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetNewTagsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getNewTags method
 */
public class VideoGetNewTagsQuery extends AbstractQueryBuilder<VideoGetNewTagsQuery, GetNewTagsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public VideoGetNewTagsQuery(VkApiClient client, UserActor actor) {
        super(client, "video.getNewTags", GetNewTagsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of videos.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetNewTagsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of videos to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetNewTagsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected VideoGetNewTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
