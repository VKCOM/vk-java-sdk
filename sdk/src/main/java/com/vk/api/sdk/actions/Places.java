package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.places.PlacesAddQuery;
import com.vk.api.sdk.queries.places.PlacesCheckinQuery;
import com.vk.api.sdk.queries.places.PlacesGetByIdQuery;
import com.vk.api.sdk.queries.places.PlacesGetCheckinsQuery;
import com.vk.api.sdk.queries.places.PlacesGetTypesQuery;
import com.vk.api.sdk.queries.places.PlacesSearchQuery;

import java.util.List;

/**
 * List of Places methods
 */
public class Places extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Places(VkApiClient client) {
        super(client);
    }

    /**
     * Adds a new location to the location database.
     */
    public PlacesAddQuery add(UserActor actor, String title, float latitude, float longitude) {
        return new PlacesAddQuery(getClient(), actor, title, latitude, longitude);
    }

    /**
     * Returns information about locations by their IDs.
     */
    public PlacesGetByIdQuery getById(UserActor actor, int... places) {
        return new PlacesGetByIdQuery(getClient(), actor, places);
    }

    /**
     * Returns information about locations by their IDs.
     */
    public PlacesGetByIdQuery getById(UserActor actor, List<Integer> places) {
        return new PlacesGetByIdQuery(getClient(), actor, places);
    }

    /**
     * Returns a list of locations that match the search criteria.
     */
    public PlacesSearchQuery search(UserActor actor, float latitude, float longitude) {
        return new PlacesSearchQuery(getClient(), actor, latitude, longitude);
    }

    /**
     * Checks a user in at the specified location.
     */
    public PlacesCheckinQuery checkin(UserActor actor) {
        return new PlacesCheckinQuery(getClient(), actor);
    }

    /**
     * Returns a list of user check-ins at locations according to the set parameters.
     */
    public PlacesGetCheckinsQuery getCheckins(UserActor actor) {
        return new PlacesGetCheckinsQuery(getClient(), actor);
    }

    /**
     * Returns a list of all types of locations.
     */
    public PlacesGetTypesQuery getTypes(UserActor actor) {
        return new PlacesGetTypesQuery(getClient(), actor);
    }
}
