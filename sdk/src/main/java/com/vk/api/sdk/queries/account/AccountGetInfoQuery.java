package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.account.responses.GetInfoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.getInfo method
 */
public class AccountGetInfoQuery extends AbstractQueryBuilder<AccountGetInfoQuery, GetInfoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AccountGetInfoQuery(VkApiClient client, UserActor actor) {
        super(client, "account.getInfo", GetInfoResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * fields
     * Fields to return. Possible values: *'country' — user country,, *'https_required' — is "HTTPS only" option enabled,, *'own_posts_default' — is "Show my posts only" option is enabled,, *'no_wall_replies' — are wall replies disabled or not,, *'intro' — is intro passed by user or not,, *'lang' — user language. By default: all.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetInfoQuery fields(String... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Fields to return. Possible values: *'country' — user country,, *'https_required' — is "HTTPS only" option enabled,, *'own_posts_default' — is "Show my posts only" option is enabled,, *'no_wall_replies' — are wall replies disabled or not,, *'intro' — is intro passed by user or not,, *'lang' — user language. By default: all.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountGetInfoQuery fields(List<String> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected AccountGetInfoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
