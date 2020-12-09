package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.GroupsWorkInfoStatus;
import com.vk.api.sdk.objects.groups.responses.AddAddressResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.addAddress method
 */
public class GroupsAddAddressQuery extends AbstractQueryBuilder<GroupsAddAddressQuery, AddAddressResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param title value of "title" parameter.
     * @param address value of "address" parameter.
     * @param countryId value of "country id" parameter. Minimum is 1.
     * @param cityId value of "city id" parameter. Minimum is 1.
     * @param latitude value of "latitude" parameter. Maximum is 90. Minimum is -90.
     * @param longitude value of "longitude" parameter. Maximum is 180. Minimum is -180.
     */
    public GroupsAddAddressQuery(VkApiClient client, UserActor actor, int groupId, String title,
            String address, int countryId, int cityId, double latitude, double longitude) {
        super(client, "groups.addAddress", AddAddressResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        title(title);
        address(address);
        countryId(countryId);
        cityId(cityId);
        latitude(latitude);
        longitude(longitude);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param title value of "title" parameter.
     * @param address value of "address" parameter.
     * @param countryId value of "country id" parameter. Minimum is 1.
     * @param cityId value of "city id" parameter. Minimum is 1.
     * @param latitude value of "latitude" parameter. Maximum is 90. Minimum is -90.
     * @param longitude value of "longitude" parameter. Maximum is 180. Minimum is -180.
     */
    public GroupsAddAddressQuery(VkApiClient client, GroupActor actor, int groupId, String title,
            String address, int countryId, int cityId, double latitude, double longitude) {
        super(client, "groups.addAddress", AddAddressResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        title(title);
        address(address);
        countryId(countryId);
        cityId(cityId);
        latitude(latitude);
        longitude(longitude);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set address
     *
     * @param value value of "address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery address(String value) {
        return unsafeParam("address", value);
    }

    /**
     * Set additional address
     *
     * @param value value of "additional address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery additionalAddress(String value) {
        return unsafeParam("additional_address", value);
    }

    /**
     * Set country id
     *
     * @param value value of "country id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery countryId(int value) {
        return unsafeParam("country_id", value);
    }

    /**
     * Set city id
     *
     * @param value value of "city id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery cityId(int value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Set metro id
     *
     * @param value value of "metro id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery metroId(Integer value) {
        return unsafeParam("metro_id", value);
    }

    /**
     * Set latitude
     *
     * @param value value of "latitude" parameter. Maximum is 90. Minimum is -90.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery latitude(double value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Set longitude
     *
     * @param value value of "longitude" parameter. Maximum is 180. Minimum is -180.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddAddressQuery longitude(double value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Set phone
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * Set work info status
     *
     * @param value value of "work info status" parameter. By default no_information.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery workInfoStatus(GroupsWorkInfoStatus value) {
        return unsafeParam("work_info_status", value);
    }

    /**
     * Set timetable
     *
     * @param value value of "timetable" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery timetable(String value) {
        return unsafeParam("timetable", value);
    }

    /**
     * Set is main address
     *
     * @param value value of "is main address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddAddressQuery isMainAddress(Boolean value) {
        return unsafeParam("is_main_address", value);
    }

    @Override
    protected GroupsAddAddressQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("address", "group_id", "city_id", "longitude", "country_id", "title", "latitude", "access_token");
    }
}
