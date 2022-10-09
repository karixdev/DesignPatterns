package com.github.karixdev.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private Person owner;
}
