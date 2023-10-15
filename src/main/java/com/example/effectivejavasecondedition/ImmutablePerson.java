package com.example.effectivejavasecondedition;

// Example 1: Creating Immutable Class with Static Factory Method
final class ImmutablePerson {
    private final String name;
    private final int age;

    private ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ImmutablePerson create(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        return new ImmutablePerson(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
