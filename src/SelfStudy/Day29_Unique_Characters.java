package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day29_Unique_Characters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefggh";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list = " + list);
        
        String unique = "";

        for (String each : list) {
           int frequency = Collections.frequency(list, each);
           if (frequency==1){
               unique+=each;
           }
        }
        System.out.println("unique = " + unique);
    }
    
}
