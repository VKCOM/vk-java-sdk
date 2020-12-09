package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.appwidgets.responses.GetImagesByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.getImagesById method
 */
public class AppWidgetsGetImagesByIdQuery extends AbstractQueryBuilder<AppWidgetsGetImagesByIdQuery, List<GetImagesByIdResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, UserActor actor, String... images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        images(images);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, UserActor actor, List<String> images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        images(images);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, GroupActor actor, String... images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        images(images);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, GroupActor actor, List<String> images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        images(images);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, ServiceActor actor, String... images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        images(images);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param images value of "images" parameter.
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, ServiceActor actor,
            List<String> images) {
        super(client, "appWidgets.getImagesById", Utils.buildParametrizedType(List.class, GetImagesByIdResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        images(images);
    }

    /**
     * images
     * List of images IDs
     *
     * @param value value of "images" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsGetImagesByIdQuery images(String... value) {
        return unsafeParam("images", value);
    }

    /**
     * List of images IDs
     *
     * @param value value of "images" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsGetImagesByIdQuery images(List<String> value) {
        return unsafeParam("images", value);
    }

    @Override
    protected AppWidgetsGetImagesByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("images", "access_token");
    }
}
