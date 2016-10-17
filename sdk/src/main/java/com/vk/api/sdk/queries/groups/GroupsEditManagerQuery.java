package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.editManager method
 */
public class GroupsEditManagerQuery extends AbstractQueryBuilder<GroupsEditManagerQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param userId  value of "user id" parameter. Minimum is 0.
     */
    public GroupsEditManagerQuery(VkApiClient client, UserActor actor, int groupId, int userId) {
        super(client, "groups.editManager", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditManagerQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditManagerQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Manager role.
     *
     * @param value value of "role" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditManagerQuery role(GroupsEditManagerRole value) {
        return unsafeParam("role", value);
    }

    /**
     * Show the manager in Contacts block of the community.
     *
     * @param value value of "is contact" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditManagerQuery isContact(Boolean value) {
        return unsafeParam("is_contact", value);
    }

    /**
     * Position to show in Contacts block.
     *
     * @param value value of "contact position" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditManagerQuery contactPosition(String value) {
        return unsafeParam("contact_position", value);
    }

    /**
     * Contact phone.
     *
     * @param value value of "contact phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditManagerQuery contactPhone(String value) {
        return unsafeParam("contact_phone", value);
    }

    /**
     * Contact e-mail.
     *
     * @param value value of "contact email" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditManagerQuery contactEmail(String value) {
        return unsafeParam("contact_email", value);
    }

    @Override
    protected GroupsEditManagerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
