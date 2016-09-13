package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.database.DatabaseGetChairsQuery;
import com.vk.api.sdk.queries.database.DatabaseGetCitiesByIdQuery;
import com.vk.api.sdk.queries.database.DatabaseGetCitiesQuery;
import com.vk.api.sdk.queries.database.DatabaseGetCountriesByIdQuery;
import com.vk.api.sdk.queries.database.DatabaseGetCountriesQuery;
import com.vk.api.sdk.queries.database.DatabaseGetFacultiesQuery;
import com.vk.api.sdk.queries.database.DatabaseGetRegionsQuery;
import com.vk.api.sdk.queries.database.DatabaseGetSchoolClassesQuery;
import com.vk.api.sdk.queries.database.DatabaseGetSchoolsQuery;
import com.vk.api.sdk.queries.database.DatabaseGetStreetsByIdQuery;
import com.vk.api.sdk.queries.database.DatabaseGetUniversitiesQuery;

/**
 * List of Database methods
 */
public class Database extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Database(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of countries.
     */
    public DatabaseGetCountriesQuery getCountries() {
        return new DatabaseGetCountriesQuery(getClient());
    }

    /**
     * Returns a list of countries.
     */
    public DatabaseGetCountriesQuery getCountries(Actor actor) {
        return new DatabaseGetCountriesQuery(getClient(), actor);
    }

    /**
     * Returns a list of regions.
     */
    public DatabaseGetRegionsQuery getRegions(int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), countryId);
    }

    /**
     * Returns a list of regions.
     */
    public DatabaseGetRegionsQuery getRegions(Actor actor, int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), actor, countryId);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(int... streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), streetIds);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(Actor actor, int... streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), actor, streetIds);
    }

    /**
     * Returns information about countries by their IDs.
     */
    public DatabaseGetCountriesByIdQuery getCountriesById() {
        return new DatabaseGetCountriesByIdQuery(getClient());
    }

    /**
     * Returns information about countries by their IDs.
     */
    public DatabaseGetCountriesByIdQuery getCountriesById(Actor actor) {
        return new DatabaseGetCountriesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of cities.
     */
    public DatabaseGetCitiesQuery getCities(int countryId) {
        return new DatabaseGetCitiesQuery(getClient(), countryId);
    }

    /**
     * Returns a list of cities.
     */
    public DatabaseGetCitiesQuery getCities(Actor actor, int countryId) {
        return new DatabaseGetCitiesQuery(getClient(), actor, countryId);
    }

    /**
     * Returns information about cities by their IDs.
     */
    public DatabaseGetCitiesByIdQuery getCitiesById() {
        return new DatabaseGetCitiesByIdQuery(getClient());
    }

    /**
     * Returns information about cities by their IDs.
     */
    public DatabaseGetCitiesByIdQuery getCitiesById(Actor actor) {
        return new DatabaseGetCitiesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of higher education institutions.
     */
    public DatabaseGetUniversitiesQuery getUniversities() {
        return new DatabaseGetUniversitiesQuery(getClient());
    }

    /**
     * Returns a list of higher education institutions.
     */
    public DatabaseGetUniversitiesQuery getUniversities(Actor actor) {
        return new DatabaseGetUniversitiesQuery(getClient(), actor);
    }

    /**
     * Returns a list of schools.
     */
    public DatabaseGetSchoolsQuery getSchools(int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), cityId);
    }

    /**
     * Returns a list of schools.
     */
    public DatabaseGetSchoolsQuery getSchools(Actor actor, int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), actor, cityId);
    }

    /**
     * Returns a list of school classes specified for the country.
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses() {
        return new DatabaseGetSchoolClassesQuery(getClient());
    }

    /**
     * Returns a list of school classes specified for the country.
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses(Actor actor) {
        return new DatabaseGetSchoolClassesQuery(getClient(), actor);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     */
    public DatabaseGetFacultiesQuery getFaculties(int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), universityId);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     */
    public DatabaseGetFacultiesQuery getFaculties(Actor actor, int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), actor, universityId);
    }

    /**
     * Returns list of chairs on a specified faculty.
     */
    public DatabaseGetChairsQuery getChairs(int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), facultyId);
    }

    /**
     * Returns list of chairs on a specified faculty.
     */
    public DatabaseGetChairsQuery getChairs(Actor actor, int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), actor, facultyId);
    }
}
