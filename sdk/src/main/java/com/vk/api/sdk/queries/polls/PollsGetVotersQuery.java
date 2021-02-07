package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.PollsNameCase;
import com.vk.api.sdk.objects.polls.responses.GetVotersResponse;
import com.vk.api.sdk.objects.users.Fields;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.getVoters method
 */
public class PollsGetVotersQuery extends AbstractQueryBuilder<PollsGetVotersQuery, List<GetVotersResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsGetVotersQuery(VkApiClient client, UserActor actor, int pollId,
            Integer... answerIds) {
        super(client, "polls.getVoters", Utils.buildParametrizedType(List.class, GetVotersResponse.class));
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param pollId value of "poll id" parameter. Minimum is 0.
     * @param answerIds value of "answer ids" parameter.
     */
    public PollsGetVotersQuery(VkApiClient client, UserActor actor, int pollId,
            List<Integer> answerIds) {
        super(client, "polls.getVoters", Utils.buildParametrizedType(List.class, GetVotersResponse.class));
        accessToken(actor.getAccessToken());
        pollId(pollId);
        answerIds(answerIds);
    }

    /**
     * ID of the user or community that owns the poll. Use a negative value to designate a community ID.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Poll ID.
     *
     * @param value value of "poll id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsGetVotersQuery pollId(int value) {
        return unsafeParam("poll_id", value);
    }

    /**
     * Set is board
     *
     * @param value value of "is board" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery isBoard(Boolean value) {
        return unsafeParam("is_board", value);
    }

    /**
     * '1' — to return only current user's friends, '0' — to return all users (default),
     *
     * @param value value of "friends only" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery friendsOnly(Boolean value) {
        return unsafeParam("friends_only", value);
    }

    /**
     * Offset needed to return a specific subset of voters. '0' — (default)
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' — (default)
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery nameCase(PollsNameCase value) {
        return unsafeParam("name_case", value);
    }

    /**
     * answer_ids
     * Answer IDs.
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsGetVotersQuery answerIds(Integer... value) {
        return unsafeParam("answer_ids", value);
    }

    /**
     * Answer IDs.
     *
     * @param value value of "answer ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PollsGetVotersQuery answerIds(List<Integer> value) {
        return unsafeParam("answer_ids", value);
    }

    /**
     * fields
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsGetVotersQuery fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected PollsGetVotersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("poll_id", "answer_ids", "access_token");
    }
}
