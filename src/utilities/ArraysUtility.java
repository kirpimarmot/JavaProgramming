package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //Print each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //Print each double of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //Print each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //Print each String of a String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns the maximum number from double array
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }

    //Checks if the given integer element  is contained in the given array. Returns boolean
    public static boolean contains( int[] array, int element){
        //{1,2,3,4},  6
        boolean result = false;
        for (int each : array) {
            if (each==element){
                result = true;
            }
        }
        return result;
    }

    //Checks if the given double element is contained in the given array. Returns boolean
    public static boolean contains(double[] array, double element){

        boolean result = false;
        for (double each : array) {
            if (each==element){
                result = true;
            }
        }
        return result;
    }

    //Checks if the given char element is contained in the given array. Returns boolean
    public static boolean contains(char[] array, char element){

        boolean result = false;
        for (char each : array) {
            if (each==element){
                result = true;
            }
        }
        return result;
    }

    //Checks if the given String element is contained in the given array. Returns boolean
    public static boolean contains(String[] array, String element){

        boolean result = false;
        for (String each : array) {
            if (each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    //Adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length +1];
        int i =0;
        for (int each : array) {
            result[i] = each;
            i++;
        }
        result[i]=element;

        return result;
    }

    //Adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];
        int i= 0;
        for (double each : array) {
            result[i]= each;
            i++;
        }
        result[i]=element;// element need to be assigned to the last index
        //result[result.length-1]=element;// boylede yapilabilir
        return result;
    }

    // Adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i= 0;
        for (String each : array) {
            result[i]= each;
            i++;
        }
        result[i]=element;// element need to be assigned to the last index
        //result[result.length-1]=element;// boylede yapilabilir
        return result;
    }

    //Adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];
        int i= 0;
        for (char each : array) {
            result[i]= each;
            i++;
        }
        result[i]=element;// element need to be assigned to the last index
        //result[result.length-1]=element;// boylede yapilabilir
        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count =0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int  count =0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count =0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count =0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    // returns the unique elements of the array (as anew array)
    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){//if frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array (as anew array)
    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){//if frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array (as anew array)
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){//if frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array (as anew array)
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1){//if frequency is 1, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //Removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {
        //                               {1,2,3,4,3} ,      3
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int[] result = new int[array.length -1];

        int j = 0;// j is the index numbers of array result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;// then skip it
            }
            result[j] = array[i];
            j++;
        }
        return result;
    }

    //Removes the index from the array, returns new array
    public static double[] removeElement(double [] array, int index) {
        //                                      {1,2,3,4,3} ,      3
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];

        int j = 0;// j is the index numbers of array result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;// then skip it
            }
            result[j] = array[i];
            j++;
        }
        return result;
    }

    //Removes the index from the array, returns new array
    public static char[] removeElement(char [] array, int index) {
        //                                  {1,2,3,4,3} ,      3
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        char[] result = new char [array.length-1];

        int j = 0;// j is the index numbers of array result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;// then skip it
            }
            result[j] = array[i];
            j++;
        }
        return result;
    }

    //Removes the index from the array, returns new array
    public static String[] removeElement(String [] array, int index) {
        //                                      {1,2,3,4,3} ,      3
        if (index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        String[] result = new String [array.length-1];

        int j = 0;// j is the index numbers of array result
        for (int i = 0; i < array.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;// then skip it
            }
            result[j] = array[i];
            j++;
        }
        return result;
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

    //Replaces the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
        if (index<0 || index>array.length){
            System.out.println("Invalid Index: "+index );
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //Replaces the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){
        if (index<0 || index>array.length){
            System.out.println("Invalid Index: "+index );
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //Replaces the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){
        if (index<0 || index>array.length){
            System.out.println("Invalid Index: "+index );
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //Replaces the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){
        if (index<0 || index>array.length){
            System.out.println("Invalid Index: "+index );
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (char i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)  ) {
                array[i] = newValue;
            }

        }
        return array;
    }

    // Removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }




 }
