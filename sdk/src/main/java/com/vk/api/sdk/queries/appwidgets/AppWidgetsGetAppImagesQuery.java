package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.appwidgets.responses.GetAppImagesResponse;
import com.vk.api.sdk.objects.enums.AppWidgetsImageType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.getAppImages method
 */
public class AppWidgetsGetAppImagesQuery extends AbstractQueryBuilder<AppWidgetsGetAppImagesQuery, GetAppImagesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppWidgetsGetAppImagesQuery(VkApiClient client, UserActor actor) {
        super(client, "appWidgets.getAppImages", GetAppImagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppWidgetsGetAppImagesQuery(VkApiClient client, GroupActor actor) {
        super(client, "appWidgets.getAppImages", GetAppImagesResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AppWidgetsGetAppImagesQuery(VkApiClient client, ServiceActor actor) {
        super(client, "appWidgets.getAppImages", GetAppImagesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Offset needed to return a specific subset of images.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Maximum count of results.
     *
     * @param value value of "count" parameter. Maximum is 100. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set image type
     *
     * @param value value of "image type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsGetAppImagesQuery imageType(AppWidgetsImageType value) {
        return unsafeParam("image_type", value);
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
