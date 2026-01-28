package OOPS.Abstract.Challenge.AbstractClassUse;

public class Circle extends Shape{

    private final double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double getDetails(){
        return radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
