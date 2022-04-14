package day13_StringClass;

import java.util.Scanner;

public class Initials_CharAt_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();
        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        String initials = firstNameInitial+"."+ lastNameInitial;
        System.out.println("Initials = "+initials);
        scan.close();





    }
}
