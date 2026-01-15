package OOPS.Polymorphism.UpCasting;

public class UserTest extends Car {

    @Override
    public void who(){

    }

    public static void main(String[] args){

        Vehicle vehicle=new Car();

        vehicle.run();
        vehicle.who();

        test(new Car());
    }

    private static void test(Vehicle veh){

    }
}