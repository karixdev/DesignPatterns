package com.github.karixdev.decorator;

public class BaseNotificationDecorator implements Notification {

    private final Notification wrappee;

    public BaseNotificationDecorator(Notification wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(User user, String message) {
        wrappee.send(user, message);
    }
}
