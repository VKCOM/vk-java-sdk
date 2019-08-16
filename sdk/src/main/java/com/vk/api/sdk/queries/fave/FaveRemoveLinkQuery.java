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
     * @param actor actor with access token
     */
    public FaveRemoveLinkQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.removeLink", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Link ID (can be obtained by [vk.com/dev/faves.getLinks|faves.getLinks] method).
     *
     * @param value value of "link id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveRemoveLinkQuery linkId(String value) {
        return unsafeParam("link_id", value);
    }

    /**
     * Link URL
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveRemoveLinkQuery link(String value) {
        return unsafeParam("link", value);
    }

    @Override
    protected FaveRemoveLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
