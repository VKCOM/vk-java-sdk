package com.vk.api.examples.youtrack.api.actions;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.objects.users.User;

import java.io.IOException;

public class UsersApi extends BaseApi {

    public static User getUser(String login) throws IOException {
        return fromXml(Application.yt().get("/rest/user/" + login), User.class);
    }
}
