package com.vk.api.sdk.events.callback;

import com.google.gson.JsonObject;
import com.vk.api.sdk.events.EventsHandler;
import com.vk.api.sdk.objects.callback.messages.CallbackMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class CallbackApi extends EventsHandler {

    private static final Logger LOG = LogManager.getLogger(CallbackApi.class);

    private final String confirmationCode;

    private final String secretKey;

    private boolean isSecretKeyValid(String receivedKey) {
        if (secretKey == null && receivedKey == null) // secret key was not received and not initialized for API client
            return true;
        if (secretKey == null || receivedKey == null) // secret key was not received but was expected, or vice versa
            return false;
        return secretKey.equals(receivedKey);
    }

    @Override
    protected String confirmation() {
        return this.confirmationCode;
    }

    public CallbackApi(String confirmationCode) {
        this.confirmationCode = confirmationCode;
        this.secretKey = null;
    }

    public CallbackApi(String confirmationCode, String secretKey) {
        this.confirmationCode = confirmationCode;
        this.secretKey = secretKey;
    }

    public String parse(String json) {
        return parse(gson.fromJson(json, CallbackMessage.class));
    }

    public String parse(JsonObject json) {
        return parse(gson.fromJson(json, CallbackMessage.class));
    }

    public String parse(CallbackMessage message) {
        if (isSecretKeyValid(message.getSecret()))
            return super.parse(message);
        LOG.error("Secret key check was failed");
        return "failed";
    }
}