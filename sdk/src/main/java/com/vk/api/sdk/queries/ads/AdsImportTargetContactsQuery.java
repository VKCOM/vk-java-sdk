package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.importTargetContacts method
 */
public class AdsImportTargetContactsQuery extends AbstractQueryBuilder<AdsImportTargetContactsQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client        VK API client
     * @param actor         actor with access token
     * @param accountId     value of "account id" parameter.
     * @param targetGroupId value of "target group id" parameter.
     * @param contacts      value of "contacts" parameter.
     */
    public AdsImportTargetContactsQuery(VkApiClient client, UserActor actor, int accountId, int targetGroupId, String contacts) {
        super(client, "ads.importTargetContacts", Integer.class);
        accessToken(actor.getAccessToken());
        accountId(accountId);
        targetGroupId(targetGroupId);
        contacts(contacts);
    }

    /**
     * Advertising account ID.
     *
     * @param value value of "account id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsImportTargetContactsQuery accountId(int value) {
        return unsafeParam("account_id", value);
    }

    /**
     * "Only for advertising agencies."
     * ID of the client with the advertising account where the group will be created.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsImportTargetContactsQuery clientId(Integer value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Target group ID.
     *
     * @param value value of "target group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsImportTargetContactsQuery targetGroupId(int value) {
        return unsafeParam("target_group_id", value);
    }

    /**
     * List of phone numbers, emails or user IDs separated with a comma.
     *
     * @param value value of "contacts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsImportTargetContactsQuery contacts(String value) {
        return unsafeParam("contacts", value);
    }

    @Override
    protected AdsImportTargetContactsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("contacts", "target_group_id", "account_id", "access_token");
    }
}
