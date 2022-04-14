package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) { // if credentials are valid
            System.out.println("Logged In");
        } else {  // if credentials are not valid
            int attempts = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {//while/if the credentials are in valid, and user has attempts to re-enter
                /*if (attempts==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }*/
                System.out.println("Incorrect user name or password, please re-enter");
                System.out.println("Enter your user name:");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attempts--;
            }

            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged In");
            } else {
                System.out.println("Your account is locked");

            }
        }
        scan.close();







    }
}
/* You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then your program should print "Your account is locked."
*/
