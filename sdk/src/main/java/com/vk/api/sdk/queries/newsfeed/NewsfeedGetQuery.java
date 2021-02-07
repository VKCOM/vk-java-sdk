package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.UserGroupFields;
import com.vk.api.sdk.objects.newsfeed.Filters;
import com.vk.api.sdk.objects.newsfeed.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.get method
 */
public class NewsfeedGetQuery extends AbstractQueryBuilder<NewsfeedGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public NewsfeedGetQuery(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * '1' — to return news items from banned sources
     *
     * @param value value of "return banned" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery returnBanned(Boolean value) {
        return unsafeParam("return_banned", value);
    }

    /**
     * Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
     *
     * @param value value of "start time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery startTime(Integer value) {
        return unsafeParam("start_time", value);
    }

    /**
     * Latest timestamp (in Unix time) of a news item to return. By default, the current time.
     *
     * @param value value of "end time" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery endTime(Integer value) {
        return unsafeParam("end_time", value);
    }

    /**
     * Maximum number of photos to return. By default, '5'.
     *
     * @param value value of "max photos" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery maxPhotos(Integer value) {
        return unsafeParam("max_photos", value);
    }

    /**
     * Sources to obtain news from, separated by commas. User IDs can be specified in formats ' or 'u' , where ' is the user's friend ID. Community IDs can be specified in formats '-' or 'g' , where ' is the community ID. If the parameter is not set, all of the user's friends and communities are returned, except for banned sources, which can be obtained with the [vk.com/dev/newsfeed.getBanned|newsfeed.getBanned] method.
     *
     * @param value value of "source ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery sourceIds(String value) {
        return unsafeParam("source_ids", value);
    }

    /**
     * Identifier required to get the next page of results. Value for this parameter is returned in 'next_from' field in a reply.
     *
     * @param value value of "start from" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery startFrom(String value) {
        return unsafeParam("start_from", value);
    }

    /**
     * Number of news items to return (default 50, maximum 100). For auto feed, you can use the 'new_offset' parameter returned by this method.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Set section
     *
     * @param value value of "section" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery section(String value) {
        return unsafeParam("section", value);
    }

    /**
     * filters
     * Filters to apply: 'post' — new wall posts, 'photo' — new photos, 'photo_tag' — new photo tags, 'wall_photo' — new wall photos, 'friend' — new friends
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery filters(Filters... value) {
        return unsafeParam("filters", value);
    }

    /**
     * Filters to apply: 'post' — new wall posts, 'photo' — new photos, 'photo_tag' — new photo tags, 'wall_photo' — new wall photos, 'friend' — new friends
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery filters(List<Filters> value) {
        return unsafeParam("filters", value);
    }

    /**
     * fields
     * Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery fields(UserGroupFields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetQuery fields(List<UserGroupFields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected NewsfeedGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
