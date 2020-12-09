package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetMusiciansResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getMusicians method
 */
public class AdsGetMusiciansQuery extends AbstractQueryBuilder<AdsGetMusiciansQuery, GetMusiciansResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param artistName value of "artist name" parameter.
     */
    public AdsGetMusiciansQuery(VkApiClient client, UserActor actor, String artistName) {
        super(client, "ads.getMusicians", GetMusiciansResponse.class);
        accessToken(actor.getAccessToken());
        artistName(artistName);
    }

    /**
     * Set artist name
     *
     * @param value value of "artist name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetMusiciansQuery artistName(String value) {
        return unsafeParam("artist_name", value);
    }

    @Override
    protected AdsGetMusiciansQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("artist_name", "access_token");
    }
}
