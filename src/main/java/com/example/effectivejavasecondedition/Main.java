package com.example.effectivejavasecondedition;

public class Main {
    public static void main(String[] args) {

        // Example 1: Creating Immutable Person
        ImmutablePerson person = ImmutablePerson.create("Alice", 28);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        // ??? Why we can still change the person values if it is immutable?
        person = ImmutablePerson.create("Alice2", 40);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        // Example 2: Using Singleton Database
        SingletonDatabase database = SingletonDatabase.getInstance();
        System.out.println("John's Age: " + database.getAge("John"));

        // Example 3: Returning Subtypes
        Shape circle = Shape.createCircle();
        Shape rectangle = Shape.createRectangle();

    }
}
