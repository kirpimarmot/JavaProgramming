package day52_Map_Functional_Interface;

import java.util.*;

public class Unique_Characters {

    public static void main(String[] args) {
    String str = "aabcccdeeeef";

    String[] arr = str.split("");

    Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            if (frequency == 1){
                result.put(each, frequency);
            }
        }


        /* // This is a different way of writing the code
        for (String each : arr) {
            if (Collections.frequency(Arrays.asList(arr), each)==1)
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }
        */
        System.out.println(result);


    }


}
/*
1. Write a program that can find the unique characters from a String
			Ex:
					str = "aabcccdeeeef";
			output:
					{b=1, d=1, f=1}
 */