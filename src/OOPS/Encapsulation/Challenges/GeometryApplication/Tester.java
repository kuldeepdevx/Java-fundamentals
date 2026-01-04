package OOPS.Encapsulation.Challenges.GeometryApplication;
import OOPS.Encapsulation.Challenges.GeometryApplication.geometry.Rectangle;
import OOPS.Encapsulation.Challenges.GeometryApplication.geometry.Circle;

public class Tester {
    public static void main(String[] args){

        Rectangle rectangle=new Rectangle(9,2);
        Circle circle=new Circle(9);

        System.out.println(rectangle);
        System.out.println(circle);
    }
}
