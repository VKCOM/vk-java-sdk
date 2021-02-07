package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.tagDelete method
 */
public class GroupsTagDeleteQuery extends AbstractQueryBuilder<GroupsTagDeleteQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param tagId value of "tag id" parameter. Minimum is 0.
     */
    public GroupsTagDeleteQuery(VkApiClient client, UserActor actor, int groupId, int tagId) {
        super(client, "groups.tagDelete", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        tagId(tagId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagDeleteQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set tag id
     *
     * @param value value of "tag id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagDeleteQuery tagId(int value) {
        return unsafeParam("tag_id", value);
    }

    @Override
    protected GroupsTagDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "tag_id", "access_token");
    }
}
