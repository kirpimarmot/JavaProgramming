package Task_and_Solutions_day23;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
ifAnagram("racecar", "carrace");
    }
    public static void ifAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }






}
