package OOPS.Inheritance.NestedClass;

public class test {
    public static void main(String[] args) {

        Car car=new Car();
        Car.Tyre tyre=car.new Tyre();

        car.show();
        tyre.test();
    }
}