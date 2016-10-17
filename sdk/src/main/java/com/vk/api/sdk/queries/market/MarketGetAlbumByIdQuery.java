package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetAlbumByIdResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getAlbumById method
 */
public class MarketGetAlbumByIdQuery extends AbstractQueryBuilder<MarketGetAlbumByIdQuery, GetAlbumByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param ownerId  value of "owner id" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketGetAlbumByIdQuery(VkApiClient client, UserActor actor, int ownerId, int... albumIds) {
        super(client, "market.getAlbumById", GetAlbumByIdResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param ownerId  value of "owner id" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketGetAlbumByIdQuery(VkApiClient client, UserActor actor, int ownerId, List<Integer> albumIds) {
        super(client, "market.getAlbumById", GetAlbumByIdResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        albumIds(albumIds);
    }

    /**
     * Identifier of an album owner community
     * Note that community id in the 'owner_id' parameter should be negative number.
     * For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetAlbumByIdQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Collections identifiers to obtain data from
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetAlbumByIdQuery albumIds(int... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Collections identifiers to obtain data from
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetAlbumByIdQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketGetAlbumByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_ids", "owner_id", "access_token");
    }
}
