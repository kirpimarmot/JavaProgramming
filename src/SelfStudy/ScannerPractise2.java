package SelfStudy;

import java.util.Scanner;

public class ScannerPractise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Sentence");
        String sen1 = input.nextLine();
        System.out.println("Enter your second Sentence");
        String sen2 = input.nextLine();

        System.out.println("Your first sentence is "+sen1 );
        System.out.println("your second sentence is "+sen2);


    }
}
