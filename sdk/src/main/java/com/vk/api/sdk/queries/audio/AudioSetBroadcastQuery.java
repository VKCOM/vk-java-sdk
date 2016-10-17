package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.setBroadcast method
 */
public class AudioSetBroadcastQuery extends AbstractQueryBuilder<AudioSetBroadcastQuery, List<Integer>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AudioSetBroadcastQuery(VkApiClient client, UserActor actor) {
        super(client, "audio.setBroadcast", Utils.buildParametrizedType(List.class, Integer.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the audio file to be shown in status (e.g., "1_190442705").
     * If the parameter is not set, the audio status of given communities and user will be deleted.
     *
     * @param value value of "audio" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSetBroadcastQuery audio(String value) {
        return unsafeParam("audio", value);
    }

    /**
     * IDs of communities and user whose statuses will be included in the broadcast.
     * Use a negative value to designate a community ID. By default, current user ID.
     *
     * @param value value of "target ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSetBroadcastQuery targetIds(Integer... value) {
        return unsafeParam("target_ids", value);
    }

    /**
     * IDs of communities and user whose statuses will be included in the broadcast.
     * Use a negative value to designate a community ID. By default, current user ID.
     *
     * @param value value of "target ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSetBroadcastQuery targetIds(List<Integer> value) {
        return unsafeParam("target_ids", value);
    }

    @Override
    protected AudioSetBroadcastQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
