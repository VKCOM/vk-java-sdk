package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.responses.AddAlbumResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.addAlbum method
 */
public class AudioAddAlbumQuery extends AbstractQueryBuilder<AudioAddAlbumQuery, AddAlbumResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param title  value of "title" parameter.
     */
    public AudioAddAlbumQuery(VkApiClient client, UserActor actor, String title) {
        super(client, "audio.addAlbum", AddAlbumResponse.class);
        accessToken(actor.getAccessToken());
        title(title);
    }

    /**
     * Community ID (if the album will be created in a community).
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioAddAlbumQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Album title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioAddAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected AudioAddAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "access_token");
    }
}
