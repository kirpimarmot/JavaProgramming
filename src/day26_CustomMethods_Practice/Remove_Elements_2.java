package day26_CustomMethods_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Remove_Elements_2 {
    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};
        numbers = removeElements(numbers, 1);//{100,300,400,500,600}
        //numbers = removeElements(numbers, 1);//{100,400,500,600}
        System.out.println(Arrays.toString(numbers));
    }


    //                                  {1,2,3,4,3}    ,   3
    public static int[] removeElements(int[] array, int index) {
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int[] result = {};
        for (int i = 0; i < array.length; i++) {// i: is arrays index number
            if (i != index) {
                ArraysUtility.addElement(result, array[i]);// it adds all the index to the result array accept for the
            }
        }
        return result;
    }
}
