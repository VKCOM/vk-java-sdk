package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.stories.StoriesBanOwnerQuery;
import com.vk.api.sdk.queries.stories.StoriesDelete;
import com.vk.api.sdk.queries.stories.StoriesGetBannedQuery;
import com.vk.api.sdk.queries.stories.StoriesGetByIdQuery;
import com.vk.api.sdk.queries.stories.StoriesGetPhotoUploadServer;
import com.vk.api.sdk.queries.stories.StoriesGetQuery;
import com.vk.api.sdk.queries.stories.StoriesGetRepliesQuery;
import com.vk.api.sdk.queries.stories.StoriesGetStatsQuery;
import com.vk.api.sdk.queries.stories.StoriesGetVideoUploadServer;
import com.vk.api.sdk.queries.stories.StoriesGetViewersQuery;
import com.vk.api.sdk.queries.stories.StoriesGetViewersQueryWithExtended;
import com.vk.api.sdk.queries.stories.StoriesHideAllRepliesQuery;
import com.vk.api.sdk.queries.stories.StoriesHideReplyQuery;
import com.vk.api.sdk.queries.stories.StoriesUnbanOwnerQuery;

import java.util.Arrays;
import java.util.List;

public class Stories extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Stories(VkApiClient client) {
        super(client);
    }

    public StoriesBanOwnerQuery banOwner(UserActor actor, List<Integer> ownerIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownerIds);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     */
    public StoriesBanOwnerQuery banOwner(UserActor actor, Integer... ownerIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownerIds);
    }

    /**
     * Story owner's ID. Current user id is used by default.
     */
    public StoriesDelete delete(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesDelete(getClient(), actor, ownerId, storyId);
    }

    /**
     * Story owner's ID. Current user id is used by default.
     */
    public StoriesDelete delete(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesDelete(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns list of sources hidden from current user's feed.
     */
    public StoriesGetBannedQuery getBanned(UserActor actor) {
        return new StoriesGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns story by its ID.
     */
    public StoriesGetByIdQuery getById(UserActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, Arrays.asList(stories));
    }

    /**
     * Returns story by its ID.
     */
    public StoriesGetByIdQuery getById(GroupActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, Arrays.asList(stories));
    }

    /**
     * Returns story by its ID.
     */
    public StoriesGetByIdQuery getById(UserActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     */
    public StoriesGetByIdQuery getById(GroupActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns URL for uploading a story with photo.
     */
    public StoriesGetPhotoUploadServer getPhotoUploadServer(UserActor actor) {
        return new StoriesGetPhotoUploadServer(getClient(), actor);
    }

    /**
     * Returns URL for uploading a story with photo.
     */
    public StoriesGetPhotoUploadServer getPhotoUploadServer(GroupActor actor) {
        return new StoriesGetPhotoUploadServer(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     */
    public StoriesGetQuery get(UserActor actor) {
        return new StoriesGetQuery(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     */
    public StoriesGetQuery get(GroupActor actor) {
        return new StoriesGetQuery(getClient(), actor);
    }

    /**
     * Returns replies to the story.
     */
    public StoriesGetRepliesQuery getReplies(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetRepliesQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns replies to the story.
     */
    public StoriesGetRepliesQuery getReplies(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetRepliesQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     */
    public StoriesGetStatsQuery getStats(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     */
    public StoriesGetStatsQuery getStats(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Allows to receive URL for uploading story with video.
     */
    public StoriesGetVideoUploadServer getVideoUploadServer(UserActor actor) {
        return new StoriesGetVideoUploadServer(getClient(), actor);
    }

    /**
     * Allows to receive URL for uploading story with video.
     */
    public StoriesGetVideoUploadServer getVideoUploadServer(GroupActor actor) {
        return new StoriesGetVideoUploadServer(getClient(), actor);
    }

    /**
     * Returns a list of story viewers.
     */
    public StoriesGetViewersQuery getViewers(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns a list of story viewers.
     */
    public StoriesGetViewersQuery getViewers(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns a list of story viewers with extended flag set to true
     */
    public StoriesGetViewersQueryWithExtended getViewersWithExtended(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQueryWithExtended(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns a list of story viewers with extended flag set to true
     */
    public StoriesGetViewersQueryWithExtended getViewersWithExtended(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQueryWithExtended(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     */
    public StoriesHideAllRepliesQuery hideAllReplies(UserActor actor, Integer ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     */
    public StoriesHideAllRepliesQuery hideAllReplies(GroupActor actor, Integer ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides the reply to the current user's story.
     */
    public StoriesHideReplyQuery hideReply(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides the reply to the current user's story.
     */
    public StoriesHideReplyQuery hideReply(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     */
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, List<Integer> userIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, userIds);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     */
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, Integer... userIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, Arrays.asList(userIds));
    }
}
