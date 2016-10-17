package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.responses.GetAlbumsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getAlbums method
 */
public class AudioGetAlbumsQuery extends AbstractQueryBuilder<AudioGetAlbumsQuery, GetAlbumsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetAlbumsQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.getAlbums", GetAlbumsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the audio file.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetAlbumsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Offset needed to return a specific subset of albums.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetAlbumsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of albums to return.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetAlbumsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected AudioGetAlbumsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
