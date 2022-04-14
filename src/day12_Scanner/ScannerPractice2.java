package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter True or False");
        //boolean result = scan.nextBoolean();
        System.out.println("Enter your name");
        String name = scan.next();// reads the input until the next space
                                  // just use it when you expect just one word
        System.out.println("Name = "+name);

        scan.close();

    }
}
