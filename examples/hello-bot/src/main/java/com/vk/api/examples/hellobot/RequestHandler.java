package com.vk.api.examples.hellobot;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

class RequestHandler extends AbstractHandler {

    private final static String CONFIRMATION_TYPE = "confirmation";
    private final static String MESSAGE_TYPE = "message_new";
    private final static String OK_BODY = "ok";

    private final BotRequestHandler botRequestHandler;
    private final String confirmationCode;

    RequestHandler(BotRequestHandler handler, String confirmationCode) {
        this.botRequestHandler = handler;
        this.confirmationCode = confirmationCode;
    }

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        if (!"POST".equalsIgnoreCase(request.getMethod())) {
            throw new ServletException("This method is unsupported");
        }

        String requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        try {
            JSONObject requestJson = new JSONObject(requestBody);

            String type = requestJson.optString("type");

            if (type == null || type.isEmpty()) throw new ServletException("No type in json");

            final String responseBody;
            switch (type) {
                case CONFIRMATION_TYPE:
                    responseBody = confirmationCode;
                    break;
                case MESSAGE_TYPE:
                    JSONObject object = requestJson.getJSONObject("object");
                    int userId = object.getInt("user_id");
                    botRequestHandler.handle(userId);
                    responseBody = OK_BODY;
                    break;
                default:
                    responseBody = OK_BODY; // in case we get another event
                    break;
            }

            response.setContentType("text/html;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            baseRequest.setHandled(true);
            response.getWriter().println(responseBody);
        } catch (JSONException e) {
            throw new ServletException("Incorrect json", e);
        }
    }
}
