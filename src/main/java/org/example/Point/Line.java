package org.example.Point;

public class Line {

    private Point beginPoint;
    private Point endPoint;

    public Line(double ax, double ay, double bx, double by) {
        this.beginPoint = new Point(ax, ay);
        this.endPoint = new Point(bx, by);
    }

    public Line(Point a, Point b) {
        this.beginPoint = new Point(a);
        this.endPoint = new Point(b);
    }

    public Line(Line copy) {
        this.beginPoint = copy.beginPoint;
        this.endPoint = copy.endPoint;
    }


    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = new Point(beginPoint);
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint);
    }

    public double[] getBeginCoordinates() {
        return beginPoint.getcordinates();

    }

    public double[] getendCoordinates() {
        return beginPoint.getcordinates();

    }

    public void setBeginCoordinates(double x, double y) {
        beginPoint.setCoordinates(x, y);
    }

    public void setEndCoordinates(double x, double y) {
        endPoint.setCoordinates(x, y);
    }

    public  double getLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - beginPoint.getX(), 2) + Math.pow(endPoint.getY() - beginPoint.getY(), 2));
    }

    public Point getMidPoint() {
        return new Point((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
    }

    @Override
    public String toString() {
        return "Line{" +
                "beginPoint=" + beginPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
