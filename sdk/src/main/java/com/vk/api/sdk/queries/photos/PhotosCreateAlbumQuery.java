package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.CreateAlbumResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.createAlbum method
 */
public class PhotosCreateAlbumQuery extends AbstractQueryBuilder<PhotosCreateAlbumQuery, CreateAlbumResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param title value of "title" parameter.
     */
    public PhotosCreateAlbumQuery(VkApiClient client, UserActor actor, String title) {
        super(client, "photos.createAlbum", CreateAlbumResponse.class);
        accessToken(actor.getAccessToken());
        title(title);
    }

    /**
     * Album title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosCreateAlbumQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * ID of the community in which the album will be created.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Album description.
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Set upload by admins only
     *
     * @param value value of "upload by admins only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery uploadByAdminsOnly(Boolean value) {
        return unsafeParam("upload_by_admins_only", value);
    }

    /**
     * Set comments disabled
     *
     * @param value value of "comments disabled" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery commentsDisabled(Boolean value) {
        return unsafeParam("comments_disabled", value);
    }

    /**
     * privacy_view
     * Set privacy view
     *
     * @param value value of "privacy view" parameter. By default all.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery privacyView(String... value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * Set privacy view
     *
     * @param value value of "privacy view" parameter. By default all.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery privacyView(List<String> value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * privacy_comment
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter. By default all.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery privacyComment(String... value) {
        return unsafeParam("privacy_comment", value);
    }

    /**
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter. By default all.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosCreateAlbumQuery privacyComment(List<String> value) {
        return unsafeParam("privacy_comment", value);
    }

    @Override
    protected PhotosCreateAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "access_token");
    }
}
