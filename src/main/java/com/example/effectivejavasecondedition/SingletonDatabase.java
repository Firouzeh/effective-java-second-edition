package com.example.effectivejavasecondedition;

import java.util.HashMap;
import java.util.Map;

// Example 2: Implementing Singleton Pattern with Static Factory Method
class SingletonDatabase {
    private static final SingletonDatabase INSTANCE = new SingletonDatabase();
    private Map<String, Integer> data = new HashMap<>();

    private SingletonDatabase() {
        // Initialize the database
        data.put("John", 30);
        data.put("Alice", 25);
    }

    public static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    public int getAge(String name) {
        return data.get(name);
    }
}
