package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.ads.AdsAddOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsCheckLinkQuery;
import com.vk.api.sdk.queries.ads.AdsCreateAdsQuery;
import com.vk.api.sdk.queries.ads.AdsCreateCampaignsQuery;
import com.vk.api.sdk.queries.ads.AdsCreateClientsQuery;
import com.vk.api.sdk.queries.ads.AdsCreateTargetGroupQuery;
import com.vk.api.sdk.queries.ads.AdsDeleteAdsQuery;
import com.vk.api.sdk.queries.ads.AdsDeleteCampaignsQuery;
import com.vk.api.sdk.queries.ads.AdsDeleteClientsQuery;
import com.vk.api.sdk.queries.ads.AdsDeleteTargetGroupQuery;
import com.vk.api.sdk.queries.ads.AdsGetAccountsQuery;
import com.vk.api.sdk.queries.ads.AdsGetAdsLayoutQuery;
import com.vk.api.sdk.queries.ads.AdsGetAdsPostsReachQuery;
import com.vk.api.sdk.queries.ads.AdsGetAdsQuery;
import com.vk.api.sdk.queries.ads.AdsGetAdsTargetingQuery;
import com.vk.api.sdk.queries.ads.AdsGetBudgetQuery;
import com.vk.api.sdk.queries.ads.AdsGetCampaignsQuery;
import com.vk.api.sdk.queries.ads.AdsGetCategoriesQuery;
import com.vk.api.sdk.queries.ads.AdsGetClientsQuery;
import com.vk.api.sdk.queries.ads.AdsGetDemographicsQuery;
import com.vk.api.sdk.queries.ads.AdsGetFloodStatsQuery;
import com.vk.api.sdk.queries.ads.AdsGetOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsGetRejectionReasonQuery;
import com.vk.api.sdk.queries.ads.AdsGetStatisticsQuery;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQuery;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithCities;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithRegions;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithSchools;
import com.vk.api.sdk.queries.ads.AdsGetTargetGroupsQuery;
import com.vk.api.sdk.queries.ads.AdsGetTargetingStatsQuery;
import com.vk.api.sdk.queries.ads.AdsGetUploadURLQuery;
import com.vk.api.sdk.queries.ads.AdsGetVideoUploadURLQuery;
import com.vk.api.sdk.queries.ads.AdsImportTargetContactsQuery;
import com.vk.api.sdk.queries.ads.AdsRemoveOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsUpdateAdsQuery;
import com.vk.api.sdk.queries.ads.AdsUpdateCampaignsQuery;
import com.vk.api.sdk.queries.ads.AdsUpdateClientsQuery;
import com.vk.api.sdk.queries.ads.AdsUpdateTargetGroupQuery;

/**
 * List of Ads methods
 */
public class Ads extends AbstractAction {
    public Ads(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of advertising accounts.
     */
    public AdsGetAccountsQuery getAccounts(Actor actor) {
        return new AdsGetAccountsQuery(getClient(), actor);
    }

    /**
     * Returns a list of advertising agency's clients.
     */
    public AdsGetClientsQuery getClients(Actor actor, int accountId) {
        return new AdsGetClientsQuery(getClient(), actor, accountId);
    }

    /**
     * Creates clients of an advertising agency.
     */
    public AdsCreateClientsQuery createClients(Actor actor, int accountId, String data) {
        return new AdsCreateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits clients of an advertising agency.
     */
    public AdsUpdateClientsQuery updateClients(Actor actor, int accountId, String data) {
        return new AdsUpdateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives clients of an advertising agency.
     */
    public AdsDeleteClientsQuery deleteClients(Actor actor, int accountId, String ids) {
        return new AdsDeleteClientsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns a list of campaigns in an advertising account.
     */
    public AdsGetCampaignsQuery getCampaigns(Actor actor, int accountId) {
        return new AdsGetCampaignsQuery(getClient(), actor, accountId);
    }

    /**
     * Creates advertising campaigns.
     */
    public AdsCreateCampaignsQuery createCampaigns(Actor actor, int accountId, String data) {
        return new AdsCreateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits advertising campaigns.
     */
    public AdsUpdateCampaignsQuery updateCampaigns(Actor actor, int accountId, String data) {
        return new AdsUpdateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives advertising campaigns.
     */
    public AdsDeleteCampaignsQuery deleteCampaigns(Actor actor, int accountId, String ids) {
        return new AdsDeleteCampaignsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns number of ads.
     */
    public AdsGetAdsQuery getAds(Actor actor, int accountId) {
        return new AdsGetAdsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns descriptions of ad layouts.
     */
    public AdsGetAdsLayoutQuery getAdsLayout(Actor actor, int accountId) {
        return new AdsGetAdsLayoutQuery(getClient(), actor, accountId);
    }

    /**
     * Retuns ad targeting parameters.
     */
    public AdsGetAdsTargetingQuery getAdsTargeting(Actor actor, int accountId) {
        return new AdsGetAdsTargetingQuery(getClient(), actor, accountId);
    }

    /**
     * Creates ads.
     */
    public AdsCreateAdsQuery createAds(Actor actor, int accountId, String data) {
        return new AdsCreateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits ads.
     */
    public AdsUpdateAdsQuery updateAds(Actor actor, int accountId, String data) {
        return new AdsUpdateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives ads.
     */
    public AdsDeleteAdsQuery deleteAds(Actor actor, int accountId, String ids) {
        return new AdsDeleteAdsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Allows to check the ad link.
     */
    public AdsCheckLinkQuery checkLink(Actor actor, int accountId, String linkType, String linkUrl) {
        return new AdsCheckLinkQuery(getClient(), actor, accountId, linkType, linkUrl);
    }

    /**
     * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
     */
    public AdsGetStatisticsQuery getStatistics(Actor actor, int accountId, String idsType, String ids, String period, String dateFrom, String dateTo) {
        return new AdsGetStatisticsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Returns demographics for ads or campaigns.
     */
    public AdsGetDemographicsQuery getDemographics(Actor actor, int accountId, String idsType, String ids, String period, String dateFrom, String dateTo) {
        return new AdsGetDemographicsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Allows to get detailed information about the ad post reach.
     */
    public AdsGetAdsPostsReachQuery getAdsPostsReach(Actor actor, int accountId, String adsIds) {
        return new AdsGetAdsPostsReachQuery(getClient(), actor, accountId, adsIds);
    }

    /**
     * Returns current budget of the advertising account.
     */
    public AdsGetBudgetQuery getBudget(Actor actor, int accountId) {
        return new AdsGetBudgetQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a list of managers and supervisors of advertising account.
     */
    public AdsGetOfficeUsersQuery getOfficeUsers(Actor actor, int accountId) {
        return new AdsGetOfficeUsersQuery(getClient(), actor, accountId);
    }

    /**
     * Adds managers and/or supervisors to advertising account.
     */
    public AdsAddOfficeUsersQuery addOfficeUsers(Actor actor, int accountId, String data) {
        return new AdsAddOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Removes managers and/or supervisors from advertising account.
     */
    public AdsRemoveOfficeUsersQuery removeOfficeUsers(Actor actor, int accountId, String ids) {
        return new AdsRemoveOfficeUsersQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns the size of targeting audience, and also recommended values for CPC and CPM.
     */
    public AdsGetTargetingStatsQuery getTargetingStats(Actor actor, int accountId, String linkUrl) {
        return new AdsGetTargetingStatsQuery(getClient(), actor, accountId, linkUrl);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     */
    public AdsGetSuggestionsQuery getSuggestions(Actor actor, String section) {
        return new AdsGetSuggestionsQuery(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     */
    public AdsGetSuggestionsQueryWithRegions getSuggestionsRegions(Actor actor, String section) {
        return new AdsGetSuggestionsQueryWithRegions(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     */
    public AdsGetSuggestionsQueryWithCities getSuggestions(Actor actor, String section, String cities) {
        return new AdsGetSuggestionsQueryWithCities(getClient(), actor, section, cities);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     */
    public AdsGetSuggestionsQueryWithSchools getSuggestionsSchools(Actor actor, String section) {
        return new AdsGetSuggestionsQueryWithSchools(getClient(), actor, section);
    }

    /**
     * Allows to get the list of possible ad categories.
     */
    public AdsGetCategoriesQuery getCategories(Actor actor) {
        return new AdsGetCategoriesQuery(getClient(), actor);
    }

    /**
     * Returns URL to upload an ad photo to. Learn more about photo upload.
     */
    public AdsGetUploadURLQuery getUploadURL(Actor actor, int adFormat) {
        return new AdsGetUploadURLQuery(getClient(), actor, adFormat);
    }

    /**
     * Returns URL to upload an ad video to. Learn more about video upload.
     */
    public AdsGetVideoUploadURLQuery getVideoUploadURL(Actor actor) {
        return new AdsGetVideoUploadURLQuery(getClient(), actor);
    }

    /**
     * Returns information about current state of a counter - number of remaining runs of methods and time to the next counter nulling in seconds.
     */
    public AdsGetFloodStatsQuery getFloodStats(Actor actor, int accountId) {
        return new AdsGetFloodStatsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a reason of ad rejection for pre-moderation.
     */
    public AdsGetRejectionReasonQuery getRejectionReason(Actor actor, int accountId, int adId) {
        return new AdsGetRejectionReasonQuery(getClient(), actor, accountId, adId);
    }

    /**
     * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
     */
    public AdsCreateTargetGroupQuery createTargetGroup(Actor actor, int accountId, String name) {
        return new AdsCreateTargetGroupQuery(getClient(), actor, accountId, name);
    }

    /**
     * Edits a retarget group.
     */
    public AdsUpdateTargetGroupQuery updateTargetGroup(Actor actor, int accountId, int targetGroupId, String name) {
        return new AdsUpdateTargetGroupQuery(getClient(), actor, accountId, targetGroupId, name);
    }

    /**
     * Deletes a retarget group.
     */
    public AdsDeleteTargetGroupQuery deleteTargetGroup(Actor actor, int accountId, int targetGroupId) {
        return new AdsDeleteTargetGroupQuery(getClient(), actor, accountId, targetGroupId);
    }

    /**
     * Returns a list of target groups.
     */
    public AdsGetTargetGroupsQuery getTargetGroups(Actor actor, int accountId) {
        return new AdsGetTargetGroupsQuery(getClient(), actor, accountId);
    }

    /**
     * Imports a list of advertiser's contacts to count VK registered users against the target group.
     */
    public AdsImportTargetContactsQuery importTargetContacts(Actor actor, int accountId, int targetGroupId, String contacts) {
        return new AdsImportTargetContactsQuery(getClient(), actor, accountId, targetGroupId, contacts);
    }
}
