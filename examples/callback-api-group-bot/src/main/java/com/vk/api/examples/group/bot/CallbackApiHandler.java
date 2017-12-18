package com.vk.api.examples.group.bot;

import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.wall.WallPost;

public class CallbackApiHandler extends CallbackApiLongPoll {

    private UserActor userActor;
    private GroupActor groupActor;

    public CallbackApiHandler(VkApiClient client, Actor actor, String groupId) {
        super(client, actor, groupId);
    }

    @Override
    public void wallPostNew(Integer groupId, WallPost message) {
        StringBuilder response = new StringBuilder();
        response.append("Hi! You just made a new post on community wall with text = \'").append(message.getText()).append('\'');
        getClient().messages().send(userActor).userId(message.getFromId()).message(response.toString());
    }

    public UserActor getUserActor() {
        return userActor;
    }

    public void setUserActor(UserActor userActor) {
        this.userActor = userActor;
    }

    public GroupActor getGroupActor() {
        return groupActor;
    }

    public void setGroupActor(GroupActor groupActor) {
        this.groupActor = groupActor;
    }
}
