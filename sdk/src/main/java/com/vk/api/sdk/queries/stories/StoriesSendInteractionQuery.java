package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.sendInteraction method
 */
public class StoriesSendInteractionQuery extends AbstractQueryBuilder<StoriesSendInteractionQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param accessKey value of "access key" parameter.
     */
    public StoriesSendInteractionQuery(VkApiClient client, ServiceActor actor, String accessKey) {
        super(client, "stories.sendInteraction", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        accessKey(accessKey);
    }

    /**
     * Set access key
     *
     * @param value value of "access key" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected StoriesSendInteractionQuery accessKey(String value) {
        return unsafeParam("access_key", value);
    }

    /**
     * Set message
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSendInteractionQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Set is broadcast
     *
     * @param value value of "is broadcast" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSendInteractionQuery isBroadcast(Boolean value) {
        return unsafeParam("is_broadcast", value);
    }

    /**
     * Set is anonymous
     *
     * @param value value of "is anonymous" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSendInteractionQuery isAnonymous(Boolean value) {
        return unsafeParam("is_anonymous", value);
    }

    /**
     * Set unseen marker
     *
     * @param value value of "unseen marker" parameter. By default false.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public StoriesSendInteractionQuery unseenMarker(Boolean value) {
        return unsafeParam("unseen_marker", value);
    }

    @Override
    protected StoriesSendInteractionQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_key", "access_token");
    }
}
