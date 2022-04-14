package day26_CustomMethods_Practice;

import java.util.Arrays;

public class Merge_Two_Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] result = new int[array1.length+array2.length];//creates new array with enough capacity
                                                           // to contain both array1 and array2
        int i =0;
        for (int each : array1) {
            result[i++]=each;
        }
        for (int each : array2) {
            result[i++]=each;
        }
        return result;
    }

}
