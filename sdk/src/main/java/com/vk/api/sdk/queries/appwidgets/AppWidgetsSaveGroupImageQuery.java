package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.appwidgets.responses.SaveGroupImageResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.saveGroupImage method
 */
public class AppWidgetsSaveGroupImageQuery extends AbstractQueryBuilder<AppWidgetsSaveGroupImageQuery, SaveGroupImageResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param hash value of "hash" parameter.
     * @param image value of "image" parameter.
     */
    public AppWidgetsSaveGroupImageQuery(VkApiClient client, GroupActor actor, String hash,
            String image) {
        super(client, "appWidgets.saveGroupImage", SaveGroupImageResponse.class);
        accessToken(actor.getAccessToken());
        hash(hash);
        image(image);
    }

    /**
     * Parameter returned when photo is uploaded to server
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsSaveGroupImageQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned when photo is uploaded to server
     *
     * @param value value of "image" parameter.
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
        return Arrays.asList("image", "hash", "access_token");
    }
}
