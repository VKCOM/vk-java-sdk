package com.vk.api.sdk;

import com.google.gson.Gson;
import com.vk.api.sdk.client.Lang;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiAuthException;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.users.UserField;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by tsivarev on 22.08.16.
 */
public class ApiTest {

    private TransportClient client;
    private VkApiClient vk;

    @BeforeClass
    public void setUp() {
        client = HttpTransportClient.getInstance();
        vk = new VkApiClient(client, new Gson());
    }

    @Test
    public void withoutActorTest() throws ClientException, ApiException {
        List<BaseObject> chairs = vk.database().getChairs(1).count(10).execute().getItems();
        Assert.assertNotNull(chairs);
        Assert.assertFalse(chairs.isEmpty());
    }

    @Test
    public void langTest() throws ClientException, ApiException {
        List<UserXtrCounters> users = vk.users().get()
                .userIds("1")
                .fields(UserField.VERIFIED, UserField.SEX)
                .lang(Lang.EN)
                .execute();

        Assert.assertEquals(users.size(), 1);

        UserXtrCounters user = users.get(0);

        Assert.assertNotNull(user);
        Assert.assertEquals(user.getLastName(), "Durov");
        Assert.assertEquals(user.getSex(), new Integer(2));
        Assert.assertTrue(user.isVerified());
    }

    @Test
    public void accessTokenRequiredTest() throws ClientException, ApiException {
        try {
            vk.wall().post(new UserActor(0, "dummy")).execute();
            Assert.fail();
        } catch (ApiAuthException e) {
            //nop
        }
    }
}
