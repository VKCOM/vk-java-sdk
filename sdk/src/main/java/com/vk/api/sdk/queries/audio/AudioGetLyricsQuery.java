package com.vk.api.sdk.queries.audio;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.audio.Lyrics;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Audio.getLyrics method
 */
public class AudioGetLyricsQuery extends AbstractQueryBuilder<AudioGetLyricsQuery, Lyrics> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param lyricsId value of "lyrics id" parameter.
     */
    public AudioGetLyricsQuery(VkApiClient client, UserActor actor, int lyricsId) {
        super(client, "audio.getLyrics", Lyrics.class);
        accessToken(actor.getAccessToken());
        lyricsId(lyricsId);
    }

    /**
     * Lyrics ID (which can be obtained with the audio.get]], audio.getById, or [[audio.search method).
     *
     * @param value value of "lyrics id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AudioGetLyricsQuery lyricsId(int value) {
        return unsafeParam("lyrics_id", value);
    }

    @Override
    protected AudioGetLyricsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("lyrics_id", "access_token");
    }
}
