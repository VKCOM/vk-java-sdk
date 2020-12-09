package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.SaveMarketPhotoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveMarketPhoto method
 */
public class PhotosSaveMarketPhotoQuery extends AbstractQueryBuilder<PhotosSaveMarketPhotoQuery, List<SaveMarketPhotoResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photo value of "photo" parameter.
     * @param server value of "server" parameter.
     * @param hash value of "hash" parameter.
     */
    public PhotosSaveMarketPhotoQuery(VkApiClient client, UserActor actor, String photo, int server,
            String hash) {
        super(client, "photos.saveMarketPhoto", Utils.buildParametrizedType(List.class, SaveMarketPhotoResponse.class));
        accessToken(actor.getAccessToken());
        photo(photo);
        server(server);
        hash(hash);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveMarketPhotoQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketPhotoQuery server(int value) {
        return unsafeParam("server", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "crop data" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveMarketPhotoQuery cropData(String value) {
        return unsafeParam("crop_data", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "crop hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveMarketPhotoQuery cropHash(String value) {
        return unsafeParam("crop_hash", value);
    }

    @Override
    protected PhotosSaveMarketPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "server", "hash", "access_token");
    }
}
