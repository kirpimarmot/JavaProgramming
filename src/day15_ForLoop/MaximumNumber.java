package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max =-2147483648;//any user entered number will be grater then -2147483648
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();// 1
            if (num > max){//if the user entered number is greater than current maximum number
                max = num;
            }
        }

        System.out.println("max number = "+max);
        scan.close();




    }
}
/*
write a program that asks the user to enter number for five times.
return the maximum number
 */