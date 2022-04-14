package day18_NestedLoop;

import day10_NestedIf.IfStatementsWithoutCurlyBrace;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while (true){
            System.out.println("enter a number");
            int num = scan.nextInt();
            if ((num%2) == 0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){//if the answer is invalid (not a 'yes' or 'no')
                System.out.println("Invalid Entry, Please re-enter, Would you like to enter another number");
                answer= scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }








    }
}
/*
 Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing
                If user enters invalid answer, repeat the previous steps
 */