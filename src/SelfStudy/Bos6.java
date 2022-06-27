package SelfStudy;

import java.util.Arrays;

public class Bos6 {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 5, 11, 25, 30};


        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                int temp = 0;
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
        }

    }



