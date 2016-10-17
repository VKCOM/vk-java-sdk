package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.Audio;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.save method
 */
public class AudioSaveQuery extends AbstractQueryBuilder<AudioSaveQuery, List<Audio>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param server value of "server" parameter.
     * @param audio  value of "audio" parameter.
     */
    public AudioSaveQuery(VkApiClient client, UserActor actor, int server, String audio) {
        super(client, "audio.save", Utils.buildParametrizedType(List.class, Audio.class));
        accessToken(actor.getAccessToken());
        server(server);
        audio(audio);
    }

    /**
     * This parameter is returned when the audio file is uploaded to the server.
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioSaveQuery server(int value) {
        return unsafeParam("server", value);
    }

    /**
     * This parameter is returned when the audio file is uploaded to the server.
     *
     * @param value value of "audio" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioSaveQuery audio(String value) {
        return unsafeParam("audio", value);
    }

    /**
     * This parameter is returned when the audio file is uploaded to the server.
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSaveQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * The name of the artist. By default, this is obtained from ID3 tags.
     *
     * @param value value of "artist" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSaveQuery artist(String value) {
        return unsafeParam("artist", value);
    }

    /**
     * The title of the audio file. By default, this is obtained from ID3 tags.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AudioSaveQuery title(String value) {
        return unsafeParam("title", value);
    }

    @Override
    protected AudioSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("server", "audio", "access_token");
    }
}
