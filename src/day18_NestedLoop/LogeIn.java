package day18_NestedLoop;

import java.util.Scanner;

public class LogeIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "Cydeo";
        String passWord = "WoodenSpoon";

        System.out.println("Enter your user name:");
        userName =scan.next();

        System.out.println("Enter your user password:");
        passWord =scan.next();
        
        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            System.out.println("Loged In");
        }else{
            for (int i = 0; i <3 ; i++) {
                System.out.println("Incorect username or password");
                System.out.println("Enter your username");
                userName =scan.next();
                System.out.println("Enter your Password");
                passWord=scan.next();

                if (userName.equals("Cydeo")&& passWord.equals("WoodenSpoon")){
                    System.out.println("Loged In");
                    break;
                }
            }

            if (!(userName.equals("Cydeo") && passWord.equals("WoodenSpoon"))){
                System.out.println("Your account is locked, Please contact support team");
            }
        }
        scan.close();






    }
}
/*
  2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon
                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user
                        to have three attempts to enter correct credentials and if all three attempts are failed,
                        then print "Your account is locked."
 */