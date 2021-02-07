package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.FavePosition;
import com.vk.api.sdk.objects.fave.responses.AddTagResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.addTag method
 */
public class FaveAddTagQuery extends AbstractQueryBuilder<FaveAddTagQuery, AddTagResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveAddTagQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.addTag", AddTagResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set name
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveAddTagQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Set position
     *
     * @param value value of "position" parameter. By default back.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveAddTagQuery position(FavePosition value) {
        return unsafeParam("position", value);
    }

    @Override
    protected FaveAddTagQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
