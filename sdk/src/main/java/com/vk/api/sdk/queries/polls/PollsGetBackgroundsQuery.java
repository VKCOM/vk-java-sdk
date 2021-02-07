package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.polls.responses.GetBackgroundsResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.getBackgrounds method
 */
public class PollsGetBackgroundsQuery extends AbstractQueryBuilder<PollsGetBackgroundsQuery, List<GetBackgroundsResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PollsGetBackgroundsQuery(VkApiClient client, UserActor actor) {
        super(client, "polls.getBackgrounds", Utils.buildParametrizedType(List.class, GetBackgroundsResponse.class));
        accessToken(actor.getAccessToken());
    }

    @Override
    protected PollsGetBackgroundsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
