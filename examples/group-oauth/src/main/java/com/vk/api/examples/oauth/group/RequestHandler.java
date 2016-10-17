package com.vk.api.examples.oauth.group;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.GroupAuthResponse;
import com.vk.api.sdk.objects.UserAuthResponse;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.groups.responses.GetResponse;
import com.vk.api.sdk.queries.groups.GroupsGetFilter;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Anton Tsivarev on 15.10.16.
 */
public class RequestHandler extends AbstractHandler {

    private final static String CONTENT_TYPE = "text/html;charset=utf-8";
    private final String clientSecret;
    private final int clientId;
    private final String host;
    private final VkApiClient vk;

    public RequestHandler(VkApiClient vk, int clientId, String clientSecret, String host) {
        this.vk = vk;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.host = host;
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            switch (target) {
                case "/group_callback":
                    Integer groupId = Integer.parseInt(baseRequest.getParameter("group_id"));
                    GroupAuthResponse groupAuthResponse = vk.oauth().groupAuthorizationCodeFlow(clientId, clientSecret, getGroupRedirectUri(groupId), baseRequest.getParameter("code")).execute();
                    GroupActor groupActor = new GroupActor(groupId, groupAuthResponse.getAccessTokens().get(groupId));

                    List<GroupFull> groups = vk.groups().getById(groupActor).groupId(groupId.toString()).execute();

                    response.setContentType(CONTENT_TYPE);
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.getWriter().println(getInfoPage(groups.get(0)));

                    baseRequest.setHandled(true);
                    break;

                case "/user_callback":
                    UserAuthResponse userAuthResponse = vk.oauth().userAuthorizationCodeFlow(clientId, clientSecret, getUserRedirectUri(), baseRequest.getParameter("code")).execute();
                    UserActor userActor = new UserActor(userAuthResponse.getUserId(), userAuthResponse.getAccessToken());
                    GetResponse getResponse = vk.groups().get(userActor).userId(userActor.getId()).filter(GroupsGetFilter.ADMIN).execute();
                    if (!getResponse.getItems().isEmpty()) {
                        response.sendRedirect(getGroupOAuthUrl(getResponse.getItems().get(0)));
                    } else {
                        response.setStatus(HttpServletResponse.SC_OK);
                        response.getWriter().println("No admin groups");
                        response.setContentType(CONTENT_TYPE);
                    }

                    baseRequest.setHandled(true);
                    break;

                case "/login":
                    response.sendRedirect(getUserOAuthUrl());

                    baseRequest.setHandled(true);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
            response.getWriter().println("Error:" + e.getMessage());
            response.setContentType(CONTENT_TYPE);
            baseRequest.setHandled(true);
        }
    }

    private String getUserOAuthUrl() {
        return "https://oauth.vk.com/authorize?client_id=" + clientId + "&display=page&redirect_uri=" + getUserRedirectUri() + "&scope=groups&response_type=code";
    }

    private String getGroupOAuthUrl(int groupId) {
        return "https://oauth.vk.com/authorize?client_id=" + clientId + "&display=page&redirect_uri=" + getGroupRedirectUri(groupId) + "&scope=manage&response_type=code&group_ids=" + groupId;
    }

    private String getUserRedirectUri() {
        return host + "/user_callback";
    }

    private String getGroupRedirectUri(int groupId) {
        return host + "/group_callback?group_id=" + groupId;
    }

    private String getInfoPage(Group group) {
        return "My group is <a href='https://vk.com/club" + group.getId() + "'>" + group.getName() + "</a>";
    }
}
