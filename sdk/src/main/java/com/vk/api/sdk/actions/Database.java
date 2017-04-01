package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
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

import java.util.List;

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
    public DatabaseGetCountriesQuery getCountries(ServiceActor actor) {
        return new DatabaseGetCountriesQuery(getClient(), actor);
    }

    /**
     * Returns a list of countries.
     */
    public DatabaseGetCountriesQuery getCountries(UserActor actor) {
        return new DatabaseGetCountriesQuery(getClient(), actor);
    }

    /**
     * Returns a list of regions.
     */
    public DatabaseGetRegionsQuery getRegions(ServiceActor actor, int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), actor, countryId);
    }

    /**
     * Returns a list of regions.
     */
    public DatabaseGetRegionsQuery getRegions(UserActor actor, int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), actor, countryId);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(ServiceActor actor, int... streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), actor, streetIds);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(ServiceActor actor, List<Integer> streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), actor, streetIds);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(UserActor actor, int... streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), actor, streetIds);
    }

    /**
     * Returns information about streets by their IDs.
     */
    public DatabaseGetStreetsByIdQuery getStreetsById(UserActor actor, List<Integer> streetIds) {
        return new DatabaseGetStreetsByIdQuery(getClient(), actor, streetIds);
    }

    /**
     * Returns information about countries by their IDs.
     */
    public DatabaseGetCountriesByIdQuery getCountriesById(ServiceActor actor) {
        return new DatabaseGetCountriesByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about countries by their IDs.
     */
    public DatabaseGetCountriesByIdQuery getCountriesById(UserActor actor) {
        return new DatabaseGetCountriesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of cities.
     */
    public DatabaseGetCitiesQuery getCities(ServiceActor actor, int countryId) {
        return new DatabaseGetCitiesQuery(getClient(), actor, countryId);
    }

    /**
     * Returns a list of cities.
     */
    public DatabaseGetCitiesQuery getCities(UserActor actor, int countryId) {
        return new DatabaseGetCitiesQuery(getClient(), actor, countryId);
    }

    /**
     * Returns information about cities by their IDs.
     */
    public DatabaseGetCitiesByIdQuery getCitiesById(ServiceActor actor) {
        return new DatabaseGetCitiesByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about cities by their IDs.
     */
    public DatabaseGetCitiesByIdQuery getCitiesById(UserActor actor) {
        return new DatabaseGetCitiesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of higher education institutions.
     */
    public DatabaseGetUniversitiesQuery getUniversities(ServiceActor actor) {
        return new DatabaseGetUniversitiesQuery(getClient(), actor);
    }

    /**
     * Returns a list of higher education institutions.
     */
    public DatabaseGetUniversitiesQuery getUniversities(UserActor actor) {
        return new DatabaseGetUniversitiesQuery(getClient(), actor);
    }

    /**
     * Returns a list of schools.
     */
    public DatabaseGetSchoolsQuery getSchools(ServiceActor actor, int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), actor, cityId);
    }

    /**
     * Returns a list of schools.
     */
    public DatabaseGetSchoolsQuery getSchools(UserActor actor, int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), actor, cityId);
    }

    /**
     * Returns a list of school classes specified for the country.
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses(ServiceActor actor) {
        return new DatabaseGetSchoolClassesQuery(getClient(), actor);
    }

    /**
     * Returns a list of school classes specified for the country.
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses(UserActor actor) {
        return new DatabaseGetSchoolClassesQuery(getClient(), actor);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     */
    public DatabaseGetFacultiesQuery getFaculties(ServiceActor actor, int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), actor, universityId);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     */
    public DatabaseGetFacultiesQuery getFaculties(UserActor actor, int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), actor, universityId);
    }

    /**
     * Returns list of chairs on a specified faculty.
     */
    public DatabaseGetChairsQuery getChairs(ServiceActor actor, int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), actor, facultyId);
    }

    /**
     * Returns list of chairs on a specified faculty.
     */
    public DatabaseGetChairsQuery getChairs(UserActor actor, int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), actor, facultyId);
    }
}
