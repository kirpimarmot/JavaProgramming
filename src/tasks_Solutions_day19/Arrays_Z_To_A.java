package tasks_Solutions_day19;

import java.util.Arrays;

public class Arrays_Z_To_A {
    public static void main(String[] args) {
        char[] letters2 = new char[26];//[Z~A]
        char ch1 = 'A';
        for (int i = letters2.length-1; i >= 0; i--) {// we can do this with 3 ~4 different approach
            letters2[i]= ch1++;
        }

        System.out.println(Arrays.toString(letters2));
    }
}
