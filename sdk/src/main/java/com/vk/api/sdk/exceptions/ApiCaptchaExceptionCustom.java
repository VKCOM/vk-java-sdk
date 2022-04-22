package com.vk.api.sdk.exceptions;

public class ApiCaptchaExceptionCustom extends ApiException {
    String captcha_sid;
    String captcha_img;

    public String getCaptcha_sid() {
        return captcha_sid;
    }

    public String getCaptcha_img() {
        return captcha_img;
    }

    public ApiCaptchaExceptionCustom(Integer code, String message, String captcha_sid, String captcha_img) {
        super(code, "(Re)Captcha needed", message);
        this.captcha_img = captcha_img;
        this.captcha_sid = captcha_sid;
    }
}
