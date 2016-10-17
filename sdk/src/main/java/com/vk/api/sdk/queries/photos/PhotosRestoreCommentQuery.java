package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.restoreComment method
 */
public class PhotosRestoreCommentQuery extends AbstractQueryBuilder<PhotosRestoreCommentQuery, BoolInt> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client    VK API client
     * @param actor     actor with access token
     * @param commentId value of "comment id" parameter.
     */
    public PhotosRestoreCommentQuery(VkApiClient client, UserActor actor, int commentId) {
        super(client, "photos.restoreComment", BoolInt.class);
        accessToken(actor.getAccessToken());
        commentId(commentId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosRestoreCommentQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * ID of the deleted comment.
     *
     * @param value value of "comment id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosRestoreCommentQuery commentId(int value) {
        return unsafeParam("comment_id", value);
    }

    @Override
    protected PhotosRestoreCommentQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("comment_id", "access_token");
    }
}
