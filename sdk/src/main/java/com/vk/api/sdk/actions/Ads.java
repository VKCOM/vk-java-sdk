package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.UserSpecification;
import com.vk.api.sdk.objects.ads.UserSpecificationCutted;
import com.vk.api.sdk.objects.enums.AdsIdsType;
import com.vk.api.sdk.objects.enums.AdsLinkType;
import com.vk.api.sdk.objects.enums.AdsPeriod;
import com.vk.api.sdk.objects.enums.AdsSection;
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
import com.vk.api.sdk.queries.ads.AdsGetAdsQuery;
import com.vk.api.sdk.queries.ads.AdsGetAdsTargetingQuery;
import com.vk.api.sdk.queries.ads.AdsGetBudgetQuery;
import com.vk.api.sdk.queries.ads.AdsGetCampaignsQuery;
import com.vk.api.sdk.queries.ads.AdsGetCategoriesQuery;
import com.vk.api.sdk.queries.ads.AdsGetClientsQuery;
import com.vk.api.sdk.queries.ads.AdsGetDemographicsQuery;
import com.vk.api.sdk.queries.ads.AdsGetFloodStatsQuery;
import com.vk.api.sdk.queries.ads.AdsGetLookalikeRequestsQuery;
import com.vk.api.sdk.queries.ads.AdsGetMusiciansQuery;
import com.vk.api.sdk.queries.ads.AdsGetOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsGetPostsReachQuery;
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
import com.vk.api.sdk.queries.ads.AdsUpdateOfficeUsersQuery;
import com.vk.api.sdk.queries.ads.AdsUpdateTargetGroupQuery;
import java.util.List;

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
     * Adds managers and/or supervisors to advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     * @return query
     */
    public AdsAddOfficeUsersQuery addOfficeUsers(UserActor actor, int accountId,
            UserSpecificationCutted... data) {
        return new AdsAddOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Adds managers and/or supervisors to advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     * @return query
     */
    public AdsAddOfficeUsersQuery addOfficeUsers(UserActor actor, int accountId,
            List<UserSpecificationCutted> data) {
        return new AdsAddOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Allows to check the ad link.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param linkType Object type: *'community' — community,, *'post' — community post,, *'application' — VK application,, *'video' — video,, *'site' — external site.
     * @param linkUrl Object URL.
     * @return query
     */
    public AdsCheckLinkQuery checkLink(UserActor actor, int accountId, AdsLinkType linkType,
            String linkUrl) {
        return new AdsCheckLinkQuery(getClient(), actor, accountId, linkType, linkUrl);
    }

    /**
     * Creates ads.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created ads. Description of 'ad_specification' objects see below.
     * @return query
     */
    public AdsCreateAdsQuery createAds(UserActor actor, int accountId, String data) {
        return new AdsCreateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Creates advertising campaigns.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
     * @return query
     */
    public AdsCreateCampaignsQuery createCampaigns(UserActor actor, int accountId, String data) {
        return new AdsCreateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Creates clients of an advertising agency.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
     * @return query
     */
    public AdsCreateClientsQuery createClients(UserActor actor, int accountId, String data) {
        return new AdsCreateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param name Name of the target group — a string up to 64 characters long.
     * @param lifetime 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group.
     * @return query
     */
    public AdsCreateTargetGroupQuery createTargetGroup(UserActor actor, int accountId, String name,
            int lifetime) {
        return new AdsCreateTargetGroupQuery(getClient(), actor, accountId, name, lifetime);
    }

    /**
     * Archives ads.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with ad IDs.
     * @return query
     */
    public AdsDeleteAdsQuery deleteAds(UserActor actor, int accountId, String ids) {
        return new AdsDeleteAdsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Archives advertising campaigns.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted campaigns.
     * @return query
     */
    public AdsDeleteCampaignsQuery deleteCampaigns(UserActor actor, int accountId, String ids) {
        return new AdsDeleteCampaignsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Archives clients of an advertising agency.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted clients.
     * @return query
     */
    public AdsDeleteClientsQuery deleteClients(UserActor actor, int accountId, String ids) {
        return new AdsDeleteClientsQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Deletes a retarget group.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param targetGroupId Group ID.
     * @return query
     */
    public AdsDeleteTargetGroupQuery deleteTargetGroup(UserActor actor, int accountId,
            int targetGroupId) {
        return new AdsDeleteTargetGroupQuery(getClient(), actor, accountId, targetGroupId);
    }

    /**
     * Returns a list of advertising accounts.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetAccountsQuery getAccounts(UserActor actor) {
        return new AdsGetAccountsQuery(getClient(), actor);
    }

    /**
     * Returns number of ads.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetAdsQuery getAds(UserActor actor, int accountId) {
        return new AdsGetAdsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns descriptions of ad layouts.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetAdsLayoutQuery getAdsLayout(UserActor actor, int accountId) {
        return new AdsGetAdsLayoutQuery(getClient(), actor, accountId);
    }

    /**
     * Returns ad targeting parameters.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetAdsTargetingQuery getAdsTargeting(UserActor actor, int accountId) {
        return new AdsGetAdsTargetingQuery(getClient(), actor, accountId);
    }

    /**
     * Returns current budget of the advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetBudgetQuery getBudget(UserActor actor, int accountId) {
        return new AdsGetBudgetQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a list of campaigns in an advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetCampaignsQuery getCampaigns(UserActor actor, int accountId) {
        return new AdsGetCampaignsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns a list of possible ad categories.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetCategoriesQuery getCategories(UserActor actor) {
        return new AdsGetCategoriesQuery(getClient(), actor);
    }

    /**
     * Returns a list of advertising agency's clients.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetClientsQuery getClients(UserActor actor, int accountId) {
        return new AdsGetClientsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns demographics for ads or campaigns.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
     * @param ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
     * @param period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
     * @param dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
     * @param dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
     * @return query
     */
    public AdsGetDemographicsQuery getDemographics(UserActor actor, int accountId,
            AdsIdsType idsType, String ids, AdsPeriod period, String dateFrom, String dateTo) {
        return new AdsGetDemographicsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Returns information about current state of a counter — number of remaining runs of methods and time to the next counter nulling in seconds.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetFloodStatsQuery getFloodStats(UserActor actor, int accountId) {
        return new AdsGetFloodStatsQuery(getClient(), actor, accountId);
    }

    /**
     * @param actor vk actor
     * @param accountId
     * @return query
     */
    public AdsGetLookalikeRequestsQuery getLookalikeRequests(UserActor actor, int accountId) {
        return new AdsGetLookalikeRequestsQuery(getClient(), actor, accountId);
    }

    /**
     * @param actor vk actor
     * @param artistName
     * @return query
     */
    public AdsGetMusiciansQuery getMusicians(UserActor actor, String artistName) {
        return new AdsGetMusiciansQuery(getClient(), actor, artistName);
    }

    /**
     * Returns a list of managers and supervisors of advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetOfficeUsersQuery getOfficeUsers(UserActor actor, int accountId) {
        return new AdsGetOfficeUsersQuery(getClient(), actor, accountId);
    }

    /**
     * Returns detailed statistics of promoted posts reach from campaigns and ads.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
     * @param ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 100 objects.
     * @return query
     */
    public AdsGetPostsReachQuery getPostsReach(UserActor actor, int accountId, AdsIdsType idsType,
            String ids) {
        return new AdsGetPostsReachQuery(getClient(), actor, accountId, idsType, ids);
    }

    /**
     * Returns a reason of ad rejection for pre-moderation.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param adId Ad ID.
     * @return query
     */
    public AdsGetRejectionReasonQuery getRejectionReason(UserActor actor, int accountId, int adId) {
        return new AdsGetRejectionReasonQuery(getClient(), actor, accountId, adId);
    }

    /**
     * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns,, *client — clients,, *office — account.
     * @param ids IDs requested ads, campaigns, clients or account, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
     * @param period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
     * @param dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
     * @param dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
     * @return query
     */
    public AdsGetStatisticsQuery getStatistics(UserActor actor, int accountId, AdsIdsType idsType,
            String ids, AdsPeriod period, String dateFrom, String dateTo) {
        return new AdsGetStatisticsQuery(getClient(), actor, accountId, idsType, ids, period, dateFrom, dateTo);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor vk actor
     * @param section Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
     * @return query
     */
    public AdsGetSuggestionsQuery getSuggestions(UserActor actor, AdsSection section) {
        return new AdsGetSuggestionsQuery(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor vk actor
     * @param section Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
     * @return query
     */
    public AdsGetSuggestionsQueryWithRegions getSuggestionsRegions(UserActor actor,
            AdsSection section) {
        return new AdsGetSuggestionsQueryWithRegions(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor vk actor
     * @param section Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
     * @return query
     */
    public AdsGetSuggestionsQueryWithSchools getSuggestionsSchools(UserActor actor,
            AdsSection section) {
        return new AdsGetSuggestionsQueryWithSchools(getClient(), actor, section);
    }

    /**
     * Returns a set of auto-suggestions for various targeting parameters.
     *
     * @param actor vk actor
     * @param section Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
     * @param cities IDs of cities where objects are searched in, separated with a comma.
     * @return query
     */
    public AdsGetSuggestionsQueryWithCities getSuggestionsWithCities(UserActor actor,
            AdsSection section, String cities) {
        return new AdsGetSuggestionsQueryWithCities(getClient(), actor, section, cities);
    }

    /**
     * Returns a list of target groups.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @return query
     */
    public AdsGetTargetGroupsQuery getTargetGroups(UserActor actor, int accountId) {
        return new AdsGetTargetGroupsQuery(getClient(), actor, accountId);
    }

    /**
     * Returns the size of targeting audience, and also recommended values for CPC and CPM.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param linkUrl URL for the advertised object.
     * @return query
     */
    public AdsGetTargetingStatsQuery getTargetingStats(UserActor actor, int accountId,
            String linkUrl) {
        return new AdsGetTargetingStatsQuery(getClient(), actor, accountId, linkUrl);
    }

    /**
     * Returns URL to upload an ad photo to.
     *
     * @param actor vk actor
     * @param adFormat Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
     * @return query
     */
    public AdsGetUploadURLQuery getUploadURL(UserActor actor, int adFormat) {
        return new AdsGetUploadURLQuery(getClient(), actor, adFormat);
    }

    /**
     * Returns URL to upload an ad video to.
     *
     * @param actor vk actor
     * @return query
     */
    public AdsGetVideoUploadURLQuery getVideoUploadURL(UserActor actor) {
        return new AdsGetVideoUploadURLQuery(getClient(), actor);
    }

    /**
     * Imports a list of advertiser's contacts to count VK registered users against the target group.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param targetGroupId Target group ID.
     * @param contacts List of phone numbers, emails or user IDs separated with a comma.
     * @return query
     */
    public AdsImportTargetContactsQuery importTargetContacts(UserActor actor, int accountId,
            int targetGroupId, String contacts) {
        return new AdsImportTargetContactsQuery(getClient(), actor, accountId, targetGroupId, contacts);
    }

    /**
     * Removes managers and/or supervisors from advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param ids Serialized JSON array with IDs of deleted managers.
     * @return query
     */
    public AdsRemoveOfficeUsersQuery removeOfficeUsers(UserActor actor, int accountId, String ids) {
        return new AdsRemoveOfficeUsersQuery(getClient(), actor, accountId, ids);
    }

    /**
     * Edits ads.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in ads. Description of 'ad_edit_specification' objects see below.
     * @return query
     */
    public AdsUpdateAdsQuery updateAds(UserActor actor, int accountId, String data) {
        return new AdsUpdateAdsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits advertising campaigns.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
     * @return query
     */
    public AdsUpdateCampaignsQuery updateCampaigns(UserActor actor, int accountId, String data) {
        return new AdsUpdateCampaignsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits clients of an advertising agency.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe changes in clients. Description of 'client_mod' objects see below.
     * @return query
     */
    public AdsUpdateClientsQuery updateClients(UserActor actor, int accountId, String data) {
        return new AdsUpdateClientsQuery(getClient(), actor, accountId, data);
    }

    /**
     * Adds managers and/or supervisors to advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     * @return query
     */
    public AdsUpdateOfficeUsersQuery updateOfficeUsers(UserActor actor, int accountId,
            UserSpecification... data) {
        return new AdsUpdateOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Adds managers and/or supervisors to advertising account.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
     * @return query
     */
    public AdsUpdateOfficeUsersQuery updateOfficeUsers(UserActor actor, int accountId,
            List<UserSpecification> data) {
        return new AdsUpdateOfficeUsersQuery(getClient(), actor, accountId, data);
    }

    /**
     * Edits a retarget group.
     *
     * @param actor vk actor
     * @param accountId Advertising account ID.
     * @param targetGroupId Group ID.
     * @param name New name of the target group — a string up to 64 characters long.
     * @param lifetime 'Only for the groups that get audience from sites with user accounting code.', Time in days when users added to a retarget group will be automatically excluded from it. '0' - automatic exclusion is off.
     * @return query
     */
    public AdsUpdateTargetGroupQuery updateTargetGroup(UserActor actor, int accountId,
            int targetGroupId, String name, int lifetime) {
        return new AdsUpdateTargetGroupQuery(getClient(), actor, accountId, targetGroupId, name, lifetime);
    }
}
