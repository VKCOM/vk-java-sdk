package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.Image;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveOwnerCoverPhoto method
 */
public class PhotosSaveOwnerCoverPhotoQuery extends AbstractQueryBuilder<PhotosSaveOwnerCoverPhotoQuery, List<Image>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param hash value of "hash" parameter.
     * @param photo value of "photo" parameter.
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, UserActor actor, String hash,
            String photo) {
        super(client, "photos.saveOwnerCoverPhoto", Utils.buildParametrizedType(List.class, Image.class));
        accessToken(actor.getAccessToken());
        hash(hash);
        photo(photo);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param hash value of "hash" parameter.
     * @param photo value of "photo" parameter.
     */
    public PhotosSaveOwnerCoverPhotoQuery(VkApiClient client, GroupActor actor, String hash,
            String photo) {
        super(client, "photos.saveOwnerCoverPhoto", Utils.buildParametrizedType(List.class, Image.class));
        accessToken(actor.getAccessToken());
        hash(hash);
        photo(photo);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosSaveOwnerCoverPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    /**
     * Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
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
        return Arrays.asList("photo", "hash", "access_token");
    }
}
