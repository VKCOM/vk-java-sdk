package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.app.widgets.ImageType;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetAppImageUploadServerQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetAppImagesQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetGroupImageUploadServerQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetGroupImagesQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsGetImagesByIdQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsSaveAppImageQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsSaveGroupImageQuery;
import com.vk.api.sdk.queries.app.widgets.AppWidgetsUpdateQuery;

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
     * @param actor service actor with access token
     * @param imageType type of image
     * @return query
     */
    public AppWidgetsGetAppImageUploadServerQuery getAppImageUploadServer(ServiceActor actor, ImageType imageType) {
        return new AppWidgetsGetAppImageUploadServerQuery(getClient(), actor, imageType);
    }

    /**
     * Returns an upload url.
     *
     * @param actor group actor with access token
     * @param imageType type of image
     * @return query
     */
    public AppWidgetsGetGroupImageUploadServerQuery getGroupImageUploadServer(GroupActor actor, ImageType imageType) {
        return new AppWidgetsGetGroupImageUploadServerQuery(getClient(), actor, imageType);
    }

    /**
     * Saves image into app collection for community app widgets.
     *
     * @param actor  service actor with access token
     * @param hash   hash param received after uploading to server
     * @param image  image param received after uploading to server
     * @return query
     */
    public AppWidgetsSaveAppImageQuery saveAppImage(ServiceActor actor, String hash, String image) {
        return new AppWidgetsSaveAppImageQuery(getClient(), actor, hash, image);
    }

    /**
     * Saves image into group collection for community app widgets.
     *
     * @param actor  group actor with access token
     * @param hash   hash param received after uploading to server
     * @param image  image param received after uploading to server
     * @return query
     */
    public AppWidgetsSaveGroupImageQuery saveGroupImage(GroupActor actor, String hash, String image) {
        return new AppWidgetsSaveGroupImageQuery(getClient(), actor, hash, image);
    }

    /**
     * Retrieves collection of images uploaded for application.
     *
     * @param actor group actor with access token
     * @return query
     */
    public AppWidgetsGetAppImagesQuery getAppImages(GroupActor actor) {
        return new AppWidgetsGetAppImagesQuery(getClient(), actor);
    }

    /**
     * Retrieves collection of images uploaded for application.
     *
     * @param actor service actor with access token
     * @return query
     */
    public AppWidgetsGetAppImagesQuery getAppImages(ServiceActor actor) {
        return new AppWidgetsGetAppImagesQuery(getClient(), actor);
    }

    /**
     * Retrieves collection of images uploaded for application.
     *
     * @param actor group actor with access token
     * @return query
     */
    public AppWidgetsGetGroupImagesQuery getGroupImages(GroupActor actor) {
        return new AppWidgetsGetGroupImagesQuery(getClient(), actor);
    }

    /**
     * Retrieves collection of images by their ids.
     *
     * @param actor group actor with access token
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(GroupActor actor) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor);
    }

    /**
     * Retrieves collection of images by their ids.
     *
     * @param actor service actor with access token
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(ServiceActor actor) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor);
    }

    /**
     * Refreshes widget.
     *
     * @param actor group actor with access token
     * @param code  widget's code
     * @return query
     */
    public AppWidgetsUpdateQuery update(GroupActor actor, String code) {
        return new AppWidgetsUpdateQuery(getClient(), actor, code);
    }
}
