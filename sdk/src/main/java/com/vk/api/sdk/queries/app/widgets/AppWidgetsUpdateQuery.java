package com.vk.api.sdk.queries.app.widgets;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;

import java.util.Arrays;
import java.util.List;

public class AppWidgetsUpdateQuery extends AbstractQueryBuilder<AppWidgetsUpdateQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    group actor with access token
     * @param code     widget's code
     */
    public AppWidgetsUpdateQuery(VkApiClient client, GroupActor actor, String code) {
        super(client, "appWidgets.update", Integer.class);
        accessToken(actor.getAccessToken());
        code(code);
    }

    /**
     * Widget type.
     *
     * @param value value of "type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppWidgetsUpdateQuery type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * Widget code.
     *
     * @param value value of "code" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppWidgetsUpdateQuery code(String value) {
        return unsafeParam("code", value);
    }

    @Override
    protected AppWidgetsUpdateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("code", "access_token");
    }
}
