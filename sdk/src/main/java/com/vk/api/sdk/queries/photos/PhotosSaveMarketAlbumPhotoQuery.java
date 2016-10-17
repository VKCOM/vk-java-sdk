package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveMarketAlbumPhoto method
 */
public class PhotosSaveMarketAlbumPhotoQuery extends AbstractQueryBuilder<PhotosSaveMarketAlbumPhotoQuery, List<Photo>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     * @param photo   value of "photo" parameter.
     * @param server  value of "server" parameter. Minimum is 0.
     * @param hash    value of "hash" parameter.
     */
    public PhotosSaveMarketAlbumPhotoQuery(VkApiClient client, UserActor actor, int groupId, String photo, int server, String hash) {
        super(client, "photos.saveMarketAlbumPhoto", Utils.buildParametrizedType(List.class, Photo.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
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
    protected PhotosSaveMarketAlbumPhotoQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Parameter returned when photos are uploaded to server.
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketAlbumPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Parameter returned when photos are uploaded to server.
     *
     * @param value value of "server" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketAlbumPhotoQuery server(int value) {
        return unsafeParam("server", value);
    }

    /**
     * Parameter returned when photos are uploaded to server.
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMarketAlbumPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected PhotosSaveMarketAlbumPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "group_id", "server", "hash", "access_token");
    }
}
