package com.vk.api.sdk.captcha;


import com.vk.api.sdk.captcha.anticaptcha.GetCaptchaSimple;

public class CaptchaHandlerAnticaptcha extends CaptchaHandlerAbstract {
    private final String apiKey;
    private final Integer sleepSecondBetweenTaskCheck;
    private final Integer maxRetries;

    public CaptchaHandlerAnticaptcha(String apiKey, Integer sleepSecondBetweenTaskCheck, Integer maxRetries) {
        this.apiKey = apiKey;
        this.sleepSecondBetweenTaskCheck = sleepSecondBetweenTaskCheck;
        this.maxRetries = maxRetries;
    }

    @Override
    public String getCaptchaCode(String sid, String img) throws CaptchaResolveException {
        System.out.println("Resolving captcha via anti-captcha.com...");
       return GetCaptchaSimple.getCaptchaCode(img, apiKey, sleepSecondBetweenTaskCheck, maxRetries);
    }

}

