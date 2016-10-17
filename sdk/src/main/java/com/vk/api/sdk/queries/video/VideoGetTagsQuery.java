package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.VideoTag;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getTags method
 */
public class VideoGetTagsQuery extends AbstractQueryBuilder<VideoGetTagsQuery, List<VideoTag>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoGetTagsQuery(VkApiClient client, UserActor actor, int videoId) {
        super(client, "video.getTags", Utils.buildParametrizedType(List.class, VideoTag.class));
        accessToken(actor.getAccessToken());
        videoId(videoId);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetTagsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetTagsQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    @Override
    protected VideoGetTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "access_token");
    }
}
