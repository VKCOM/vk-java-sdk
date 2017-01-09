package com.vk.api.examples.youtrack.jobs;

import com.vk.api.examples.youtrack.Application;
import com.vk.api.examples.youtrack.storage.LangStorage;
import com.vk.api.examples.youtrack.storage.MembersStorage;
import com.vk.api.examples.youtrack.storage.users.YouTrackUsersStorage;
import com.vk.api.sdk.exceptions.ApiMessagesDenySendException;
import com.vk.api.sdk.objects.groups.responses.GetMembersResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by tsivarev on 07.09.16.
 */
public class MembersUpdateJob implements Job {

    private static final Logger LOG = LoggerFactory.getLogger(MembersUpdateJob.class);

    @Override
    public void doJob() throws Exception {
        GetMembersResponse getMembers = Application.vk().groups().getMembers(Application.actor())
                .groupId(String.valueOf(-Application.actor().getId()))
                .execute();


        Set<Integer> toRemove = YouTrackUsersStorage.getInstance().getIds();
        Set<Integer> newMembers = new HashSet<>();
        for (Integer userId : getMembers.getItems()) {
            toRemove.remove(userId);

            if (YouTrackUsersStorage.getInstance().getUserById(userId) != null) {
                continue;
            }

            if (MembersStorage.getInstance().contains(userId)) {
                continue;
            }

            newMembers.add(userId);
        }

        for (Integer userId : newMembers) {
            try {
                Application.vk().messages().send(Application.actor())
                        .randomId(new Random().nextInt(10000))
                        .message(LangStorage.getInstance().get("welcome"))
                        .peerId(userId).execute();
            } catch (ApiMessagesDenySendException e) {
                LOG.warn("No messages with user " + userId);
            }

            MembersStorage.getInstance().add(userId);
        }

        for (Integer userId : toRemove) {
            LOG.info("User " + userId + " is not group member. Remove.");
            YouTrackUsersStorage.getInstance().remove(userId);
        }
    }
}
