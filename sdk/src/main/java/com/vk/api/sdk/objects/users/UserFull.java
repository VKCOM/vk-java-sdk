package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.City;
import com.vk.api.sdk.objects.base.Country;
import com.vk.api.sdk.objects.base.CropPhoto;
import com.vk.api.sdk.objects.owner.State;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.photos.PhotoFalseable;
import com.vk.api.sdk.objects.video.LiveInfo;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * UserFull object
 */
public class UserFull extends User implements Validable {
    /**
     * User's first name in nominative case
     */
    @SerializedName("first_name_nom")
    private String firstNameNom;

    /**
     * User's first name in genitive case
     */
    @SerializedName("first_name_gen")
    private String firstNameGen;

    /**
     * User's first name in dative case
     */
    @SerializedName("first_name_dat")
    private String firstNameDat;

    /**
     * User's first name in accusative case
     */
    @SerializedName("first_name_acc")
    private String firstNameAcc;

    /**
     * User's first name in instrumental case
     */
    @SerializedName("first_name_ins")
    private String firstNameIns;

    /**
     * User's first name in prepositional case
     */
    @SerializedName("first_name_abl")
    private String firstNameAbl;

    /**
     * User's last name in nominative case
     */
    @SerializedName("last_name_nom")
    private String lastNameNom;

    /**
     * User's last name in genitive case
     */
    @SerializedName("last_name_gen")
    private String lastNameGen;

    /**
     * User's last name in dative case
     */
    @SerializedName("last_name_dat")
    private String lastNameDat;

    /**
     * User's last name in accusative case
     */
    @SerializedName("last_name_acc")
    private String lastNameAcc;

    /**
     * User's last name in instrumental case
     */
    @SerializedName("last_name_ins")
    private String lastNameIns;

    /**
     * User's last name in prepositional case
     */
    @SerializedName("last_name_abl")
    private String lastNameAbl;

    /**
     * User nickname
     */
    @SerializedName("nickname")
    private String nickname;

    /**
     * User maiden name
     */
    @SerializedName("maiden_name")
    private String maidenName;

    /**
     * User contact name
     */
    @SerializedName("contact_name")
    private String contactName;

    /**
     * Domain name of the user's page
     */
    @SerializedName("domain")
    private String domain;

    /**
     * User's date of birth
     */
    @SerializedName("bdate")
    private String bdate;

    @SerializedName("city")
    private City city;

    @SerializedName("country")
    private Country country;

    /**
     * User's timezone
     */
    @SerializedName("timezone")
    private Float timezone;

    @SerializedName("owner_state")
    private State ownerState;

    /**
     * URL of square photo of the user with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * URL of square photo of the user with maximum width
     */
    @SerializedName("photo_max")
    private URI photoMax;

    /**
     * URL of user's photo with 200 pixels in width
     */
    @SerializedName("photo_200_orig")
    private URI photo200Orig;

    /**
     * URL of user's photo with 400 pixels in width
     */
    @SerializedName("photo_400_orig")
    private URI photo400Orig;

    /**
     * URL of user's photo of maximum size
     */
    @SerializedName("photo_max_orig")
    private URI photoMaxOrig;

    /**
     * ID of the user's main photo
     */
    @SerializedName("photo_id")
    private String photoId;

    /**
     * Information whether the user has main photo
     */
    @SerializedName("has_photo")
    private BoolInt hasPhoto;

    /**
     * Information whether the user specified his phone number
     */
    @SerializedName("has_mobile")
    private BoolInt hasMobile;

    /**
     * Information whether the user is a friend of current user
     */
    @SerializedName("is_friend")
    private BoolInt isFriend;

    /**
     * Information whether current user can comment wall posts
     */
    @SerializedName("wall_comments")
    private BoolInt wallComments;

    /**
     * Information whether current user can post on the user's wall
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Information whether current user can see other users' audio on the wall
     */
    @SerializedName("can_see_all_posts")
    private BoolInt canSeeAllPosts;

    /**
     * Information whether current user can see the user's audio
     */
    @SerializedName("can_see_audio")
    private BoolInt canSeeAudio;

    @SerializedName("type")
    private UserType type;

    @SerializedName("email")
    private String email;

    @SerializedName("skype")
    private String skype;

    @SerializedName("facebook")
    private String facebook;

    @SerializedName("facebook_name")
    private String facebookName;

    @SerializedName("twitter")
    private String twitter;

    @SerializedName("livejournal")
    private String livejournal;

    @SerializedName("instagram")
    private String instagram;

    @SerializedName("test")
    private BoolInt test;

    @SerializedName("video_live")
    private LiveInfo videoLive;

    @SerializedName("is_video_live_notifications_blocked")
    private BoolInt isVideoLiveNotificationsBlocked;

    @SerializedName("is_service")
    private Boolean isService;

    @SerializedName("service_description")
    private String serviceDescription;

    @SerializedName("photo_rec")
    private PhotoFalseable photoRec;

    @SerializedName("photo_medium")
    private PhotoFalseable photoMedium;

    @SerializedName("photo_medium_rec")
    private PhotoFalseable photoMediumRec;

    @SerializedName("photo")
    private String photo;

    @SerializedName("photo_big")
    private String photoBig;

    @SerializedName("photo_400")
    private String photo400;

    @SerializedName("photo_max_size")
    private Photo photoMaxSize;

    @SerializedName("language")
    private String language;

    @SerializedName("stories_archive_count")
    private Integer storiesArchiveCount;

    @SerializedName("wall_default")
    private UserFullWallDefault wallDefault;

    /**
     * Information whether current user can call
     */
    @SerializedName("can_call")
    private Boolean canCall;

    /**
     * Information whether current user can see the user's wishes
     */
    @SerializedName("can_see_wishes")
    private Boolean canSeeWishes;

    /**
     * Information whether current user can see the user's gifts
     */
    @SerializedName("can_see_gifts")
    private BoolInt canSeeGifts;

    @SerializedName("interests")
    private String interests;

    @SerializedName("books")
    private String books;

    @SerializedName("tv")
    private String tv;

    @SerializedName("quotes")
    private String quotes;

    @SerializedName("about")
    private String about;

    @SerializedName("games")
    private String games;

    @SerializedName("movies")
    private String movies;

    @SerializedName("activities")
    private String activities;

    @SerializedName("music")
    private String music;

    /**
     * Information whether current user can write private message
     */
    @SerializedName("can_write_private_message")
    private BoolInt canWritePrivateMessage;

    /**
     * Information whether current user can send a friend request
     */
    @SerializedName("can_send_friend_request")
    private BoolInt canSendFriendRequest;

    /**
     * Information whether current user can be invited to the community
     */
    @SerializedName("can_be_invited_group")
    private Boolean canBeInvitedGroup;

    /**
     * User's mobile phone number
     */
    @SerializedName("mobile_phone")
    private String mobilePhone;

    /**
     * User's additional phone number
     */
    @SerializedName("home_phone")
    private String homePhone;

    /**
     * User's website
     */
    @SerializedName("site")
    private String site;

    @SerializedName("status_audio")
    private Audio statusAudio;

    /**
     * User's status
     */
    @SerializedName("status")
    private String status;

    /**
     * User's status
     */
    @SerializedName("activity")
    private String activity;

    @SerializedName("last_seen")
    private LastSeen lastSeen;

    @SerializedName("exports")
    private Exports exports;

    @SerializedName("crop_photo")
    private CropPhoto cropPhoto;

    /**
     * Number of user's followers
     */
    @SerializedName("followers_count")
    private Integer followersCount;

    /**
     * User level in live streams achievements
     */
    @SerializedName("video_live_level")
    private Integer videoLiveLevel;

    /**
     * Number of user's live streams
     */
    @SerializedName("video_live_count")
    private Integer videoLiveCount;

    /**
     * Number of user's clips
     */
    @SerializedName("clips_count")
    private Integer clipsCount;

    /**
     * Information whether current user is in the requested user's blacklist.
     */
    @SerializedName("blacklisted")
    private BoolInt blacklisted;

    /**
     * Information whether the requested user is in current user's blacklist
     */
    @SerializedName("blacklisted_by_me")
    private BoolInt blacklistedByMe;

    /**
     * Information whether the requested user is in faves of current user
     */
    @SerializedName("is_favorite")
    private BoolInt isFavorite;

    /**
     * Information whether the requested user is hidden from current user's newsfeed
     */
    @SerializedName("is_hidden_from_feed")
    private BoolInt isHiddenFromFeed;

    /**
     * Number of common friends with current user
     */
    @SerializedName("common_count")
    private Integer commonCount;

    @SerializedName("occupation")
    private Occupation occupation;

    @SerializedName("career")
    private List<Career> career;

    @SerializedName("military")
    private List<Military> military;

    /**
     * University ID
     */
    @SerializedName("university")
    private Integer university;

    /**
     * University name
     */
    @SerializedName("university_name")
    private String universityName;

    @SerializedName("university_group_id")
    private Integer universityGroupId;

    /**
     * Faculty ID
     */
    @SerializedName("faculty")
    private Integer faculty;

    /**
     * Faculty name
     */
    @SerializedName("faculty_name")
    private String facultyName;

    /**
     * Graduation year
     */
    @SerializedName("graduation")
    private Integer graduation;

    /**
     * Education form
     */
    @SerializedName("education_form")
    private String educationForm;

    /**
     * User's education status
     */
    @SerializedName("education_status")
    private String educationStatus;

    /**
     * User hometown
     */
    @SerializedName("home_town")
    private String homeTown;

    /**
     * User relationship status
     */
    @SerializedName("relation")
    private UserRelation relation;

    @SerializedName("relation_partner")
    private UserMin relationPartner;

    @SerializedName("personal")
    private Personal personal;

    @SerializedName("universities")
    private List<University> universities;

    @SerializedName("schools")
    private List<School> schools;

    @SerializedName("relatives")
    private List<Relative> relatives;

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

    @SerializedName("counters")
    private UserCounters counters;

    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("can_upload_doc")
    private BoolInt canUploadDoc;

    @SerializedName("hash")
    private String hash;

    @SerializedName("has_email")
    private Boolean hasEmail;

    public String getFirstNameNom() {
        return firstNameNom;
    }

    public UserFull setFirstNameNom(String firstNameNom) {
        this.firstNameNom = firstNameNom;
        return this;
    }

    public String getFirstNameGen() {
        return firstNameGen;
    }

    public UserFull setFirstNameGen(String firstNameGen) {
        this.firstNameGen = firstNameGen;
        return this;
    }

    public String getFirstNameDat() {
        return firstNameDat;
    }

    public UserFull setFirstNameDat(String firstNameDat) {
        this.firstNameDat = firstNameDat;
        return this;
    }

    public String getFirstNameAcc() {
        return firstNameAcc;
    }

    public UserFull setFirstNameAcc(String firstNameAcc) {
        this.firstNameAcc = firstNameAcc;
        return this;
    }

    public String getFirstNameIns() {
        return firstNameIns;
    }

    public UserFull setFirstNameIns(String firstNameIns) {
        this.firstNameIns = firstNameIns;
        return this;
    }

    public String getFirstNameAbl() {
        return firstNameAbl;
    }

    public UserFull setFirstNameAbl(String firstNameAbl) {
        this.firstNameAbl = firstNameAbl;
        return this;
    }

    public String getLastNameNom() {
        return lastNameNom;
    }

    public UserFull setLastNameNom(String lastNameNom) {
        this.lastNameNom = lastNameNom;
        return this;
    }

    public String getLastNameGen() {
        return lastNameGen;
    }

    public UserFull setLastNameGen(String lastNameGen) {
        this.lastNameGen = lastNameGen;
        return this;
    }

    public String getLastNameDat() {
        return lastNameDat;
    }

    public UserFull setLastNameDat(String lastNameDat) {
        this.lastNameDat = lastNameDat;
        return this;
    }

    public String getLastNameAcc() {
        return lastNameAcc;
    }

    public UserFull setLastNameAcc(String lastNameAcc) {
        this.lastNameAcc = lastNameAcc;
        return this;
    }

    public String getLastNameIns() {
        return lastNameIns;
    }

    public UserFull setLastNameIns(String lastNameIns) {
        this.lastNameIns = lastNameIns;
        return this;
    }

    public String getLastNameAbl() {
        return lastNameAbl;
    }

    public UserFull setLastNameAbl(String lastNameAbl) {
        this.lastNameAbl = lastNameAbl;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserFull setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public UserFull setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public UserFull setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public UserFull setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getBdate() {
        return bdate;
    }

    public UserFull setBdate(String bdate) {
        this.bdate = bdate;
        return this;
    }

    public City getCity() {
        return city;
    }

    public UserFull setCity(City city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public UserFull setCountry(Country country) {
        this.country = country;
        return this;
    }

    public Float getTimezone() {
        return timezone;
    }

    public UserFull setTimezone(Float timezone) {
        this.timezone = timezone;
        return this;
    }

    public State getOwnerState() {
        return ownerState;
    }

    public UserFull setOwnerState(State ownerState) {
        this.ownerState = ownerState;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public UserFull setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhotoMax() {
        return photoMax;
    }

    public UserFull setPhotoMax(URI photoMax) {
        this.photoMax = photoMax;
        return this;
    }

    public URI getPhoto200Orig() {
        return photo200Orig;
    }

    public UserFull setPhoto200Orig(URI photo200Orig) {
        this.photo200Orig = photo200Orig;
        return this;
    }

    public URI getPhoto400Orig() {
        return photo400Orig;
    }

    public UserFull setPhoto400Orig(URI photo400Orig) {
        this.photo400Orig = photo400Orig;
        return this;
    }

    public URI getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public UserFull setPhotoMaxOrig(URI photoMaxOrig) {
        this.photoMaxOrig = photoMaxOrig;
        return this;
    }

    public String getPhotoId() {
        return photoId;
    }

    public UserFull setPhotoId(String photoId) {
        this.photoId = photoId;
        return this;
    }

    public boolean isHasPhoto() {
        return hasPhoto == BoolInt.YES;
    }

    public BoolInt getHasPhoto() {
        return hasPhoto;
    }

    public boolean isHasMobile() {
        return hasMobile == BoolInt.YES;
    }

    public BoolInt getHasMobile() {
        return hasMobile;
    }

    public boolean isFriend() {
        return isFriend == BoolInt.YES;
    }

    public BoolInt getIsFriend() {
        return isFriend;
    }

    public boolean isWallComments() {
        return wallComments == BoolInt.YES;
    }

    public BoolInt getWallComments() {
        return wallComments;
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

    public boolean canSeeAudio() {
        return canSeeAudio == BoolInt.YES;
    }

    public BoolInt getCanSeeAudio() {
        return canSeeAudio;
    }

    public UserType getType() {
        return type;
    }

    public UserFull setType(UserType type) {
        this.type = type;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserFull setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSkype() {
        return skype;
    }

    public UserFull setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public String getFacebook() {
        return facebook;
    }

    public UserFull setFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public UserFull setFacebookName(String facebookName) {
        this.facebookName = facebookName;
        return this;
    }

    public String getTwitter() {
        return twitter;
    }

    public UserFull setTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    public String getLivejournal() {
        return livejournal;
    }

    public UserFull setLivejournal(String livejournal) {
        this.livejournal = livejournal;
        return this;
    }

    public String getInstagram() {
        return instagram;
    }

    public UserFull setInstagram(String instagram) {
        this.instagram = instagram;
        return this;
    }

    public boolean isTest() {
        return test == BoolInt.YES;
    }

    public BoolInt getTest() {
        return test;
    }

    public LiveInfo getVideoLive() {
        return videoLive;
    }

    public UserFull setVideoLive(LiveInfo videoLive) {
        this.videoLive = videoLive;
        return this;
    }

    public boolean isVideoLiveNotificationsBlocked() {
        return isVideoLiveNotificationsBlocked == BoolInt.YES;
    }

    public BoolInt getIsVideoLiveNotificationsBlocked() {
        return isVideoLiveNotificationsBlocked;
    }

    public Boolean getIsService() {
        return isService;
    }

    public UserFull setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public UserFull setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }

    public PhotoFalseable getPhotoRec() {
        return photoRec;
    }

    public UserFull setPhotoRec(PhotoFalseable photoRec) {
        this.photoRec = photoRec;
        return this;
    }

    public PhotoFalseable getPhotoMedium() {
        return photoMedium;
    }

    public UserFull setPhotoMedium(PhotoFalseable photoMedium) {
        this.photoMedium = photoMedium;
        return this;
    }

    public PhotoFalseable getPhotoMediumRec() {
        return photoMediumRec;
    }

    public UserFull setPhotoMediumRec(PhotoFalseable photoMediumRec) {
        this.photoMediumRec = photoMediumRec;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public UserFull setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhotoBig() {
        return photoBig;
    }

    public UserFull setPhotoBig(String photoBig) {
        this.photoBig = photoBig;
        return this;
    }

    public String getPhoto400() {
        return photo400;
    }

    public UserFull setPhoto400(String photo400) {
        this.photo400 = photo400;
        return this;
    }

    public Photo getPhotoMaxSize() {
        return photoMaxSize;
    }

    public UserFull setPhotoMaxSize(Photo photoMaxSize) {
        this.photoMaxSize = photoMaxSize;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public UserFull setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Integer getStoriesArchiveCount() {
        return storiesArchiveCount;
    }

    public UserFull setStoriesArchiveCount(Integer storiesArchiveCount) {
        this.storiesArchiveCount = storiesArchiveCount;
        return this;
    }

    public UserFullWallDefault getWallDefault() {
        return wallDefault;
    }

    public UserFull setWallDefault(UserFullWallDefault wallDefault) {
        this.wallDefault = wallDefault;
        return this;
    }

    public Boolean getCanCall() {
        return canCall;
    }

    public UserFull setCanCall(Boolean canCall) {
        this.canCall = canCall;
        return this;
    }

    public Boolean getCanSeeWishes() {
        return canSeeWishes;
    }

    public UserFull setCanSeeWishes(Boolean canSeeWishes) {
        this.canSeeWishes = canSeeWishes;
        return this;
    }

    public boolean canSeeGifts() {
        return canSeeGifts == BoolInt.YES;
    }

    public BoolInt getCanSeeGifts() {
        return canSeeGifts;
    }

    public String getInterests() {
        return interests;
    }

    public UserFull setInterests(String interests) {
        this.interests = interests;
        return this;
    }

    public String getBooks() {
        return books;
    }

    public UserFull setBooks(String books) {
        this.books = books;
        return this;
    }

    public String getTv() {
        return tv;
    }

    public UserFull setTv(String tv) {
        this.tv = tv;
        return this;
    }

    public String getQuotes() {
        return quotes;
    }

    public UserFull setQuotes(String quotes) {
        this.quotes = quotes;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public UserFull setAbout(String about) {
        this.about = about;
        return this;
    }

    public String getGames() {
        return games;
    }

    public UserFull setGames(String games) {
        this.games = games;
        return this;
    }

    public String getMovies() {
        return movies;
    }

    public UserFull setMovies(String movies) {
        this.movies = movies;
        return this;
    }

    public String getActivities() {
        return activities;
    }

    public UserFull setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    public String getMusic() {
        return music;
    }

    public UserFull setMusic(String music) {
        this.music = music;
        return this;
    }

    public boolean canWritePrivateMessage() {
        return canWritePrivateMessage == BoolInt.YES;
    }

    public BoolInt getCanWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public boolean canSendFriendRequest() {
        return canSendFriendRequest == BoolInt.YES;
    }

    public BoolInt getCanSendFriendRequest() {
        return canSendFriendRequest;
    }

    public Boolean getCanBeInvitedGroup() {
        return canBeInvitedGroup;
    }

    public UserFull setCanBeInvitedGroup(Boolean canBeInvitedGroup) {
        this.canBeInvitedGroup = canBeInvitedGroup;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public UserFull setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public UserFull setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getSite() {
        return site;
    }

    public UserFull setSite(String site) {
        this.site = site;
        return this;
    }

    public Audio getStatusAudio() {
        return statusAudio;
    }

    public UserFull setStatusAudio(Audio statusAudio) {
        this.statusAudio = statusAudio;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserFull setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getActivity() {
        return activity;
    }

    public UserFull setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public LastSeen getLastSeen() {
        return lastSeen;
    }

    public UserFull setLastSeen(LastSeen lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public Exports getExports() {
        return exports;
    }

    public UserFull setExports(Exports exports) {
        this.exports = exports;
        return this;
    }

    public CropPhoto getCropPhoto() {
        return cropPhoto;
    }

    public UserFull setCropPhoto(CropPhoto cropPhoto) {
        this.cropPhoto = cropPhoto;
        return this;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public UserFull setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    public Integer getVideoLiveLevel() {
        return videoLiveLevel;
    }

    public UserFull setVideoLiveLevel(Integer videoLiveLevel) {
        this.videoLiveLevel = videoLiveLevel;
        return this;
    }

    public Integer getVideoLiveCount() {
        return videoLiveCount;
    }

    public UserFull setVideoLiveCount(Integer videoLiveCount) {
        this.videoLiveCount = videoLiveCount;
        return this;
    }

    public Integer getClipsCount() {
        return clipsCount;
    }

    public UserFull setClipsCount(Integer clipsCount) {
        this.clipsCount = clipsCount;
        return this;
    }

    public boolean isBlacklisted() {
        return blacklisted == BoolInt.YES;
    }

    public BoolInt getBlacklisted() {
        return blacklisted;
    }

    public boolean isBlacklistedByMe() {
        return blacklistedByMe == BoolInt.YES;
    }

    public BoolInt getBlacklistedByMe() {
        return blacklistedByMe;
    }

    public boolean isFavorite() {
        return isFavorite == BoolInt.YES;
    }

    public BoolInt getIsFavorite() {
        return isFavorite;
    }

    public boolean isHiddenFromFeed() {
        return isHiddenFromFeed == BoolInt.YES;
    }

    public BoolInt getIsHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    public UserFull setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
        return this;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public UserFull setOccupation(Occupation occupation) {
        this.occupation = occupation;
        return this;
    }

    public List<Career> getCareer() {
        return career;
    }

    public UserFull setCareer(List<Career> career) {
        this.career = career;
        return this;
    }

    public List<Military> getMilitary() {
        return military;
    }

    public UserFull setMilitary(List<Military> military) {
        this.military = military;
        return this;
    }

    public Integer getUniversity() {
        return university;
    }

    public UserFull setUniversity(Integer university) {
        this.university = university;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public UserFull setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public Integer getUniversityGroupId() {
        return universityGroupId;
    }

    public UserFull setUniversityGroupId(Integer universityGroupId) {
        this.universityGroupId = universityGroupId;
        return this;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public UserFull setFaculty(Integer faculty) {
        this.faculty = faculty;
        return this;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public UserFull setFacultyName(String facultyName) {
        this.facultyName = facultyName;
        return this;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public UserFull setGraduation(Integer graduation) {
        this.graduation = graduation;
        return this;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public UserFull setEducationForm(String educationForm) {
        this.educationForm = educationForm;
        return this;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public UserFull setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
        return this;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public UserFull setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public UserRelation getRelation() {
        return relation;
    }

    public UserFull setRelation(UserRelation relation) {
        this.relation = relation;
        return this;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public UserFull setRelationPartner(UserMin relationPartner) {
        this.relationPartner = relationPartner;
        return this;
    }

    public Personal getPersonal() {
        return personal;
    }

    public UserFull setPersonal(Personal personal) {
        this.personal = personal;
        return this;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public UserFull setUniversities(List<University> universities) {
        this.universities = universities;
        return this;
    }

    public List<School> getSchools() {
        return schools;
    }

    public UserFull setSchools(List<School> schools) {
        this.schools = schools;
        return this;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public UserFull setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
        return this;
    }

    public Boolean getIsSubscribedPodcasts() {
        return isSubscribedPodcasts;
    }

    public UserFull setIsSubscribedPodcasts(Boolean isSubscribedPodcasts) {
        this.isSubscribedPodcasts = isSubscribedPodcasts;
        return this;
    }

    public Boolean getCanSubscribePodcasts() {
        return canSubscribePodcasts;
    }

    public UserFull setCanSubscribePodcasts(Boolean canSubscribePodcasts) {
        this.canSubscribePodcasts = canSubscribePodcasts;
        return this;
    }

    public Boolean getCanSubscribePosts() {
        return canSubscribePosts;
    }

    public UserFull setCanSubscribePosts(Boolean canSubscribePosts) {
        this.canSubscribePosts = canSubscribePosts;
        return this;
    }

    public UserCounters getCounters() {
        return counters;
    }

    public UserFull setCounters(UserCounters counters) {
        this.counters = counters;
        return this;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public UserFull setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public boolean canUploadDoc() {
        return canUploadDoc == BoolInt.YES;
    }

    public BoolInt getCanUploadDoc() {
        return canUploadDoc;
    }

    public String getHash() {
        return hash;
    }

    public UserFull setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Boolean getHasEmail() {
        return hasEmail;
    }

    public UserFull setHasEmail(Boolean hasEmail) {
        this.hasEmail = hasEmail;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canBeInvitedGroup, career, occupation, about, instagram, type, quotes, relation, movies, ownerState, twitter, music, universities, homeTown, graduation, games, storiesArchiveCount, lastNameIns, firstNameGen, counters, canSeeAllPosts, photoMediumRec, personal, educationStatus, videoLiveCount, books, lastSeen, canSubscribePodcasts, hasPhoto, mobilePhone, schools, domain, lastNameNom, facultyName, followersCount, hash, facebookName, statusAudio, status, activity, city, maidenName, photo200, videoLiveLevel, skype, canPost, photoMaxSize, canSeeGifts, nickname, wallDefault, commonCount, email, isVideoLiveNotificationsBlocked, photoBig, lastNameDat, facebook, videoLive, photoId, photo, photo200Orig, lastNameAcc, site, blacklisted, firstNameIns, interests, canSendFriendRequest, universityName, country, canSubscribePosts, tv, bdate, language, educationForm, faculty, canSeeAudio, photoMaxOrig, military, firstNameNom, lastNameAbl, isService, test, contactName, homePhone, livejournal, relatives, canUploadDoc, accessKey, photo400Orig, isHiddenFromFeed, lastNameGen, isFavorite, relationPartner, cropPhoto, timezone, exports, university, isSubscribedPodcasts, photoMedium, photo400, firstNameAcc, clipsCount, hasEmail, universityGroupId, firstNameDat, wallComments, photoMax, isFriend, canSeeWishes, hasMobile, blacklistedByMe, canCall, photoRec, activities, firstNameAbl, serviceDescription, canWritePrivateMessage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserFull userFull = (UserFull) o;
        return Objects.equals(canCall, userFull.canCall) &&
                Objects.equals(career, userFull.career) &&
                Objects.equals(universityGroupId, userFull.universityGroupId) &&
                Objects.equals(occupation, userFull.occupation) &&
                Objects.equals(about, userFull.about) &&
                Objects.equals(photoBig, userFull.photoBig) &&
                Objects.equals(instagram, userFull.instagram) &&
                Objects.equals(type, userFull.type) &&
                Objects.equals(statusAudio, userFull.statusAudio) &&
                Objects.equals(quotes, userFull.quotes) &&
                Objects.equals(relation, userFull.relation) &&
                Objects.equals(isService, userFull.isService) &&
                Objects.equals(movies, userFull.movies) &&
                Objects.equals(firstNameGen, userFull.firstNameGen) &&
                Objects.equals(storiesArchiveCount, userFull.storiesArchiveCount) &&
                Objects.equals(relationPartner, userFull.relationPartner) &&
                Objects.equals(twitter, userFull.twitter) &&
                Objects.equals(photoMaxSize, userFull.photoMaxSize) &&
                Objects.equals(music, userFull.music) &&
                Objects.equals(universities, userFull.universities) &&
                Objects.equals(graduation, userFull.graduation) &&
                Objects.equals(lastNameNom, userFull.lastNameNom) &&
                Objects.equals(games, userFull.games) &&
                Objects.equals(canSeeAllPosts, userFull.canSeeAllPosts) &&
                Objects.equals(canSeeWishes, userFull.canSeeWishes) &&
                Objects.equals(commonCount, userFull.commonCount) &&
                Objects.equals(counters, userFull.counters) &&
                Objects.equals(firstNameAcc, userFull.firstNameAcc) &&
                Objects.equals(personal, userFull.personal) &&
                Objects.equals(photoMediumRec, userFull.photoMediumRec) &&
                Objects.equals(books, userFull.books) &&
                Objects.equals(isSubscribedPodcasts, userFull.isSubscribedPodcasts) &&
                Objects.equals(schools, userFull.schools) &&
                Objects.equals(domain, userFull.domain) &&
                Objects.equals(firstNameAbl, userFull.firstNameAbl) &&
                Objects.equals(hash, userFull.hash) &&
                Objects.equals(status, userFull.status) &&
                Objects.equals(hasMobile, userFull.hasMobile) &&
                Objects.equals(photoId, userFull.photoId) &&
                Objects.equals(activity, userFull.activity) &&
                Objects.equals(city, userFull.city) &&
                Objects.equals(canSeeGifts, userFull.canSeeGifts) &&
                Objects.equals(hasPhoto, userFull.hasPhoto) &&
                Objects.equals(skype, userFull.skype) &&
                Objects.equals(nickname, userFull.nickname) &&
                Objects.equals(photo200, userFull.photo200) &&
                Objects.equals(email, userFull.email) &&
                Objects.equals(contactName, userFull.contactName) &&
                Objects.equals(isVideoLiveNotificationsBlocked, userFull.isVideoLiveNotificationsBlocked) &&
                Objects.equals(facebook, userFull.facebook) &&
                Objects.equals(photo, userFull.photo) &&
                Objects.equals(educationStatus, userFull.educationStatus) &&
                Objects.equals(photoMedium, userFull.photoMedium) &&
                Objects.equals(site, userFull.site) &&
                Objects.equals(blacklisted, userFull.blacklisted) &&
                Objects.equals(wallDefault, userFull.wallDefault) &&
                Objects.equals(cropPhoto, userFull.cropPhoto) &&
                Objects.equals(lastNameIns, userFull.lastNameIns) &&
                Objects.equals(photoRec, userFull.photoRec) &&
                Objects.equals(interests, userFull.interests) &&
                Objects.equals(isFriend, userFull.isFriend) &&
                Objects.equals(country, userFull.country) &&
                Objects.equals(tv, userFull.tv) &&
                Objects.equals(bdate, userFull.bdate) &&
                Objects.equals(canSendFriendRequest, userFull.canSendFriendRequest) &&
                Objects.equals(lastSeen, userFull.lastSeen) &&
                Objects.equals(blacklistedByMe, userFull.blacklistedByMe) &&
                Objects.equals(language, userFull.language) &&
                Objects.equals(educationForm, userFull.educationForm) &&
                Objects.equals(faculty, userFull.faculty) &&
                Objects.equals(canSubscribePodcasts, userFull.canSubscribePodcasts) &&
                Objects.equals(military, userFull.military) &&
                Objects.equals(lastNameGen, userFull.lastNameGen) &&
                Objects.equals(firstNameNom, userFull.firstNameNom) &&
                Objects.equals(homePhone, userFull.homePhone) &&
                Objects.equals(test, userFull.test) &&
                Objects.equals(videoLiveCount, userFull.videoLiveCount) &&
                Objects.equals(livejournal, userFull.livejournal) &&
                Objects.equals(relatives, userFull.relatives) &&
                Objects.equals(photoMax, userFull.photoMax) &&
                Objects.equals(canSeeAudio, userFull.canSeeAudio) &&
                Objects.equals(firstNameIns, userFull.firstNameIns) &&
                Objects.equals(homeTown, userFull.homeTown) &&
                Objects.equals(canBeInvitedGroup, userFull.canBeInvitedGroup) &&
                Objects.equals(ownerState, userFull.ownerState) &&
                Objects.equals(videoLive, userFull.videoLive) &&
                Objects.equals(photo200Orig, userFull.photo200Orig) &&
                Objects.equals(photo400Orig, userFull.photo400Orig) &&
                Objects.equals(clipsCount, userFull.clipsCount) &&
                Objects.equals(isFavorite, userFull.isFavorite) &&
                Objects.equals(timezone, userFull.timezone) &&
                Objects.equals(exports, userFull.exports) &&
                Objects.equals(university, userFull.university) &&
                Objects.equals(firstNameDat, userFull.firstNameDat) &&
                Objects.equals(canSubscribePosts, userFull.canSubscribePosts) &&
                Objects.equals(photoMaxOrig, userFull.photoMaxOrig) &&
                Objects.equals(facultyName, userFull.facultyName) &&
                Objects.equals(lastNameDat, userFull.lastNameDat) &&
                Objects.equals(mobilePhone, userFull.mobilePhone) &&
                Objects.equals(isHiddenFromFeed, userFull.isHiddenFromFeed) &&
                Objects.equals(canPost, userFull.canPost) &&
                Objects.equals(hasEmail, userFull.hasEmail) &&
                Objects.equals(photo400, userFull.photo400) &&
                Objects.equals(maidenName, userFull.maidenName) &&
                Objects.equals(wallComments, userFull.wallComments) &&
                Objects.equals(serviceDescription, userFull.serviceDescription) &&
                Objects.equals(videoLiveLevel, userFull.videoLiveLevel) &&
                Objects.equals(universityName, userFull.universityName) &&
                Objects.equals(canUploadDoc, userFull.canUploadDoc) &&
                Objects.equals(lastNameAcc, userFull.lastNameAcc) &&
                Objects.equals(canWritePrivateMessage, userFull.canWritePrivateMessage) &&
                Objects.equals(activities, userFull.activities) &&
                Objects.equals(followersCount, userFull.followersCount) &&
                Objects.equals(accessKey, userFull.accessKey) &&
                Objects.equals(facebookName, userFull.facebookName) &&
                Objects.equals(lastNameAbl, userFull.lastNameAbl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserFull{");
        sb.append("canCall=").append(canCall);
        sb.append(", career=").append(career);
        sb.append(", universityGroupId=").append(universityGroupId);
        sb.append(", occupation=").append(occupation);
        sb.append(", about='").append(about).append("'");
        sb.append(", photoBig='").append(photoBig).append("'");
        sb.append(", instagram='").append(instagram).append("'");
        sb.append(", type=").append(type);
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", quotes='").append(quotes).append("'");
        sb.append(", relation=").append(relation);
        sb.append(", isService=").append(isService);
        sb.append(", movies='").append(movies).append("'");
        sb.append(", firstNameGen='").append(firstNameGen).append("'");
        sb.append(", storiesArchiveCount=").append(storiesArchiveCount);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", twitter='").append(twitter).append("'");
        sb.append(", photoMaxSize=").append(photoMaxSize);
        sb.append(", music='").append(music).append("'");
        sb.append(", universities=").append(universities);
        sb.append(", graduation=").append(graduation);
        sb.append(", lastNameNom='").append(lastNameNom).append("'");
        sb.append(", games='").append(games).append("'");
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canSeeWishes=").append(canSeeWishes);
        sb.append(", commonCount=").append(commonCount);
        sb.append(", counters=").append(counters);
        sb.append(", firstNameAcc='").append(firstNameAcc).append("'");
        sb.append(", personal=").append(personal);
        sb.append(", photoMediumRec=").append(photoMediumRec);
        sb.append(", books='").append(books).append("'");
        sb.append(", isSubscribedPodcasts=").append(isSubscribedPodcasts);
        sb.append(", schools=").append(schools);
        sb.append(", domain='").append(domain).append("'");
        sb.append(", firstNameAbl='").append(firstNameAbl).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", photoId='").append(photoId).append("'");
        sb.append(", activity='").append(activity).append("'");
        sb.append(", city=").append(city);
        sb.append(", canSeeGifts=").append(canSeeGifts);
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", skype='").append(skype).append("'");
        sb.append(", nickname='").append(nickname).append("'");
        sb.append(", photo200=").append(photo200);
        sb.append(", email='").append(email).append("'");
        sb.append(", contactName='").append(contactName).append("'");
        sb.append(", isVideoLiveNotificationsBlocked=").append(isVideoLiveNotificationsBlocked);
        sb.append(", facebook='").append(facebook).append("'");
        sb.append(", photo='").append(photo).append("'");
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append(", photoMedium=").append(photoMedium);
        sb.append(", site='").append(site).append("'");
        sb.append(", blacklisted=").append(blacklisted);
        sb.append(", wallDefault='").append(wallDefault).append("'");
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", lastNameIns='").append(lastNameIns).append("'");
        sb.append(", photoRec=").append(photoRec);
        sb.append(", interests='").append(interests).append("'");
        sb.append(", isFriend=").append(isFriend);
        sb.append(", country=").append(country);
        sb.append(", tv='").append(tv).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", blacklistedByMe=").append(blacklistedByMe);
        sb.append(", language='").append(language).append("'");
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append(", canSubscribePodcasts=").append(canSubscribePodcasts);
        sb.append(", military=").append(military);
        sb.append(", lastNameGen='").append(lastNameGen).append("'");
        sb.append(", firstNameNom='").append(firstNameNom).append("'");
        sb.append(", homePhone='").append(homePhone).append("'");
        sb.append(", test=").append(test);
        sb.append(", videoLiveCount=").append(videoLiveCount);
        sb.append(", livejournal='").append(livejournal).append("'");
        sb.append(", relatives=").append(relatives);
        sb.append(", photoMax=").append(photoMax);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", firstNameIns='").append(firstNameIns).append("'");
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", canBeInvitedGroup=").append(canBeInvitedGroup);
        sb.append(", ownerState=").append(ownerState);
        sb.append(", videoLive=").append(videoLive);
        sb.append(", photo200Orig=").append(photo200Orig);
        sb.append(", photo400Orig=").append(photo400Orig);
        sb.append(", clipsCount=").append(clipsCount);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", timezone=").append(timezone);
        sb.append(", exports=").append(exports);
        sb.append(", university=").append(university);
        sb.append(", firstNameDat='").append(firstNameDat).append("'");
        sb.append(", canSubscribePosts=").append(canSubscribePosts);
        sb.append(", photoMaxOrig=").append(photoMaxOrig);
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", lastNameDat='").append(lastNameDat).append("'");
        sb.append(", mobilePhone='").append(mobilePhone).append("'");
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", canPost=").append(canPost);
        sb.append(", hasEmail=").append(hasEmail);
        sb.append(", photo400='").append(photo400).append("'");
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", wallComments=").append(wallComments);
        sb.append(", serviceDescription='").append(serviceDescription).append("'");
        sb.append(", videoLiveLevel=").append(videoLiveLevel);
        sb.append(", universityName='").append(universityName).append("'");
        sb.append(", canUploadDoc=").append(canUploadDoc);
        sb.append(", lastNameAcc='").append(lastNameAcc).append("'");
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", activities='").append(activities).append("'");
        sb.append(", followersCount=").append(followersCount);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", facebookName='").append(facebookName).append("'");
        sb.append(", lastNameAbl='").append(lastNameAbl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
