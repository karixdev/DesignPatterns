package com.github.karixdev.decorator;

public class ConcreteNotification implements Notification {
    @Override
    public void send(User user, String message) {
        System.out.println("Notification message to: " + user.firstname() + ". With message: " + message);
    }
}
