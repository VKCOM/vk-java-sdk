package com.vk.api.sdk.captcha;

public abstract class CaptchaHandlerAbstract {
    private int maxCaptchaProcessRetries = 2;
    private int maxTechnicalResolveRetries = 2;

    public int getMaxCaptchaProcessRetries() {
        return maxCaptchaProcessRetries;
    }

    public int getMaxTechnicalResolveRetries() {
        return maxTechnicalResolveRetries;
    }

    public CaptchaHandlerAbstract(int maxCaptchaProcessRetries, int maxTechnicalResolveRetries) {
        this.maxCaptchaProcessRetries = maxCaptchaProcessRetries;
        this.maxTechnicalResolveRetries = maxTechnicalResolveRetries;
    }

    public CaptchaHandlerAbstract() {
    }

    abstract public String getCaptchaCode(String sid, String img) throws CaptchaResolveException;

    public boolean checkCode(String key) {
        if(key == null || !key.matches("^[0-9a-zA-Z]*?$")) return false;
        return true;
    }
}
