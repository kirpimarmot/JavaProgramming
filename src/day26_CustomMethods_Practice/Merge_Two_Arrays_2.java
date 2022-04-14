package day26_CustomMethods_Practice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class Merge_Two_Arrays_2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] arr3 =  merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------- ");
        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};
        String[] result = merge(a1,a2);
        System.out.println(Arrays.toString(result));




    }
    // Merge the given two arrays and returns the new array
    public static int[] merge(int[] array1, int[] array2){
        int[] result = {};

        for (int each : array1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (int each : array2) {
            result= ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // Merge the given two arrays and returns the new array
    public static double[] merge(double[] array1, double[] array2){
        double[] result = {};

        for (double each : array1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (double each : array2) {
            result= ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // Merge the given two arrays and returns the new array
    public static char[] merge(char[] array1, char[] array2){
        char[] result = {};

        for (char each : array1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (char each : array2) {
            result= ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // Merge the given two arrays and returns the new array
    public static String[] merge(String[] array1, String[] array2){
        String[] result = {};

        for (String each : array1) {
            result= ArraysUtility.addElement(result, each);
        }
        for (String each : array2) {
            result= ArraysUtility.addElement(result, each);
        }
        return result;
    }



}
