package OOPS.Encapsulation.Challenges.GeometryApplication.utils;

public class Calculator{
    private Calculator(){}

    public static double areaOfRectangle(double length,double breadth){
        return length*breadth;
    }
    public static double areaOfCircle(double radius){
        return Math.PI*Math.pow(radius,2);
    }

}
