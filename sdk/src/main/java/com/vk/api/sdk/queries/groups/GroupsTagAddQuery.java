package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import com.vk.api.sdk.objects.enums.GroupsTagColor;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.tagAdd method
 */
public class GroupsTagAddQuery extends AbstractQueryBuilder<GroupsTagAddQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param tagName value of "tag name" parameter.
     */
    public GroupsTagAddQuery(VkApiClient client, UserActor actor, int groupId, String tagName) {
        super(client, "groups.tagAdd", BoolResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        tagName(tagName);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagAddQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set tag name
     *
     * @param value value of "tag name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsTagAddQuery tagName(String value) {
        return unsafeParam("tag_name", value);
    }

    /**
     * Set tag color
     *
     * @param value value of "tag color" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsTagAddQuery tagColor(GroupsTagColor value) {
        return unsafeParam("tag_color", value);
    }

    @Override
    protected GroupsTagAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token", "tag_name");
    }
}
