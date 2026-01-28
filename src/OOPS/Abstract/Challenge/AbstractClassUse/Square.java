package OOPS.Abstract.Challenge.AbstractClassUse;

public class Square extends Shape{

    private final double side;

    Square(double side){
        this.side=side;
    }

    public double getDetails(){
        return side;
    }

    @Override
    public double calculatePerimeter(){
        return side*side;
    }

    @Override
    public double calculateArea(){
        return side*side;
    }
}
