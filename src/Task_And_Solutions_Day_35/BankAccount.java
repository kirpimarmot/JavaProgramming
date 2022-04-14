package Task_And_Solutions_Day_35;

import day06_PrimitiveTypeCastings.PrimitiveCasting;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount<=0){
            System.err.println("Invalid entry "+amount);
            System.exit(0);
        }
        System.out.println("Depositing $"+amount+" to the account "+ accountNumber);
    }

    public void withdraw(double amount){
        if (amount<=0){
            System.err.println("Invalid entry "+amount);
            System.exit(0);
        }
        if (balance<=0){
            System.out.println("Insufficient balance");
            System.exit(0);
        }

        System.out.println("withdrawing $"+amount+" from the account "+accountNumber);
        balance-=amount;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance
        encapsulate all the fields
        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()
 */