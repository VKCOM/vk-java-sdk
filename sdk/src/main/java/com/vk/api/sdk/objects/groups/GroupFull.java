package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Country;
import java.util.List;
import java.util.Objects;

/**
 * GroupFull object
 */
public class GroupFull extends Group implements Validable {
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

    @SerializedName("cover")
    private Cover cover;

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
     * Information whether community has photo
     */
    @SerializedName("has_photo")
    private BoolInt hasPhoto;

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

    @SerializedName("main_section")
    private GroupFullMainSection mainSection;

    /**
     * Information whether the community has a "fire" pictogram.
     */
    @SerializedName("trending")
    private BoolInt trending;

    /**
     * Information whether current user can send a message to community
     */
    @SerializedName("can_message")
    private BoolInt canMessage;

    /**
     * Information whether community can send a message to current user
     */
    @SerializedName("is_messages_blocked")
    private BoolInt isMessagesBlocked;

    /**
     * Information whether community can send notifications by phone number to current user
     */
    @SerializedName("can_send_notify")
    private BoolInt canSendNotify;

    /**
     * Status of replies in community messages
     */
    @SerializedName("online_status")
    private OnlineStatus onlineStatus;

    /**
     * Information whether age limit
     */
    @SerializedName("age_limits")
    private GroupFullAgeLimits ageLimits;

    /**
     * User ban info
     */
    @SerializedName("ban_info")
    private GroupBanInfo banInfo;

    /**
     * Info about addresses in groups
     */
    @SerializedName("addresses")
    private AddressesInfo addresses;

    /**
     * Information whether current user is subscribed to podcasts
     */
    @SerializedName("is_subscribed_podcasts")
    private Boolean isSubscribedPodcasts;

    /**
     * Owner in whitelist or not
     */
    @SerializedName("can_subscribe_podcasts")
    private Boolean canSubscribePodcasts;

    /**
     * Can subscribe to wall
     */
    @SerializedName("can_subscribe_posts")
    private Boolean canSubscribePosts;

    public MarketInfo getMarket() {
        return market;
    }

    public GroupFull setMarket(MarketInfo market) {
        this.market = market;
        return this;
    }

    public GroupFullMemberStatus getMemberStatus() {
        return memberStatus;
    }

    public GroupFull setMemberStatus(GroupFullMemberStatus memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    public boolean isFavorite() {
        return isFavorite == BoolInt.YES;
    }

    public BoolInt getIsFavorite() {
        return isFavorite;
    }

    public boolean isSubscribed() {
        return isSubscribed == BoolInt.YES;
    }

    public BoolInt getIsSubscribed() {
        return isSubscribed;
    }

    public BaseObject getCity() {
        return city;
    }

    public GroupFull setCity(BaseObject city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public GroupFull setCountry(Country country) {
        this.country = country;
        return this;
    }

    public boolean isVerified() {
        return verified == BoolInt.YES;
    }

    public BoolInt getVerified() {
        return verified;
    }

    public String getDescription() {
        return description;
    }

    public GroupFull setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getWikiPage() {
        return wikiPage;
    }

    public GroupFull setWikiPage(String wikiPage) {
        this.wikiPage = wikiPage;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public GroupFull setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public CountersGroup getCounters() {
        return counters;
    }

    public GroupFull setCounters(CountersGroup counters) {
        this.counters = counters;
        return this;
    }

    public Cover getCover() {
        return cover;
    }

    public GroupFull setCover(Cover cover) {
        this.cover = cover;
        return this;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts == BoolInt.YES;
    }

    public BoolInt getCanSeeAllPosts() {
        return canSeeAllPosts;
    }

    public String getActivity() {
        return activity;
    }

    public GroupFull setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public Integer getFixedPost() {
        return fixedPost;
    }

    public GroupFull setFixedPost(Integer fixedPost) {
        this.fixedPost = fixedPost;
        return this;
    }

    public boolean canCreateTopic() {
        return canCreateTopic == BoolInt.YES;
    }

    public BoolInt getCanCreateTopic() {
        return canCreateTopic;
    }

    public boolean canUploadVideo() {
        return canUploadVideo == BoolInt.YES;
    }

    public BoolInt getCanUploadVideo() {
        return canUploadVideo;
    }

    public boolean isHasPhoto() {
        return hasPhoto == BoolInt.YES;
    }

    public BoolInt getHasPhoto() {
        return hasPhoto;
    }

    public String getStatus() {
        return status;
    }

    public GroupFull setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public GroupFull setMainAlbumId(Integer mainAlbumId) {
        this.mainAlbumId = mainAlbumId;
        return this;
    }

    public List<LinksItem> getLinks() {
        return links;
    }

    public GroupFull setLinks(List<LinksItem> links) {
        this.links = links;
        return this;
    }

    public List<ContactsItem> getContacts() {
        return contacts;
    }

    public GroupFull setContacts(List<ContactsItem> contacts) {
        this.contacts = contacts;
        return this;
    }

    public String getSite() {
        return site;
    }

    public GroupFull setSite(String site) {
        this.site = site;
        return this;
    }

    public GroupFullMainSection getMainSection() {
        return mainSection;
    }

    public GroupFull setMainSection(GroupFullMainSection mainSection) {
        this.mainSection = mainSection;
        return this;
    }

    public boolean isTrending() {
        return trending == BoolInt.YES;
    }

    public BoolInt getTrending() {
        return trending;
    }

    public boolean canMessage() {
        return canMessage == BoolInt.YES;
    }

    public BoolInt getCanMessage() {
        return canMessage;
    }

    public boolean isMessagesBlocked() {
        return isMessagesBlocked == BoolInt.YES;
    }

    public BoolInt getIsMessagesBlocked() {
        return isMessagesBlocked;
    }

    public boolean canSendNotify() {
        return canSendNotify == BoolInt.YES;
    }

    public BoolInt getCanSendNotify() {
        return canSendNotify;
    }

    public OnlineStatus getOnlineStatus() {
        return onlineStatus;
    }

    public GroupFull setOnlineStatus(OnlineStatus onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    public GroupFullAgeLimits getAgeLimits() {
        return ageLimits;
    }

    public GroupFull setAgeLimits(GroupFullAgeLimits ageLimits) {
        this.ageLimits = ageLimits;
        return this;
    }

    public GroupBanInfo getBanInfo() {
        return banInfo;
    }

    public GroupFull setBanInfo(GroupBanInfo banInfo) {
        this.banInfo = banInfo;
        return this;
    }

    public AddressesInfo getAddresses() {
        return addresses;
    }

    public GroupFull setAddresses(AddressesInfo addresses) {
        this.addresses = addresses;
        return this;
    }

    public Boolean getIsSubscribedPodcasts() {
        return isSubscribedPodcasts;
    }

    public GroupFull setIsSubscribedPodcasts(Boolean isSubscribedPodcasts) {
        this.isSubscribedPodcasts = isSubscribedPodcasts;
        return this;
    }

    public Boolean getCanSubscribePodcasts() {
        return canSubscribePodcasts;
    }

    public GroupFull setCanSubscribePodcasts(Boolean canSubscribePodcasts) {
        this.canSubscribePodcasts = canSubscribePodcasts;
        return this;
    }

    public Boolean getCanSubscribePosts() {
        return canSubscribePosts;
    }

    public GroupFull setCanSubscribePosts(Boolean canSubscribePosts) {
        this.canSubscribePosts = canSubscribePosts;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trending, country, canSubscribePosts, wikiPage, addresses, mainSection, canCreateTopic, activity, banInfo, city, onlineStatus, isSubscribedPodcasts, description, memberStatus, canSendNotify, cover, mainAlbumId, isSubscribed, canPost, canUploadVideo, links, isMessagesBlocked, membersCount, counters, canSeeAllPosts, verified, canMessage, market, ageLimits, site, canSubscribePodcasts, hasPhoto, fixedPost, contacts, isFavorite, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupFull groupFull = (GroupFull) o;
        return Objects.equals(canCreateTopic, groupFull.canCreateTopic) &&
                Objects.equals(trending, groupFull.trending) &&
                Objects.equals(country, groupFull.country) &&
                Objects.equals(fixedPost, groupFull.fixedPost) &&
                Objects.equals(addresses, groupFull.addresses) &&
                Objects.equals(isFavorite, groupFull.isFavorite) &&
                Objects.equals(activity, groupFull.activity) &&
                Objects.equals(city, groupFull.city) &&
                Objects.equals(canSubscribePosts, groupFull.canSubscribePosts) &&
                Objects.equals(description, groupFull.description) &&
                Objects.equals(hasPhoto, groupFull.hasPhoto) &&
                Objects.equals(mainSection, groupFull.mainSection) &&
                Objects.equals(banInfo, groupFull.banInfo) &&
                Objects.equals(cover, groupFull.cover) &&
                Objects.equals(canSubscribePodcasts, groupFull.canSubscribePodcasts) &&
                Objects.equals(memberStatus, groupFull.memberStatus) &&
                Objects.equals(canSendNotify, groupFull.canSendNotify) &&
                Objects.equals(canPost, groupFull.canPost) &&
                Objects.equals(links, groupFull.links) &&
                Objects.equals(canSeeAllPosts, groupFull.canSeeAllPosts) &&
                Objects.equals(mainAlbumId, groupFull.mainAlbumId) &&
                Objects.equals(isMessagesBlocked, groupFull.isMessagesBlocked) &&
                Objects.equals(canUploadVideo, groupFull.canUploadVideo) &&
                Objects.equals(counters, groupFull.counters) &&
                Objects.equals(onlineStatus, groupFull.onlineStatus) &&
                Objects.equals(verified, groupFull.verified) &&
                Objects.equals(market, groupFull.market) &&
                Objects.equals(ageLimits, groupFull.ageLimits) &&
                Objects.equals(site, groupFull.site) &&
                Objects.equals(isSubscribedPodcasts, groupFull.isSubscribedPodcasts) &&
                Objects.equals(isSubscribed, groupFull.isSubscribed) &&
                Objects.equals(membersCount, groupFull.membersCount) &&
                Objects.equals(contacts, groupFull.contacts) &&
                Objects.equals(wikiPage, groupFull.wikiPage) &&
                Objects.equals(status, groupFull.status) &&
                Objects.equals(canMessage, groupFull.canMessage);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupFull{");
        sb.append("canCreateTopic=").append(canCreateTopic);
        sb.append(", trending=").append(trending);
        sb.append(", country=").append(country);
        sb.append(", fixedPost=").append(fixedPost);
        sb.append(", addresses=").append(addresses);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", activity='").append(activity).append("'");
        sb.append(", city=").append(city);
        sb.append(", canSubscribePosts=").append(canSubscribePosts);
        sb.append(", description='").append(description).append("'");
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", mainSection=").append(mainSection);
        sb.append(", banInfo=").append(banInfo);
        sb.append(", cover=").append(cover);
        sb.append(", canSubscribePodcasts=").append(canSubscribePodcasts);
        sb.append(", memberStatus=").append(memberStatus);
        sb.append(", canSendNotify=").append(canSendNotify);
        sb.append(", canPost=").append(canPost);
        sb.append(", links=").append(links);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", isMessagesBlocked=").append(isMessagesBlocked);
        sb.append(", canUploadVideo=").append(canUploadVideo);
        sb.append(", counters=").append(counters);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", verified=").append(verified);
        sb.append(", market=").append(market);
        sb.append(", ageLimits=").append(ageLimits);
        sb.append(", site='").append(site).append("'");
        sb.append(", isSubscribedPodcasts=").append(isSubscribedPodcasts);
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", contacts=").append(contacts);
        sb.append(", wikiPage='").append(wikiPage).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append(", canMessage=").append(canMessage);
        sb.append('}');
        return sb.toString();
    }
}
