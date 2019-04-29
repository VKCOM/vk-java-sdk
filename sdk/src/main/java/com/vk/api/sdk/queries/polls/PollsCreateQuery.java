package com.vk.api.sdk.queries.polls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.enums.PollsBackgroundId;
import com.vk.api.sdk.objects.polls.Poll;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Polls.create method
 */
public class PollsCreateQuery extends AbstractQueryBuilder<PollsCreateQuery, Poll> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PollsCreateQuery(VkApiClient client, UserActor actor) {
        super(client, "polls.create", Poll.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Question text
     *
     * @param value value of "question" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery question(String value) {
        return unsafeParam("question", value);
    }

    /**
     * '1' – anonymous poll, participants list is hidden,, '0' – public poll, participants list is available,, Default value is '0'.
     *
     * @param value value of "is anonymous" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery isAnonymous(Boolean value) {
        return unsafeParam("is_anonymous", value);
    }

    /**
     * Set is multiple
     *
     * @param value value of "is multiple" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery isMultiple(Boolean value) {
        return unsafeParam("is_multiple", value);
    }

    /**
     * Set end date
     *
     * @param value value of "end date" parameter. Minimum is 1550700000.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery endDate(Integer value) {
        return unsafeParam("end_date", value);
    }

    /**
     * If a poll will be added to a communty it is required to send a negative group identifier. Current user by default.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery ownerId(Integer value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Available answers list, for example: " ["yes","no","maybe"]", There can be from 1 to 10 answers.
     *
     * @param value value of "add answers" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery addAnswers(String value) {
        return unsafeParam("add_answers", value);
    }

    /**
     * Set photo id
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * Set background id
     *
     * @param value value of "background id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PollsCreateQuery backgroundId(PollsBackgroundId value) {
        return unsafeParam("background_id", value);
    }

    @Override
    protected PollsCreateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
