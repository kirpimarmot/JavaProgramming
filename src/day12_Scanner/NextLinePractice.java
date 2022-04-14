package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
        double GPA = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your School Name");
        String schoolName = input.nextLine();

        System.out.println("Age = "+ age);
        System.out.println("Full Name = "+ fullName);
        System.out.println("School Nmae = "+ schoolName);
        input.close();

    }
}
/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */