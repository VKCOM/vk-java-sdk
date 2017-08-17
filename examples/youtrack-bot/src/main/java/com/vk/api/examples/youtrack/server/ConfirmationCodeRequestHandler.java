package com.vk.api.examples.youtrack.server;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.vk.api.sdk.callback.objects.messages.CallbackMessage;
import com.vk.api.sdk.callback.objects.messages.CallbackMessageType;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.stream.Collectors;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public class ConfirmationCodeRequestHandler extends AbstractHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ConfirmationCodeRequestHandler.class);

    private final Gson gson;
    private final String confirmationCode;

    public ConfirmationCodeRequestHandler(String confirmationCode) {
        this.confirmationCode = confirmationCode;
        gson = new Gson();
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (!"POST".equalsIgnoreCase(request.getMethod())) {
            return;
        }

        String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        Type typeOfClass = new TypeToken<CallbackMessage<JsonObject>>() {
        }.getType();
        CallbackMessage<JsonObject> callback = gson.fromJson(body, typeOfClass);
        if (callback == null) {
            return;
        }

        if (callback.getType() != CallbackMessageType.CONFIRMATION) {
            return;
        }

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(confirmationCode);
    }
}
