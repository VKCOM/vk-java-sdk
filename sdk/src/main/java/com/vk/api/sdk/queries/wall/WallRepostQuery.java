package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.responses.RepostResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.repost method
 */
public class WallRepostQuery extends AbstractQueryBuilder<WallRepostQuery, RepostResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param object value of "object" parameter.
     */
    public WallRepostQuery(VkApiClient client, UserActor actor, String object) {
        super(client, "wall.repost", RepostResponse.class);
        accessToken(actor.getAccessToken());
        object(object);
    }

    /**
     * ID of the object to be reposted on the wall. Example:
     * wall66748_3675
     *
     * @param value value of "object" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallRepostQuery object(String value) {
        return unsafeParam("object", value);
    }

    /**
     * Comment to be added along with the reposted object.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallRepostQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * Target community ID when reposting to a community.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallRepostQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set mark as ads
     *
     * @param value value of "mark as ads" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallRepostQuery markAsAds(Boolean value) {
        return unsafeParam("mark_as_ads", value);
    }

    @Override
    protected WallRepostQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("object", "access_token");
    }
}
