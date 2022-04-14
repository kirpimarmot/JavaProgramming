package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0,};
        int max = numbers[0]; //with this we assume that the first element/number is the greater, (index 0)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){// if there is an element in the array that is greater than the current max number
                max = numbers[i];
            }
        }
        System.out.println(max);










    }
}
