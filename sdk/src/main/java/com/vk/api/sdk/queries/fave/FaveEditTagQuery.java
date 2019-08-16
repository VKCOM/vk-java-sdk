package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.editTag method
 */
public class FaveEditTagQuery extends AbstractQueryBuilder<FaveEditTagQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param id value of "id" parameter.
     * @param name value of "name" parameter.
     */
    public FaveEditTagQuery(VkApiClient client, UserActor actor, int id, String name) {
        super(client, "fave.editTag", OkResponse.class);
        accessToken(actor.getAccessToken());
        id(id);
        name(name);
    }

    /**
     * Set id
     *
     * @param value value of "id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveEditTagQuery id(int value) {
        return unsafeParam("id", value);
    }

    /**
     * Set name
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected FaveEditTagQuery name(String value) {
        return unsafeParam("name", value);
    }

    @Override
    protected FaveEditTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("id", "name", "access_token");
    }
}
