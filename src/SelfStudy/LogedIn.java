package SelfStudy;

import java.util.Scanner;

public class LogedIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();
        System.out.println("Enter you password");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Loged in");
        }else{
            int attempts = 3;

            while (!(u.equals("Cydeo")&& p.equals("Cydeo123") && attempts>0)){
                System.out.println("Loged in");

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter username");
                u=scan.next();

                System.out.println("Enter your password");
                p=scan.next();
                attempts--;
            }
            if (u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Loged in");
            }else{
                System.out.println("Your account is locked");
            }
        }
        scan.close();
    }
}
