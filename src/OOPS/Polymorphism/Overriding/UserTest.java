package OOPS.Polymorphism.Overriding;

public class UserTest {
    public static void main(String[] args){

        BankAccount savingAccount=new SavingAccount();
        BankAccount currentAccount=new CurrentAccount();

        savingAccount.type();
        currentAccount.type();
    }
}
