package com.notification.channels;

import com.notification.unified_interface.Notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
