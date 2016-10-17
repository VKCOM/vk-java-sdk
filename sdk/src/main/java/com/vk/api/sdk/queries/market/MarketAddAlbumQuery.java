package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.AddAlbumResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.addAlbum method
 */
public class MarketAddAlbumQuery extends AbstractQueryBuilder<MarketAddAlbumQuery, AddAlbumResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param title   value of "title" parameter.
     */
    public MarketAddAlbumQuery(VkApiClient client, UserActor actor, int ownerId, String title) {
        super(client, "market.addAlbum", AddAlbumResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        title(title);
    }

    /**
     * Collection owner identifier
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Collection title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Collection cover photo id
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddAlbumQuery photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Set as main
     *
     * @param value value of "main album" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketAddAlbumQuery mainAlbum(Boolean value) {
        return unsafeParam("main_album", value);
    }

    @Override
    protected MarketAddAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "owner_id", "access_token");
    }
}
