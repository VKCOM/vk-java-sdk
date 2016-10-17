package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.responses.GetCatalogInfoResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getCatalogInfo method
 */
public class GroupsGetCatalogInfoQuery extends AbstractQueryBuilder<GroupsGetCatalogInfoQuery, GetCatalogInfoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public GroupsGetCatalogInfoQuery(VkApiClient client, UserActor actor) {
        super(client, "groups.getCatalogInfo", GetCatalogInfoResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected GroupsGetCatalogInfoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
