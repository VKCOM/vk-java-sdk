package com.vk.api.sdk.objects.users;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * UserXtrCounters object
 */
public class UserXtrCounters extends UserFull {
    @SerializedName("counters")
    private UserCounters counters;

    public UserCounters getCounters() {
        return counters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), counters);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrCounters userXtrCounters = (UserXtrCounters) o;
        return Objects.equals(counters, userXtrCounters.counters);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrCounters{");
        sb.append("about='").append(getAbout()).append('\'');
        sb.append(", activities='").append(getActivities()).append('\'');
        sb.append(", activity='").append(getActivity()).append('\'');
        sb.append(", bdate='").append(getBdate()).append('\'');
        sb.append(", blacklisted=").append(isBlacklisted());
        sb.append(", blacklistedByMe=").append(isBlacklistedByMe());
        sb.append(", books='").append(getBooks()).append('\'');
        sb.append(", canPost=").append(canPost());
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts());
        sb.append(", canSeeAudio=").append(canSeeAudio());
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest());
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage());
        sb.append(", career=").append(getCareer());
        sb.append(", city=").append(getCity());
        sb.append(", commonCount=").append(getCommonCount());
        sb.append(", counters=").append(counters);
        sb.append(", country=").append(getCountry());
        sb.append(", cropPhoto=").append(getCropPhoto());
        sb.append(", deactivated='").append(getDeactivated()).append('\'');
        sb.append(", domain='").append(getDomain()).append('\'');
        sb.append(", educationForm='").append(getEducationForm()).append('\'');
        sb.append(", educationStatus='").append(getEducationStatus()).append('\'');
        sb.append(", exports=").append(getExports());
        sb.append(", facebook='").append(getFacebook()).append('\'');
        sb.append(", facebookName='").append(getFacebookName()).append('\'');
        sb.append(", faculty=").append(getFaculty());
        sb.append(", facultyName='").append(getFacultyName()).append('\'');
        sb.append(", favorite=").append(isFavorite());
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", followersCount=").append(getFollowersCount());
        sb.append(", friend=").append(isFriend());
        sb.append(", friendStatus=").append(getFriendStatus());
        sb.append(", games='").append(getGames()).append('\'');
        sb.append(", graduation=").append(getGraduation());
        sb.append(", hasMobile=").append(hasMobile());
        sb.append(", hasPhoto=").append(hasPhoto());
        sb.append(", hidden=").append(getHidden());
        sb.append(", hiddenFromFeed=").append(isHiddenFromFeed());
        sb.append(", homePhone='").append(getHomePhone()).append('\'');
        sb.append(", homeTown='").append(getHomeTown()).append('\'');
        sb.append(", id=").append(getId());
        sb.append(", instagram='").append(getInstagram()).append('\'');
        sb.append(", interests='").append(getInterests()).append('\'');
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", lastSeen=").append(getLastSeen());
        sb.append(", livejournal='").append(getLivejournal()).append('\'');
        sb.append(", maidenName='").append(getMaidenName()).append('\'');
        sb.append(", military=").append(getMilitary());
        sb.append(", mobilePhone='").append(getMobilePhone()).append('\'');
        sb.append(", movies='").append(getMovies()).append('\'');
        sb.append(", music='").append(getMusic()).append('\'');
        sb.append(", nickname='").append(getNickname()).append('\'');
        sb.append(", occupation=").append(getOccupation());
        sb.append(", online=").append(isOnline());
        sb.append(", onlineApp=").append(getOnlineApp());
        sb.append(", onlineMobile=").append(isOnlineMobile());
        sb.append(", personal=").append(getPersonal());
        sb.append(", photo100='").append(getPhoto100()).append('\'');
        sb.append(", photo200='").append(getPhoto200()).append('\'');
        sb.append(", photo200Orig='").append(getPhoto200Orig()).append('\'');
        sb.append(", photo400Orig='").append(getPhoto400Orig()).append('\'');
        sb.append(", photo50='").append(getPhoto50()).append('\'');
        sb.append(", photoId='").append(getPhotoId()).append('\'');
        sb.append(", photoMax='").append(getPhotoMax()).append('\'');
        sb.append(", photoMaxOrig='").append(getPhotoMaxOrig()).append('\'');
        sb.append(", quotes='").append(getQuotes()).append('\'');
        sb.append(", relation=").append(getRelation());
        sb.append(", relationPartner=").append(getRelationPartner());
        sb.append(", relatives=").append(getRelatives());
        sb.append(", schools=").append(getSchools());
        sb.append(", screenName='").append(getScreenName()).append('\'');
        sb.append(", sex=").append(getSex());
        sb.append(", site='").append(getSite()).append('\'');
        sb.append(", skype='").append(getSkype()).append('\'');
        sb.append(", status='").append(getStatus()).append('\'');
        sb.append(", statusAudio=").append(getStatusAudio());
        sb.append(", timezone=").append(getTimezone());
        sb.append(", tv='").append(getTv()).append('\'');
        sb.append(", twitter='").append(getTwitter()).append('\'');
        sb.append(", universities=").append(getUniversities());
        sb.append(", university=").append(getUniversity());
        sb.append(", universityName='").append(getUniversityName()).append('\'');
        sb.append(", verified=").append(isVerified());
        sb.append(", wallComments=").append(isWallComments());
        sb.append(", trending=").append(isTrending());
        sb.append('}');
        return sb.toString();
    }
}
