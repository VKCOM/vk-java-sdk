package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.Photo;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveMessagesPhoto method
 */
public class PhotosSaveMessagesPhotoQuery extends AbstractQueryBuilder<PhotosSaveMessagesPhotoQuery, List<Photo>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param photo  value of "photo" parameter.
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, UserActor actor, String photo) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, Photo.class));
        accessToken(actor.getAccessToken());
        photo(photo);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param photo  value of "photo" parameter.
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, GroupActor actor, String photo) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, Photo.class));
        accessToken(actor.getAccessToken());
        photo(photo);
    }

    /**
     * Parameter returned when photo upload to the server.
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveMessagesPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set server
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveMessagesPhotoQuery server(Integer value) {
        return unsafeParam("server", value);
    }

    /**
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosSaveMessagesPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected PhotosSaveMessagesPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "access_token");
    }
}
