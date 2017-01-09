package com.vk.api.sdk.queries.oauth;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.exceptions.OAuthException;
import com.vk.api.sdk.objects.oauth.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringReader;
import java.lang.reflect.Type;

/**
 * Created by tsivarev on 14.08.16.
 */
public abstract class OAuthQueryBuilder<T, R> extends AbstractQueryBuilder<T, R> {

    private static final Logger LOG = LoggerFactory.getLogger(OAuthQueryBuilder.class);

    public OAuthQueryBuilder(VkApiClient client, String endpoint, String method, Type type) {
        super(client, endpoint, method, type);
    }

    @Override
    public R execute() throws ApiException, ClientException {
        String textResponse = executeAsString();
        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));
        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("error")) {
            Error error;
            try {
                error = getGson().fromJson(json, Error.class);
            } catch (JsonSyntaxException e) {
                LOG.error("Invalid JSON: " + textResponse, e);
                throw new ClientException("Can't parse json response");
            }

            OAuthException exception = new OAuthException(error.getError(), error.getErrorDescription(), error.getRedirectUri());
            LOG.error("API error", exception);
            throw exception;
        }

        try {
            return getGson().fromJson(json, getResponseClass());
        } catch (JsonSyntaxException e) {
            LOG.error("Invalid JSON: " + textResponse, e);
            throw new ClientException("Can't parse json response");
        }
    }

}
