package com.vk.api.examples.youtrack.server;

import com.google.gson.Gson;
import com.vk.api.examples.youtrack.callback.CallbackVk;
import com.vk.api.examples.youtrack.callback.CallbackVkNewMessage;
import com.vk.api.sdk.objects.messages.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public class CallbackRequestHandler extends AbstractHandler {

    private static final Logger LOG = LogManager.getLogger(CallbackRequestHandler.class);

    private final static String OK_BODY = "ok";
    private final Gson gson;
    private final CallbackVkNewMessage callbackVkNewMessage;

    public CallbackRequestHandler() {
        gson = new Gson();
        callbackVkNewMessage = new CallbackVkNewMessage();
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (!"POST".equalsIgnoreCase(request.getMethod())) {
            return;
        }

        String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        CallbackVk callback = gson.fromJson(body, CallbackVk.class);
        if (callback == null) {
            return;
        }

        switch (callback.getType()) {
            case MESSAGE_NEW:
                Message message = gson.fromJson(callback.getObject(), Message.class);
                callbackVkNewMessage.parseCmd(message);
                break;

            default:
                return;
        }


        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(OK_BODY);
    }
}
