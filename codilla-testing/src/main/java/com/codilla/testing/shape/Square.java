package com.codilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private double field;

    public Square(double field) {
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
