package Interview_Tasks;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=scan.nextInt();

        System.out.println("Enter another number");
        int num2=scan.nextInt();
        sumOfNumbers(num1, num2);
    }

    public static void sumOfNumbers(int num1, int num2){
        int sum=0;
        for (int i = num1; i <= num2; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
