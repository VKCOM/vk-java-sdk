package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetAllCommentsResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getAllComments method
 */
public class PhotosGetAllCommentsQuery extends AbstractQueryBuilder<PhotosGetAllCommentsQuery, GetAllCommentsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetAllCommentsQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getAllComments", GetAllCommentsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the album(s).
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllCommentsQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Album ID. If the parameter is not set, comments on all of the user's albums will be returned.
     *
     * @param value value of "album id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllCommentsQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Return an additional "likes" field
     *
     * @param value value of "need likes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllCommentsQuery needLikes(Boolean value) {
        return unsafeParam("need_likes", value);
    }

    /**
     * Offset needed to return a specific subset of comments. By default, "0".
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllCommentsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of comments to return. By default, "20". Maximum value, "100".
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetAllCommentsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected PhotosGetAllCommentsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
