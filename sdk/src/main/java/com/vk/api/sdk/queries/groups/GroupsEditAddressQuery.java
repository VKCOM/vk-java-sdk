package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.GroupsWorkInfoStatus;
import com.vk.api.sdk.objects.groups.responses.EditAddressResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.editAddress method
 */
public class GroupsEditAddressQuery extends AbstractQueryBuilder<GroupsEditAddressQuery, EditAddressResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param addressId value of "address id" parameter. Minimum is 0.
     */
    public GroupsEditAddressQuery(VkApiClient client, UserActor actor, int groupId, int addressId) {
        super(client, "groups.editAddress", EditAddressResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        addressId(addressId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param addressId value of "address id" parameter. Minimum is 0.
     */
    public GroupsEditAddressQuery(VkApiClient client, GroupActor actor, int groupId,
            int addressId) {
        super(client, "groups.editAddress", EditAddressResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
        addressId(addressId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditAddressQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set address id
     *
     * @param value value of "address id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditAddressQuery addressId(int value) {
        return unsafeParam("address_id", value);
    }

    /**
     * Set title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set address
     *
     * @param value value of "address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery address(String value) {
        return unsafeParam("address", value);
    }

    /**
     * Set additional address
     *
     * @param value value of "additional address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery additionalAddress(String value) {
        return unsafeParam("additional_address", value);
    }

    /**
     * Set country id
     *
     * @param value value of "country id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery countryId(Integer value) {
        return unsafeParam("country_id", value);
    }

    /**
     * Set city id
     *
     * @param value value of "city id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery cityId(Integer value) {
        return unsafeParam("city_id", value);
    }

    /**
     * Set metro id
     *
     * @param value value of "metro id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery metroId(Integer value) {
        return unsafeParam("metro_id", value);
    }

    /**
     * Set latitude
     *
     * @param value value of "latitude" parameter. Maximum is 90. Minimum is -90.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery latitude(Number value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Set longitude
     *
     * @param value value of "longitude" parameter. Maximum is 180. Minimum is -180.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery longitude(Number value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Set phone
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * Set work info status
     *
     * @param value value of "work info status" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery workInfoStatus(GroupsWorkInfoStatus value) {
        return unsafeParam("work_info_status", value);
    }

    /**
     * Set timetable
     *
     * @param value value of "timetable" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery timetable(String value) {
        return unsafeParam("timetable", value);
    }

    /**
     * Set is main address
     *
     * @param value value of "is main address" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditAddressQuery isMainAddress(Boolean value) {
        return unsafeParam("is_main_address", value);
    }

    @Override
    protected GroupsEditAddressQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token", "address_id");
    }
}
