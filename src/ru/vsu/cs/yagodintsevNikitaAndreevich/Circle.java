package ru.vsu.cs.yagodintsevNikitaAndreevich;

public class Circle {
    private double x0;
    private double y0;
    private double radius;

    public Circle(double x0, double y0, double radius) {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
    }

    public boolean isPointInside(double x, double y) {
        return Math.pow((x - x0), 2) + Math.pow((y - y0), 2) < Math.pow(radius, 2);
    }
}
