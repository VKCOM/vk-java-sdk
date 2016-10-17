package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.edit method
 */
public class WallEditQuery extends AbstractQueryBuilder<WallEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param postId value of "post id" parameter. Minimum is 0.
     */
    public WallEditQuery(VkApiClient client, UserActor actor, int postId) {
        super(client, "wall.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        postId(postId);
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Post ID.
     *
     * @param value value of "post id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallEditQuery postId(int value) {
        return unsafeParam("post_id", value);
    }

    /**
     * (Applies only when editing a scheduled post.)
     * Post will be available to friends only
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * (Required if "attachments" is not set.) Text of the post.
     *
     * @param value value of "message" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery message(String value) {
        return unsafeParam("message", value);
    }

    /**
     * (Required if "message" is not set.) List of objects attached to the post, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media application owner.
     * ""media_id"" - Media application ID.
     * <p>
     * Example:
     * photo100172_166443618,photo66748_265827614
     * May contain a link to an external page to include in the post. Example:
     * <pre>photo66748_265827614,http://habrahabr.ru</pre>
     * NOTE: If more than one link is being attached, an error is thrown.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery attachments(String... value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Required if "message" is not set.) List of objects attached to the post, in the following format:
     * "type""owner_id"_"media_id"
     * ""type"" - Type of media attachment:
     * "photo" - photo
     * "video" - video
     * "audio" - audio
     * "doc" - document
     * ""owner_id"" - ID of the media application owner.
     * ""media_id"" - Media application ID.
     * <p>
     * Example:
     * photo100172_166443618,photo66748_265827614
     * May contain a link to an external page to include in the post. Example:
     * <pre>photo66748_265827614,http://habrahabr.ru</pre>
     * NOTE: If more than one link is being attached, an error is thrown.
     *
     * @param value value of "attachments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery attachments(List<String> value) {
        return unsafeParam("attachments", value);
    }

    /**
     * (Applies only to a scheduled post.) List of services or websites where status will be updated, if the user has so requested. Sample values: "twitter", "facebook".
     *
     * @param value value of "services" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery services(String value) {
        return unsafeParam("services", value);
    }

    /**
     * (Applies only to a post that was created "as community" on a community wall.)
     * "1" - to add the signature of the user who created the post
     *
     * @param value value of "signed" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery signed(Boolean value) {
        return unsafeParam("signed", value);
    }

    /**
     * (Applies only to a scheduled post.) Publication date (in Unix time). If used, posting will be delayed until the set time.
     *
     * @param value value of "publish date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery publishDate(Integer value) {
        return unsafeParam("publish_date", value);
    }

    /**
     * Geographical latitude of the check-in, in degrees (from -90 to 90).
     *
     * @param value value of "lat" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery lat(Float value) {
        return unsafeParam("lat", value);
    }

    /**
     * Geographical longitude of the check-in, in degrees (from -180 to 180).
     *
     * @param value value of "long" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery lng(Float value) {
        return unsafeParam("long", value);
    }

    /**
     * ID of the location where the user was tagged.
     *
     * @param value value of "place id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery placeId(Integer value) {
        return unsafeParam("place_id", value);
    }

    /**
     * Set mark as ads
     *
     * @param value value of "mark as ads" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public WallEditQuery markAsAds(Boolean value) {
        return unsafeParam("mark_as_ads", value);
    }

    @Override
    protected WallEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("post_id", "access_token");
    }
}
