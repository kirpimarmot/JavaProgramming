package Tasks_And_Solutions_day24;

import java.util.Arrays;

public class Is_Anagram {
    public static void main(String[] args) {
        String str1 = "cba";
        String str2 = "bac";
        isAnagram(str1, str2);
        System.out.println(isAnagram("cba", "bac"));
    }

    public static boolean isAnagram(String str1, String str2){
        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

}
