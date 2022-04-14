package SelfStudy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator== '-')){
            System.out.println("Invalid operator, please re-enter");
            operator=scan.next().charAt(0);
        }
        System.out.println((operator=='+')? num1+num2 : num1-num2);





    }
}
