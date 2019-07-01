package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * GroupSettings object
 */
public class GroupSettings implements Validable {
    /**
     * Community access settings
     */
    @SerializedName("access")
    private Integer access;

    /**
     * Community's page domain
     */
    @SerializedName("address")
    private String address;

    /**
     * Audio settings
     */
    @SerializedName("audio")
    private Integer audio;

    /**
     * Community description
     */
    @SerializedName("description")
    private String description;

    /**
     * Docs settings
     */
    @SerializedName("docs")
    private Integer docs;

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
    private String obsceneWords;

    /**
     * Photos settings
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Information about the group category
     */
    @SerializedName("public_category")
    private Integer publicCategory;

    @SerializedName("public_category_list")
    private List<GroupPublicCategoryList> publicCategoryList;

    /**
     * Information about the group subcategory
     */
    @SerializedName("public_subcategory")
    private Integer publicSubcategory;

    /**
     * URL of the RSS feed
     */
    @SerializedName("rss")
    private URL rss;

    /**
     * Community subject ID
     */
    @SerializedName("subject")
    private Integer subject;

    @SerializedName("subject_list")
    private List<SubjectItem> subjectList;

    /**
     * Community title
     */
    @SerializedName("title")
    private String title;

    /**
     * Topics settings
     */
    @SerializedName("topics")
    private Integer topics;

    /**
     * Video settings
     */
    @SerializedName("video")
    private Integer video;

    /**
     * Wall settings
     */
    @SerializedName("wall")
    private Integer wall;

    /**
     * Community website
     */
    @SerializedName("website")
    private String website;

    /**
     * Wiki settings
     */
    @SerializedName("wiki")
    private Integer wiki;

    public Integer getAccess() {
        return access;
    }

    public GroupSettings setAccess(Integer access) {
        this.access = access;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public GroupSettings setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getAudio() {
        return audio;
    }

    public GroupSettings setAudio(Integer audio) {
        this.audio = audio;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GroupSettings setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDocs() {
        return docs;
    }

    public GroupSettings setDocs(Integer docs) {
        this.docs = docs;
        return this;
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

    public String getObsceneWords() {
        return obsceneWords;
    }

    public GroupSettings setObsceneWords(String obsceneWords) {
        this.obsceneWords = obsceneWords;
        return this;
    }

    public Integer getPhotos() {
        return photos;
    }

    public GroupSettings setPhotos(Integer photos) {
        this.photos = photos;
        return this;
    }

    public Integer getPublicCategory() {
        return publicCategory;
    }

    public GroupSettings setPublicCategory(Integer publicCategory) {
        this.publicCategory = publicCategory;
        return this;
    }

    public List<GroupPublicCategoryList> getPublicCategoryList() {
        return publicCategoryList;
    }

    public GroupSettings setPublicCategoryList(List<GroupPublicCategoryList> publicCategoryList) {
        this.publicCategoryList = publicCategoryList;
        return this;
    }

    public Integer getPublicSubcategory() {
        return publicSubcategory;
    }

    public GroupSettings setPublicSubcategory(Integer publicSubcategory) {
        this.publicSubcategory = publicSubcategory;
        return this;
    }

    public URL getRss() {
        return rss;
    }

    public GroupSettings setRss(URL rss) {
        this.rss = rss;
        return this;
    }

    public Integer getSubject() {
        return subject;
    }

    public GroupSettings setSubject(Integer subject) {
        this.subject = subject;
        return this;
    }

    public List<SubjectItem> getSubjectList() {
        return subjectList;
    }

    public GroupSettings setSubjectList(List<SubjectItem> subjectList) {
        this.subjectList = subjectList;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GroupSettings setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getTopics() {
        return topics;
    }

    public GroupSettings setTopics(Integer topics) {
        this.topics = topics;
        return this;
    }

    public Integer getVideo() {
        return video;
    }

    public GroupSettings setVideo(Integer video) {
        this.video = video;
        return this;
    }

    public Integer getWall() {
        return wall;
    }

    public GroupSettings setWall(Integer wall) {
        this.wall = wall;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public GroupSettings setWebsite(String website) {
        this.website = website;
        return this;
    }

    public Integer getWiki() {
        return wiki;
    }

    public GroupSettings setWiki(Integer wiki) {
        this.wiki = wiki;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(website, subjectList, access, address, obsceneStopwords, subject, topics, wiki, description, obsceneFilter, publicCategoryList, video, title, photos, publicSubcategory, obsceneWords, rss, docs, audio, publicCategory, wall);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupSettings groupSettings = (GroupSettings) o;
        return Objects.equals(website, groupSettings.website) &&
                Objects.equals(access, groupSettings.access) &&
                Objects.equals(address, groupSettings.address) &&
                Objects.equals(publicCategory, groupSettings.publicCategory) &&
                Objects.equals(publicSubcategory, groupSettings.publicSubcategory) &&
                Objects.equals(subject, groupSettings.subject) &&
                Objects.equals(topics, groupSettings.topics) &&
                Objects.equals(wiki, groupSettings.wiki) &&
                Objects.equals(description, groupSettings.description) &&
                Objects.equals(obsceneWords, groupSettings.obsceneWords) &&
                Objects.equals(video, groupSettings.video) &&
                Objects.equals(title, groupSettings.title) &&
                Objects.equals(photos, groupSettings.photos) &&
                Objects.equals(obsceneStopwords, groupSettings.obsceneStopwords) &&
                Objects.equals(publicCategoryList, groupSettings.publicCategoryList) &&
                Objects.equals(rss, groupSettings.rss) &&
                Objects.equals(docs, groupSettings.docs) &&
                Objects.equals(subjectList, groupSettings.subjectList) &&
                Objects.equals(audio, groupSettings.audio) &&
                Objects.equals(obsceneFilter, groupSettings.obsceneFilter) &&
                Objects.equals(wall, groupSettings.wall);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupSettings{");
        sb.append("website='").append(website).append("'");
        sb.append(", access=").append(access);
        sb.append(", address='").append(address).append("'");
        sb.append(", publicCategory=").append(publicCategory);
        sb.append(", publicSubcategory=").append(publicSubcategory);
        sb.append(", subject=").append(subject);
        sb.append(", topics=").append(topics);
        sb.append(", wiki=").append(wiki);
        sb.append(", description='").append(description).append("'");
        sb.append(", obsceneWords='").append(obsceneWords).append("'");
        sb.append(", video=").append(video);
        sb.append(", title='").append(title).append("'");
        sb.append(", photos=").append(photos);
        sb.append(", obsceneStopwords=").append(obsceneStopwords);
        sb.append(", publicCategoryList=").append(publicCategoryList);
        sb.append(", rss=").append(rss);
        sb.append(", docs=").append(docs);
        sb.append(", subjectList=").append(subjectList);
        sb.append(", audio=").append(audio);
        sb.append(", obsceneFilter=").append(obsceneFilter);
        sb.append(", wall=").append(wall);
        sb.append('}');
        return sb.toString();
    }
}
