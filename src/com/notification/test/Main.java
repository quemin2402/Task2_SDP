package com.notification.test;

import com.notification.BulkNotificationSender;
import com.notification.channels.EmailNotification;
import com.notification.channels.PushNotification;
import com.notification.channels.SMSNotification;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> recipients = Arrays.asList("User1", "User2", "User3");

        BulkNotificationSender smsSender = new BulkNotificationSender(new SMSNotification());
        smsSender.sendBulkNotifications("Hey, it's an SMS message!", recipients);
        System.out.println();

        BulkNotificationSender emailSender = new BulkNotificationSender(new EmailNotification());
        emailSender.sendBulkNotifications("Hello, it's an Email message!", recipients);
        System.out.println();

        BulkNotificationSender pushSender = new BulkNotificationSender(new PushNotification());
        pushSender.sendBulkNotifications("This is a Push message for you!", recipients);
        System.out.println();
    }
}
