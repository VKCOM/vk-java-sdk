package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.app.widgets.responses.GetImagesByIdResponse;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsGetImagesByIdQuery extends AbstractQueryBuilder<AppWidgetsGetImagesByIdQuery, GetImagesByIdResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   user actor with access token
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, UserActor actor) {
        super(client, "", GetImagesByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   group actor with access token
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, GroupActor actor) {
        super(client, "appWidgets.getImagesById", GetImagesByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   service actor with access token
     */
    public AppWidgetsGetImagesByIdQuery(VkApiClient client, ServiceActor actor) {
        super(client, "appWidgets.getImagesById", GetImagesByIdResponse.class);
        accessToken(actor.getAccessToken());
    }

    public AppWidgetsGetImagesByIdQuery images(String images) {
        return unsafeParam("images", images);
    }

    public AppWidgetsGetImagesByIdQuery images(String... images) {
        return unsafeParam("images", images);
    }

    @Override
    protected AppWidgetsGetImagesByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
