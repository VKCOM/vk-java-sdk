package com.vk.api.sdk.objects.groups;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * UserXtrBanInfo object
 */
public class UserXtrBanInfo {
    /**
     * User ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * User first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * User last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Returns if a profile is deleted or blocked
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * Returns if a profile is hidden.
     */
    @SerializedName("hidden")
    private Integer hidden;

    /**
     * User sex
     */
    @SerializedName("sex")
    private Integer sex;

    /**
     * Domain name of the user's page
     */
    @SerializedName("screen_name")
    private String screenName;

    /**
     * URL of square photo of the user with 50 pixels in width
     */
    @SerializedName("photo_50")
    private String photo50;

    /**
     * URL of square photo of the user with 100 pixels in width
     */
    @SerializedName("photo_100")
    private String photo100;

    /**
     * Information whether the user is online
     */
    @SerializedName("online")
    private Integer online;

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
    private JsonObject city;

    @SerializedName("country")
    private JsonObject country;

    /**
     * User's timezone
     */
    @SerializedName("timezone")
    private Integer timezone;

    /**
     * URL of square photo of the user with 200 pixels in width
     */
    @SerializedName("photo_200")
    private String photo200;

    /**
     * URL of square photo of the user with maximum width
     */
    @SerializedName("photo_max")
    private String photoMax;

    /**
     * URL of user's photo with 200 pixels in width
     */
    @SerializedName("photo_200_orig")
    private String photo200Orig;

    /**
     * URL of user's photo with 400 pixels in width
     */
    @SerializedName("photo_400_orig")
    private String photo400Orig;

    /**
     * URL of user's photo of maximum size
     */
    @SerializedName("photo_max_orig")
    private String photoMaxOrig;

    /**
     * ID of the user's main photo
     */
    @SerializedName("photo_id")
    private String photoId;

    /**
     * Information whether the user has main photo
     */
    @SerializedName("has_photo")
    private Integer hasPhoto;

    /**
     * Information whether the user specified his phone number
     */
    @SerializedName("has_mobile")
    private Integer hasMobile;

    /**
     * Information whether the user is a friend of current user
     */
    @SerializedName("is_friend")
    private Integer isFriend;

    /**
     * Friend status for current user
     */
    @SerializedName("friend_status")
    private Integer friendStatus;

    /**
     * Information whether current user can comment wall posts
     */
    @SerializedName("wall_comments")
    private Integer wallComments;

    /**
     * Information whether current user can post on the user's wall
     */
    @SerializedName("can_post")
    private Integer canPost;

    /**
     * Information whether current user can see other users' audio on the wall
     */
    @SerializedName("can_see_all_posts")
    private Integer canSeeAllPosts;

    /**
     * Information whether current user can see the user's audio
     */
    @SerializedName("can_see_audio")
    private Integer canSeeAudio;

    /**
     * Information whether current user can write private message
     */
    @SerializedName("can_write_private_message")
    private Integer canWritePrivateMessage;

    /**
     * Information whether current user can send a friend request
     */
    @SerializedName("can_send_friend_request")
    private Integer canSendFriendRequest;

    /**
     * Information whether current user can see
     */
    @SerializedName("mobile_phone")
    private String mobilePhone;

    /**
     * User's mobile phone number
     */
    @SerializedName("home_phone")
    private String homePhone;

    /**
     * User's Skype nickname
     */
    @SerializedName("skype")
    private String skype;

    /**
     * User's Facebook account
     */
    @SerializedName("facebook")
    private String facebook;

    /**
     * User's Facebook name
     */
    @SerializedName("facebook_name")
    private String facebookName;

    /**
     * User's Twitter account
     */
    @SerializedName("twitter")
    private String twitter;

    /**
     * User's Livejournal account
     */
    @SerializedName("livejournal")
    private String livejournal;

    /**
     * User's Instagram account
     */
    @SerializedName("instagram")
    private String instagram;

    /**
     * User's website
     */
    @SerializedName("site")
    private String site;

    @SerializedName("status_audio")
    private JsonObject statusAudio;

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
    private JsonObject lastSeen;

    @SerializedName("exports")
    private String exports;

    @SerializedName("crop_photo")
    private JsonObject cropPhoto;

    /**
     * Information whether the user is verified
     */
    @SerializedName("verified")
    private Integer verified;

    /**
     * Number of user's followers
     */
    @SerializedName("followers_count")
    private Integer followersCount;

    /**
     * Information whether current user is in the requested user's blacklist.
     */
    @SerializedName("blacklisted")
    private Integer blacklisted;

    /**
     * Information whether the requested user is in current user's blacklist
     */
    @SerializedName("blacklisted_by_me")
    private Integer blacklistedByMe;

    /**
     * Information whether the requested user is in faves of current user
     */
    @SerializedName("is_favorite")
    private Integer isFavorite;

    /**
     * Information whether the requested user is hidden from current user's newsfeed
     */
    @SerializedName("is_hidden_from_feed")
    private Integer isHiddenFromFeed;

    /**
     * Number of common friends with current user
     */
    @SerializedName("common_count")
    private Integer commonCount;

    @SerializedName("occupation")
    private JsonObject occupation;

    @SerializedName("career")
    private List<JsonObject> career;

    @SerializedName("military")
    private List<JsonObject> military;

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
    private Integer relation;

    @SerializedName("relation_partner")
    private JsonObject relationPartner;

    @SerializedName("personal")
    private JsonObject personal;

    /**
     * User's interests
     */
    @SerializedName("interests")
    private String interests;

    /**
     * User's favorite music
     */
    @SerializedName("music")
    private String music;

    /**
     * User's activities
     */
    @SerializedName("activities")
    private String activities;

    /**
     * User's favorite movies
     */
    @SerializedName("movies")
    private String movies;

    /**
     * User's favorite tv shows
     */
    @SerializedName("tv")
    private String tv;

    /**
     * User's favorite books
     */
    @SerializedName("books")
    private String books;

    /**
     * User's favorite games
     */
    @SerializedName("games")
    private String games;

    @SerializedName("universities")
    private List<JsonObject> universities;

    @SerializedName("schools")
    private List<JsonObject> schools;

    /**
     * About me field
     */
    @SerializedName("about")
    private String about;

    @SerializedName("relatives")
    private List<JsonObject> relatives;

    /**
     * Favorite quotes
     */
    @SerializedName("quotes")
    private String quotes;

    @SerializedName("ban_info")
    private JsonObject banInfo;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Integer getHidden() {
        return hidden;
    }

    public Integer getSex() {
        return sex;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public Integer getOnline() {
        return online;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getDomain() {
        return domain;
    }

    public String getBdate() {
        return bdate;
    }

    public JsonObject getCity() {
        return city;
    }

    public JsonObject getCountry() {
        return country;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public String getPhoto200() {
        return photo200;
    }

    public String getPhotoMax() {
        return photoMax;
    }

    public String getPhoto200Orig() {
        return photo200Orig;
    }

    public String getPhoto400Orig() {
        return photo400Orig;
    }

    public String getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public String getPhotoId() {
        return photoId;
    }

    public Integer getHasPhoto() {
        return hasPhoto;
    }

    public Integer getHasMobile() {
        return hasMobile;
    }

    public Integer getIsFriend() {
        return isFriend;
    }

    public Integer getFriendStatus() {
        return friendStatus;
    }

    public Integer getWallComments() {
        return wallComments;
    }

    public Integer getCanPost() {
        return canPost;
    }

    public Integer getCanSeeAllPosts() {
        return canSeeAllPosts;
    }

    public Integer getCanSeeAudio() {
        return canSeeAudio;
    }

    public Integer getCanWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public Integer getCanSendFriendRequest() {
        return canSendFriendRequest;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getSkype() {
        return skype;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getLivejournal() {
        return livejournal;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getSite() {
        return site;
    }

    public JsonObject getStatusAudio() {
        return statusAudio;
    }

    public String getStatus() {
        return status;
    }

    public String getActivity() {
        return activity;
    }

    public JsonObject getLastSeen() {
        return lastSeen;
    }

    public String getExports() {
        return exports;
    }

    public JsonObject getCropPhoto() {
        return cropPhoto;
    }

    public Integer getVerified() {
        return verified;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public Integer getBlacklisted() {
        return blacklisted;
    }

    public Integer getBlacklistedByMe() {
        return blacklistedByMe;
    }

    public Integer getIsFavorite() {
        return isFavorite;
    }

    public Integer getIsHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    public JsonObject getOccupation() {
        return occupation;
    }

    public List<JsonObject> getCareer() {
        return career;
    }

    public List<JsonObject> getMilitary() {
        return military;
    }

    public Integer getUniversity() {
        return university;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Integer getRelation() {
        return relation;
    }

    public JsonObject getRelationPartner() {
        return relationPartner;
    }

    public JsonObject getPersonal() {
        return personal;
    }

    public String getInterests() {
        return interests;
    }

    public String getMusic() {
        return music;
    }

    public String getActivities() {
        return activities;
    }

    public String getMovies() {
        return movies;
    }

    public String getTv() {
        return tv;
    }

    public String getBooks() {
        return books;
    }

    public String getGames() {
        return games;
    }

    public List<JsonObject> getUniversities() {
        return universities;
    }

    public List<JsonObject> getSchools() {
        return schools;
    }

    public String getAbout() {
        return about;
    }

    public List<JsonObject> getRelatives() {
        return relatives;
    }

    public String getQuotes() {
        return quotes;
    }

    public JsonObject getBanInfo() {
        return banInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canSendFriendRequest, universityName, country, career, tv, bdate, occupation, banInfo, about, screenName, instagram, educationForm, deactivated, faculty, relation, quotes, movies, friendStatus, twitter, music, canSeeAudio, homeTown, universities, graduation, photoMaxOrig, games, military, id, canSeeAllPosts, homePhone, livejournal, personal, relatives, firstName, educationStatus, lastSeen, books, hasPhoto, mobilePhone, schools, domain, photo400Orig, followersCount, facultyName, facebookName, isHiddenFromFeed, statusAudio, status, isFavorite, lastName, relationPartner, hidden, activity, city, cropPhoto, timezone, exports, university, photo50, maidenName, photo200, skype, canPost, wallComments, nickname, photoMax, isFriend, commonCount, sex, hasMobile, facebook, verified, photo200Orig, photoId, blacklistedByMe, site, blacklisted, photo100, activities, online, canWritePrivateMessage, interests);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrBanInfo userXtrBanInfo = (UserXtrBanInfo) o;
        return Objects.equals(id, userXtrBanInfo.id) &&
                Objects.equals(firstName, userXtrBanInfo.firstName) &&
                Objects.equals(lastName, userXtrBanInfo.lastName) &&
                Objects.equals(deactivated, userXtrBanInfo.deactivated) &&
                Objects.equals(hidden, userXtrBanInfo.hidden) &&
                Objects.equals(sex, userXtrBanInfo.sex) &&
                Objects.equals(screenName, userXtrBanInfo.screenName) &&
                Objects.equals(photo50, userXtrBanInfo.photo50) &&
                Objects.equals(photo100, userXtrBanInfo.photo100) &&
                Objects.equals(online, userXtrBanInfo.online) &&
                Objects.equals(nickname, userXtrBanInfo.nickname) &&
                Objects.equals(maidenName, userXtrBanInfo.maidenName) &&
                Objects.equals(domain, userXtrBanInfo.domain) &&
                Objects.equals(bdate, userXtrBanInfo.bdate) &&
                Objects.equals(city, userXtrBanInfo.city) &&
                Objects.equals(country, userXtrBanInfo.country) &&
                Objects.equals(timezone, userXtrBanInfo.timezone) &&
                Objects.equals(photo200, userXtrBanInfo.photo200) &&
                Objects.equals(photoMax, userXtrBanInfo.photoMax) &&
                Objects.equals(photo200Orig, userXtrBanInfo.photo200Orig) &&
                Objects.equals(photo400Orig, userXtrBanInfo.photo400Orig) &&
                Objects.equals(photoMaxOrig, userXtrBanInfo.photoMaxOrig) &&
                Objects.equals(photoId, userXtrBanInfo.photoId) &&
                Objects.equals(hasPhoto, userXtrBanInfo.hasPhoto) &&
                Objects.equals(hasMobile, userXtrBanInfo.hasMobile) &&
                Objects.equals(isFriend, userXtrBanInfo.isFriend) &&
                Objects.equals(friendStatus, userXtrBanInfo.friendStatus) &&
                Objects.equals(wallComments, userXtrBanInfo.wallComments) &&
                Objects.equals(canPost, userXtrBanInfo.canPost) &&
                Objects.equals(canSeeAllPosts, userXtrBanInfo.canSeeAllPosts) &&
                Objects.equals(canSeeAudio, userXtrBanInfo.canSeeAudio) &&
                Objects.equals(canWritePrivateMessage, userXtrBanInfo.canWritePrivateMessage) &&
                Objects.equals(canSendFriendRequest, userXtrBanInfo.canSendFriendRequest) &&
                Objects.equals(mobilePhone, userXtrBanInfo.mobilePhone) &&
                Objects.equals(homePhone, userXtrBanInfo.homePhone) &&
                Objects.equals(skype, userXtrBanInfo.skype) &&
                Objects.equals(facebook, userXtrBanInfo.facebook) &&
                Objects.equals(facebookName, userXtrBanInfo.facebookName) &&
                Objects.equals(twitter, userXtrBanInfo.twitter) &&
                Objects.equals(livejournal, userXtrBanInfo.livejournal) &&
                Objects.equals(instagram, userXtrBanInfo.instagram) &&
                Objects.equals(site, userXtrBanInfo.site) &&
                Objects.equals(statusAudio, userXtrBanInfo.statusAudio) &&
                Objects.equals(status, userXtrBanInfo.status) &&
                Objects.equals(activity, userXtrBanInfo.activity) &&
                Objects.equals(lastSeen, userXtrBanInfo.lastSeen) &&
                Objects.equals(exports, userXtrBanInfo.exports) &&
                Objects.equals(cropPhoto, userXtrBanInfo.cropPhoto) &&
                Objects.equals(verified, userXtrBanInfo.verified) &&
                Objects.equals(followersCount, userXtrBanInfo.followersCount) &&
                Objects.equals(blacklisted, userXtrBanInfo.blacklisted) &&
                Objects.equals(blacklistedByMe, userXtrBanInfo.blacklistedByMe) &&
                Objects.equals(isFavorite, userXtrBanInfo.isFavorite) &&
                Objects.equals(isHiddenFromFeed, userXtrBanInfo.isHiddenFromFeed) &&
                Objects.equals(commonCount, userXtrBanInfo.commonCount) &&
                Objects.equals(occupation, userXtrBanInfo.occupation) &&
                Objects.equals(career, userXtrBanInfo.career) &&
                Objects.equals(military, userXtrBanInfo.military) &&
                Objects.equals(university, userXtrBanInfo.university) &&
                Objects.equals(universityName, userXtrBanInfo.universityName) &&
                Objects.equals(faculty, userXtrBanInfo.faculty) &&
                Objects.equals(facultyName, userXtrBanInfo.facultyName) &&
                Objects.equals(graduation, userXtrBanInfo.graduation) &&
                Objects.equals(educationForm, userXtrBanInfo.educationForm) &&
                Objects.equals(educationStatus, userXtrBanInfo.educationStatus) &&
                Objects.equals(homeTown, userXtrBanInfo.homeTown) &&
                Objects.equals(relation, userXtrBanInfo.relation) &&
                Objects.equals(relationPartner, userXtrBanInfo.relationPartner) &&
                Objects.equals(personal, userXtrBanInfo.personal) &&
                Objects.equals(interests, userXtrBanInfo.interests) &&
                Objects.equals(music, userXtrBanInfo.music) &&
                Objects.equals(activities, userXtrBanInfo.activities) &&
                Objects.equals(movies, userXtrBanInfo.movies) &&
                Objects.equals(tv, userXtrBanInfo.tv) &&
                Objects.equals(books, userXtrBanInfo.books) &&
                Objects.equals(games, userXtrBanInfo.games) &&
                Objects.equals(universities, userXtrBanInfo.universities) &&
                Objects.equals(schools, userXtrBanInfo.schools) &&
                Objects.equals(about, userXtrBanInfo.about) &&
                Objects.equals(relatives, userXtrBanInfo.relatives) &&
                Objects.equals(quotes, userXtrBanInfo.quotes) &&
                Objects.equals(banInfo, userXtrBanInfo.banInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrBanInfo{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", hidden=").append(hidden);
        sb.append(", sex=").append(sex);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", online=").append(online);
        sb.append(", nickname='").append(nickname).append("'");
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", domain='").append(domain).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", timezone=").append(timezone);
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", photoMax='").append(photoMax).append("'");
        sb.append(", photo200Orig='").append(photo200Orig).append("'");
        sb.append(", photo400Orig='").append(photo400Orig).append("'");
        sb.append(", photoMaxOrig='").append(photoMaxOrig).append("'");
        sb.append(", photoId='").append(photoId).append("'");
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", isFriend=").append(isFriend);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", wallComments=").append(wallComments);
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest);
        sb.append(", mobilePhone='").append(mobilePhone).append("'");
        sb.append(", homePhone='").append(homePhone).append("'");
        sb.append(", skype='").append(skype).append("'");
        sb.append(", facebook='").append(facebook).append("'");
        sb.append(", facebookName='").append(facebookName).append("'");
        sb.append(", twitter='").append(twitter).append("'");
        sb.append(", livejournal='").append(livejournal).append("'");
        sb.append(", instagram='").append(instagram).append("'");
        sb.append(", site='").append(site).append("'");
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", status='").append(status).append("'");
        sb.append(", activity='").append(activity).append("'");
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", exports='").append(exports).append("'");
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", verified=").append(verified);
        sb.append(", followersCount=").append(followersCount);
        sb.append(", blacklisted=").append(blacklisted);
        sb.append(", blacklistedByMe=").append(blacklistedByMe);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", commonCount=").append(commonCount);
        sb.append(", occupation=").append(occupation);
        sb.append(", career=").append(career);
        sb.append(", military=").append(military);
        sb.append(", university=").append(university);
        sb.append(", universityName='").append(universityName).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", graduation=").append(graduation);
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", personal=").append(personal);
        sb.append(", interests='").append(interests).append("'");
        sb.append(", music='").append(music).append("'");
        sb.append(", activities='").append(activities).append("'");
        sb.append(", movies='").append(movies).append("'");
        sb.append(", tv='").append(tv).append("'");
        sb.append(", books='").append(books).append("'");
        sb.append(", games='").append(games).append("'");
        sb.append(", universities=").append(universities);
        sb.append(", schools=").append(schools);
        sb.append(", about='").append(about).append("'");
        sb.append(", relatives=").append(relatives);
        sb.append(", quotes='").append(quotes).append("'");
        sb.append(", banInfo=").append(banInfo);
        sb.append('}');
        return sb.toString();
    }
}
