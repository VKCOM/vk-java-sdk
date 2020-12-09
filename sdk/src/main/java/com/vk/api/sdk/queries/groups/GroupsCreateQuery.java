package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.GroupsSubtype;
import com.vk.api.sdk.objects.enums.GroupsType;
import com.vk.api.sdk.objects.groups.responses.CreateResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.create method
 */
public class GroupsCreateQuery extends AbstractQueryBuilder<GroupsCreateQuery, CreateResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param title value of "title" parameter.
     */
    public GroupsCreateQuery(VkApiClient client, UserActor actor, String title) {
        super(client, "groups.create", CreateResponse.class);
        accessToken(actor.getAccessToken());
        title(title);
    }

    /**
     * Community title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsCreateQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Community description (ignored for 'type' = 'public').
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Community type. Possible values: *'group' – group,, *'event' – event,, *'public' – public page
     *
     * @param value value of "type" parameter. By default group.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery type(GroupsType value) {
        return unsafeParam("type", value);
    }

    /**
     * Category ID (for 'type' = 'public' only).
     *
     * @param value value of "public category" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery publicCategory(Integer value) {
        return unsafeParam("public_category", value);
    }

    /**
     * Public page subtype. Possible values: *'1' – place or small business,, *'2' – company, organization or website,, *'3' – famous person or group of people,, *'4' – product or work of art.
     *
     * @param value value of "subtype" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery subtype(GroupsSubtype value) {
        return unsafeParam("subtype", value);
    }

    @Override
    protected GroupsCreateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "access_token");
    }
}
