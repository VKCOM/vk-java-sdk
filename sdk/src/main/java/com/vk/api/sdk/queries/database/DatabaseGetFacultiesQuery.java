package com.vk.api.sdk.queries.database;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.database.responses.GetFacultiesResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Database.getFaculties method
 */
public class DatabaseGetFacultiesQuery extends AbstractQueryBuilder<DatabaseGetFacultiesQuery, GetFacultiesResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client       VK API client
     * @param actor        actor with access token
     * @param universityId value of "university id" parameter. Minimum is 0.
     */
    public DatabaseGetFacultiesQuery(VkApiClient client, UserActor actor, int universityId) {
        super(client, "database.getFaculties", GetFacultiesResponse.class);
        accessToken(actor.getAccessToken());
        universityId(universityId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client       VK API client
     * @param universityId value of "university id" parameter. Minimum is 0.
     */
    public DatabaseGetFacultiesQuery(VkApiClient client, ServiceActor actor, int universityId) {
        super(client, "database.getFaculties", GetFacultiesResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        universityId(universityId);
    }

    /**
     * University ID.
     *
     * @param value value of "university id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected DatabaseGetFacultiesQuery universityId(int value) {
        return unsafeParam("university_id", value);
    }

    /**
     * Offset needed to return a specific subset of faculties.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetFacultiesQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of faculties to return.
     *
     * @param value value of "count" parameter. Maximum is 10000. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DatabaseGetFacultiesQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected DatabaseGetFacultiesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("university_id");
    }
}
