package com.vk.api.examples.youtrack.server;

import com.vk.api.examples.youtrack.callback.CallbackApiHandler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public class CallbackRequestHandler extends AbstractHandler {

    private static final Logger LOG = LoggerFactory.getLogger(CallbackRequestHandler.class);

    private final static String OK_BODY = "ok";
    private final CallbackApiHandler callbackApiHandler;

    public CallbackRequestHandler() {
        callbackApiHandler = new CallbackApiHandler();
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (!"POST".equalsIgnoreCase(request.getMethod())) {
            return;
        }

        String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        boolean handled = callbackApiHandler.parse(body);
        if (!handled) {
            return;
        }

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(OK_BODY);
    }
}
