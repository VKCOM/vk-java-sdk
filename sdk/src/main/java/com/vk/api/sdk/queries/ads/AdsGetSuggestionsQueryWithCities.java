package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.ads.responses.GetSuggestionsCitiesResponse;
import com.vk.api.sdk.objects.enums.AdsLang;
import com.vk.api.sdk.objects.enums.AdsSection;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getSuggestions method
 */
public class AdsGetSuggestionsQueryWithCities extends AbstractQueryBuilder<AdsGetSuggestionsQueryWithCities, List<GetSuggestionsCitiesResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param section value of "section" parameter.
     */
    public AdsGetSuggestionsQueryWithCities(VkApiClient client, UserActor actor, AdsSection section,
            String cities) {
        super(client, "ads.getSuggestions", Utils.buildParametrizedType(List.class, GetSuggestionsCitiesResponse.class));
        accessToken(actor.getAccessToken());
        section(section);
        cities(cities);
    }

    /**
     * Section, suggestions are retrieved in. Available values: *countries — request of a list of countries. If q is not set or blank, a short list of countries is shown. Otherwise, a full list of countries is shown. *regions — requested list of regions. 'country' parameter is required. *cities — requested list of cities. 'country' parameter is required. *districts — requested list of districts. 'cities' parameter is required. *stations — requested list of subway stations. 'cities' parameter is required. *streets — requested list of streets. 'cities' parameter is required. *schools — requested list of educational organizations. 'cities' parameter is required. *interests — requested list of interests. *positions — requested list of positions (professions). *group_types — requested list of group types. *religions — requested list of religious commitments. *browsers — requested list of browsers and mobile devices.
     *
     * @param value value of "section" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetSuggestionsQueryWithCities section(AdsSection value) {
        return unsafeParam("section", value);
    }

    /**
     * Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
     *
     * @param value value of "ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetSuggestionsQueryWithCities ids(String value) {
        return unsafeParam("ids", value);
    }

    /**
     * Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
     *
     * @param value value of "q" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetSuggestionsQueryWithCities q(String value) {
        return unsafeParam("q", value);
    }

    /**
     * ID of the country objects are searched in.
     *
     * @param value value of "country" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetSuggestionsQueryWithCities country(Integer value) {
        return unsafeParam("country", value);
    }

    /**
     * IDs of cities where objects are searched in, separated with a comma.
     *
     * @param value value of "cities" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AdsGetSuggestionsQueryWithCities cities(String value) {
        return unsafeParam("cities", value);
    }

    /**
     * Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
     *
     * @param value value of "lang" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetSuggestionsQueryWithCities lang(AdsLang value) {
        return unsafeParam("lang", value);
    }

    @Override
    protected AdsGetSuggestionsQueryWithCities getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("section", "access_token");
    }
}
