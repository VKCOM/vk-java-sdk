package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetAppImageUploadServerQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsSaveAppImageQuery;

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

    /**
     * Allows to save image into app collection for community app widgets.
     *
     * @param actor  vk service actor
     * @param hash   hash param received after uploading to server
     * @param image  image param received after uploading to server
     * @return query
     */
    public AppWidgetsSaveAppImageQuery saveAppImage(ServiceActor actor, String hash, String image) {
        return new AppWidgetsSaveAppImageQuery(getClient(), actor, hash, image);
    }
}
