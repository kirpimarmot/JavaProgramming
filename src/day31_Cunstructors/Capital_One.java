package day31_Cunstructors;

public class Capital_One {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();

        System.out.println("-----------------------------------");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987654321);

        account2.deposit(10000);



    }
}