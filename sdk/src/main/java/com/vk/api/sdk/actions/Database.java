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
import com.vk.api.sdk.queries.database.DatabaseGetMetroStationsByIdQuery;
import com.vk.api.sdk.queries.database.DatabaseGetMetroStationsQuery;
import com.vk.api.sdk.queries.database.DatabaseGetRegionsQuery;
import com.vk.api.sdk.queries.database.DatabaseGetSchoolClassesQuery;
import com.vk.api.sdk.queries.database.DatabaseGetSchoolsQuery;
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
     * Returns list of chairs on a specified faculty.
     *
     * @param actor vk actor
     * @param facultyId id of the faculty to get chairs from
     * @return query
     */
    public DatabaseGetChairsQuery getChairs(UserActor actor, int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), actor, facultyId);
    }

    /**
     * Returns list of chairs on a specified faculty.
     *
     * @param actor vk actor
     * @param facultyId id of the faculty to get chairs from
     * @return query
     */
    public DatabaseGetChairsQuery getChairs(ServiceActor actor, int facultyId) {
        return new DatabaseGetChairsQuery(getClient(), actor, facultyId);
    }

    /**
     * Returns a list of cities.
     *
     * @param actor vk actor
     * @param countryId Country ID.
     * @return query
     */
    public DatabaseGetCitiesQuery getCities(UserActor actor, int countryId) {
        return new DatabaseGetCitiesQuery(getClient(), actor, countryId);
    }

    /**
     * Returns information about cities by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetCitiesByIdQuery getCitiesById(UserActor actor) {
        return new DatabaseGetCitiesByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about cities by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetCitiesByIdQuery getCitiesById(ServiceActor actor) {
        return new DatabaseGetCitiesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of countries.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetCountriesQuery getCountries(UserActor actor) {
        return new DatabaseGetCountriesQuery(getClient(), actor);
    }

    /**
     * Returns information about countries by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetCountriesByIdQuery getCountriesById(UserActor actor) {
        return new DatabaseGetCountriesByIdQuery(getClient(), actor);
    }

    /**
     * Returns information about countries by their IDs.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetCountriesByIdQuery getCountriesById(ServiceActor actor) {
        return new DatabaseGetCountriesByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     *
     * @param actor vk actor
     * @param universityId University ID.
     * @return query
     */
    public DatabaseGetFacultiesQuery getFaculties(UserActor actor, int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), actor, universityId);
    }

    /**
     * Returns a list of faculties (i.e., university departments).
     *
     * @param actor vk actor
     * @param universityId University ID.
     * @return query
     */
    public DatabaseGetFacultiesQuery getFaculties(ServiceActor actor, int universityId) {
        return new DatabaseGetFacultiesQuery(getClient(), actor, universityId);
    }

    /**
     * Get metro stations by city
     *
     * @param actor vk actor
     * @param cityId
     * @return query
     */
    public DatabaseGetMetroStationsQuery getMetroStations(UserActor actor, int cityId) {
        return new DatabaseGetMetroStationsQuery(getClient(), actor, cityId);
    }

    /**
     * Get metro stations by city
     *
     * @param actor vk actor
     * @param cityId
     * @return query
     */
    public DatabaseGetMetroStationsQuery getMetroStations(ServiceActor actor, int cityId) {
        return new DatabaseGetMetroStationsQuery(getClient(), actor, cityId);
    }

    /**
     * Get metro station by his id
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetMetroStationsByIdQuery getMetroStationsById(UserActor actor) {
        return new DatabaseGetMetroStationsByIdQuery(getClient(), actor);
    }

    /**
     * Get metro station by his id
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetMetroStationsByIdQuery getMetroStationsById(ServiceActor actor) {
        return new DatabaseGetMetroStationsByIdQuery(getClient(), actor);
    }

    /**
     * Returns a list of regions.
     *
     * @param actor vk actor
     * @param countryId Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
     * @return query
     */
    public DatabaseGetRegionsQuery getRegions(UserActor actor, int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), actor, countryId);
    }

    /**
     * Returns a list of regions.
     *
     * @param actor vk actor
     * @param countryId Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
     * @return query
     */
    public DatabaseGetRegionsQuery getRegions(ServiceActor actor, int countryId) {
        return new DatabaseGetRegionsQuery(getClient(), actor, countryId);
    }

    /**
     * Returns a list of school classes specified for the country.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses(UserActor actor) {
        return new DatabaseGetSchoolClassesQuery(getClient(), actor);
    }

    /**
     * Returns a list of school classes specified for the country.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetSchoolClassesQuery getSchoolClasses(ServiceActor actor) {
        return new DatabaseGetSchoolClassesQuery(getClient(), actor);
    }

    /**
     * Returns a list of schools.
     *
     * @param actor vk actor
     * @param cityId City ID.
     * @return query
     */
    public DatabaseGetSchoolsQuery getSchools(UserActor actor, int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), actor, cityId);
    }

    /**
     * Returns a list of schools.
     *
     * @param actor vk actor
     * @param cityId City ID.
     * @return query
     */
    public DatabaseGetSchoolsQuery getSchools(ServiceActor actor, int cityId) {
        return new DatabaseGetSchoolsQuery(getClient(), actor, cityId);
    }

    /**
     * Returns a list of higher education institutions.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetUniversitiesQuery getUniversities(UserActor actor) {
        return new DatabaseGetUniversitiesQuery(getClient(), actor);
    }

    /**
     * Returns a list of higher education institutions.
     *
     * @param actor vk actor
     * @return query
     */
    public DatabaseGetUniversitiesQuery getUniversities(ServiceActor actor) {
        return new DatabaseGetUniversitiesQuery(getClient(), actor);
    }
}
