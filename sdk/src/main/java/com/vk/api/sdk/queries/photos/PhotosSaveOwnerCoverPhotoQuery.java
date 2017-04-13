package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.Image;
import com.vk.api.sdk.objects.photos.responses.PhotosSaveOwnerCoverPhotoResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveOwnerCoverPhoto method
 */
public class PhotosSaveOwnerCoverPhotoQuery extends AbstractQueryBuilder<PhotosSaveOwnerCoverPhotoQuery, PhotosSaveOwnerCoverPhotoResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, UserActor actor, String photo, String hash) {
        super(client, "photos.saveOwnerCoverPhoto", PhotosSaveOwnerCoverPhotoResponse.class);
        accessToken(actor.getAccessToken());
        photo(photo);
        hash(hash);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, GroupActor actor, String photo, String hash) {
        super(client, "photos.saveOwnerCoverPhoto", PhotosSaveOwnerCoverPhotoResponse.class);
        accessToken(actor.getAccessToken());
        photo(photo);
        hash(hash);
    }

    /**
     * Parameter returned after photo upload.
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveOwnerCoverPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned after photo upload.
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveOwnerCoverPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    @Override
    protected PhotosSaveOwnerCoverPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token", "photo", "hash");
    }
}
