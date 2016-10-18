package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetAlbumsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getAlbums method
 */
public class VideoGetAlbumsQuery extends AbstractQueryBuilder<VideoGetAlbumsQuery, GetAlbumsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public VideoGetAlbumsQuery(VkApiClient client, UserActor actor) {
        super(client, "video.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the video album(s).
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetAlbumsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Offset needed to return a specific subset of video albums.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetAlbumsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of video albums to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetAlbumsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Return system albums
     *
     * @param value value of "need_system" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetAlbumsQuery needSystem(Boolean value) {
        return unsafeParam("need_system", value);
    }

    @Override
    protected VideoGetAlbumsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
