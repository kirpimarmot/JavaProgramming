package SelfStudy;

import java.util.Scanner;

public class LogedIn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();
        System.out.println("Enter your Password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("You are loged in");
        }else{
            int attempts =3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")&& attempts>0)){
                System.out.println("Incoreect username or Password, please re-enter");
                System.out.println("Enter your username:");
                u= scan.next();
                System.out.println("Enter your password:");
                p= scan.next();
                attempts--;
            }
            if ((u.equals("Cydeo") && p.equals("Cydeo123"))){
                System.out.println("You are loged in");
            }else{
                System.out.println("your account is locked");
            }
        }
        scan.close();
    }
}
