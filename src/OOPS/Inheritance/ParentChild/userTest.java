package OOPS.Inheritance.ParentChild;

public class userTest{

    public static void main(String[] args) {

        TwoWheeler bike=new TwoWheeler();
        bike.show();
        bike.commute();

        FourWheeler car=new FourWheeler();
        car.commute();
        car.show();

    }
}
