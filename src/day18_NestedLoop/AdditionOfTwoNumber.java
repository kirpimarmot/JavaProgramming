package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your first number");
            int firstNum = scan.nextInt();

            System.out.println("Enter your second number");
            int secondNum = scan.nextInt();

            System.out.println("Addition: "+(firstNum+secondNum));

            System.out.println("Would you like to continue");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.out.println("invalid Entry, Please re-enter");
                answer= scan.next().toLowerCase();
            }

            if (answer.equals("no")){
            break;// exist the outer loop
        }
    }




    }
}
