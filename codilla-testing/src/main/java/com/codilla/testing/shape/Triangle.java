package com.codilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private double field;

    public Triangle(double field) {
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
