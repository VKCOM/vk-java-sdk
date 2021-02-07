package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.AppWidgetsImageType;
import com.vk.api.sdk.objects.enums.AppWidgetsType;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsGetAppImageUploadServerQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsGetAppImagesQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsGetGroupImageUploadServerQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsGetGroupImagesQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsGetImagesByIdQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsSaveAppImageQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsSaveGroupImageQuery;
import com.vk.api.sdk.queries.appwidgets.AppWidgetsUpdateQuery;
import java.util.List;

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
     * Returns a URL for uploading a photo to the community collection for community app widgets
     *
     * @param actor vk actor
     * @param imageType
     * @return query
     */
    public AppWidgetsGetAppImageUploadServerQuery getAppImageUploadServer(ServiceActor actor,
            AppWidgetsImageType imageType) {
        return new AppWidgetsGetAppImageUploadServerQuery(getClient(), actor, imageType);
    }

    /**
     * Returns an app collection of images for community app widgets
     *
     * @param actor vk actor
     * @return query
     */
    public AppWidgetsGetAppImagesQuery getAppImages(UserActor actor) {
        return new AppWidgetsGetAppImagesQuery(getClient(), actor);
    }

    /**
     * Returns an app collection of images for community app widgets
     *
     * @param actor vk actor
     * @return query
     */
    public AppWidgetsGetAppImagesQuery getAppImages(GroupActor actor) {
        return new AppWidgetsGetAppImagesQuery(getClient(), actor);
    }

    /**
     * Returns an app collection of images for community app widgets
     *
     * @param actor vk actor
     * @return query
     */
    public AppWidgetsGetAppImagesQuery getAppImages(ServiceActor actor) {
        return new AppWidgetsGetAppImagesQuery(getClient(), actor);
    }

    /**
     * Returns a URL for uploading a photo to the community collection for community app widgets
     *
     * @param actor vk actor
     * @param imageType
     * @return query
     */
    public AppWidgetsGetGroupImageUploadServerQuery getGroupImageUploadServer(GroupActor actor,
            AppWidgetsImageType imageType) {
        return new AppWidgetsGetGroupImageUploadServerQuery(getClient(), actor, imageType);
    }

    /**
     * Returns a community collection of images for community app widgets
     *
     * @param actor vk actor
     * @return query
     */
    public AppWidgetsGetGroupImagesQuery getGroupImages(GroupActor actor) {
        return new AppWidgetsGetGroupImagesQuery(getClient(), actor);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(UserActor actor, String... images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(UserActor actor, List<String> images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(GroupActor actor, String... images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(GroupActor actor, List<String> images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(ServiceActor actor, String... images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Returns an image for community app widgets by its ID
     *
     * @param actor vk actor
     * @param images List of images IDs
     * @return query
     */
    public AppWidgetsGetImagesByIdQuery getImagesById(ServiceActor actor, List<String> images) {
        return new AppWidgetsGetImagesByIdQuery(getClient(), actor, images);
    }

    /**
     * Allows to save image into app collection for community app widgets
     *
     * @param actor vk actor
     * @param hash Parameter returned when photo is uploaded to server
     * @param image Parameter returned when photo is uploaded to server
     * @return query
     */
    public AppWidgetsSaveAppImageQuery saveAppImage(ServiceActor actor, String hash, String image) {
        return new AppWidgetsSaveAppImageQuery(getClient(), actor, hash, image);
    }

    /**
     * Allows to save image into community collection for community app widgets
     *
     * @param actor vk actor
     * @param hash Parameter returned when photo is uploaded to server
     * @param image Parameter returned when photo is uploaded to server
     * @return query
     */
    public AppWidgetsSaveGroupImageQuery saveGroupImage(GroupActor actor, String hash,
            String image) {
        return new AppWidgetsSaveGroupImageQuery(getClient(), actor, hash, image);
    }

    /**
     * Allows to update community app widget
     *
     * @param actor vk actor
     * @param code
     * @param type
     * @return query
     */
    public AppWidgetsUpdateQuery update(GroupActor actor, String code, AppWidgetsType type) {
        return new AppWidgetsUpdateQuery(getClient(), actor, code, type);
    }
}
