package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.removeLink method
 */
public class FaveRemoveLinkQuery extends AbstractQueryBuilder<FaveRemoveLinkQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param linkId value of "link id" parameter.
     */
    public FaveRemoveLinkQuery(VkApiClient client, UserActor actor, String linkId) {
        super(client, "fave.removeLink", OkResponse.class);
        accessToken(actor.getAccessToken());
        linkId(linkId);
    }

    /**
     * Set link id
     *
     * @param value value of "link id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveRemoveLinkQuery linkId(String value) {
        return unsafeParam("link_id", value);
    }

    @Override
    protected FaveRemoveLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link_id", "access_token");
    }
}
