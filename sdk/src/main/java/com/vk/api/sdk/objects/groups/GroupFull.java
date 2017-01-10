package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Country;

import java.util.List;
import java.util.Objects;

/**
 * GroupFull object
 */
public class GroupFull extends Group {

    @SerializedName("market")
    private MarketInfo market;

    /**
     * Current user's member status
     */
    @SerializedName("member_status")
    private GroupFullMemberStatus memberStatus;

    /**
     * Information whether community is in faves
     */
    @SerializedName("is_favorite")
    private BoolInt isFavorite;

    /**
     * Information whether current user is subscribed
     */
    @SerializedName("is_subscribed")
    private BoolInt isSubscribed;

    @SerializedName("city")
    private BaseObject city;

    @SerializedName("country")
    private Country country;

    @SerializedName("cover")
    private Cover cover;

    /**
     * Information whether community is verified
     */
    @SerializedName("verified")
    private BoolInt verified;

    /**
     * Community description
     */
    @SerializedName("description")
    private String description;

    /**
     * Community's main wiki page title
     */
    @SerializedName("wiki_page")
    private String wikiPage;

    /**
     * Community members number
     */
    @SerializedName("members_count")
    private Integer membersCount;

    @SerializedName("counters")
    private CountersGroup counters;

    /**
     * Information whether current user can post on community's wall
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Information whether current user can see all posts on community's wall
     */
    @SerializedName("can_see_all_posts")
    private BoolInt canSeeAllPosts;

    /**
     * Type of group, start date of event or category of public page
     */
    @SerializedName("activity")
    private String activity;

    /**
     * Fixed post ID
     */
    @SerializedName("fixed_post")
    private Integer fixedPost;

    /**
     * Information whether current user can create topic
     */
    @SerializedName("can_create_topic")
    private BoolInt canCreateTopic;

    /**
     * Information whether current user can upload video
     */
    @SerializedName("can_upload_video")
    private BoolInt canUploadVideo;

    /**
     * Community status
     */
    @SerializedName("status")
    private String status;

    /**
     * Community's main photo album ID
     */
    @SerializedName("main_album_id")
    private Integer mainAlbumId;

    @SerializedName("links")
    private List<LinksItem> links;

    @SerializedName("contacts")
    private List<ContactsItem> contacts;

    /**
     * Community's website
     */
    @SerializedName("site")
    private String site;

    /**
     * Main section of community
     */
    @SerializedName("main_section")
    private GroupFullMainSection mainSection;

    /**
     * Information whether current user can send a message to community
     */
    @SerializedName("can_message")
    private BoolInt canMessage;

    /**
     * Information whether current user allow to community send a message
     */
    @SerializedName("is_messages_allowed")
    private BoolInt isMessagesAllowed;

    /**
     * Start date of event in Unixtime
     */
    @SerializedName("start_date")
    private Integer startDate;

    /**
     * Finish date of event in Unixtime
     */
    @SerializedName("finish_date")
    private Integer finishDate;

    /**
     * Information whether community is banned
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Information whether age limit
     */
    @SerializedName("age_limits")
    private GroupFullAgeLimits ageLimits;

    public MarketInfo getMarket() {
        return market;
    }

    public GroupFullMemberStatus getMemberStatus() {
        return memberStatus;
    }

    public boolean isIsFavorite() {
        return isFavorite == BoolInt.YES;
    }

    public boolean isIsSubscribed() {
        return isSubscribed == BoolInt.YES;
    }

    public BaseObject getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public boolean isVerified() {
        return verified == BoolInt.YES;
    }

    public String getDescription() {
        return description;
    }

    public String getWikiPage() {
        return wikiPage;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public CountersGroup getCounters() {
        return counters;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts == BoolInt.YES;
    }

    public String getActivity() {
        return activity;
    }

    public Integer getFixedPost() {
        return fixedPost;
    }

    public boolean canCreateTopic() {
        return canCreateTopic == BoolInt.YES;
    }

    public boolean canUploadVideo() {
        return canUploadVideo == BoolInt.YES;
    }

    public String getStatus() {
        return status;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public List<LinksItem> getLinks() {
        return links;
    }

    public List<ContactsItem> getContacts() {
        return contacts;
    }

    public String getSite() {
        return site;
    }

    public GroupFullMainSection getMainSection() {
        return mainSection;
    }

    public boolean canMessage() {
        return canMessage == BoolInt.YES;
    }

    public boolean isMessagesAllowed() {
        return isMessagesAllowed == BoolInt.YES;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public GroupFullAgeLimits getAgeLimits() {
        return ageLimits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country, wikiPage, mainSection, canCreateTopic, activity, city, memberStatus, description,
                deactivated, isSubscribed, mainAlbumId, canPost, canUploadVideo, links, membersCount, counters,
                canSeeAllPosts, verified, canMessage, isMessagesAllowed, market, ageLimits, site, fixedPost, finishDate,
                contacts, startDate, isFavorite, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GroupFull groupFull = (GroupFull) o;
        return Objects.equals(market, groupFull.market) &&
                Objects.equals(memberStatus, groupFull.memberStatus) &&
                Objects.equals(isFavorite, groupFull.isFavorite) &&
                Objects.equals(isSubscribed, groupFull.isSubscribed) &&
                Objects.equals(city, groupFull.city) &&
                Objects.equals(country, groupFull.country) &&
                Objects.equals(verified, groupFull.verified) &&
                Objects.equals(description, groupFull.description) &&
                Objects.equals(wikiPage, groupFull.wikiPage) &&
                Objects.equals(membersCount, groupFull.membersCount) &&
                Objects.equals(counters, groupFull.counters) &&
                Objects.equals(canPost, groupFull.canPost) &&
                Objects.equals(canSeeAllPosts, groupFull.canSeeAllPosts) &&
                Objects.equals(activity, groupFull.activity) &&
                Objects.equals(fixedPost, groupFull.fixedPost) &&
                Objects.equals(canCreateTopic, groupFull.canCreateTopic) &&
                Objects.equals(canUploadVideo, groupFull.canUploadVideo) &&
                Objects.equals(status, groupFull.status) &&
                Objects.equals(mainAlbumId, groupFull.mainAlbumId) &&
                Objects.equals(links, groupFull.links) &&
                Objects.equals(contacts, groupFull.contacts) &&
                Objects.equals(site, groupFull.site) &&
                Objects.equals(mainSection, groupFull.mainSection) &&
                Objects.equals(canMessage, groupFull.canMessage) &&
                Objects.equals(isMessagesAllowed, groupFull.isMessagesAllowed) &&
                Objects.equals(startDate, groupFull.startDate) &&
                Objects.equals(finishDate, groupFull.finishDate) &&
                Objects.equals(deactivated, groupFull.deactivated) &&
                Objects.equals(ageLimits, groupFull.ageLimits);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupFull{");
        sb.append("market=").append(market);
        sb.append(", memberStatus=").append(memberStatus);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", verified=").append(verified);
        sb.append(", description='").append(description).append("'");
        sb.append(", wikiPage='").append(wikiPage).append("'");
        sb.append(", membersCount=").append(membersCount);
        sb.append(", counters=").append(counters);
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", activity='").append(activity).append("'");
        sb.append(", fixedPost=").append(fixedPost);
        sb.append(", canCreateTopic=").append(canCreateTopic);
        sb.append(", canUploadVideo=").append(canUploadVideo);
        sb.append(", status='").append(status).append("'");
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", links=").append(links);
        sb.append(", contacts=").append(contacts);
        sb.append(", site='").append(site).append("'");
        sb.append(", mainSection=").append(mainSection);
        sb.append(", canMessage=").append(canMessage);
        sb.append(", isMessagesAllowed=").append(isMessagesAllowed);
        sb.append(", startDate=").append(startDate);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", ageLimits=").append(ageLimits);
        sb.append('}');
        return sb.toString();
    }
}
