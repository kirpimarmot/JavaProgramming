package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {98,36,65,87,9, 4,88};
        int minimum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<minimum){
                minimum = numbers[i];
            }
        }
        System.out.println(minimum);






    }
}
