package org.example.Point;

public class LineDemo {

    public static Point x = new Point(0, 0);
    public static Point y = new Point(2, 2);

    public static void main(String[] args) {
        Line lineWithFourArguments = new Line(0, 0, 5, 5);
        Line lineWithTwoArguments = new Line(x, y);
        System.out.println("The length of first line is " + lineWithFourArguments.getLength() + " and the midpoint of it's is  " + lineWithFourArguments.getMidPoint().toString());
        System.out.println("The length of second line is " + lineWithTwoArguments.getLength() + " and the midpoint of it's is  " + lineWithTwoArguments.getMidPoint().toString());

        Line copyOfFirstLine = new Line(lineWithFourArguments);
        lineWithFourArguments.setBeginPoint(lineWithTwoArguments.getMidPoint());
        System.out.println("The length of first line now is " + lineWithFourArguments.getLength() + " and the midpoint of it's is  " + lineWithFourArguments.getMidPoint().toString());
        System.out.println("The length of copyLineofFirst line  is " + copyOfFirstLine.getLength() + " and the midpoint of it's is  " + copyOfFirstLine.getMidPoint().toString());


    }


//    Point beginPoint;
//    Point endPoint;
//    private double length;
//    private double [] midpoint;

//    public LineDemo (Point beginPoint, Point endpoint, double length, double [] midpoint ){
//        this.beginPoint = beginPoint;
//        this.endPoint = endPoint;
//        this.length = length;
//        this.midpoint = midpoint;
//
//    }
//    public LineDemo (Point beginPoint, Point endpoint){
//
//    }

    //public

}
