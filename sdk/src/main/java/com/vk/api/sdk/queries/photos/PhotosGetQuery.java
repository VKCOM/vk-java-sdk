package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetResponse;

import java.util.Collections;
import java.util.List;

/**
 * Query for Photos.get method
 */
public class PhotosGetQuery extends AbstractQueryBuilder<PhotosGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosGetQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     */
    public PhotosGetQuery(VkApiClient client, ServiceActor actor) {
        super(client, "photos.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * ID of the user or community that owns the photos. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo album ID. To return information about photos from service albums, use the following string values: "profile, wall, saved".
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery albumId(String value) {
        return unsafeParam("album_id", value);
    }

    /**
     * Photo IDs.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery photoIds(String... value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * Photo IDs.
     *
     * @param value value of "photo ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery photoIds(List<String> value) {
        return unsafeParam("photo_ids", value);
    }

    /**
     * Return photos in reverse chronological order
     *
     * @param value value of "rev" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery rev(Boolean value) {
        return unsafeParam("rev", value);
    }

    /**
     * Return additional "likes", "comments", and "tags" fields
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Type of feed obtained in "feed" field of the method.
     *
     * @param value value of "feed type" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery feedType(String value) {
        return unsafeParam("feed_type", value);
    }

    /**
     * Unixtime, that can be obtained with newsfeed.get method in date field to get all photos uploaded by the user on a specific day, or photos the user has been tagged on. Also, "uid" parameter of the user the event happened with shall be specified.
     *
     * @param value value of "feed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery feed(Integer value) {
        return unsafeParam("feed", value);
    }

    /**
     * Return photo sizes in a special format
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    /**
     * Set offset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Set count
     *
     * @param value value of "count" parameter. Maximum is 1000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    @Override
    protected PhotosGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Collections.EMPTY_LIST;
    }
}
