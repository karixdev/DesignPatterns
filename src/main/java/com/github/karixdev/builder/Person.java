package com.github.karixdev.builder;

import lombok.Data;

@Data
public class Person {
    private String forename;
    private String surname;
    private int age;
    private int height;
    private double weight;
    private String hairColor;

    public Person(PersonBuilder personBuilder) {
        forename = personBuilder.forename;
        surname = personBuilder.surname;
        age = personBuilder.age;
        height = personBuilder.height;
        weight = personBuilder.weight;
        hairColor = personBuilder.hairColor;
    }

    public static class PersonBuilder {
        private final String forename;
        private String surname;
        private final int age;
        private int height;
        private double weight;
        private String hairColor;

        public PersonBuilder(String forename, int age) {
            this.forename = forename;
            this.age = age;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder height(int height) {
            this.height = height;
            return this;
        }

        public PersonBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder hairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
