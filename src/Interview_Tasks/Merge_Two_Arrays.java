package Interview_Tasks;

import java.util.Arrays;

public class Merge_Two_Arrays {
    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 4};
        // index       0  1  2   3
        int[] arr4 = {5, 6};

        int[] result =new int[arr3.length+arr4.length];
        int a =0;
        for (int i1 = 0; i1 < arr3.length; i1++) {
            result[a++]=arr3[i1];
        }
        for (int k = 0; k < arr4.length; k++) {
            result[k+arr3.length]=arr4[k];
            a++;
        }

        System.out.println(Arrays.toString(result));
    }
}
