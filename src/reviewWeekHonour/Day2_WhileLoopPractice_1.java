package reviewWeekHonour;

import java.util.Scanner;

public class Day2_WhileLoopPractice_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Odd nUmber");
            } else {
                System.out.println("Even Number");
            }

            System.out.println("Would you like to continue? Yes/No");
            String answer = scan.next();

            if(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you");
                break;
            }
        }


    }
}
/*
    1-Ask user to enter a number
    if it is odd, print ""Odd Number";
    if it is even, print "Even Number"
    Ask user again if wants to continue or not, if answer is "yes", continue to enter number,
                                                if answer is "no", send "Thank you!" message and close the program.
    If answer is not "yes" or "no" Don't let user continue and close the program with "Invalid Entry!" message

 */