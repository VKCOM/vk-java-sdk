package com.vk.api.sdk.queries.execute;

import com.google.gson.JsonElement;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.client.actors.ServiceActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for execute by code
 */
public class ExecuteCodeQuery extends AbstractQueryBuilder<ExecuteCodeQuery, JsonElement> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param code   value of "code" parameter
     */
    public ExecuteCodeQuery(VkApiClient client, UserActor actor, String code) {
        super(client, "execute", JsonElement.class);
        accessToken(actor.getAccessToken());
        code(code);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param code   value of "code" parameter
     */
    public ExecuteCodeQuery(VkApiClient client, GroupActor actor, String code) {
        super(client, "execute", JsonElement.class);
        accessToken(actor.getAccessToken());
        code(code);
    }

    /**
     * Code
     *
     * @param value value of "code" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected ExecuteCodeQuery code(String value) {
        return unsafeParam("code", value);
    }

    @Override
    protected ExecuteCodeQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("code", "access_token");
    }
}
