package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.DuplicateResult;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.duplicate method
 */
public class VideoDuplicateQuery extends AbstractQueryBuilder<VideoDuplicateQuery, DuplicateResult> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param videoId value of "video id" parameter. Minimum is 0.
     * @param md5sum value of "md5sum" parameter.
     * @param size value of "size" parameter. Minimum is 0.
     */
    public VideoDuplicateQuery(VkApiClient client, UserActor actor, int ownerId, int videoId,
            String md5sum, int size) {
        super(client, "video.duplicate", DuplicateResult.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        videoId(videoId);
        md5sum(md5sum);
        size(size);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoDuplicateQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set video id
     *
     * @param value value of "video id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoDuplicateQuery videoId(int value) {
        return unsafeParam("video_id", value);
    }

    /**
     * Set md5sum
     *
     * @param value value of "md5sum" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoDuplicateQuery md5sum(String value) {
        return unsafeParam("md5sum", value);
    }

    /**
     * Set size
     *
     * @param value value of "size" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoDuplicateQuery size(int value) {
        return unsafeParam("size", value);
    }

    @Override
    protected VideoDuplicateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("size", "md5sum", "video_id", "owner_id", "access_token");
    }
}
