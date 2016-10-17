package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.hideCatalogSection method
 */
public class VideoHideCatalogSectionQuery extends AbstractQueryBuilder<VideoHideCatalogSectionQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param sectionId value of "section id" parameter.
     */
    public VideoHideCatalogSectionQuery(VkApiClient client, UserActor actor, int sectionId) {
        super(client, "video.hideCatalogSection", OkResponse.class);
        accessToken(actor.getAccessToken());
        sectionId(sectionId);
    }

    /**
     * "id" value returned with a block to hide by the "video.getCatalog" method.
     *
     * @param value value of "section id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoHideCatalogSectionQuery sectionId(int value) {
        return unsafeParam("section_id", value);
    }

    @Override
    protected VideoHideCatalogSectionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("section_id", "access_token");
    }
}
