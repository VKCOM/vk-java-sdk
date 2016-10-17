package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.users.UserBroadcast;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getBroadcastList method
 */
public class AudioGetBroadcastListQuery extends AbstractQueryBuilder<AudioGetBroadcastListQuery, List<UserBroadcast>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioGetBroadcastListQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.getBroadcastList", Utils.buildParametrizedType(List.class, UserBroadcast.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Types of objects to return
     *
     * @param value value of "filter" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetBroadcastListQuery filter(AudioGetBroadcastListFilter value) {
        return unsafeParam("filter", value);
    }

    /**
     * Return only friends and communities that are broadcasting at the moment.
     *
     * @param value value of "active" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioGetBroadcastListQuery active(Boolean value) {
        return unsafeParam("active", value);
    }

    @Override
    protected AudioGetBroadcastListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
