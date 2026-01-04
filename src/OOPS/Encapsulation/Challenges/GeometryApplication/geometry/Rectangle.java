package OOPS.Encapsulation.Challenges.GeometryApplication.geometry;
import OOPS.Encapsulation.Challenges.GeometryApplication.utils.Calculator;

public class Rectangle{
    private double breadth;
    private double length;

    public  Rectangle(double length,double breadth){
        if(length<=0 || breadth<=0){
            System.out.println("Invalid data");
            this.length=0;
            this.breadth=0;
        }else{
            this.length=length;
            this.breadth=breadth;
        }
    }

    double calculateArea(){
        return Calculator.areaOfRectangle(length,breadth);
    }

    @Override
    public String toString() {
        return "Area of rectangle is "+
                Calculator.areaOfRectangle(length,breadth);
    }
}
