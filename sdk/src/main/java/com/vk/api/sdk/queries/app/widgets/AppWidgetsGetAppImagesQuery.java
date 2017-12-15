package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.objects.app.widgets.responses.GetAppImagesResponse;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsGetAppImagesQuery extends AbstractQueryBuilder<AppWidgetsGetAppImagesQuery, GetAppImagesResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     */
    public AppWidgetsGetAppImagesQuery(VkApiClient client, GroupActor actor) {
        super(client, "appWidgets.getAppImages", GetAppImagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   service actor with access token
     */
    public AppWidgetsGetAppImagesQuery(VkApiClient client, ServiceActor actor) {
        super(client, "appWidgets.getAppImages", GetAppImagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Specifies the offset.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Specifies the maximal result size.
     *
     * @param value value of "count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Image type.
     *
     * @param value value of "image_type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery imageType(ImageType value) {
        return unsafeParam("image_type", value.getValue());
    }

    @Override
    protected AppWidgetsGetAppImagesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
