package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.apps.responses.GetResponse;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Collections;
import java.util.List;

/**
 * Query for Apps.get method
 */
public class AppsGetQuery extends AbstractQueryBuilder<AppsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AppsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "apps.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public AppsGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "apps.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Application ID
     *
     * @param value value of "app id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery appId(Integer value) {
        return unsafeParam("app_id", value);
    }

    /**
     * List of application ID
     *
     * @param value value of "app ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery appIds(String... value) {
        return unsafeParam("app_ids", value);
    }

    /**
     * List of application ID
     *
     * @param value value of "app ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery appIds(List<String> value) {
        return unsafeParam("app_ids", value);
    }

    /**
     * Platform.
     *
     * @param value value of "platform" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery platform(AppsPlatform value) {
        return unsafeParam("platform", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname.
     * Only if "return_friends" = "1"
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected AppsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
