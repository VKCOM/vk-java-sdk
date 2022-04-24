package com.vk.api.sdk.captcha.anticaptcha.entities;

import com.google.gson.annotations.SerializedName;

public class ImageToTextTaskRequestObject {
    private String type = "ImageToTextTask";
    private String body;
    private Boolean phrase;
    @SerializedName("case")
    private Boolean tCase;
    private Integer numeric;
    private Boolean math;
    private Integer minLength;
    private Integer maxLength;
    private String commend;
    private String websiteURL;

    public ImageToTextTaskRequestObject setType(String type) {
        this.type = type;
        return this;
    }

    public ImageToTextTaskRequestObject setBody(String body) {
        this.body = body;
        return this;
    }

    public ImageToTextTaskRequestObject setPhrase(Boolean phrase) {
        this.phrase = phrase;
        return this;
    }

    public ImageToTextTaskRequestObject setCase(Boolean tCase) {
        this.tCase = tCase;
        return this;
    }

    public ImageToTextTaskRequestObject setNumeric(Integer numeric) {
        this.numeric = numeric;
        return this;
    }

    public ImageToTextTaskRequestObject setMath(Boolean math) {
        this.math = math;
        return this;
    }

    public ImageToTextTaskRequestObject setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    public ImageToTextTaskRequestObject setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public ImageToTextTaskRequestObject setCommend(String commend) {
        this.commend = commend;
        return this;
    }

    public ImageToTextTaskRequestObject setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
        return this;
    }
}
