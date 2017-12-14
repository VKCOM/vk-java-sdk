package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetAppImageUploadServerQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsUploadImageQuery;

import java.io.File;

/**
 * List of AppWidgets methods
 */
public class AppWidgets extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public AppWidgets(VkApiClient client) {
        super(client);
    }

    /**
     * Returns an upload url.
     *
     * @param actor vk service actor
     * @param imageType type of image
     * @return query
     */
    public AppWidgetsGetAppImageUploadServerQuery getAppImageUploadServer(ServiceActor actor, ImageType imageType) {
        return new AppWidgetsGetAppImageUploadServerQuery(getClient(), actor, imageType);
    }

    public AppWidgetsUploadImageQuery uploadImage(String uploadUrl, File file) {
        return new AppWidgetsUploadImageQuery(getClient(), uploadUrl, file);
    }
}
