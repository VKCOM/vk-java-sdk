package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.putTag method
 */
public class VideoPutTagQuery extends AbstractQueryBuilder<VideoPutTagQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param userId  value of "user id" parameter. Minimum is 0.
     * @param videoId value of "video id" parameter. Minimum is 0.
     */
    public VideoPutTagQuery(VkApiClient client, UserActor actor, int userId, int videoId) {
        super(client, "video.putTag", Integer.class);
        accessToken(actor.getAccessToken());
        userId(userId);
        videoId(videoId);
    }

    /**
     * ID of the user to be tagged.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoPutTagQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoPutTagQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Video ID.
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoPutTagQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    /**
     * Tag text.
     *
     * @param value value of "tagged name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoPutTagQuery taggedName(String value) {
        return unsafeParam("tagged_name", value);
    }

    @Override
    protected VideoPutTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("video_id", "user_id", "access_token");
    }
}
