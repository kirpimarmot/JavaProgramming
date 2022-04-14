package SelfStudy;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.out.println("Invalid entry, please re-enter");
            System.out.println("Enter your age");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? Yes/No");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen? Yes/No");
            answer = scan.next().toLowerCase();
        }
        if (age >= 18 && answer.equals("yes")) {
            System.out.println("you are eligible to vote");

        } else {
            System.out.println("you are not eligible to vote");
        }

        scan.close();
    }
}