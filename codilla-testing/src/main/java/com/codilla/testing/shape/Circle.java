package com.codilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "Circle";
    private double field;

    public Circle(double field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return shapeName + ", Field: " + field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}
