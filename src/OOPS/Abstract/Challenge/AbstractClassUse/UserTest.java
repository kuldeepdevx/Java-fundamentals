package OOPS.Abstract.Challenge.AbstractClassUse;

public class UserTest {
    public static void main(String[] args){
        Shape circle=new Circle(5);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        Shape square=new Square(5);
        System.out.printf("%.12f",circle.calculatePerimeter());
        System.out.println(square.calculateArea());

        Shape a=new Shape() {
            @Override
            public double getDetails() {
                return 0;
            }

            @Override
            public double calculateArea() {
                return 0;
            }

            @Override
            public double calculatePerimeter() {
                return 0;
            }
        };
    }
}
