package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you full name: ");
        String fulName = scan.nextLine();

        System.out.println("Enter your programming language:");
        String programming = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();// to capture (elaminate) the Enter Key user pressed for nextInt()

        System.out.println("Enter your School name:");
        String schoolName = scan.nextLine();

        System.out.println("FullName = "+fulName);
        System.out.println("Programming = "+programming);
        System.out.println("Age = "+age);
        System.out.println("School Name = "+schoolName);

        scan.close();




    }
}
