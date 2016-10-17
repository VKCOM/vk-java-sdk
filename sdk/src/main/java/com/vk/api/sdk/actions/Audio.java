package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.audio.AudioAddAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioAddQuery;
import com.vk.api.sdk.queries.audio.AudioDeleteAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioDeleteQuery;
import com.vk.api.sdk.queries.audio.AudioEditAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioEditQuery;
import com.vk.api.sdk.queries.audio.AudioGetAlbumsQuery;
import com.vk.api.sdk.queries.audio.AudioGetBroadcastListQuery;
import com.vk.api.sdk.queries.audio.AudioGetByIdQuery;
import com.vk.api.sdk.queries.audio.AudioGetCountQuery;
import com.vk.api.sdk.queries.audio.AudioGetLyricsQuery;
import com.vk.api.sdk.queries.audio.AudioGetPopularQuery;
import com.vk.api.sdk.queries.audio.AudioGetQuery;
import com.vk.api.sdk.queries.audio.AudioGetRecommendationsQuery;
import com.vk.api.sdk.queries.audio.AudioGetUploadServerQuery;
import com.vk.api.sdk.queries.audio.AudioMoveToAlbumQuery;
import com.vk.api.sdk.queries.audio.AudioReorderQuery;
import com.vk.api.sdk.queries.audio.AudioRestoreQuery;
import com.vk.api.sdk.queries.audio.AudioSaveQuery;
import com.vk.api.sdk.queries.audio.AudioSearchQuery;
import com.vk.api.sdk.queries.audio.AudioSetBroadcastQuery;

import java.util.List;

/**
 * List of Audio methods
 */
public class Audio extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Audio(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of audio files of a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetQuery get(UserActor actor) {
        return new AudioGetQuery(getClient(), actor);
    }

    /**
     * Returns information about audio files by their IDs.
     *
     * @param actor  vk actor
     * @param audios adios
     * @return query
     */
    public AudioGetByIdQuery getById(UserActor actor, String... audios) {
        return new AudioGetByIdQuery(getClient(), actor, audios);
    }

    /**
     * Returns information about audio files by their IDs.
     *
     * @param actor  vk actor
     * @param audios adios
     * @return query
     */
    public AudioGetByIdQuery getById(UserActor actor, List<String> audios) {
        return new AudioGetByIdQuery(getClient(), actor, audios);
    }

    /**
     * Returns lyrics associated with an audio file.
     *
     * @param actor    vk actor
     * @param lyricsId lyrics id
     * @return query
     */
    public AudioGetLyricsQuery getLyrics(UserActor actor, int lyricsId) {
        return new AudioGetLyricsQuery(getClient(), actor, lyricsId);
    }

    /**
     * Returns a list of audio files.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioSearchQuery search(UserActor actor) {
        return new AudioSearchQuery(getClient(), actor);
    }

    /**
     * Returns the server address to upload audio files.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetUploadServerQuery getUploadServer(UserActor actor) {
        return new AudioGetUploadServerQuery(getClient(), actor);
    }

    /**
     * Saves audio files after successful uploading.
     *
     * @param actor  vk actor
     * @param server server
     * @param audio  audio
     * @return query
     */
    public AudioSaveQuery save(UserActor actor, int server, String audio) {
        return new AudioSaveQuery(getClient(), actor, server, audio);
    }

    /**
     * Copies an audio file to a user page or community page.
     *
     * @param actor   vk actor
     * @param audioId audio id
     * @param ownerId owner id
     * @return query
     */
    public AudioAddQuery add(UserActor actor, int audioId, int ownerId) {
        return new AudioAddQuery(getClient(), actor, audioId, ownerId);
    }

    /**
     * Deletes an audio file from a user page or community page.
     *
     * @param actor   vk actor
     * @param audioId audio id
     * @param ownerId owner id
     * @return query
     */
    public AudioDeleteQuery delete(UserActor actor, int audioId, int ownerId) {
        return new AudioDeleteQuery(getClient(), actor, audioId, ownerId);
    }

    /**
     * Edits an audio file on a user or community page.
     *
     * @param actor   vk actor
     * @param ownerId owner id
     * @param audioId audio id
     * @return query
     */
    public AudioEditQuery edit(UserActor actor, int ownerId, int audioId) {
        return new AudioEditQuery(getClient(), actor, ownerId, audioId);
    }

    /**
     * Reorders an audio file, placing it between other specified audio files.
     *
     * @param actor   vk actor
     * @param audioId audio id
     * @return query
     */
    public AudioReorderQuery reorder(UserActor actor, int audioId) {
        return new AudioReorderQuery(getClient(), actor, audioId);
    }

    /**
     * Restores a deleted audio file.
     *
     * @param actor   vk actor
     * @param audioId audio id
     * @return query
     */
    public AudioRestoreQuery restore(UserActor actor, int audioId) {
        return new AudioRestoreQuery(getClient(), actor, audioId);
    }

    /**
     * Returns a list of audio albums of a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetAlbumsQuery getAlbums(UserActor actor) {
        return new AudioGetAlbumsQuery(getClient(), actor);
    }

    /**
     * Creates an empty audio album.
     *
     * @param actor vk actor
     * @param title album title
     * @return query
     */
    public AudioAddAlbumQuery addAlbum(UserActor actor, String title) {
        return new AudioAddAlbumQuery(getClient(), actor, title);
    }

    /**
     * Edits the title of an audio album.
     *
     * @param actor   vk actor
     * @param albumId album id
     * @param title   album title
     * @return query
     */
    public AudioEditAlbumQuery editAlbum(UserActor actor, int albumId, String title) {
        return new AudioEditAlbumQuery(getClient(), actor, albumId, title);
    }

    /**
     * Deletes an audio album.
     *
     * @param actor   vk actor
     * @param albumId albumd id
     * @return query
     */
    public AudioDeleteAlbumQuery deleteAlbum(UserActor actor, int albumId) {
        return new AudioDeleteAlbumQuery(getClient(), actor, albumId);
    }

    /**
     * Moves audio files to an album.
     *
     * @param actor    vk actor
     * @param audioIds audio ids
     * @return query
     */
    public AudioMoveToAlbumQuery moveToAlbum(UserActor actor, int... audioIds) {
        return new AudioMoveToAlbumQuery(getClient(), actor, audioIds);
    }

    /**
     * Moves audio files to an album.
     *
     * @param actor    vk actor
     * @param audioIds audio ids
     * @return query
     */
    public AudioMoveToAlbumQuery moveToAlbum(UserActor actor, List<Integer> audioIds) {
        return new AudioMoveToAlbumQuery(getClient(), actor, audioIds);
    }

    /**
     * Activates an audio broadcast to the status of a user or community.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioSetBroadcastQuery setBroadcast(UserActor actor) {
        return new AudioSetBroadcastQuery(getClient(), actor);
    }

    /**
     * Returns a list of the user's friends and communities that are broadcasting music in their statuses.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetBroadcastListQuery getBroadcastList(UserActor actor) {
        return new AudioGetBroadcastListQuery(getClient(), actor);
    }

    /**
     * Returns a list of suggested audio files based on a user's playlist or a particular audio file.
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetRecommendationsQuery getRecommendations(UserActor actor) {
        return new AudioGetRecommendationsQuery(getClient(), actor);
    }

    /**
     * Returns a list of audio files from the "Popular".
     *
     * @param actor vk actor
     * @return query
     */
    public AudioGetPopularQuery getPopular(UserActor actor) {
        return new AudioGetPopularQuery(getClient(), actor);
    }

    /**
     * Returns the total number of audio files on a user or community page.
     *
     * @param actor   vk actor
     * @param ownerId owner id
     * @return query
     */
    public AudioGetCountQuery getCount(UserActor actor, int ownerId) {
        return new AudioGetCountQuery(getClient(), actor, ownerId);
    }
}
