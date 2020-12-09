package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.tagUpdate method
 */
public class GroupsTagUpdateQuery extends AbstractQueryBuilder<GroupsTagUpdateQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param tagId value of "tag id" parameter. Minimum is 0.
     * @param tagName value of "tag name" parameter.
     */
    public GroupsTagUpdateQuery(VkApiClient client, UserActor actor, int groupId, int tagId,
            String tagName) {
        super(client, "groups.tagUpdate", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        tagId(tagId);
        tagName(tagName);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagUpdateQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set tag id
     *
     * @param value value of "tag id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagUpdateQuery tagId(int value) {
        return unsafeParam("tag_id", value);
    }

    /**
     * Set tag name
     *
     * @param value value of "tag name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagUpdateQuery tagName(String value) {
        return unsafeParam("tag_name", value);
    }

    @Override
    protected GroupsTagUpdateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "tag_id", "access_token", "tag_name");
    }
}
