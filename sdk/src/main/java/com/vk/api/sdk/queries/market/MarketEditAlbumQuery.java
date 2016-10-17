package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.editAlbum method
 */
public class MarketEditAlbumQuery extends AbstractQueryBuilder<MarketEditAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param albumId value of "album id" parameter. Minimum is 0.
     * @param title   value of "title" parameter.
     */
    public MarketEditAlbumQuery(VkApiClient client, UserActor actor, int ownerId, int albumId, String title) {
        super(client, "market.editAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        albumId(albumId);
        title(title);
    }

    /**
     * Collection owner identifier
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Collection id
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditAlbumQuery albumId(int value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Collection title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketEditAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Cover photo id
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditAlbumQuery photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Set main album
     *
     * @param value value of "main album" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketEditAlbumQuery mainAlbum(Boolean value) {
        return unsafeParam("main_album", value);
    }

    @Override
    protected MarketEditAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_id", "title", "owner_id", "access_token");
    }
}
