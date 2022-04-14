package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Revers_Array {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }


    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = array[i];
        /*
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
             result[j++] = array[i];
         */
        }
    return result;
    }
    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){
       double[] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = array[i];
        /*
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
             result[j++] = array[i];
         */
        }
        return result;
    }
    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = array[i];
        /*
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
             result[j++] = array[i];
         */
        }
        return result;
    }
    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = array[i];
        /*
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
             result[j++] = array[i];
         */
        }
        return result;
    }




}
