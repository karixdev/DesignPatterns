package com.github.karixdev.builder;

public interface IDogBuilder {
    void setName();
    void setAge();
    void setBreed();
    void setColor();
    void setWeight();
    void setOwner();
    Dog build();
}
