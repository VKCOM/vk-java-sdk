package com.vk.api.sdk.queries.video;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Video.restoreComment method
 */
public class VideoRestoreCommentQuery extends AbstractQueryBuilder<VideoRestoreCommentQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param commentId value of "comment id" parameter.
     */
    public VideoRestoreCommentQuery(VkApiClient client, UserActor actor, int commentId) {
        super(client, "video.restoreComment", BoolInt.class);
        accessToken(actor.getAccessToken());
        commentId(commentId);
    }

    /**
     * ID of the user or community that owns the video.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public VideoRestoreCommentQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the deleted comment.
     *
     * @param value value of "comment id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected VideoRestoreCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    @Override
    protected VideoRestoreCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("comment_id", "access_token");
    }
}
