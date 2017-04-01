package com.vk.api.sdk.queries.database;

import com.google.gson.JsonObject;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Collections;
import java.util.List;

/**
 * Query for Database.getSchoolClasses method
 */
public class DatabaseGetSchoolClassesQuery extends AbstractQueryBuilder<DatabaseGetSchoolClassesQuery, List<List<JsonObject>>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public DatabaseGetSchoolClassesQuery(VkApiClient client, UserActor actor) {
        super(client, "database.getSchoolClasses", Utils.buildParametrizedType(List.class, Utils.buildParametrizedType(List.class, JsonObject.class)));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public DatabaseGetSchoolClassesQuery(VkApiClient client, ServiceActor actor) {
        super(client, "database.getSchoolClasses", Utils.buildParametrizedType(List.class, Utils.buildParametrizedType(List.class, JsonObject.class)));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * Country ID.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetSchoolClassesQuery countryId(Integer value) {
        return unsafeParam("country_id", value);
    }

    @Override
    protected DatabaseGetSchoolClassesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
