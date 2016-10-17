package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.EditPlaceResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.editPlace method
 */
public class GroupsEditPlaceQuery extends AbstractQueryBuilder<GroupsEditPlaceQuery, EditPlaceResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsEditPlaceQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.editPlace", EditPlaceResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditPlaceQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Place title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Place address.
     *
     * @param value value of "address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery address(String value) {
        return unsafeParam("address", value);
    }

    /**
     * Country ID.
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery countryId(Integer value) {
        return unsafeParam("country_id", value);
    }

    /**
     * City ID.
     *
     * @param value value of "city id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery cityId(Integer value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Geographical latitude.
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery latitude(Float value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude.
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditPlaceQuery longitude(Float value) {
        return unsafeParam("longitude", value);
    }

    @Override
    protected GroupsEditPlaceQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
