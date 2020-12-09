package com.vk.api.sdk.queries.prettycards;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.prettycards.responses.GetByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for PrettyCards.getById method
 */
public class PrettyCardsGetByIdQuery extends AbstractQueryBuilder<PrettyCardsGetByIdQuery, List<GetByIdResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param cardIds value of "card ids" parameter.
     */
    public PrettyCardsGetByIdQuery(VkApiClient client, UserActor actor, int ownerId,
            Integer... cardIds) {
        super(client, "prettyCards.getById", Utils.buildParametrizedType(List.class, GetByIdResponse.class));
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        cardIds(cardIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param cardIds value of "card ids" parameter.
     */
    public PrettyCardsGetByIdQuery(VkApiClient client, UserActor actor, int ownerId,
            List<Integer> cardIds) {
        super(client, "prettyCards.getById", Utils.buildParametrizedType(List.class, GetByIdResponse.class));
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        cardIds(cardIds);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PrettyCardsGetByIdQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * card_ids
     * Set card ids
     *
     * @param value value of "card ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PrettyCardsGetByIdQuery cardIds(Integer... value) {
        return unsafeParam("card_ids", value);
    }

    /**
     * Set card ids
     *
     * @param value value of "card ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PrettyCardsGetByIdQuery cardIds(List<Integer> value) {
        return unsafeParam("card_ids", value);
    }

    @Override
    protected PrettyCardsGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("card_ids", "owner_id", "access_token");
    }
}
