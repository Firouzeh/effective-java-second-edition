package com.example.effectivejavasecondedition;

// Example 3: Returning Subtypes with Static Factory Method
class Shape {
    public static Shape createCircle() {
        return new Circle();
    }

    public static Shape createRectangle() {
        return new Rectangle();
    }
}
