package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.SaveResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.save method
 */
public class PhotosSaveQuery extends AbstractQueryBuilder<PhotosSaveQuery, List<SaveResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosSaveQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.save", Utils.buildParametrizedType(List.class, SaveResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the album to save photos to.
     *
     * @param value value of "album id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    /**
     * ID of the community to save photos to.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery server(Integer value) {
        return unsafeParam("server", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "photos list" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery photosList(String value) {
        return unsafeParam("photos_list", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Geographical latitude, in degrees (from '-90' to '90').
     *
     * @param value value of "latitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery latitude(Number value) {
        return unsafeParam("latitude", value);
    }

    /**
     * Geographical longitude, in degrees (from '-180' to '180').
     *
     * @param value value of "longitude" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery longitude(Number value) {
        return unsafeParam("longitude", value);
    }

    /**
     * Text describing the photo. 2048 digits max.
     *
     * @param value value of "caption" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveQuery caption(String value) {
        return unsafeParam("caption", value);
    }

    @Override
    protected PhotosSaveQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
