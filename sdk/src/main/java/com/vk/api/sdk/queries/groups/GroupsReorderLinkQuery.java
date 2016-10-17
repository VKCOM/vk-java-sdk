package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.reorderLink method
 */
public class GroupsReorderLinkQuery extends AbstractQueryBuilder<GroupsReorderLinkQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param linkId  value of "link id" parameter. Minimum is 0.
     */
    public GroupsReorderLinkQuery(VkApiClient client, UserActor actor, int groupId, int linkId) {
        super(client, "groups.reorderLink", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        linkId(linkId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsReorderLinkQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Link ID.
     *
     * @param value value of "link id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsReorderLinkQuery linkId(int value) {
        return unsafeParam("link_id", value);
    }

    /**
     * ID of the link after which to place the link with "link_id".
     *
     * @param value value of "after" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsReorderLinkQuery after(Integer value) {
        return unsafeParam("after", value);
    }

    @Override
    protected GroupsReorderLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "link_id", "access_token");
    }
}
