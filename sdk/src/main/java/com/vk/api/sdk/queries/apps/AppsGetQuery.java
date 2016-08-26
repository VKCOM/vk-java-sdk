package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.apps.responses.GetResponse;
import com.vk.api.sdk.queries.Field;

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
    public AppsGetQuery(VkApiClient client, Actor actor) {
        super(client, "apps.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public AppsGetQuery(VkApiClient client) {
        super(client, "apps.get", GetResponse.class);
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
     * Platform. Possible values:
     * ''ios'' - iOS;
     * ''android'' - Android;
     * ''winphone'' - Windows Phone;
     * ''web'' - Ð¿Ñ�Ð¸Ð»Ð¾Ð¶ÐµÐ½Ð¸Ñ� Ð½Ð° vk.com.
     * By default: ''web''.
     *
     * @param value value of "platform" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery platform(String value) {
        return unsafeParam("platform", value);
    }

    /**
     * Profile fields to return. Sample values: ''nickname'', ''screen_name'', ''sex'', ''bdate'' (birthdate), ''city'', ''country'', ''timezone'', ''photo'', ''photo_medium'', ''photo_big'', ''has_mobile'', ''contacts'', ''education'', ''online'', ''counters'', ''relation'', ''last_seen'', ''activity'', ''can_write_private_message'', ''can_see_all_posts'', ''can_post'', ''universities''
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery fields(Field... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default);
     * ''gen'' - genitive;
     * ''dat'' - dative;
     * ''acc'' - accusative;
     * ''ins'' - instrumental;
     * ''abl'' - prepositional.
     * <p>
     * (only if "return_friends" = ''1'')
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsGetQuery nameCase(String value) {
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
