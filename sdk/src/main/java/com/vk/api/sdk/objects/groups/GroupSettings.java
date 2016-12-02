package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.places.PlaceMin;

import java.util.List;
import java.util.Objects;

/**
 * GroupSettings object
 */
public class GroupSettings {
    /**
     * Community title
     */
    @SerializedName("title")
    private String title;

    /**
     * Community description
     */
    @SerializedName("description")
    private String description;

    /**
     * Community's page domain
     */
    @SerializedName("address")
    private String address;

    @SerializedName("place")
    private PlaceMin place;

    /**
     * Wall settings
     */
    @SerializedName("wall")
    private Integer wall;

    /**
     * Photos settings
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Video settings
     */
    @SerializedName("video")
    private Integer video;

    /**
     * Audio settings
     */
    @SerializedName("audio")
    private Integer audio;

    /**
     * Docs settings
     */
    @SerializedName("docs")
    private Integer docs;

    /**
     * Topics settings
     */
    @SerializedName("topics")
    private Integer topics;

    /**
     * Wiki settings
     */
    @SerializedName("wiki")
    private Integer wiki;

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
     * Community access settings
     */
    @SerializedName("access")
    private Integer access;

    /**
     * Community subject ID
     */
    @SerializedName("subject")
    private Integer subject;

    @SerializedName("subject_list")
    private List<SubjectItem> subjectList;

    /**
     * URL of the RSS feed
     */
    @SerializedName("rss")
    private String rss;

    /**
     * Community website
     */
    @SerializedName("website")
    private String website;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public PlaceMin getPlace() {
        return place;
    }

    public Integer getWall() {
        return wall;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getVideo() {
        return video;
    }

    public Integer getAudio() {
        return audio;
    }

    public Integer getDocs() {
        return docs;
    }

    public Integer getTopics() {
        return topics;
    }

    public Integer getWiki() {
        return wiki;
    }

    public boolean isObsceneFilter() {
        return obsceneFilter == BoolInt.YES;
    }

    public boolean isObsceneStopwords() {
        return obsceneStopwords == BoolInt.YES;
    }

    public String getObsceneWords() {
        return obsceneWords;
    }

    public Integer getAccess() {
        return access;
    }

    public Integer getSubject() {
        return subject;
    }

    public List<SubjectItem> getSubjectList() {
        return subjectList;
    }

    public String getRss() {
        return rss;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectList, website, address, access, obsceneStopwords, topics, subject, wiki, description, obsceneFilter, video, title, photos, obsceneWords, rss, docs, place, audio, wall);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupSettings groupSettings = (GroupSettings) o;
        return Objects.equals(title, groupSettings.title) &&
                Objects.equals(description, groupSettings.description) &&
                Objects.equals(address, groupSettings.address) &&
                Objects.equals(place, groupSettings.place) &&
                Objects.equals(wall, groupSettings.wall) &&
                Objects.equals(photos, groupSettings.photos) &&
                Objects.equals(video, groupSettings.video) &&
                Objects.equals(audio, groupSettings.audio) &&
                Objects.equals(docs, groupSettings.docs) &&
                Objects.equals(topics, groupSettings.topics) &&
                Objects.equals(wiki, groupSettings.wiki) &&
                Objects.equals(obsceneFilter, groupSettings.obsceneFilter) &&
                Objects.equals(obsceneStopwords, groupSettings.obsceneStopwords) &&
                Objects.equals(obsceneWords, groupSettings.obsceneWords) &&
                Objects.equals(access, groupSettings.access) &&
                Objects.equals(subject, groupSettings.subject) &&
                Objects.equals(subjectList, groupSettings.subjectList) &&
                Objects.equals(rss, groupSettings.rss) &&
                Objects.equals(website, groupSettings.website);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupSettings{");
        sb.append("title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append(", place=").append(place);
        sb.append(", wall=").append(wall);
        sb.append(", photos=").append(photos);
        sb.append(", video=").append(video);
        sb.append(", audio=").append(audio);
        sb.append(", docs=").append(docs);
        sb.append(", topics=").append(topics);
        sb.append(", wiki=").append(wiki);
        sb.append(", obsceneFilter=").append(obsceneFilter);
        sb.append(", obsceneStopwords=").append(obsceneStopwords);
        sb.append(", obsceneWords='").append(obsceneWords).append("'");
        sb.append(", access=").append(access);
        sb.append(", subject=").append(subject);
        sb.append(", subjectList=").append(subjectList);
        sb.append(", rss='").append(rss).append("'");
        sb.append(", website='").append(website).append("'");
        sb.append('}');
        return sb.toString();
    }
}
