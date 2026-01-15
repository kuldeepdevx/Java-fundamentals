package OOPS.Polymorphism.Overriding;

public class SavingAccount extends BankAccount {

    @Override
    public void type(){
        System.out.println("I am saving account");
    }
}
