package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.video.responses.GetCatalogSectionExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.getCatalogSection method
 */
public class VideoGetCatalogSectionQueryWithExtended extends AbstractQueryBuilder<VideoGetCatalogSectionQueryWithExtended, GetCatalogSectionExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param sectionId value of "section id" parameter.
     * @param from      value of "from" parameter.
     */
    public VideoGetCatalogSectionQueryWithExtended(VkApiClient client, UserActor actor, String sectionId, String from) {
        super(client, "video.getCatalogSection", GetCatalogSectionExtendedResponse.class);
        accessToken(actor.getAccessToken());
        sectionId(sectionId);
        from(from);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param sectionId value of "section id" parameter.
     * @param from      value of "from" parameter.
     */
    public VideoGetCatalogSectionQueryWithExtended(VkApiClient client, String sectionId, String from) {
        super(client, "video.getCatalogSection", GetCatalogSectionExtendedResponse.class);
        sectionId(sectionId);
        from(from);
        extended(true);
    }

    /**
     * "id" value returned with a block by the "video.getCatalog" method.
     *
     * @param value value of "section id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogSectionQueryWithExtended sectionId(String value) {
        return unsafeParam("section_id", value);
    }

    /**
     * "next" value returned with a block by the "video.getCatalog" method.
     *
     * @param value value of "from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogSectionQueryWithExtended from(String value) {
        return unsafeParam("from", value);
    }

    /**
     * Number of blocks to return.
     *
     * @param value value of "count" parameter. Maximum is 16. Minimum is 0. By default 10.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoGetCatalogSectionQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoGetCatalogSectionQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected VideoGetCatalogSectionQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("from", "section_id");
    }
}
