package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.stories.StoriesBanOwnerQuery;
import com.vk.api.sdk.queries.stories.StoriesDeleteQuery;
import com.vk.api.sdk.queries.stories.StoriesGetBannedQuery;
import com.vk.api.sdk.queries.stories.StoriesGetBannedQueryWithExtended;
import com.vk.api.sdk.queries.stories.StoriesGetByIdQuery;
import com.vk.api.sdk.queries.stories.StoriesGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.stories.StoriesGetPhotoUploadServerQuery;
import com.vk.api.sdk.queries.stories.StoriesGetQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesGetRepliesQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesGetStatsQuery;
import com.vk.api.sdk.queries.stories.StoriesGetVideoUploadServerQuery;
import com.vk.api.sdk.queries.stories.StoriesGetViewersQueryWithExtendedV5115;
import com.vk.api.sdk.queries.stories.StoriesHideAllRepliesQuery;
import com.vk.api.sdk.queries.stories.StoriesHideReplyQuery;
import com.vk.api.sdk.queries.stories.StoriesSaveQuery;
import com.vk.api.sdk.queries.stories.StoriesSearchQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesSendInteractionQuery;
import com.vk.api.sdk.queries.stories.StoriesUnbanOwnerQuery;
import java.util.List;

/**
 * List of Stories methods
 */
public class Stories extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Stories(VkApiClient client) {
        super(client);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     *
     * @param actor vk actor
     * @param ownersIds List of sources IDs
     * @return query
     */
    public StoriesBanOwnerQuery banOwner(UserActor actor, Integer... ownersIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     *
     * @param actor vk actor
     * @param ownersIds List of sources IDs
     * @return query
     */
    public StoriesBanOwnerQuery banOwner(UserActor actor, List<Integer> ownersIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to delete story.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesDeleteQuery delete(UserActor actor) {
        return new StoriesDeleteQuery(getClient(), actor);
    }

    /**
     * Allows to delete story.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesDeleteQuery delete(GroupActor actor) {
        return new StoriesDeleteQuery(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetQueryWithV5113 getV5113(UserActor actor) {
        return new StoriesGetQueryWithV5113(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetQueryWithV5113 getV5113(GroupActor actor) {
        return new StoriesGetQueryWithV5113(getClient(), actor);
    }

    /**
     * Returns list of sources hidden from current user's feed.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetBannedQuery getBanned(UserActor actor) {
        return new StoriesGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns list of sources hidden from current user's feed.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetBannedQueryWithExtended getBannedExtended(UserActor actor) {
        return new StoriesGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQuery getById(UserActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQuery getById(UserActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQuery getById(GroupActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQuery getById(GroupActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQueryWithExtended getByIdExtended(GroupActor actor, String... stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    public StoriesGetByIdQueryWithExtended getByIdExtended(GroupActor actor, List<String> stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns URL for uploading a story with photo.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetPhotoUploadServerQuery getPhotoUploadServer(UserActor actor) {
        return new StoriesGetPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns URL for uploading a story with photo.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetPhotoUploadServerQuery getPhotoUploadServer(GroupActor actor) {
        return new StoriesGetPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns replies to the story.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetRepliesQueryWithV5113 getRepliesV5113(UserActor actor, int ownerId,
            int storyId) {
        return new StoriesGetRepliesQueryWithV5113(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns replies to the story.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetRepliesQueryWithV5113 getRepliesV5113(GroupActor actor, int ownerId,
            int storyId) {
        return new StoriesGetRepliesQueryWithV5113(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID. 
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetStatsQuery getStats(UserActor actor, int ownerId, int storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID. 
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetStatsQuery getStats(GroupActor actor, int ownerId, int storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Allows to receive URL for uploading story with video.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetVideoUploadServerQuery getVideoUploadServer(UserActor actor) {
        return new StoriesGetVideoUploadServerQuery(getClient(), actor);
    }

    /**
     * Allows to receive URL for uploading story with video.
     *
     * @param actor vk actor
     * @return query
     */
    public StoriesGetVideoUploadServerQuery getVideoUploadServer(GroupActor actor) {
        return new StoriesGetVideoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of story viewers.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetViewersQueryWithExtendedV5115 getViewersExtendedV5115(UserActor actor,
            int ownerId, int storyId) {
        return new StoriesGetViewersQueryWithExtendedV5115(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns a list of story viewers.
     *
     * @param actor vk actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesGetViewersQueryWithExtendedV5115 getViewersExtendedV5115(GroupActor actor,
            int ownerId, int storyId) {
        return new StoriesGetViewersQueryWithExtendedV5115(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @return query
     */
    public StoriesHideAllRepliesQuery hideAllReplies(UserActor actor, int ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @return query
     */
    public StoriesHideAllRepliesQuery hideAllReplies(GroupActor actor, int ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesHideReplyQuery hideReply(UserActor actor, int ownerId, int storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @param storyId Story ID.
     * @return query
     */
    public StoriesHideReplyQuery hideReply(GroupActor actor, int ownerId, int storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * @param actor vk actor
     * @param uploadResults
     * @return query
     */
    public StoriesSaveQuery save(UserActor actor, String... uploadResults) {
        return new StoriesSaveQuery(getClient(), actor, uploadResults);
    }

    /**
     * @param actor vk actor
     * @param uploadResults
     * @return query
     */
    public StoriesSaveQuery save(UserActor actor, List<String> uploadResults) {
        return new StoriesSaveQuery(getClient(), actor, uploadResults);
    }

    /**
     * @param actor vk actor
     * @param uploadResults
     * @return query
     */
    public StoriesSaveQuery save(GroupActor actor, String... uploadResults) {
        return new StoriesSaveQuery(getClient(), actor, uploadResults);
    }

    /**
     * @param actor vk actor
     * @param uploadResults
     * @return query
     */
    public StoriesSaveQuery save(GroupActor actor, List<String> uploadResults) {
        return new StoriesSaveQuery(getClient(), actor, uploadResults);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public StoriesSearchQueryWithV5113 searchV5113(UserActor actor) {
        return new StoriesSearchQueryWithV5113(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param accessKey
     * @return query
     */
    public StoriesSendInteractionQuery sendInteraction(ServiceActor actor, String accessKey) {
        return new StoriesSendInteractionQuery(getClient(), actor, accessKey);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     *
     * @param actor vk actor
     * @param ownersIds List of hidden sources to show stories from.
     * @return query
     */
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, Integer... ownersIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     *
     * @param actor vk actor
     * @param ownersIds List of hidden sources to show stories from.
     * @return query
     */
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, List<Integer> ownersIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, ownersIds);
    }
}
