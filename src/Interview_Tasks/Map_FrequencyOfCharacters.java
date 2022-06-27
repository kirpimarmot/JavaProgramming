package Interview_Tasks;

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
        String[] arr = str.split("");//First convert str to Array by .split() method

        Map<String, Integer> result = new LinkedHashMap<>();//Second create a LinkedHashMap to put everything

        //Third iterate the array via for each loop
        for (String each : arr) { // each is the characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
            //put each character of array in to map as key and for the value part
            // which is the frequency of the characters use
            // -(Collections.frequency(collection Type, the element that you want to find the frequency of) )- method which returns an integer
            // and then this Collection.frequency method is going to return how many times this element has occurred in this collection type as an integer
        }

        System.out.println("result = " + result);


    }
}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */