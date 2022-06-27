package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        //           bca
        //           235
        //Collections.frequency()
        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) { // each is the characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }
        System.out.println("result = " + result);

        /** // another way of writing the code
         for (String each : arr) { // each is the characters of string
         int frequency = Collections.frequency(Arrays.asList(arr), each);
         result.put(each, frequency);
         //          key,  value
         }
         System.out.println("result = " + result);
         */


    }
}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */