package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetAlbumByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getAlbumById method
 */
public class VideoGetAlbumByIdQuery extends AbstractQueryBuilder<VideoGetAlbumByIdQuery, GetAlbumByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param albumId value of "album id" parameter.
     */
    public VideoGetAlbumByIdQuery(VkApiClient client, UserActor actor, int albumId) {
        super(client, "video.getAlbumById", GetAlbumByIdResponse.class);
        accessToken(actor.getAccessToken());
        albumId(albumId);
    }

    /**
     * Identifier of a user or community to add a video to. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetAlbumByIdQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Album ID.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetAlbumByIdQuery albumId(int value) {
        return unsafeParam("album_id", value);
    }

    @Override
    protected VideoGetAlbumByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "access_token");
    }
}
