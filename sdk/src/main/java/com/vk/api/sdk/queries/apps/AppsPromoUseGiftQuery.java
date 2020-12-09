package com.vk.api.sdk.queries.apps;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Apps.promoUseGift method
 */
public class AppsPromoUseGiftQuery extends AbstractQueryBuilder<AppsPromoUseGiftQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param promoId value of "promo id" parameter. Minimum is 0.
     */
    public AppsPromoUseGiftQuery(VkApiClient client, UserActor actor, int promoId) {
        super(client, "apps.promoUseGift", BoolResponse.class);
        accessToken(actor.getAccessToken());
        promoId(promoId);
    }

    /**
     * Id of game promo action
     *
     * @param value value of "promo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AppsPromoUseGiftQuery promoId(int value) {
        return unsafeParam("promo_id", value);
    }

    /**
     * Set user id
     *
     * @param value value of "user id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AppsPromoUseGiftQuery userId(Integer value) {
        return unsafeParam("user_id", value);
    }

    @Override
    protected AppsPromoUseGiftQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("promo_id", "access_token");
    }
}
