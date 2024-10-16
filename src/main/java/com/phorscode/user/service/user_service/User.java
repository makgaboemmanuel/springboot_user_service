package com.phorscode.user.service.user_service;

import com.phorscode.user.service.user_service.client_services.Notifications;
import com.phorscode.user.service.user_service.client_services.Posts;

public class User {
    private String userId;
    private String userName;
    private String userPhoneNumber;

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Notifications getNotifications() {
        return notifications;
    }

    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    private Posts posts;
    private Notifications notifications;

    public User(String userId, String userName, String userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
