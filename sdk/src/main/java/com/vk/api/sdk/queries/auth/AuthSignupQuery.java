package com.vk.api.sdk.queries.auth;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.objects.auth.responses.SignupResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Auth.signup method
 */
public class AuthSignupQuery extends AbstractQueryBuilder<AuthSignupQuery, SignupResponse> {

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client       VK API client
     * @param firstName    value of "first name" parameter.
     * @param lastName     value of "last name" parameter.
     * @param clientId     value of "client id" parameter.
     * @param clientSecret value of "client secret" parameter.
     * @param phone        value of "phone" parameter.
     */
    public AuthSignupQuery(VkApiClient client, String firstName, String lastName, String birthday, int clientId, String clientSecret, String phone) {
        super(client, "auth.signup", SignupResponse.class);
        firstName(firstName);
        lastName(lastName);
        birthday(birthday);
        clientId(clientId);
        clientSecret(clientSecret);
        phone(phone);
    }

    /**
     * User's first name.
     *
     * @param value value of "first name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery firstName(String value) {
        return unsafeParam("first_name", value);
    }

    /**
     * User's surname.
     *
     * @param value value of "last name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery lastName(String value) {
        return unsafeParam("last_name", value);
    }

    /**
     * User's birthday.
     *
     * @param value value of "last name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery birthday(String value) {
        return unsafeParam("birthday", value);
    }

    /**
     * Your application ID.
     *
     * @param value value of "client id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery clientId(int value) {
        return unsafeParam("client_id", value);
    }

    /**
     * Set client secret
     *
     * @param value value of "client secret" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery clientSecret(String value) {
        return unsafeParam("client_secret", value);
    }

    /**
     * User's phone number. Can be pre-checked with the auth.checkPhone method.
     *
     * @param value value of "phone" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected AuthSignupQuery phone(String value) {
        return unsafeParam("phone", value);
    }

    /**
     * User's password (minimum of 6 characters). Can be specified later with the auth.confirm method.
     *
     * @param value value of "password" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthSignupQuery password(String value) {
        return unsafeParam("password", value);
    }

    /**
     * true - test mode, in which the user will not be registered and the phone number will not be checked for availability
     * false - default mode (default)
     *
     * @param value value of "test mode" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthSignupQuery testMode(Boolean value) {
        return unsafeParam("test_mode", value);
    }

    /**
     * true - call the phone number and leave a voice message of the authorization code
     * false - send the code by SMS (default)
     *
     * @param value value of "voice" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthSignupQuery voice(Boolean value) {
        return unsafeParam("voice", value);
    }

    /**
     * Set sex
     *
     * @param value value of "sex" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthSignupQuery sex(AppsSignupSex value) {
        return unsafeParam("sex", value);
    }

    /**
     * Session ID required for method recall when SMS was not delivered.
     *
     * @param value value of "sid" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AuthSignupQuery sid(String value) {
        return unsafeParam("sid", value);
    }

    @Override
    protected AuthSignupQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("first_name", "phone", "client_secret", "last_name", "birthday", "client_id");
    }
}
