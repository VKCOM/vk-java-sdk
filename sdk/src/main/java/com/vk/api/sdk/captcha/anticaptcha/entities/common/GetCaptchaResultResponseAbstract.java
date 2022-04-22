package com.vk.api.sdk.captcha.anticaptcha.entities.common;

abstract public class GetCaptchaResultResponseAbstract {
    protected Integer errorId;
    protected String errorCode;
    protected String errorDescription;
    protected String status;

    protected Double cost;
    protected String ip;
    protected Integer createTime;
    protected Integer endTime;
    protected Integer solveCount;

    public Integer getErrorId() {
        return errorId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getStatus() {
        return status;
    }

    public Double getCost() {
        return cost;
    }

    public String getIp() {
        return ip;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public Integer getSolveCount() {
        return solveCount;
    }

    public GetCaptchaResultResponseAbstract setErrorId(Integer errorId) {
        this.errorId = errorId;
        return this;
    }

    public GetCaptchaResultResponseAbstract setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public GetCaptchaResultResponseAbstract setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    public GetCaptchaResultResponseAbstract setStatus(String status) {
        this.status = status;
        return this;
    }

    public GetCaptchaResultResponseAbstract setCost(Double cost) {
        this.cost = cost;
        return this;
    }

    public GetCaptchaResultResponseAbstract setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public GetCaptchaResultResponseAbstract setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    public GetCaptchaResultResponseAbstract setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    public GetCaptchaResultResponseAbstract setSolveCount(Integer solveCount) {
        this.solveCount = solveCount;
        return this;
    }
}
