package com.notification.channels;

import com.notification.unified_interface.Notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}
