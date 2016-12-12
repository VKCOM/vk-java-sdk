package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetCatalogExtendedResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Video.getCatalog method
 */
public class VideoGetCatalogQueryWithExtended extends AbstractQueryBuilder<VideoGetCatalogQueryWithExtended, GetCatalogExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public VideoGetCatalogQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "video.getCatalog", GetCatalogExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public VideoGetCatalogQueryWithExtended(VkApiClient client) {
        super(client, "video.getCatalog", GetCatalogExtendedResponse.class);
        extended(true);
    }

    /**
     * Number of catalog blocks to return.
     *
     * @param value value of "count" parameter. Maximum is 16. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Number of videos in each block.
     *
     * @param value value of "items count" parameter. Maximum is 16. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogQueryWithExtended itemsCount(Integer value) {
        return unsafeParam("items_count", value);
    }

    /**
     * Parameter for requesting the next results page. Value for transmitting here is returned in the "next" field in a reply.
     *
     * @param value value of "from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogQueryWithExtended from(String value) {
        return unsafeParam("from", value);
    }

    /**
     * List of requested catalog sections
     *
     * @param value value of "filters" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogQueryWithExtended filters(VideoGetCatalogFilter... value) {
        return unsafeParam("filters", value);
    }

    /**
     * List of requested catalog sections
     *
     * @param value value of "filters" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogQueryWithExtended filters(List<VideoGetCatalogFilter> value) {
        return unsafeParam("filters", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected VideoGetCatalogQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
