package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

public class Revers_Array_2 {

    public static int[] reverse(int[] array){
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
      return result;
    }
}
