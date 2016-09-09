package com.vk.api.examples.youtrack.server;

import com.google.gson.Gson;
import com.vk.api.examples.youtrack.callback.CallbackVk;
import com.vk.api.examples.youtrack.callback.CallbackVkType;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anton Tsivarev on 09.09.16.
 */
public class ConfirmationCodeRequestHandler extends AbstractHandler {

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

        CallbackVk callback = gson.fromJson(request.getReader(), CallbackVk.class);
        if (callback.getType() != CallbackVkType.CONFIRMATION) {
            return;
        }

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(confirmationCode);
    }
}
