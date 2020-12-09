package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.enums.GroupsAgeLimits;
import com.vk.api.sdk.objects.groups.GroupAccess;
import com.vk.api.sdk.objects.groups.GroupAudio;
import com.vk.api.sdk.objects.groups.GroupDocs;
import com.vk.api.sdk.objects.groups.GroupMarketCurrency;
import com.vk.api.sdk.objects.groups.GroupPhotos;
import com.vk.api.sdk.objects.groups.GroupSubject;
import com.vk.api.sdk.objects.groups.GroupTopics;
import com.vk.api.sdk.objects.groups.GroupVideo;
import com.vk.api.sdk.objects.groups.GroupWall;
import com.vk.api.sdk.objects.groups.GroupWiki;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.edit method
 */
public class GroupsEditQuery extends AbstractQueryBuilder<GroupsEditQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsEditQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "groups.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsEditQuery(VkApiClient client, GroupActor actor, int groupId) {
        super(client, "groups.edit", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(actor.getGroupId());
        groupId(groupId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsEditQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Community title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Community description.
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Community screen name.
     *
     * @param value value of "screen name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery screenName(String value) {
        return unsafeParam("screen_name", value);
    }

    /**
     * Community type. Possible values: *'0' – open,, *'1' – closed,, *'2' – private.
     *
     * @param value value of "access" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery access(GroupAccess value) {
        return unsafeParam("access", value);
    }

    /**
     * Website that will be displayed in the community information field.
     *
     * @param value value of "website" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery website(String value) {
        return unsafeParam("website", value);
    }

    /**
     * Community subject. Possible values: , *'1' – auto/moto,, *'2' – activity holidays,, *'3' – business,, *'4' – pets,, *'5' – health,, *'6' – dating and communication, , *'7' – games,, *'8' – IT (computers and software),, *'9' – cinema,, *'10' – beauty and fashion,, *'11' – cooking,, *'12' – art and culture,, *'13' – literature,, *'14' – mobile services and internet,, *'15' – music,, *'16' – science and technology,, *'17' – real estate,, *'18' – news and media,, *'19' – security,, *'20' – education,, *'21' – home and renovations,, *'22' – politics,, *'23' – food,, *'24' – industry,, *'25' – travel,, *'26' – work,, *'27' – entertainment,, *'28' – religion,, *'29' – family,, *'30' – sports,, *'31' – insurance,, *'32' – television,, *'33' – goods and services,, *'34' – hobbies,, *'35' – finance,, *'36' – photo,, *'37' – esoterics,, *'38' – electronics and appliances,, *'39' – erotic,, *'40' – humor,, *'41' – society, humanities,, *'42' – design and graphics.
     *
     * @param value value of "subject" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery subject(GroupSubject value) {
        return unsafeParam("subject", value);
    }

    /**
     * Organizer email (for events).
     *
     * @param value value of "email" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery email(String value) {
        return unsafeParam("email", value);
    }

    /**
     * Organizer phone number (for events).
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * RSS feed address for import (available only to communities with special permission. Contact vk.com/support to get it.
     *
     * @param value value of "rss" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery rss(String value) {
        return unsafeParam("rss", value);
    }

    /**
     * Event start date in Unixtime format.
     *
     * @param value value of "event start date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventStartDate(Integer value) {
        return unsafeParam("event_start_date", value);
    }

    /**
     * Event finish date in Unixtime format.
     *
     * @param value value of "event finish date" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventFinishDate(Integer value) {
        return unsafeParam("event_finish_date", value);
    }

    /**
     * Organizer community ID (for events only).
     *
     * @param value value of "event group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery eventGroupId(Integer value) {
        return unsafeParam("event_group_id", value);
    }

    /**
     * Public page category ID.
     *
     * @param value value of "public category" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicCategory(Integer value) {
        return unsafeParam("public_category", value);
    }

    /**
     * Public page subcategory ID.
     *
     * @param value value of "public subcategory" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicSubcategory(Integer value) {
        return unsafeParam("public_subcategory", value);
    }

    /**
     * Founding date of a company or organization owning the community in "dd.mm.YYYY" format.
     *
     * @param value value of "public date" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery publicDate(String value) {
        return unsafeParam("public_date", value);
    }

    /**
     * Wall settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (groups and events only),, *'3' – closed (groups and events only).
     *
     * @param value value of "wall" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery wall(GroupWall value) {
        return unsafeParam("wall", value);
    }

    /**
     * Board topics settings. Possbile values: , *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "topics" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery topics(GroupTopics value) {
        return unsafeParam("topics", value);
    }

    /**
     * Photos settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "photos" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery photos(GroupPhotos value) {
        return unsafeParam("photos", value);
    }

    /**
     * Video settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "video" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery video(GroupVideo value) {
        return unsafeParam("video", value);
    }

    /**
     * Audio settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "audio" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery audio(GroupAudio value) {
        return unsafeParam("audio", value);
    }

    /**
     * Links settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "links" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery links(Boolean value) {
        return unsafeParam("links", value);
    }

    /**
     * Events settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "events" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery events(Boolean value) {
        return unsafeParam("events", value);
    }

    /**
     * Places settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "places" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery places(Boolean value) {
        return unsafeParam("places", value);
    }

    /**
     * Contacts settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "contacts" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery contacts(Boolean value) {
        return unsafeParam("contacts", value);
    }

    /**
     * Documents settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "docs" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery docs(GroupDocs value) {
        return unsafeParam("docs", value);
    }

    /**
     * Wiki pages settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
     *
     * @param value value of "wiki" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery wiki(GroupWiki value) {
        return unsafeParam("wiki", value);
    }

    /**
     * Community messages. Possible values: *'0' — disabled,, *'1' — enabled.
     *
     * @param value value of "messages" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery messages(Boolean value) {
        return unsafeParam("messages", value);
    }

    /**
     * Set articles
     *
     * @param value value of "articles" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery articles(Boolean value) {
        return unsafeParam("articles", value);
    }

    /**
     * Set addresses
     *
     * @param value value of "addresses" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery addresses(Boolean value) {
        return unsafeParam("addresses", value);
    }

    /**
     * Community age limits. Possible values: *'1' — no limits,, *'2' — 16+,, *'3' — 18+.
     *
     * @param value value of "age limits" parameter. Minimum is 0. By default 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery ageLimits(GroupsAgeLimits value) {
        return unsafeParam("age_limits", value);
    }

    /**
     * Market settings. Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "market" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery market(Boolean value) {
        return unsafeParam("market", value);
    }

    /**
     * Market comments settings. Possible values: *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "market comments" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketComments(Boolean value) {
        return unsafeParam("market_comments", value);
    }

    /**
     * Market currency settings. Possbile values: , *'643' – Russian rubles,, *'980' – Ukrainian hryvnia,, *'398' – Kazakh tenge,, *'978' – Euro,, *'840' – US dollars
     *
     * @param value value of "market currency" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCurrency(GroupMarketCurrency value) {
        return unsafeParam("market_currency", value);
    }

    /**
     * Seller contact for market. Set '0' for community messages.
     *
     * @param value value of "market contact" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketContact(Integer value) {
        return unsafeParam("market_contact", value);
    }

    /**
     * ID of a wiki page with market description.
     *
     * @param value value of "market wiki" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketWiki(Integer value) {
        return unsafeParam("market_wiki", value);
    }

    /**
     * Obscene expressions filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "obscene filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneFilter(Boolean value) {
        return unsafeParam("obscene_filter", value);
    }

    /**
     * Stopwords filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
     *
     * @param value value of "obscene stopwords" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneStopwords(Boolean value) {
        return unsafeParam("obscene_stopwords", value);
    }

    /**
     * Set main section
     *
     * @param value value of "main section" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery mainSection(Integer value) {
        return unsafeParam("main_section", value);
    }

    /**
     * Set secondary section
     *
     * @param value value of "secondary section" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery secondarySection(Integer value) {
        return unsafeParam("secondary_section", value);
    }

    /**
     * Country of the community.
     *
     * @param value value of "country" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery country(Integer value) {
        return unsafeParam("country", value);
    }

    /**
     * City of the community.
     *
     * @param value value of "city" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery city(Integer value) {
        return unsafeParam("city", value);
    }

    /**
     * obscene_words
     * Keywords for stopwords filter.
     *
     * @param value value of "obscene words" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneWords(String... value) {
        return unsafeParam("obscene_words", value);
    }

    /**
     * Keywords for stopwords filter.
     *
     * @param value value of "obscene words" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery obsceneWords(List<String> value) {
        return unsafeParam("obscene_words", value);
    }

    /**
     * market_country
     * Market delivery countries.
     *
     * @param value value of "market country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCountry(Integer... value) {
        return unsafeParam("market_country", value);
    }

    /**
     * Market delivery countries.
     *
     * @param value value of "market country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCountry(List<Integer> value) {
        return unsafeParam("market_country", value);
    }

    /**
     * market_city
     * Market delivery cities (if only one country is specified).
     *
     * @param value value of "market city" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCity(Integer... value) {
        return unsafeParam("market_city", value);
    }

    /**
     * Market delivery cities (if only one country is specified).
     *
     * @param value value of "market city" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsEditQuery marketCity(List<Integer> value) {
        return unsafeParam("market_city", value);
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
