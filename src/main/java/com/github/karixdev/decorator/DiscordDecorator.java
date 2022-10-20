package com.github.karixdev.decorator;

public class DiscordDecorator extends BaseNotificationDecorator {
    public DiscordDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void send(User user, String message) {
        super.send(user, message);
        System.out.println("Sending a discord notification");
    }
}
