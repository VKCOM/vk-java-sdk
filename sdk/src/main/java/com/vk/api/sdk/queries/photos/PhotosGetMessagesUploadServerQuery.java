package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.photos.responses.GetMessagesUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getMessagesUploadServer method
 */
public class PhotosGetMessagesUploadServerQuery extends AbstractQueryBuilder<PhotosGetMessagesUploadServerQuery, GetMessagesUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetMessagesUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.getMessagesUploadServer", GetMessagesUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosGetMessagesUploadServerQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.getMessagesUploadServer", GetMessagesUploadServerResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetMessagesUploadServerQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    @Override
    protected PhotosGetMessagesUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
