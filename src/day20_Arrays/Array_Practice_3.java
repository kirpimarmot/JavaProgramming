package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");//number of numbers user enters
        int numberOfNumbers =scan.nextInt();// 5
        if (numberOfNumbers<=0){
            System.out.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[numberOfNumbers];// [10, 20, 30, 40, 50,]
        // array needs to have enough capacity to contain all the elements user going to enter


        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();// 10, 20, 30, 40, 50,
        }

        System.out.println(Arrays.toString(numbers));








    }
}
