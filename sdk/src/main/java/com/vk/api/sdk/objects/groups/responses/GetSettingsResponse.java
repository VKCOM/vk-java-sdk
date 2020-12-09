package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.groups.GroupAccess;
import com.vk.api.sdk.objects.groups.GroupAgeLimits;
import com.vk.api.sdk.objects.groups.GroupAudio;
import com.vk.api.sdk.objects.groups.GroupDocs;
import com.vk.api.sdk.objects.groups.GroupFullMainSection;
import com.vk.api.sdk.objects.groups.GroupPhotos;
import com.vk.api.sdk.objects.groups.GroupPublicCategoryList;
import com.vk.api.sdk.objects.groups.GroupSuggestedPrivacy;
import com.vk.api.sdk.objects.groups.GroupTopics;
import com.vk.api.sdk.objects.groups.GroupVideo;
import com.vk.api.sdk.objects.groups.GroupWall;
import com.vk.api.sdk.objects.groups.GroupWiki;
import com.vk.api.sdk.objects.groups.SettingsTwitter;
import com.vk.api.sdk.objects.groups.SubjectItem;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * GetSettingsResponse object
 */
public class GetSettingsResponse implements Validable {
    /**
     * Community access settings
     */
    @SerializedName("access")
    private GroupAccess access;

    /**
     * Community's page domain
     */
    @SerializedName("address")
    private String address;

    /**
     * Audio settings
     */
    @SerializedName("audio")
    @Required
    private GroupAudio audio;

    /**
     * Articles settings
     */
    @SerializedName("articles")
    @Required
    private Integer articles;

    /**
     * Photo suggests setting
     */
    @SerializedName("recognize_photo")
    private Integer recognizePhoto;

    /**
     * City id of group
     */
    @SerializedName("city_id")
    private Integer cityId;

    @SerializedName("contacts")
    private BoolInt contacts;

    @SerializedName("links")
    private BoolInt links;

    @SerializedName("sections_list")
    private List<JsonObject> sectionsList;

    @SerializedName("main_section")
    private GroupFullMainSection mainSection;

    @SerializedName("secondary_section")
    private Integer secondarySection;

    @SerializedName("age_limits")
    private GroupAgeLimits ageLimits;

    /**
     * Country id of group
     */
    @SerializedName("country_id")
    private Integer countryId;

    /**
     * Community description
     */
    @SerializedName("description")
    @Required
    private String description;

    /**
     * Docs settings
     */
    @SerializedName("docs")
    @Required
    private GroupDocs docs;

    @SerializedName("events")
    private BoolInt events;

    /**
     * Information whether the obscene filter is enabled
     */
    @SerializedName("obscene_filter")
    private BoolInt obsceneFilter;

    /**
     * Information whether the stopwords filter is enabled
     */
    @SerializedName("obscene_stopwords")
    private BoolInt obsceneStopwords;

    /**
     * The list of stop words
     */
    @SerializedName("obscene_words")
    private List<String> obsceneWords;

    @SerializedName("event_group_id")
    private Integer eventGroupId;

    /**
     * Photos settings
     */
    @SerializedName("photos")
    @Required
    private GroupPhotos photos;

    /**
     * Information about the group category
     */
    @SerializedName("public_category")
    private Integer publicCategory;

    @SerializedName("public_category_list")
    private List<GroupPublicCategoryList> publicCategoryList;

    @SerializedName("public_date")
    private String publicDate;

    @SerializedName("public_date_label")
    private String publicDateLabel;

    /**
     * Information about the group subcategory
     */
    @SerializedName("public_subcategory")
    private Integer publicSubcategory;

    /**
     * URL of the RSS feed
     */
    @SerializedName("rss")
    private URI rss;

    /**
     * Start date
     */
    @SerializedName("start_date")
    private Integer startDate;

    /**
     * Finish date in Unixtime format
     */
    @SerializedName("finish_date")
    private Integer finishDate;

    /**
     * Community subject ID
     */
    @SerializedName("subject")
    private Integer subject;

    @SerializedName("subject_list")
    private List<SubjectItem> subjectList;

    @SerializedName("suggested_privacy")
    private GroupSuggestedPrivacy suggestedPrivacy;

    /**
     * Community title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Topics settings
     */
    @SerializedName("topics")
    @Required
    private GroupTopics topics;

    @SerializedName("twitter")
    private SettingsTwitter twitter;

    /**
     * Video settings
     */
    @SerializedName("video")
    @Required
    private GroupVideo video;

    /**
     * Wall settings
     */
    @SerializedName("wall")
    @Required
    private GroupWall wall;

    /**
     * Community website
     */
    @SerializedName("website")
    private String website;

    /**
     * Community phone
     */
    @SerializedName("phone")
    private String phone;

    /**
     * Community email
     */
    @SerializedName("email")
    private String email;

    /**
     * Wiki settings
     */
    @SerializedName("wiki")
    @Required
    private GroupWiki wiki;

    public GroupAccess getAccess() {
        return access;
    }

    public GetSettingsResponse setAccess(GroupAccess access) {
        this.access = access;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public GetSettingsResponse setAddress(String address) {
        this.address = address;
        return this;
    }

    public GroupAudio getAudio() {
        return audio;
    }

    public GetSettingsResponse setAudio(GroupAudio audio) {
        this.audio = audio;
        return this;
    }

    public Integer getArticles() {
        return articles;
    }

    public GetSettingsResponse setArticles(Integer articles) {
        this.articles = articles;
        return this;
    }

    public Integer getRecognizePhoto() {
        return recognizePhoto;
    }

    public GetSettingsResponse setRecognizePhoto(Integer recognizePhoto) {
        this.recognizePhoto = recognizePhoto;
        return this;
    }

    public Integer getCityId() {
        return cityId;
    }

    public GetSettingsResponse setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public boolean isContacts() {
        return contacts == BoolInt.YES;
    }

    public BoolInt getContacts() {
        return contacts;
    }

    public boolean isLinks() {
        return links == BoolInt.YES;
    }

    public BoolInt getLinks() {
        return links;
    }

    public List<JsonObject> getSectionsList() {
        return sectionsList;
    }

    public GetSettingsResponse setSectionsList(List<JsonObject> sectionsList) {
        this.sectionsList = sectionsList;
        return this;
    }

    public GroupFullMainSection getMainSection() {
        return mainSection;
    }

    public GetSettingsResponse setMainSection(GroupFullMainSection mainSection) {
        this.mainSection = mainSection;
        return this;
    }

    public Integer getSecondarySection() {
        return secondarySection;
    }

    public GetSettingsResponse setSecondarySection(Integer secondarySection) {
        this.secondarySection = secondarySection;
        return this;
    }

    public GroupAgeLimits getAgeLimits() {
        return ageLimits;
    }

    public GetSettingsResponse setAgeLimits(GroupAgeLimits ageLimits) {
        this.ageLimits = ageLimits;
        return this;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public GetSettingsResponse setCountryId(Integer countryId) {
        this.countryId = countryId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetSettingsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public GroupDocs getDocs() {
        return docs;
    }

    public GetSettingsResponse setDocs(GroupDocs docs) {
        this.docs = docs;
        return this;
    }

    public boolean isEvents() {
        return events == BoolInt.YES;
    }

    public BoolInt getEvents() {
        return events;
    }

    public boolean isObsceneFilter() {
        return obsceneFilter == BoolInt.YES;
    }

    public BoolInt getObsceneFilter() {
        return obsceneFilter;
    }

    public boolean isObsceneStopwords() {
        return obsceneStopwords == BoolInt.YES;
    }

    public BoolInt getObsceneStopwords() {
        return obsceneStopwords;
    }

    public List<String> getObsceneWords() {
        return obsceneWords;
    }

    public GetSettingsResponse setObsceneWords(List<String> obsceneWords) {
        this.obsceneWords = obsceneWords;
        return this;
    }

    public Integer getEventGroupId() {
        return eventGroupId;
    }

    public GetSettingsResponse setEventGroupId(Integer eventGroupId) {
        this.eventGroupId = eventGroupId;
        return this;
    }

    public GroupPhotos getPhotos() {
        return photos;
    }

    public GetSettingsResponse setPhotos(GroupPhotos photos) {
        this.photos = photos;
        return this;
    }

    public Integer getPublicCategory() {
        return publicCategory;
    }

    public GetSettingsResponse setPublicCategory(Integer publicCategory) {
        this.publicCategory = publicCategory;
        return this;
    }

    public List<GroupPublicCategoryList> getPublicCategoryList() {
        return publicCategoryList;
    }

    public GetSettingsResponse setPublicCategoryList(
            List<GroupPublicCategoryList> publicCategoryList) {
        this.publicCategoryList = publicCategoryList;
        return this;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public GetSettingsResponse setPublicDate(String publicDate) {
        this.publicDate = publicDate;
        return this;
    }

    public String getPublicDateLabel() {
        return publicDateLabel;
    }

    public GetSettingsResponse setPublicDateLabel(String publicDateLabel) {
        this.publicDateLabel = publicDateLabel;
        return this;
    }

    public Integer getPublicSubcategory() {
        return publicSubcategory;
    }

    public GetSettingsResponse setPublicSubcategory(Integer publicSubcategory) {
        this.publicSubcategory = publicSubcategory;
        return this;
    }

    public URI getRss() {
        return rss;
    }

    public GetSettingsResponse setRss(URI rss) {
        this.rss = rss;
        return this;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public GetSettingsResponse setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public GetSettingsResponse setFinishDate(Integer finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public Integer getSubject() {
        return subject;
    }

    public GetSettingsResponse setSubject(Integer subject) {
        this.subject = subject;
        return this;
    }

    public List<SubjectItem> getSubjectList() {
        return subjectList;
    }

    public GetSettingsResponse setSubjectList(List<SubjectItem> subjectList) {
        this.subjectList = subjectList;
        return this;
    }

    public GroupSuggestedPrivacy getSuggestedPrivacy() {
        return suggestedPrivacy;
    }

    public GetSettingsResponse setSuggestedPrivacy(GroupSuggestedPrivacy suggestedPrivacy) {
        this.suggestedPrivacy = suggestedPrivacy;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GetSettingsResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public GroupTopics getTopics() {
        return topics;
    }

    public GetSettingsResponse setTopics(GroupTopics topics) {
        this.topics = topics;
        return this;
    }

    public SettingsTwitter getTwitter() {
        return twitter;
    }

    public GetSettingsResponse setTwitter(SettingsTwitter twitter) {
        this.twitter = twitter;
        return this;
    }

    public GroupVideo getVideo() {
        return video;
    }

    public GetSettingsResponse setVideo(GroupVideo video) {
        this.video = video;
        return this;
    }

    public GroupWall getWall() {
        return wall;
    }

    public GetSettingsResponse setWall(GroupWall wall) {
        this.wall = wall;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public GetSettingsResponse setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public GetSettingsResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public GetSettingsResponse setEmail(String email) {
        this.email = email;
        return this;
    }

    public GroupWiki getWiki() {
        return wiki;
    }

    public GetSettingsResponse setWiki(GroupWiki wiki) {
        this.wiki = wiki;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainSection, access, obsceneStopwords, subject, wiki, description, obsceneFilter, video, publicDate, cityId, title, photos, countryId, recognizePhoto, publicDateLabel, twitter, rss, docs, links, audio, publicCategory, events, email, eventGroupId, sectionsList, subjectList, website, address, topics, publicCategoryList, secondarySection, suggestedPrivacy, ageLimits, publicSubcategory, obsceneWords, phone, finishDate, articles, wall, startDate, contacts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSettingsResponse getSettingsResponse = (GetSettingsResponse) o;
        return Objects.equals(access, getSettingsResponse.access) &&
                Objects.equals(publicCategory, getSettingsResponse.publicCategory) &&
                Objects.equals(publicSubcategory, getSettingsResponse.publicSubcategory) &&
                Objects.equals(subject, getSettingsResponse.subject) &&
                Objects.equals(wiki, getSettingsResponse.wiki) &&
                Objects.equals(description, getSettingsResponse.description) &&
                Objects.equals(video, getSettingsResponse.video) &&
                Objects.equals(title, getSettingsResponse.title) &&
                Objects.equals(photos, getSettingsResponse.photos) &&
                Objects.equals(mainSection, getSettingsResponse.mainSection) &&
                Objects.equals(obsceneStopwords, getSettingsResponse.obsceneStopwords) &&
                Objects.equals(suggestedPrivacy, getSettingsResponse.suggestedPrivacy) &&
                Objects.equals(twitter, getSettingsResponse.twitter) &&
                Objects.equals(rss, getSettingsResponse.rss) &&
                Objects.equals(docs, getSettingsResponse.docs) &&
                Objects.equals(subjectList, getSettingsResponse.subjectList) &&
                Objects.equals(finishDate, getSettingsResponse.finishDate) &&
                Objects.equals(links, getSettingsResponse.links) &&
                Objects.equals(audio, getSettingsResponse.audio) &&
                Objects.equals(obsceneFilter, getSettingsResponse.obsceneFilter) &&
                Objects.equals(publicDate, getSettingsResponse.publicDate) &&
                Objects.equals(secondarySection, getSettingsResponse.secondarySection) &&
                Objects.equals(events, getSettingsResponse.events) &&
                Objects.equals(email, getSettingsResponse.email) &&
                Objects.equals(startDate, getSettingsResponse.startDate) &&
                Objects.equals(website, getSettingsResponse.website) &&
                Objects.equals(address, getSettingsResponse.address) &&
                Objects.equals(topics, getSettingsResponse.topics) &&
                Objects.equals(recognizePhoto, getSettingsResponse.recognizePhoto) &&
                Objects.equals(obsceneWords, getSettingsResponse.obsceneWords) &&
                Objects.equals(publicDateLabel, getSettingsResponse.publicDateLabel) &&
                Objects.equals(publicCategoryList, getSettingsResponse.publicCategoryList) &&
                Objects.equals(ageLimits, getSettingsResponse.ageLimits) &&
                Objects.equals(phone, getSettingsResponse.phone) &&
                Objects.equals(sectionsList, getSettingsResponse.sectionsList) &&
                Objects.equals(eventGroupId, getSettingsResponse.eventGroupId) &&
                Objects.equals(articles, getSettingsResponse.articles) &&
                Objects.equals(wall, getSettingsResponse.wall) &&
                Objects.equals(contacts, getSettingsResponse.contacts) &&
                Objects.equals(countryId, getSettingsResponse.countryId) &&
                Objects.equals(cityId, getSettingsResponse.cityId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetSettingsResponse{");
        sb.append("access=").append(access);
        sb.append(", publicCategory=").append(publicCategory);
        sb.append(", publicSubcategory=").append(publicSubcategory);
        sb.append(", subject=").append(subject);
        sb.append(", wiki=").append(wiki);
        sb.append(", description='").append(description).append("'");
        sb.append(", video=").append(video);
        sb.append(", title='").append(title).append("'");
        sb.append(", photos=").append(photos);
        sb.append(", mainSection=").append(mainSection);
        sb.append(", obsceneStopwords=").append(obsceneStopwords);
        sb.append(", suggestedPrivacy=").append(suggestedPrivacy);
        sb.append(", twitter=").append(twitter);
        sb.append(", rss=").append(rss);
        sb.append(", docs=").append(docs);
        sb.append(", subjectList=").append(subjectList);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", links=").append(links);
        sb.append(", audio=").append(audio);
        sb.append(", obsceneFilter=").append(obsceneFilter);
        sb.append(", publicDate='").append(publicDate).append("'");
        sb.append(", secondarySection=").append(secondarySection);
        sb.append(", events=").append(events);
        sb.append(", email='").append(email).append("'");
        sb.append(", startDate=").append(startDate);
        sb.append(", website='").append(website).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append(", topics=").append(topics);
        sb.append(", recognizePhoto=").append(recognizePhoto);
        sb.append(", obsceneWords='").append(obsceneWords).append("'");
        sb.append(", publicDateLabel='").append(publicDateLabel).append("'");
        sb.append(", publicCategoryList=").append(publicCategoryList);
        sb.append(", ageLimits=").append(ageLimits);
        sb.append(", phone='").append(phone).append("'");
        sb.append(", sectionsList=").append(sectionsList);
        sb.append(", eventGroupId=").append(eventGroupId);
        sb.append(", articles=").append(articles);
        sb.append(", wall=").append(wall);
        sb.append(", contacts=").append(contacts);
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append('}');
        return sb.toString();
    }
}
