package com.github.karixdev.builder;

public class DogBuilder implements IDogBuilder{
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private Person owner;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public Dog build() {
        return new Dog(
                name,
                age,
                breed,
                color,
                weight,
                owner
        );
    }
}
