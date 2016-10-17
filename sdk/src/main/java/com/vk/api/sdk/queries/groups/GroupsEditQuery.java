package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.edit method
 */
public class GroupsEditQuery extends AbstractQueryBuilder<GroupsEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsEditQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Community identifier
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Community name
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Community description
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Community screen name
     *
     * @param value value of "screen name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery screenName(String value) {
        return unsafeParam("screen_name", value);
    }

    /**
     * Community type.
     *
     * @param value value of "access" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery access(GroupsEditAccess value) {
        return unsafeParam("access", value);
    }

    /**
     * Website that will be displayed in the community information field
     *
     * @param value value of "website" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery website(String value) {
        return unsafeParam("website", value);
    }

    /**
     * Community subject.
     *
     * @param value value of "subject" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery subject(GroupsEditSubject value) {
        return unsafeParam("subject", value);
    }

    /**
     * Organizer email (for events)
     *
     * @param value value of "email" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery email(String value) {
        return unsafeParam("email", value);
    }

    /**
     * Organizer phone number (for events)
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * Rss feed address for import (available only to communities with special permission. Contact vk.com/support to get it
     *
     * @param value value of "rss" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery rss(String value) {
        return unsafeParam("rss", value);
    }

    /**
     * Event start date in Unixtime format
     *
     * @param value value of "event start date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventStartDate(Integer value) {
        return unsafeParam("event_start_date", value);
    }

    /**
     * Event finish date in Unixtime format
     *
     * @param value value of "event finish date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventFinishDate(Integer value) {
        return unsafeParam("event_finish_date", value);
    }

    /**
     * Organizer community id (for events only)
     *
     * @param value value of "event group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventGroupId(Integer value) {
        return unsafeParam("event_group_id", value);
    }

    /**
     * Public page category
     *
     * @param value value of "public category" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicCategory(Integer value) {
        return unsafeParam("public_category", value);
    }

    /**
     * Public page subcategory
     *
     * @param value value of "public subcategory" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicSubcategory(Integer value) {
        return unsafeParam("public_subcategory", value);
    }

    /**
     * Founding date of a company or organization owning the community in "dd.mm.YYYY" format
     *
     * @param value value of "public date" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicDate(String value) {
        return unsafeParam("public_date", value);
    }

    /**
     * Wall settings
     *
     * @param value value of "wall" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery wall(GroupsEditWall value) {
        return unsafeParam("wall", value);
    }

    /**
     * Board topics settings.
     *
     * @param value value of "topics" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery topics(GroupsEditTopics value) {
        return unsafeParam("topics", value);
    }

    /**
     * Photos settings.
     *
     * @param value value of "photos" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery photos(GroupsEditPhotos value) {
        return unsafeParam("photos", value);
    }

    /**
     * Video settings.
     *
     * @param value value of "video" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery video(GroupsEditVideo value) {
        return unsafeParam("video", value);
    }

    /**
     * Audio settings.
     *
     * @param value value of "audio" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery audio(GroupsEditAudio value) {
        return unsafeParam("audio", value);
    }

    /**
     * Links settings (for public pages only).
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled
     *
     * @param value value of "links" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery links(Boolean value) {
        return unsafeParam("links", value);
    }

    /**
     * Events settings (for public pages only).
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled
     *
     * @param value value of "events" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery events(Boolean value) {
        return unsafeParam("events", value);
    }

    /**
     * Places settings (for public pages only).
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled
     *
     * @param value value of "places" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery places(Boolean value) {
        return unsafeParam("places", value);
    }

    /**
     * Contacts settings (for public pages only).
     *
     * @param value value of "contacts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery contacts(Boolean value) {
        return unsafeParam("contacts", value);
    }

    /**
     * Documents settings.
     *
     * @param value value of "docs" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery docs(GroupsEditDocs value) {
        return unsafeParam("docs", value);
    }

    /**
     * Wiki pages settings.
     *
     * @param value value of "wiki" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery wiki(GroupsEditWall value) {
        return unsafeParam("wiki", value);
    }

    /**
     * Community messages.
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled.
     *
     * @param value value of "messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery messages(Boolean value) {
        return unsafeParam("messages", value);
    }

    /**
     * Community age limits
     *
     * @param value value of "age limits" parameter. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery ageLimits(GroupsEditAgeLimit value) {
        return unsafeParam("age_limits", value);
    }

    /**
     * Market settings.
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled
     *
     * @param value value of "market" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery market(Boolean value) {
        return unsafeParam("market", value);
    }

    /**
     * Market comments settings.
     * <p>
     * Possible values:
     * false - disabled;
     * true - enabled
     *
     * @param value value of "market comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketComments(Boolean value) {
        return unsafeParam("market_comments", value);
    }

    /**
     * Market delivery regions
     *
     * @param value value of "market country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCountry(Integer... value) {
        return unsafeParam("market_country", value);
    }

    /**
     * Market delivery regions
     *
     * @param value value of "market country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCountry(List<Integer> value) {
        return unsafeParam("market_country", value);
    }

    /**
     * Market delivery cities (if only one country is specified)
     *
     * @param value value of "market city" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCity(Integer... value) {
        return unsafeParam("market_city", value);
    }

    /**
     * Market delivery cities (if only one country is specified)
     *
     * @param value value of "market city" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCity(List<Integer> value) {
        return unsafeParam("market_city", value);
    }

    /**
     * Market currency settings.
     *
     * @param value value of "market currency" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCurrency(GroupsEditMarketCurrency value) {
        return unsafeParam("market_currency", value);
    }

    /**
     * Seller contact for market.
     * Set 0 for community messages.
     *
     * @param value value of "market contact" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketContact(Integer value) {
        return unsafeParam("market_contact", value);
    }

    /**
     * Id of a wiki page with market description
     *
     * @param value value of "market wiki" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketWiki(Integer value) {
        return unsafeParam("market_wiki", value);
    }

    /**
     * Obscene expressions filter in comments.
     * <p>
     * Possible values:
     * false - disabled
     * true - enabled
     *
     * @param value value of "obscene filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneFilter(Boolean value) {
        return unsafeParam("obscene_filter", value);
    }

    /**
     * Stopwords filter in comments.
     * <p>
     * Possible values:
     * false - disabled
     * true - enabled
     *
     * @param value value of "obscene stopwords" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneStopwords(Boolean value) {
        return unsafeParam("obscene_stopwords", value);
    }

    /**
     * Keywords for stopwords filter
     *
     * @param value value of "obscene words" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneWords(String... value) {
        return unsafeParam("obscene_words", value);
    }

    /**
     * Keywords for stopwords filter
     *
     * @param value value of "obscene words" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneWords(List<String> value) {
        return unsafeParam("obscene_words", value);
    }

    @Override
    protected GroupsEditQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
