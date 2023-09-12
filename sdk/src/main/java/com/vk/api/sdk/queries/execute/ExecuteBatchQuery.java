package com.vk.api.sdk.queries.execute;

import com.google.gson.JsonElement;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.LookupTranslator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Query for execute by code
 */
public class ExecuteBatchQuery extends AbstractQueryBuilder<ExecuteBatchQuery, JsonElement> {

    /**
     * Translator object for escaping VKScript
     */
    private static final CharSequenceTranslator ESCAPE_VKSCRIPT = new LookupTranslator(new HashMap<CharSequence, CharSequence>() {
        private static final long serialVersionUID = 1L;
        {
            put("\"", "\\\"");
            put("\n", "\\n");
            put("\r", "\\r");
            put("\\", "\\\\");
        }
    });

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param requests batch requests
     */
    public ExecuteBatchQuery(VkApiClient client, UserActor actor, AbstractQueryBuilder... requests) {
        super(client, "execute", JsonElement.class);
        accessToken(actor.getAccessToken());
        requests(requests);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client   VK API client
     * @param actor    actor with access token
     * @param requests batch requests
     */
    public ExecuteBatchQuery(VkApiClient client, GroupActor actor, AbstractQueryBuilder... requests) {
        super(client, "execute", JsonElement.class);
        accessToken(actor.getAccessToken());
        requests(requests);
    }

    /**
     * Batch requests
     *
     * @param value value of "code" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected ExecuteBatchQuery requests(AbstractQueryBuilder... value) {
        StringBuilder builder = new StringBuilder();
        builder.append("return [");

        int requestIndex = 0;
        for (AbstractQueryBuilder request : value) {
            builder.append("API.").append(request.getMethod()).append("(");
            Map<String, String> params = new HashMap<>(request.build());

            params.remove("access_token");
            params.remove("v");

            if (!params.isEmpty()) {
                builder.append("{");
                int paramIndex = 0;
                for (Map.Entry<String, String> param : params.entrySet()) {
                    builder.append("\"").append(param.getKey()).append("\":").append("\"")
                            .append(ESCAPE_VKSCRIPT.translate(param.getValue())).append("\"");

                    if (paramIndex < (params.size() - 1)) {
                        builder.append(",");
                    }

                    paramIndex++;
                }

                builder.append("}");
            }

            builder.append(")");

            if (requestIndex < (value.length - 1)) {
                builder.append(",");
            }

            requestIndex++;
        }

        builder.append("];");
        return unsafeParam("code", builder.toString());
    }

    @Override
    protected ExecuteBatchQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("code");
    }
}
