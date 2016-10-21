package com.vk.api.sdk.queries.secure;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Secure.addAppEvent method
 */
public class SecureAddAppEventQuery extends AbstractSecureQueryBuilder<SecureAddAppEventQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client     VK API client
     * @param actor      actor with access token
     * @param userId     value of "user id" parameter. Minimum is 0.
     * @param activityId value of "activity id" parameter. Minimum is 0.
     */
    public SecureAddAppEventQuery(VkApiClient client, ServiceActor actor, int userId, int activityId) {
        super(client, "secure.addAppEvent", OkResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
        userId(userId);
        activityId(activityId);
    }

    /**
     * ID of a user to save the data
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected SecureAddAppEventQuery userId(int value) {
        return unsafeParam("user_id", value);
    }

    /**
     * There are 2 default activities:
     * 1 - level. Works similar to secure.setUserLevel;
     * 2 - points, saves points amount
     * Any other value is for saving completed missions
     *
     * @param value value of "activity id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected SecureAddAppEventQuery activityId(int value) {
        return unsafeParam("activity_id", value);
    }

    /**
     * Depends on activity_id:
     * 1 - number, current level number;
     * 2 - number, current user's points amount
     * <p>
     * Any other value is ignored
     *
     * @param value value of "value" parameter. Maximum is 10000. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public SecureAddAppEventQuery value(Integer value) {
        return unsafeParam("value", value);
    }

    @Override
    protected SecureAddAppEventQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("activity_id", "user_id", "access_token", "client_secret");
    }
}
