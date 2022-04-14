package day20_Arrays;

import java.util.Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        /*letters[0]= 'A';
        letters[1]= 'B';*/
        char ch = 'A';
       for (int i = 0; i < letters.length; i++) {// we can do this with 3 ~4 different approach
           letters[i]= ch++;
        }
        /*
        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {// i: index numbers 0 ~ last index
            letters[i]= (char) j;
        }
        */

        /*for (char i = 'A', j=0; i <='Z' && j < letters.length ; i++, j++) {
            letters[j]=i;
        }*/

       System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------------");
        char[] letters2 = new char[26];//[Z~A]
        char ch1 = 'Z';
        for (int i = 0 ; i < letters2.length; i++) {// we can do this with 3 ~4 different approach
            letters2[i]= ch1--;
        }

        System.out.println(Arrays.toString(letters2));






    }
}
