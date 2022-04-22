package com.vk.api.sdk.captcha.anticaptcha.entities.requests;

import com.vk.api.sdk.captcha.anticaptcha.entities.ImageToTextTaskResultObject;
import com.vk.api.sdk.captcha.anticaptcha.entities.common.GetCaptchaResultResponseAbstract;

public class GetCaptchaResultResponse extends GetCaptchaResultResponseAbstract {

    ImageToTextTaskResultObject solution;

    public ImageToTextTaskResultObject getSolution() {
        return solution;
    }
}
