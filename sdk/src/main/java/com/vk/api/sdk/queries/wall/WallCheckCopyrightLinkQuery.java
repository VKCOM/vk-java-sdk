package com.vk.api.sdk.queries.wall;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.BoolResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Wall.checkCopyrightLink method
 */
public class WallCheckCopyrightLinkQuery extends AbstractQueryBuilder<WallCheckCopyrightLinkQuery, BoolResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param link value of "link" parameter.
     */
    public WallCheckCopyrightLinkQuery(VkApiClient client, UserActor actor, String link) {
        super(client, "wall.checkCopyrightLink", BoolResponse.class);
        accessToken(actor.getAccessToken());
        link(link);
    }

    /**
     * Set link
     *
     * @param value value of "link" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected WallCheckCopyrightLinkQuery link(String value) {
        return unsafeParam("link", value);
    }

    @Override
    protected WallCheckCopyrightLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("link", "access_token");
    }
}
