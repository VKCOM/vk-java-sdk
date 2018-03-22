package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

public class StoriesBanOwnerQuery extends AbstractQueryBuilder<StoriesBanOwnerQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  User actor with access token
     * @param ownerIds    List of ids
     */
    public StoriesBanOwnerQuery(VkApiClient client, UserActor actor, List<Integer> ownerIds) {
        super(client, "stories.banOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownersIds(ownerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  User actor with access token
     * @param ownerIds    List of ids
     */
    public StoriesBanOwnerQuery(VkApiClient client, UserActor actor, Integer... ownerIds) {
        super(client, "stories.banOwner", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownersIds(Arrays.asList(ownerIds));
    }

    protected StoriesBanOwnerQuery ownersIds(List<Integer> value) {
        return unsafeParam("owners_ids", value);
    }

    @Override
    protected StoriesBanOwnerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "owners_ids");
    }
}
