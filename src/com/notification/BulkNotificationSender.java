package com.notification;

import com.notification.unified_interface.Notification;

import java.util.List;

public class BulkNotificationSender {
    private Notification notification;

    public BulkNotificationSender(Notification notification) {
        this.notification = notification;
    }

    public void sendBulkNotifications(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notification.sendNotification(message, recipient);
        }
    }
}
