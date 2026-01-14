package OOPS.Polymorphism.Casting;

public class Car extends Vehicle {

    @Override
    public void run(){
        System.out.println("I am running");
    }

    @Override
    public void who(){
        System.out.println("I am Car");
    }

}
