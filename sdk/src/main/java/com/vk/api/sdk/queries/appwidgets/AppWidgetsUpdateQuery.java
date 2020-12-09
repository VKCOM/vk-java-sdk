package com.vk.api.sdk.queries.appwidgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.enums.AppWidgetsType;
import java.util.Arrays;
import java.util.List;

/**
 * Query for AppWidgets.update method
 */
public class AppWidgetsUpdateQuery extends AbstractQueryBuilder<AppWidgetsUpdateQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param code value of "code" parameter.
     * @param type value of "type" parameter.
     */
    public AppWidgetsUpdateQuery(VkApiClient client, GroupActor actor, String code,
            AppWidgetsType type) {
        super(client, "appWidgets.update", OkResponse.class);
        accessToken(actor.getAccessToken());
        code(code);
        type(type);
    }

    /**
     * Set code
     *
     * @param value value of "code" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsUpdateQuery code(String value) {
        return unsafeParam("code", value);
    }

    /**
     * Set type
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsUpdateQuery type(AppWidgetsType value) {
        return unsafeParam("type", value);
    }

    @Override
    protected AppWidgetsUpdateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("type", "code", "access_token");
    }
}
