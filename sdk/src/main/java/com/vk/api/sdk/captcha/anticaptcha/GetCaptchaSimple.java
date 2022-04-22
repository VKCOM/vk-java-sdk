package com.vk.api.sdk.captcha.anticaptcha;


import com.vk.api.sdk.captcha.CaptchaResolveException;
import com.vk.api.sdk.captcha.anticaptcha.entities.ImageToTextTaskRequestObject;
import com.vk.api.sdk.captcha.anticaptcha.entities.requests.CreateTaskRequest;
import com.vk.api.sdk.captcha.anticaptcha.entities.requests.CreateTaskResponse;
import com.vk.api.sdk.captcha.anticaptcha.entities.requests.GetCaptchaResultRequest;
import com.vk.api.sdk.captcha.anticaptcha.entities.requests.GetCaptchaResultResponse;
import com.vk.api.sdk.captcha.anticaptcha.simpleRequest.simpleRequest;
import org.apache.commons.io.IOUtils;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Objects;

public class GetCaptchaSimple {

    public static byte[] readFromPathOrUrl(String urlOrPath) throws IOException {
        if(urlOrPath.contains("http")) {
            URL url = new URL (urlOrPath);
            InputStream is = null;
            try {
                is = url.openStream();
                return IOUtils.toByteArray(is);
            }
            catch (IOException e) {
                System.err.printf ("Failed while reading bytes from %s: %s", url.toExternalForm(), e.getMessage());
                e.printStackTrace ();
                throw e;
            }
            finally {
                if (is != null) { is.close(); }
            }
        }
        else return Files.readAllBytes(Path.of(urlOrPath));
    }


    public static String getCaptchaCode(String captchaUrlOrPath, String antiCaptchaApiKey, Integer sleepSecondBetweenTaskCheck, Integer maxRetries) throws CaptchaResolveException {
        if(sleepSecondBetweenTaskCheck==null) sleepSecondBetweenTaskCheck=5;
        if(maxRetries==null) maxRetries=2;

        //Base64 of image
        String encodedImage = null;
        try {
            encodedImage = Base64.getEncoder().encodeToString(readFromPathOrUrl(captchaUrlOrPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (encodedImage == null) throw new CaptchaResolveException("Cant resolve captcha, cant get base64 of img!");

        //Set resolve task
        Integer taskId = null;
        try {
            CreateTaskResponse createTaskResponse = new simpleRequest()
                    .setUrl("http://api.anti-captcha.com/createTask")
                    .addHeader(new BasicHeader("Accept", "application/json"))
                    .addHeader(new BasicHeader("Content-Type", "application/json"))
                    .doRequest(new CreateTaskRequest().setClientKey(antiCaptchaApiKey).setTask(new ImageToTextTaskRequestObject().setBody(encodedImage)), CreateTaskResponse.class);
            taskId = createTaskResponse.getTaskId();
        } catch (IOException e) {
            e.printStackTrace();
            throw new CaptchaResolveException("IO exception during create task!");
        }
        if (taskId == null) throw new CaptchaResolveException("Cant resolve captcha, anticaptcha /createTask not returned taskId!");

        //Get captcha resolve
        for (int i = 0; i < maxRetries; i++) {
            try {
                Thread.sleep(sleepSecondBetweenTaskCheck*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new CaptchaResolveException("Cant resolve captcha, wait interrupted!");
            }

            //Get captcha code
            String captchaText = null;
            try {
                GetCaptchaResultResponse response = new simpleRequest()
                        .setUrl("http://api.anti-captcha.com/getTaskResult")
                        .addHeader(new BasicHeader("Accept", "application/json"))
                        .addHeader(new BasicHeader("Content-Type", "application/json"))
                        .doRequest(new GetCaptchaResultRequest().setClientKey(antiCaptchaApiKey).setTaskId(taskId), GetCaptchaResultResponse.class);
                if (Objects.equals(response.getStatus(), "processing")) continue;
                if (!Objects.equals(response.getStatus(), "ready"))
                    throw new CaptchaResolveException("Cant resolve captcha, anticaptcha result is not in correct status, error: "
                            + response.getErrorId()
                            + " " + response.getErrorCode()
                            + " " + response.getErrorDescription()
                    );
                captchaText = response.getSolution().getText();
                if (captchaText == null)
                    throw new CaptchaResolveException("Cant resolve captcha, anticaptcha result text is null!");
                return captchaText;

            } catch (IOException e) {
                e.printStackTrace();
                throw new CaptchaResolveException("IO exception during getTaskResult");
            }
        }
        throw new CaptchaResolveException("Cant be here!");
    }

}

