package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.GroupLink;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.addLink method
 */
public class GroupsAddLinkQuery extends AbstractQueryBuilder<GroupsAddLinkQuery, GroupLink> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param link    value of "link" parameter.
     */
    public GroupsAddLinkQuery(VkApiClient client, UserActor actor, int groupId, String link) {
        super(client, "groups.addLink", GroupLink.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        link(link);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddLinkQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * LInk URL.
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsAddLinkQuery link(String value) {
        return unsafeParam("link", value);
    }

    /**
     * Description text for the link.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsAddLinkQuery text(String value) {
        return unsafeParam("text", value);
    }

    @Override
    protected GroupsAddLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "link", "access_token");
    }
}
