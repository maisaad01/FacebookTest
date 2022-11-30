package com.example.facebooktest.model;

public class FriendsRequestModel {
    private String requestName , requestTime ,requestMutual ;
    private int requestImg ;

    public FriendsRequestModel(String requestName, String requestTime, String requestMutual, int requestImg) {
        this.requestName = requestName;
        this.requestTime = requestTime;
        this.requestMutual = requestMutual;
        this.requestImg = requestImg;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestMutual() {
        return requestMutual;
    }

    public void setRequestMutual(String requestMutual) {
        this.requestMutual = requestMutual;
    }

    public int getRequestImg() {
        return requestImg;
    }

    public void setRequestImg(int requestImg) {
        this.requestImg = requestImg;
    }
}
