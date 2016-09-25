package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.ads.AdsAddOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsCheckLinkQuery;
import com.vk.api.sdk.queries.ads.AdsCheckLinkType;
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
import com.vk.api.sdk.queries.ads.AdsGetDemographicsIdsType;
import com.vk.api.sdk.queries.ads.AdsGetDemographicsQuery;
import com.vk.api.sdk.queries.ads.AdsGetFloodStatsQuery;
import com.vk.api.sdk.queries.ads.AdsGetOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsGetRejectionReasonQuery;
import com.vk.api.sdk.queries.ads.AdsGetStatisticsIdsType;
import com.vk.api.sdk.queries.ads.AdsGetStatisticsPeriod;
import com.vk.api.sdk.queries.ads.AdsGetStatisticsQuery;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQuery;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithCities;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithRegions;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsQueryWithSchools;
import com.vk.api.sdk.queries.ads.AdsGetSuggestionsSection;
import com.vk.api.sdk.queries.ads.AdsGetTargetGroupsQuery;
import com.vk.api.sdk.queries.ads.AdsGetTargetingStatsQuery;
import com.vk.api.sdk.queries.ads.AdsGetUploadURLAdFormat;
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

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Ads(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of advertising accounts.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetAccountsQuery getAccounts(Actor actor) {
        return new AdsGetAccountsQuery(getClient(), actor);
    }

    /**
     * Returns a list of advertising agency's clients.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetClientsQuery getClients(Actor actor, int accountId) {
        return new AdsGetClientsQuery(getClient(), actor, accountId);
    }

    /**
     * Creates clients of an advertising agency.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      data
     * @return query
     */
    public AdsCreateClientsQuery createClients(Actor actor, int accountId, String data) {
        return new AdsCreateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits clients of an advertising agency.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      data
     * @return query
     */
    public AdsUpdateClientsQuery updateClients(Actor actor, int accountId, String data) {
        return new AdsUpdateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives clients of an advertising agency.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param ids       ids
     * @return query
     */
    public AdsDeleteClientsQuery deleteClients(Actor actor, int accountId, String ids) {
        return new AdsDeleteClientsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns a list of campaigns in an advertising account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetCampaignsQuery getCampaigns(Actor actor, int accountId) {
        return new AdsGetCampaignsQuery(getClient(), actor, accountId);
    }

    /**
     * Creates advertising campaigns.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      data
     * @return query
     */
    public AdsCreateCampaignsQuery createCampaigns(Actor actor, int accountId, String data) {
        return new AdsCreateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits advertising campaigns.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      data
     * @return query
     */
    public AdsUpdateCampaignsQuery updateCampaigns(Actor actor, int accountId, String data) {
        return new AdsUpdateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives advertising campaigns.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param ids       ids
     * @return query
     */
    public AdsDeleteCampaignsQuery deleteCampaigns(Actor actor, int accountId, String ids) {
        return new AdsDeleteCampaignsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns number of ads.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetAdsQuery getAds(Actor actor, int accountId) {
        return new AdsGetAdsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns descriptions of ad layouts.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetAdsLayoutQuery getAdsLayout(Actor actor, int accountId) {
        return new AdsGetAdsLayoutQuery(getClient(), actor, accountId);
    }

    /**
     * Retuns ad targeting parameters.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetAdsTargetingQuery getAdsTargeting(Actor actor, int accountId) {
        return new AdsGetAdsTargetingQuery(getClient(), actor, accountId);
    }

    /**
     * Creates ads.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      date
     * @return query
     */
    public AdsCreateAdsQuery createAds(Actor actor, int accountId, String data) {
        return new AdsCreateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits ads.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      date
     * @return query
     */
    public AdsUpdateAdsQuery updateAds(Actor actor, int accountId, String data) {
        return new AdsUpdateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Archives ads.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param ids       ids
     * @return query
     */
    public AdsDeleteAdsQuery deleteAds(Actor actor, int accountId, String ids) {
        return new AdsDeleteAdsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Allows to check the ad link.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param linkType  type of link
     * @param linkUrl   url
     * @return query
     */
    public AdsCheckLinkQuery checkLink(Actor actor, int accountId, AdsCheckLinkType linkType, String linkUrl) {
        return new AdsCheckLinkQuery(getClient(), actor, accountId, linkType, linkUrl);
    }

    /**
     * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param idsType   ids type
     * @param ids       ids
     * @param period    period
     * @param dateFrom  from date
     * @param dateTo    to date
     * @return query
     */
    public AdsGetStatisticsQuery getStatistics(Actor actor, int accountId, AdsGetStatisticsIdsType idsType, String ids,
                                               AdsGetStatisticsPeriod period, String dateFrom, String dateTo) {
        return new AdsGetStatisticsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Returns demographics for ads or campaigns.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param idsType   ids type
     * @param ids       ids
     * @param period    period
     * @param dateFrom  from date
     * @param dateTo    to date
     * @return query
     */
    public AdsGetDemographicsQuery getDemographics(Actor actor, int accountId, AdsGetDemographicsIdsType idsType, String ids, String period, String dateFrom, String dateTo) {
        return new AdsGetDemographicsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Allows to get detailed information about the ad post reach.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetAdsPostsReachQuery getAdsPostsReach(Actor actor, int accountId, String adsIds) {
        return new AdsGetAdsPostsReachQuery(getClient(), actor, accountId, adsIds);
    }

    /**
     * Returns current budget of the advertising account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetBudgetQuery getBudget(Actor actor, int accountId) {
        return new AdsGetBudgetQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a list of managers and supervisors of advertising account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetOfficeUsersQuery getOfficeUsers(Actor actor, int accountId) {
        return new AdsGetOfficeUsersQuery(getClient(), actor, accountId);
    }

    /**
     * Adds managers and/or supervisors to advertising account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param data      data
     * @return query
     */
    public AdsAddOfficeUsersQuery addOfficeUsers(Actor actor, int accountId, String data) {
        return new AdsAddOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Removes managers and/or supervisors from advertising account.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param ids       ids
     * @return query
     */
    public AdsRemoveOfficeUsersQuery removeOfficeUsers(Actor actor, int accountId, String ids) {
        return new AdsRemoveOfficeUsersQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Returns the size of targeting audience, and also recommended values for CPC and CPM.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param linkUrl   link
     * @return query
     */
    public AdsGetTargetingStatsQuery getTargetingStats(Actor actor, int accountId, String linkUrl) {
        return new AdsGetTargetingStatsQuery(getClient(), actor, accountId, linkUrl);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor   vk actor
     * @param section section
     * @return query
     */
    public AdsGetSuggestionsQuery getSuggestions(Actor actor, AdsGetSuggestionsSection section) {
        return new AdsGetSuggestionsQuery(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor   vk actor
     * @param section section
     * @return query
     */
    public AdsGetSuggestionsQueryWithRegions getSuggestionsRegions(Actor actor, AdsGetSuggestionsSection section) {
        return new AdsGetSuggestionsQueryWithRegions(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor   vk actor
     * @param section section
     * @param cities  cities
     * @return query
     */
    public AdsGetSuggestionsQueryWithCities getSuggestions(Actor actor, AdsGetSuggestionsSection section, String cities) {
        return new AdsGetSuggestionsQueryWithCities(getClient(), actor, section, cities);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor   vk actor
     * @param section section
     * @return query
     */
    public AdsGetSuggestionsQueryWithSchools getSuggestionsSchools(Actor actor, AdsGetSuggestionsSection section) {
        return new AdsGetSuggestionsQueryWithSchools(getClient(), actor, section);
    }

    /**
     * Allows to get the list of possible ad categories.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetCategoriesQuery getCategories(Actor actor) {
        return new AdsGetCategoriesQuery(getClient(), actor);
    }

    /**
     * Returns URL to upload an ad photo to. Learn more about photo upload.
     *
     * @param actor    vk actor
     * @param adFormat ad format
     * @return query
     */
    public AdsGetUploadURLQuery getUploadURL(Actor actor, AdsGetUploadURLAdFormat adFormat) {
        return new AdsGetUploadURLQuery(getClient(), actor, adFormat);
    }

    /**
     * Returns URL to upload an ad video to. Learn more about video upload.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetVideoUploadURLQuery getVideoUploadURL(Actor actor) {
        return new AdsGetVideoUploadURLQuery(getClient(), actor);
    }

    /**
     * Returns information about current state of a counter - number of remaining runs of methods and time to the next counter nulling in seconds.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetFloodStatsQuery getFloodStats(Actor actor, int accountId) {
        return new AdsGetFloodStatsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a reason of ad rejection for pre-moderation.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param adId      ad id
     * @return query
     */
    public AdsGetRejectionReasonQuery getRejectionReason(Actor actor, int accountId, int adId) {
        return new AdsGetRejectionReasonQuery(getClient(), actor, accountId, adId);
    }

    /**
     * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
     *
     * @param actor     vk actor
     * @param accountId account id
     * @param name      name
     * @return query
     */
    public AdsCreateTargetGroupQuery createTargetGroup(Actor actor, int accountId, String name) {
        return new AdsCreateTargetGroupQuery(getClient(), actor, accountId, name);
    }

    /**
     * Edits a retarget group.
     *
     * @param actor         vk actor
     * @param accountId     account id
     * @param targetGroupId target group id
     * @param name          name
     * @return query
     */
    public AdsUpdateTargetGroupQuery updateTargetGroup(Actor actor, int accountId, int targetGroupId, String name) {
        return new AdsUpdateTargetGroupQuery(getClient(), actor, accountId, targetGroupId, name);
    }

    /**
     * Deletes a retarget group.
     *
     * @param actor         vk actor
     * @param accountId     account id
     * @param targetGroupId target group id
     * @return query
     */
    public AdsDeleteTargetGroupQuery deleteTargetGroup(Actor actor, int accountId, int targetGroupId) {
        return new AdsDeleteTargetGroupQuery(getClient(), actor, accountId, targetGroupId);
    }

    /**
     * Returns a list of target groups.
     *
     * @param actor     vk actor
     * @param accountId account id
     * @return query
     */
    public AdsGetTargetGroupsQuery getTargetGroups(Actor actor, int accountId) {
        return new AdsGetTargetGroupsQuery(getClient(), actor, accountId);
    }

    /**
     * Imports a list of advertiser's contacts to count VK registered users against the target group.
     *
     * @param actor         vk actor
     * @param accountId     account id
     * @param targetGroupId target group id
     * @param contacts      advertiser's contacts
     * @return query
     */
    public AdsImportTargetContactsQuery importTargetContacts(Actor actor, int accountId, int targetGroupId, String contacts) {
        return new AdsImportTargetContactsQuery(getClient(), actor, accountId, targetGroupId, contacts);
    }
}
