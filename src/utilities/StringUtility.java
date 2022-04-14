package utilities;

import java.util.Arrays;

public class StringUtility {
    // Prints each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    // Reverse a given string and returns the reverse string
    public static String reverse(String str){
        String result ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    //checks whether it is palindrome or not, returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }
    //Checks if the given string is anagram, returns boolean
    public static boolean isAnagram(String str1, String str2){// "acb" , "bca"
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    //Removes the duplicate characters from a given string, returns String. "aaaabbbbccc"===>"abc"
    public static String removeDuplicates(String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);//aaaabbbbccc
            if (!result.contains(""+each)){
                result += each;
            }
        }
        return result;
    }






}
