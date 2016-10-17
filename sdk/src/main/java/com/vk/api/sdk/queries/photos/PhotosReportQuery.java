package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.queries.ReportReason;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.report method
 */
public class PhotosReportQuery extends AbstractQueryBuilder<PhotosReportQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param photoId value of "photo id" parameter. Minimum is 0.
     */
    public PhotosReportQuery(VkApiClient client, UserActor actor, int ownerId, int photoId) {
        super(client, "photos.report", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        photoId(photoId);
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosReportQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosReportQuery photoId(int value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Reason for the complaint
     *
     * @param value value of "reason" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosReportQuery reason(ReportReason value) {
        return unsafeParam("reason", value);
    }

    @Override
    protected PhotosReportQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo_id", "owner_id", "access_token");
    }
}
