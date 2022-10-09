package com.github.karixdev.builder;

public interface IDogBuilder {
    void setName(String name);
    void setAge(int age);
    void setBreed(String breed);
    void setColor(String color);
    void setWeight(double weight);
    void setOwner(Person owner);
    Dog build();
}
