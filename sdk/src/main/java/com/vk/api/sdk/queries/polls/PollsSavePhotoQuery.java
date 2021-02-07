package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.polls.responses.SavePhotoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.savePhoto method
 */
public class PollsSavePhotoQuery extends AbstractQueryBuilder<PollsSavePhotoQuery, SavePhotoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photo value of "photo" parameter.
     * @param hash value of "hash" parameter.
     */
    public PollsSavePhotoQuery(VkApiClient client, UserActor actor, String photo, String hash) {
        super(client, "polls.savePhoto", SavePhotoResponse.class);
        accessToken(actor.getAccessToken());
        photo(photo);
        hash(hash);
    }

    /**
     * Set photo
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsSavePhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsSavePhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected PollsSavePhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "hash", "access_token");
    }
}
