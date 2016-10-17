package com.vk.api.sdk.queries.newsfeed;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.newsfeed.responses.GetBannedExtendedResponse;
import com.vk.api.sdk.queries.EnumParam;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Newsfeed.getBanned method
 */
public class NewsfeedGetBannedQueryWithExtended extends AbstractQueryBuilder<NewsfeedGetBannedQueryWithExtended, GetBannedExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public NewsfeedGetBannedQueryWithExtended(VkApiClient client, UserActor actor) {
        super(client, "newsfeed.getBanned", GetBannedExtendedResponse.class);
        accessToken(actor.getAccessToken());
        extended(true);
    }

    /**
     * "1" - return extra information about users and communities
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NewsfeedGetBannedQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetBannedQueryWithExtended fields(EnumParam... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetBannedQueryWithExtended fields(List<EnumParam> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NewsfeedGetBannedQueryWithExtended nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected NewsfeedGetBannedQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
