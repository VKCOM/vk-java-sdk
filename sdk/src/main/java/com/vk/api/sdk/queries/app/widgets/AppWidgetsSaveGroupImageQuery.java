package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.app.widgets.responses.SaveImageResponse;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsSaveGroupImageQuery extends AbstractQueryBuilder<AppWidgetsSaveGroupImageQuery, SaveImageResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    group actor with access token
     * @param hash     hash param received after uploading to server
     * @param image    image param received after uploading to server
     */
    public AppWidgetsSaveGroupImageQuery(VkApiClient client, GroupActor actor, String hash, String image) {
        super(client, "appWidgets.saveGroupImage", SaveImageResponse.class);
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
    protected AppWidgetsSaveGroupImageQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Image.
     *
     * @param value value of "image_type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsSaveGroupImageQuery image(String value) {
        return unsafeParam("image", value);
    }

    @Override
    protected AppWidgetsSaveGroupImageQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("hash", "image", "access_token");
    }
}
