package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetChairsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getChairs method
 */
public class DatabaseGetChairsQuery extends AbstractQueryBuilder<DatabaseGetChairsQuery, GetChairsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param facultyId value of "faculty id" parameter. Minimum is 0.
     */
    public DatabaseGetChairsQuery(VkApiClient client, UserActor actor, int facultyId) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
        facultyId(facultyId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param facultyId value of "faculty id" parameter. Minimum is 0.
     */
    public DatabaseGetChairsQuery(VkApiClient client, ServiceActor actor, int facultyId) {
        super(client, "database.getChairs", GetChairsResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        facultyId(facultyId);
    }

    /**
     * Id of the faculty to get chairs from
     *
     * @param value value of "faculty id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetChairsQuery facultyId(int value) {
        return unsafeParam("faculty_id", value);
    }

    /**
     * Offset required to get a certain subset of chairs
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetChairsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Amount of chairs to get
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetChairsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetChairsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("faculty_id");
    }
}
