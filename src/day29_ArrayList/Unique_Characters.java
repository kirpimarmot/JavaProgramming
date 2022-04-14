package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique_Characters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";
        //str.split("");this splits the String and create the non-primitive array

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));// use Array.asList method to pass a non-primitive array to collection type
        //This is how we convert the String to the Arraylist.

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency==1){
                unique+= each;
            }
        }
        System.out.println("unique = " + unique);
    }

       /* ANOTHER WAY CREATING AN STRING ARRAY BY SPLITTING THE NON-PRIMITIVE STRING
        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {

           int frequency =  Collections.frequency(list, each);
           if(frequency == 1){
              unique += each;
           }

        }


        System.out.println("unique = " + unique);

         */
}
