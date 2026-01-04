package OOPS.Encapsulation.Challenges.GeometryApplication.geometry;
import OOPS.Encapsulation.Challenges.GeometryApplication.utils.Calculator;

public class Circle{
    private  double radius;

    public Circle(double radius){
        if(radius<=0){
            System.out.println("Invalid data");
            this.radius=0;
        }else {
            this.radius = radius;
        }
    }

    double calculateArea(){
        return Calculator.areaOfCircle(radius);
    }

    @Override
    public String toString(){
        return "Area of circle is "+Calculator.areaOfCircle(radius);
    }
}