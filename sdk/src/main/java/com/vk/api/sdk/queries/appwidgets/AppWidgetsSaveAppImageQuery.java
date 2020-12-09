package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.appwidgets.responses.SaveAppImageResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.saveAppImage method
 */
public class AppWidgetsSaveAppImageQuery extends AbstractQueryBuilder<AppWidgetsSaveAppImageQuery, SaveAppImageResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param hash value of "hash" parameter.
     * @param image value of "image" parameter.
     */
    public AppWidgetsSaveAppImageQuery(VkApiClient client, ServiceActor actor, String hash,
            String image) {
        super(client, "appWidgets.saveAppImage", SaveAppImageResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        hash(hash);
        image(image);
    }

    /**
     * Parameter returned when photo is uploaded to server
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsSaveAppImageQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned when photo is uploaded to server
     *
     * @param value value of "image" parameter.
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
        return Arrays.asList("image", "hash", "access_token");
    }
}
