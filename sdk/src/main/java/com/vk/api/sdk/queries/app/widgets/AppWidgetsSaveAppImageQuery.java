package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.app.widgets.responses.SaveImageResponse;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsSaveAppImageQuery extends AbstractQueryBuilder<AppWidgetsSaveAppImageQuery, SaveImageResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    service actor with access token
     * @param hash     hash param received after uploading to server
     * @param image    image param received after uploading to server
     */
    public AppWidgetsSaveAppImageQuery(VkApiClient client, ServiceActor actor, String hash, String image) {
        super(client, "appWidgets.saveAppImage", SaveImageResponse.class);
        accessToken(actor.getAccessToken());
        hash(hash);
        image(image);
    }

    /**
     * Hash.
     *
     * @param value value of "image_type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsSaveAppImageQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Image.
     *
     * @param value value of "image_type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsSaveAppImageQuery image(String value) {
        return unsafeParam("image", value);
    }

    @Override
    protected AppWidgetsSaveAppImageQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("hash", "image", "access_token");
    }
}
