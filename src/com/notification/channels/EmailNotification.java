package com.notification.channels;

import com.notification.unified_interface.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
