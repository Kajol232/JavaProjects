package com.company;

public class Triangle extends GeometricObject {
    private double length,base, height;

    public Triangle() {
    }

    public Triangle(double length, double base, double height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, boolean filled, double length, double base, double height) {
        super(color, filled);
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((1/2) * base) - height;
    }

    @Override
    public double getPerimeter() {
        return length + base + height;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + "\nPerimeter: " +  getPerimeter() + "\nColor: "
                + getColor() + "\nisFilled: " + isFilled();
    }
}
