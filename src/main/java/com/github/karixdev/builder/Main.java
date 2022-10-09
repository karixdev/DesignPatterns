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

        DogBuilder dogBuilder = new DogBuilder();
        dogBuilder.setName("Odi");
        dogBuilder.setColor("Brown");
        dogBuilder.setBreed("German shepherd");
        dogBuilder.setOwner(person);
        dogBuilder.setWeight(7.0);
        dogBuilder.setAge(2);

        Dog dog = dogBuilder.build();

        System.out.println(dog);
    }
}
