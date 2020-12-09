package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetTagListResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getTagList method
 */
public class GroupsGetTagListQuery extends AbstractQueryBuilder<GroupsGetTagListQuery, List<GetTagListResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetTagListQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.getTagList", Utils.buildParametrizedType(List.class, GetTagListResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetTagListQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected GroupsGetTagListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
