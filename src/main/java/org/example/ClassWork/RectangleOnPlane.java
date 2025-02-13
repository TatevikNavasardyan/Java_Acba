package org.example.ClassWork;

public class RectangleOnPlane {
    private double width;
    private double heigth;
    private Point corner;

    public RectangleOnPlane(double width, double height, Point corner) {
        this.heigth = height;
        this.width = width;
        this.corner = new Point(corner);
    }

    public RectangleOnPlane(RectangleOnPlane other) {
        this.heigth = other.heigth;
        this.width = other.width;
        this.corner= new Point(corner);

    }
}

