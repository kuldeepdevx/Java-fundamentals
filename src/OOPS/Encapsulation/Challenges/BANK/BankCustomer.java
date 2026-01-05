package OOPS.Encapsulation.Challenges.BANK;
import OOPS.Encapsulation.Challenges.BANK.BANKACCOUNT.BankAccount;

public class BankCustomer{
    public static void main(String[] args){

        BankAccount customer1=new BankAccount(12345,
                "Kuldeep", 500);

        System.out.println(customer1.getHolderName());
        System.out.println(customer1.getAccountNumber());
        customer1.deposite(500);
        customer1.withdraw(499.5);
        System.out.println(customer1.getAccountBalance());
        System.out.println(customer1.checkBalance());
        System.out.println(customer1);


        BankAccount customer2=new BankAccount(98765,
                "Virat", 1000);

        System.out.println(customer2.getHolderName());
        System.out.println(customer2.getAccountNumber());
        customer2.deposite(-500);
        customer2.withdraw(10000);
        System.out.println(customer2.getAccountBalance());
        System.out.println(customer2.checkBalance());
        System.out.println(customer2);

        BankAccount customer3=new BankAccount(67890,
                "Samay", 400);

        System.out.println(BankAccount.getTotalAccounts());
        System.out.println(BankAccount.getTotalApplications());
    }
}



