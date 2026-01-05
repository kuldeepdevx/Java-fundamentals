package OOPS.Encapsulation.Challenges.BANK.BANKACCOUNT;

public class BankAccount{
    private static int totalApplications;
    private static int totalAccounts;

    private long accountNumber;
    private String holderName;
    private double accountBalance;

    static{
        System.out.println("****************************** Welcome to the Bank ******************************\n");
        totalAccounts=0;
    }

    {
       totalApplications++;
    }

    public BankAccount(int accountNumber,
                       String holderName,double accountBalance){
        if(accountBalance<500){
            System.out.println("To open an account, the balance must be at least 500.\n");
            return;
        }
            this.accountBalance=accountBalance;
            this.holderName=holderName;
            this.accountNumber=accountNumber;
            totalAccounts++;
            System.out.println("\n\nThank you for opening a bank account "+this.holderName+"\n");
    }

    public static int getTotalApplications() {
        return totalApplications;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }


    public String getHolderName(){
        return holderName;
    }

    public void setHolderName(String name){
        this.holderName=name;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void deposite(double balance){
        if(balance<=0){
            System.out.println("Invalid amount to deposit.");
        }else {
            this.accountBalance += balance;
            System.out.println("Deposit of Rs:"+ balance +" was successful.");
        }
    }

    public void withdraw(double balance){
        if(balance>this.accountBalance){
            System.out.println("Insufficient balance for withdrawal");
        }else if(balance<=0) {
            System.out.println("Invalid amount for withdrawal");
        }else{
            this.accountBalance -= balance;
            System.out.println("Withdrawal of rs:" + balance + " is successful");
        }
    }

    public String checkBalance(){
        return "Avl Bal is rs:"+this.accountBalance;
    }

    @Override
    public String toString() {
        return "Account Details=[" +
                "Holder Name="+holderName+
                ",Account Number="+accountNumber+
                ",Account Balance="+accountBalance+
                "]\n";
    }
}

















