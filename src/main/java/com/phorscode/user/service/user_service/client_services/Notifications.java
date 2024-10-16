package com.phorscode.user.service.user_service.client_services;

public class Notifications {
    private String notificationId;
    private String description;

    public Notifications(String notificationId, String description) {
        this.notificationId = notificationId;
        this.description = description;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getDescription() {
        return description;
    }
}
