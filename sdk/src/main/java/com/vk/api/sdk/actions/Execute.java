package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.execute.ExecuteBatchQuery;
import com.vk.api.sdk.queries.execute.ExecuteCodeQuery;
import com.vk.api.sdk.queries.execute.ExecuteStorageFunctionQuery;
import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.LookupTranslator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Execute extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Execute(VkApiClient client) {
        super(client);
    }

    private static final CharSequenceTranslator ESCAPE_VKSCRIPT =
            new LookupTranslator(new HashMap<CharSequence, CharSequence>() {
                private static final long serialVersionUID = 1L;

                {
                    put("\"", "\\\"");
                    put("\n", "\\n");
                    put("\r", "\\r");
                    put("\\", "\\\\");
                }
            });

    /**
     * Execute by code
     */
    public ExecuteCodeQuery code(UserActor actor, String code) {
        return new ExecuteCodeQuery(getClient(), actor, code);
    }

    /**
     * Execute by code
     */
    public ExecuteCodeQuery code(GroupActor actor, String code) {
        return new ExecuteCodeQuery(getClient(), actor, code);
    }

    /**
     * Execute storage function
     */
    public ExecuteStorageFunctionQuery storageFunction(UserActor actor, String storageFunctionName) {
        return new ExecuteStorageFunctionQuery(getClient(), actor, storageFunctionName);
    }

    /**
     * Execute storage function
     */
    public ExecuteStorageFunctionQuery storageFunction(GroupActor actor, String storageFunctionName) {
        return new ExecuteStorageFunctionQuery(getClient(), actor, storageFunctionName);
    }

    public ExecuteBatchQuery batch(UserActor actor, AbstractQueryBuilder... request) {
        return new ExecuteBatchQuery(getClient(), actor, request);
    }

    public ExecuteBatchQuery batch(GroupActor actor, AbstractQueryBuilder... request) {
        return new ExecuteBatchQuery(getClient(), actor, request);
    }

    public ExecuteBatchQuery batch(UserActor actor, List<AbstractQueryBuilder> requests) {
        return new ExecuteBatchQuery(getClient(), actor, requests.toArray(new AbstractQueryBuilder[requests.size()]));
    }

    public ExecuteBatchQuery batch(GroupActor actor, List<AbstractQueryBuilder> requests) {
        return new ExecuteBatchQuery(getClient(), actor, requests.toArray(new AbstractQueryBuilder[requests.size()]));
    }
}
