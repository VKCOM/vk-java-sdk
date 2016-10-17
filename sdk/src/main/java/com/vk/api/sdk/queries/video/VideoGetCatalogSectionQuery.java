package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetCatalogSectionResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getCatalogSection method
 */
public class VideoGetCatalogSectionQuery extends AbstractQueryBuilder<VideoGetCatalogSectionQuery, GetCatalogSectionResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param sectionId value of "section id" parameter.
     * @param from      value of "from" parameter.
     */
    public VideoGetCatalogSectionQuery(VkApiClient client, UserActor actor, String sectionId, String from) {
        super(client, "video.getCatalogSection", GetCatalogSectionResponse.class);
        accessToken(actor.getAccessToken());
        sectionId(sectionId);
        from(from);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param sectionId value of "section id" parameter.
     * @param from      value of "from" parameter.
     */
    public VideoGetCatalogSectionQuery(VkApiClient client, String sectionId, String from) {
        super(client, "video.getCatalogSection", GetCatalogSectionResponse.class);
        sectionId(sectionId);
        from(from);
    }

    /**
     * "id" value returned with a block by the "video.getCatalog" method.
     *
     * @param value value of "section id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogSectionQuery sectionId(String value) {
        return unsafeParam("section_id", value);
    }

    /**
     * "next" value returned with a block by the "video.getCatalog" method.
     *
     * @param value value of "from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogSectionQuery from(String value) {
        return unsafeParam("from", value);
    }

    /**
     * Number of blocks to return.
     *
     * @param value value of "count" parameter. Maximum is 16. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogSectionQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected VideoGetCatalogSectionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("from", "section_id");
    }
}
