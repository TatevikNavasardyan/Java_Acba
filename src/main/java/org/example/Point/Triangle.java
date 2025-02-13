//package org.example.Point;
//import org.example.Point.Line;
//
//public class Triangle {
//    private Point pointA;
//    private Point pointB;
//    private Point pointC;
//
//    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
//        this.pointA = new Point(ax, ay);
//        this.pointB = new Point(bx, by);
//        this.pointC = new Point(cx, cy);
//    }
//
//    public Triangle(Point a, Point b, Point c) {
//        this.pointA = a;
//        this.pointB = b;
//        this.pointC = c;
//    }
//
//    public Triangle(Triangle copy) {
//        this.pointA = copy.pointA;
//        this.pointB = copy.pointB;
//        this.pointC = copy.pointC;
//
//    }
//
//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }
//
//    //calculates the perimeter of triangle
//    public double perimeter(Point a, Point b, Point c) {
//        return new Line(a, b).getLength() + new Line(b, c).getLength() + new Line(c, a).getLength();
//
//    }
//
////    Line bc = new Line(pointB, pointC);
////    Line ab = new Line(pointA, pointB);
////    Line ca = new Line(pointC, pointA);
//
//
//    public Line heigthOfTriangle (){
//     return new Line (pointA.getX(), pointA.getY(), ((pointB.getX()+pointC.getX())/2), ((pointB.getY()+t.pointC.getY())/2));
//    }
//    public double area(Triangle t){
//
//        return heigthOfTriangle(t).getLength()*(new Line(t.pointB, t.pointC)).getLength()/2;
//    }
//
//    public Point centerOfMass(){
//        return new Point();
//    }
//    public boolean isEquilateral (Triangle t)
//    {
//        double  lengthA=new Line(t.pointA, t.pointB).getLength();
//        double  lengthB=new Line(t.pointB, t.pointC).getLength();
//        double  lengthC=new Line(t.pointC, t.pointA).getLength();
//        return (lengthA==lengthB && lengthB==lengthC);
//    }
//    public boolean isIsosceles (Triangle t)
//    {
//        double  lengthA=new Line(t.pointA, t.pointB).getLength();
//        double  lengthB=new Line(t.pointB, t.pointC).getLength();
//        double  lengthC=new Line(t.pointC, t.pointA).getLength();
//        return (lengthA==lengthB || lengthB==lengthC || lengthA==lengthC);
//    }
//    public boolean isScalene (Triangle t)
//    {
//        double  lengthA=new Line(t.pointA, t.pointB).getLength();
//        double  lengthB=new Line(t.pointB, t.pointC).getLength();
//        double  lengthC=new Line(t.pointC, t.pointA).getLength();
//        return (lengthA!=lengthB || lengthB!=lengthC || lengthA!=lengthC);
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "pointA=" + pointA +
//                ", pointB=" + pointB +
//                ", pointC=" + pointC +
//                '}';
//    }
//}
