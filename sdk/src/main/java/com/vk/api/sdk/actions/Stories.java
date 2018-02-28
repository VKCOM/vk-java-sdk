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

    public StoriesBanOwnerQuery banOwner(UserActor actor, Integer... ownerIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, Arrays.asList(ownerIds));
    }

    public StoriesDelete delete(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesDelete(getClient(), actor, ownerId, storyId);
    }

    public StoriesDelete delete(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesDelete(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetBannedQuery getBanned(UserActor actor) {
        return new StoriesGetBannedQuery(getClient(), actor);
    }

    public StoriesGetByIdQuery getById(UserActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, Arrays.asList(stories));
    }

    public StoriesGetByIdQuery getById(GroupActor actor, String... stories) {
        return new StoriesGetByIdQuery(getClient(), actor, Arrays.asList(stories));
    }

    public StoriesGetByIdQuery getById(UserActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    public StoriesGetByIdQuery getById(GroupActor actor, List<String> stories) {
        return new StoriesGetByIdQuery(getClient(), actor, stories);
    }

    public StoriesGetPhotoUploadServer getPhotoUploadServer(UserActor actor) {
        return new StoriesGetPhotoUploadServer(getClient(), actor);
    }

    public StoriesGetPhotoUploadServer getPhotoUploadServer(GroupActor actor) {
        return new StoriesGetPhotoUploadServer(getClient(), actor);
    }

    public StoriesGetQuery get(UserActor actor) {
        return new StoriesGetQuery(getClient(), actor);
    }

    public StoriesGetQuery get(GroupActor actor) {
        return new StoriesGetQuery(getClient(), actor);
    }

    public StoriesGetRepliesQuery getReplies(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetRepliesQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetRepliesQuery getReplies(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetRepliesQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetStatsQuery getStats(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetStatsQuery getStats(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetVideoUploadServer getVideoUploadServer(UserActor actor) {
        return new StoriesGetVideoUploadServer(getClient(), actor);
    }

    public StoriesGetVideoUploadServer getVideoUploadServer(GroupActor actor) {
        return new StoriesGetVideoUploadServer(getClient(), actor);
    }

    public StoriesGetViewersQuery getViewers(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetViewersQuery getViewers(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetViewersQueryWithExtended getViewersWithExtended(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQueryWithExtended(getClient(), actor, ownerId, storyId);
    }

    public StoriesGetViewersQueryWithExtended getViewersWithExtended(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesGetViewersQueryWithExtended(getClient(), actor, ownerId, storyId);
    }

    public StoriesHideAllRepliesQuery hideAllReplies(UserActor actor, Integer ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    public StoriesHideAllRepliesQuery hideAllReplies(GroupActor actor, Integer ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    public StoriesHideReplyQuery hideReply(UserActor actor, Integer ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesHideReplyQuery hideReply(GroupActor actor, Integer ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, List<Integer> userIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, userIds);
    }

    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, Integer... userIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, Arrays.asList(userIds));
    }
}
