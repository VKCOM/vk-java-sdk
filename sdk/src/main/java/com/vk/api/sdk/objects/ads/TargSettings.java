package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * TargSettings object
 */
public class TargSettings extends Criteria {
    /**
     * Ad ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Campaign ID
     */
    @SerializedName("campaign_id")
    private Integer campaignId;

    public Integer getId() {
        return id;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), campaignId, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TargSettings targSettings = (TargSettings) o;
        return Objects.equals(id, targSettings.id) &&
                Objects.equals(campaignId, targSettings.campaignId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSettings{");
        sb.append("ageFrom=").append(getAgeFrom());
        sb.append(", ageTo=").append(getAgeTo());
        sb.append(", apps='").append(getApps()).append('\'');
        sb.append(", appsNot='").append(getAppsNot()).append('\'');
        sb.append(", birthday=").append(getBirthday());
        sb.append(", campaignId=").append(campaignId);
        sb.append(", cities='").append(getCities()).append('\'');
        sb.append(", citiesNot='").append(getCitiesNot()).append('\'');
        sb.append(", country=").append(getCountry());
        sb.append(", districts='").append(getDistricts()).append('\'');
        sb.append(", groups='").append(getGroups()).append('\'');
        sb.append(", id=").append(id);
        sb.append(", interestCategories='").append(getInterestCategories()).append('\'');
        sb.append(", interests='").append(getInterests()).append('\'');
        sb.append(", paying=").append(isPaying());
        sb.append(", positions='").append(getPositions()).append('\'');
        sb.append(", religions='").append(getReligions()).append('\'');
        sb.append(", retargetingGroups='").append(getRetargetingGroups()).append('\'');
        sb.append(", retargetingGroupsNot='").append(getRetargetingGroupsNot()).append('\'');
        sb.append(", schoolFrom=").append(getSchoolFrom());
        sb.append(", schools='").append(getSchools()).append('\'');
        sb.append(", schoolTo=").append(getSchoolTo());
        sb.append(", sex=").append(getSex());
        sb.append(", stations='").append(getStations()).append('\'');
        sb.append(", statuses='").append(getStatuses()).append('\'');
        sb.append(", streets='").append(getStreets()).append('\'');
        sb.append(", travellers=").append(isTravellers());
        sb.append(", uniFrom=").append(getUniFrom());
        sb.append(", uniTo=").append(getUniTo());
        sb.append(", userBrowsers='").append(getUserBrowsers()).append('\'');
        sb.append(", userDevices='").append(getUserDevices()).append('\'');
        sb.append(", userOs='").append(getUserOs()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
