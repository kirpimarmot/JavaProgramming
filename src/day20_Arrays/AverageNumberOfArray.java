package day20_Arrays;

import java.util.Scanner;

public class AverageNumberOfArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber= sum / numbers.length;

        System.out.println("averageNumber = " + averageNumber);

    }
}
