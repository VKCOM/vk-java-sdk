package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.PollsNameCase;
import com.vk.api.sdk.objects.polls.responses.GetByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.getById method
 */
public class PollsGetByIdQuery extends AbstractQueryBuilder<PollsGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     */
    public PollsGetByIdQuery(VkApiClient client, UserActor actor, int pollId) {
        super(client, "polls.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        pollId(pollId);
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * '1' – poll is in a board, '0' – poll is on a wall. '0' by default.
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsGetByIdQuery pollId(int value) {
        return unsafeParam("poll_id", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * Set friends count
     *
     * @param value value of "friends count" parameter. Maximum is 100. Minimum is 0. By default 3.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery friendsCount(Integer value) {
        return unsafeParam("friends_count", value);
    }

    /**
     * Set name case
     *
     * @param value value of "name case" parameter. By default nom.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery nameCase(PollsNameCase value) {
        return unsafeParam("name_case", value);
    }

    /**
     * fields
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Set fields
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetByIdQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected PollsGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "access_token");
    }
}
