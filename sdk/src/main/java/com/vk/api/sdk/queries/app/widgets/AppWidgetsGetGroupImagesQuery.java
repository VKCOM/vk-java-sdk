package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.objects.app.widgets.responses.GetGroupImagesResponse;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsGetGroupImagesQuery extends AbstractQueryBuilder<AppWidgetsGetGroupImagesQuery, GetGroupImagesResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      group actor with access token
     */
    public AppWidgetsGetGroupImagesQuery(VkApiClient client, GroupActor actor) {
        super(client, "appWidgets.getGroupImages", GetGroupImagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Specifies the offset.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetGroupImagesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Specifies the maximal result size.
     *
     * @param value value of "count" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetGroupImagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Image type.
     *
     * @param value value of "image_type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetGroupImagesQuery imageType(ImageType value) {
        return unsafeParam("image_type", value.getValue());
    }

    @Override
    protected AppWidgetsGetGroupImagesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
