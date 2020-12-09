package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.appwidgets.responses.GetGroupImageUploadServerResponse;
import com.vk.api.sdk.objects.enums.AppWidgetsImageType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.getGroupImageUploadServer method
 */
public class AppWidgetsGetGroupImageUploadServerQuery extends AbstractQueryBuilder<AppWidgetsGetGroupImageUploadServerQuery, GetGroupImageUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param imageType value of "image type" parameter.
     */
    public AppWidgetsGetGroupImageUploadServerQuery(VkApiClient client, GroupActor actor,
            AppWidgetsImageType imageType) {
        super(client, "appWidgets.getGroupImageUploadServer", GetGroupImageUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        imageType(imageType);
    }

    /**
     * Set image type
     *
     * @param value value of "image type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsGetGroupImageUploadServerQuery imageType(AppWidgetsImageType value) {
        return unsafeParam("image_type", value);
    }

    @Override
    protected AppWidgetsGetGroupImageUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("image_type", "access_token");
    }
}
