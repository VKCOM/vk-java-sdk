package com.vk.api.sdk.queries.fave;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.fave.responses.GetPhotosResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Fave.getPhotos method
 */
public class FaveGetPhotosQuery extends AbstractQueryBuilder<FaveGetPhotosQuery, GetPhotosResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public FaveGetPhotosQuery(VkApiClient client, UserActor actor) {
        super(client, "fave.getPhotos", GetPhotosResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Offset needed to return a specific subset of photos.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPhotosQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of photos to return.
     *
     * @param value value of "count" parameter. Minimum is 0. By default 50.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FaveGetPhotosQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected FaveGetPhotosQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
