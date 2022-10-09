package com.github.karixdev.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Adam", 20)
                .height(176)
                .weight(82)
                .hairColor("black")
                .surname("Brown")
                .build();

        System.out.println(person);
    }
}
