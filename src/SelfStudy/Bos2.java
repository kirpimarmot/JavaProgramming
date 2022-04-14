package SelfStudy;

import java.util.Arrays;

public class Bos2 {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 9, 7, 8, 6};
        int[] num2 = {17, 12, 11, 13, 14, 15, 16, 10, 18};

        int[] numbers= merge1(num1,num2);
        System.out.println(Arrays.toString(numbers));


        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i; i1 < numbers.length; i1++) {
                if (numbers[i] > numbers[i1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i1];
                    numbers[i1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(numbers));


        }


    public static int[] merge1(int[] num1, int[] num2) {
        int[] result = new int[num1.length+num2.length];

        for (int i = 0; i < num1.length; i++) {
            result[i]=num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            result[i+num1.length]=num2[i];

        }
        return result;
    }


}
