package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import com.vk.api.sdk.objects.enums.GroupsAct;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.tagBind method
 */
public class GroupsTagBindQuery extends AbstractQueryBuilder<GroupsTagBindQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param tagId value of "tag id" parameter. Minimum is 0.
     * @param userId value of "user id" parameter. Minimum is 0.
     * @param act value of "act" parameter.
     */
    public GroupsTagBindQuery(VkApiClient client, UserActor actor, int groupId, int tagId,
            int userId, GroupsAct act) {
        super(client, "groups.tagBind", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        tagId(tagId);
        userId(userId);
        act(act);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagBindQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set tag id
     *
     * @param value value of "tag id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagBindQuery tagId(int value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagBindQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Describe the action
     *
     * @param value value of "act" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagBindQuery act(GroupsAct value) {
        return unsafeParam("act", value);
    }

    @Override
    protected GroupsTagBindQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "tag_id", "user_id", "act", "access_token");
    }
}
