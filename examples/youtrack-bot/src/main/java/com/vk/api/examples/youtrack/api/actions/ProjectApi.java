package com.vk.api.examples.youtrack.api.actions;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.api.objects.projects.AdminProjectList;
import com.vk.api.examples.youtrack.api.objects.projects.ProjectList;

import java.io.IOException;

public class ProjectApi extends BaseApi {

    public static AdminProjectList adminList() throws IOException {
        return fromXml(Application.yt().get("/rest/admin/project"), AdminProjectList.class);
    }

    public static ProjectList list() throws IOException {
        return fromXml(Application.yt().get("/rest/project/all"), ProjectList.class);
    }
}
