package com.github.karixdev.decorator;

public class FacebookDecorator extends BaseNotificationDecorator {
    public FacebookDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void send(User user, String message) {
        super.send(user, message);
        System.out.println("Sending a facebook notification");
    }
}
