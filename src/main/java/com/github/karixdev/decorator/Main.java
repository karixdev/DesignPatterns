package com.github.karixdev.decorator;

public class Main {
    public static void main(String[] args) {

        Notification notification = new ConcreteNotification();

        User user1 = User.builder()
                .firstname("Karol")
                .discordConnected(true)
                .facebookConnected(true)
                .build();

        if (user1.discordConnected()) {
            notification = new DiscordDecorator(notification);
        }
        if (user1.facebookConnected()) {
            notification = new FacebookDecorator(notification);
        }

        notification.send(user1, "The admin system has been hacked!");
    }
}
