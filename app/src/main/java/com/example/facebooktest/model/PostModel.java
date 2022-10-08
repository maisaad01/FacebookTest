package com.example.facebooktest.model;

public class PostModel {
    private String userNamePost ,postText ,postTime;
    private int profileImg , postImg ;

    public PostModel(String userNamePost, String postText, String postTime, int profileImg, int postImg) {
        this.userNamePost = userNamePost;
        this.postText = postText;
        this.postTime = postTime;
        this.profileImg = profileImg;
        this.postImg = postImg;
    }

    public String getUserNamePost() {
        return userNamePost;
    }

    public void setUserNamePost(String userNamePost) {
        this.userNamePost = userNamePost;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public int getPostImg() {
        return postImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }
}
