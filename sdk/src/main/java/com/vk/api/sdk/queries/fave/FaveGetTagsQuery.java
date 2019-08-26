package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetTagsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getTags method
 */
public class FaveGetTagsQuery extends AbstractQueryBuilder<FaveGetTagsQuery, GetTagsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetTagsQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getTags", GetTagsResponse.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected FaveGetTagsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
