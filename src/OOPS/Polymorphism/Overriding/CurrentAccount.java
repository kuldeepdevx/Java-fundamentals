package OOPS.Polymorphism.Overriding;

public class CurrentAccount extends BankAccount{

    @Override
    public void type(){
        System.out.println("I am current account");
    }
}
