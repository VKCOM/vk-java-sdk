package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.banUser method
 */
public class GroupsBanUserQuery extends AbstractQueryBuilder<GroupsBanUserQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param userId  value of "user id" parameter. Minimum is 0.
     */
    public GroupsBanUserQuery(VkApiClient client, UserActor actor, int groupId, int userId) {
        super(client, "groups.banUser", OkResponse.class);
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
    protected GroupsBanUserQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsBanUserQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Date (in Unix time) when the user will be removed from the blacklist.
     *
     * @param value value of "end date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsBanUserQuery endDate(Integer value) {
        return unsafeParam("end_date", value);
    }

    /**
     * Reason for ban
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsBanUserQuery reason(GroupsBanUserReason value) {
        return unsafeParam("reason", value);
    }

    /**
     * Text of comment to ban.
     *
     * @param value value of "comment" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsBanUserQuery comment(String value) {
        return unsafeParam("comment", value);
    }

    /**
     * true - text of comment will be visible to the user
     * false - text of comment will be invisible to the user (default)
     *
     * @param value value of "comment visible" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsBanUserQuery commentVisible(Boolean value) {
        return unsafeParam("comment_visible", value);
    }

    @Override
    protected GroupsBanUserQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "user_id", "access_token");
    }
}
