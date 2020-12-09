package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.setUserNote method
 */
public class GroupsSetUserNoteQuery extends AbstractQueryBuilder<GroupsSetUserNoteQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param userId value of "user id" parameter. Minimum is 0.
     */
    public GroupsSetUserNoteQuery(VkApiClient client, UserActor actor, int groupId, int userId) {
        super(client, "groups.setUserNote", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        userId(userId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetUserNoteQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsSetUserNoteQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Note body
     *
     * @param value value of "note" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsSetUserNoteQuery note(String value) {
        return unsafeParam("note", value);
    }

    @Override
    protected GroupsSetUserNoteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
