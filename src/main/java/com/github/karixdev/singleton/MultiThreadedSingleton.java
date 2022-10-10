package com.github.karixdev.singleton;

public class MultiThreadedSingleton {
    private String value;

    private static volatile MultiThreadedSingleton instance;

    public MultiThreadedSingleton(String value) {
        this.value = value;
    }

    public static MultiThreadedSingleton getInstance(String value) {
        MultiThreadedSingleton result = instance;

        if (result != null) {
            return instance;
        }

        synchronized (MultiThreadedSingleton.class) {
            if (instance == null) {
                instance = new MultiThreadedSingleton(value);
            }

            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
