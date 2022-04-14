package SelfStudy;

import java.util.Scanner;

public class ScannerPractise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String fulName = input.nextLine();

        System.out.println("score = "+score);
        System.out.println("fullName = "+fulName);
        input.close();



    }
}
