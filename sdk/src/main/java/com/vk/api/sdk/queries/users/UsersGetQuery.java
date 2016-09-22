package com.vk.api.sdk.queries.users;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.users.UserXtrCounters;

import java.util.Collections;
import java.util.List;

/**
 * Query for Users.get method
 */
public class UsersGetQuery extends AbstractQueryBuilder<UsersGetQuery, List<UserXtrCounters>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public UsersGetQuery(VkApiClient client, Actor actor) {
        super(client, "users.get", Utils.buildParametrizedType(List.class, UserXtrCounters.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public UsersGetQuery(VkApiClient client) {
        super(client, "users.get", Utils.buildParametrizedType(List.class, UserXtrCounters.class));
    }

    /**
     * User IDs or screen names ("screen_name"). By default, current user ID.
     *
     * @param value value of "user ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetQuery userIds(String... value) {
        return unsafeParam("user_ids", value);
    }

    /**
     * Profile fields to return. Sample values: ''nickname'', ''screen_name'', ''sex'', ''bdate'' (birthdate), ''city'', ''country'', ''timezone'', ''photo'', ''photo_medium'', ''photo_big'', ''has_mobile'', ''contacts'', ''education'', ''online'', ''counters'', ''relation'', ''last_seen'', ''activity'', ''can_write_private_message'', ''can_see_all_posts'', ''can_post'', ''universities''
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public UsersGetQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected UsersGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
