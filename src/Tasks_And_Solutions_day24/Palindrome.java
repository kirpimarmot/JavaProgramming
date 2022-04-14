package Tasks_And_Solutions_day24;

public class Palindrome {


    public static boolean isPalindrome(String str){
        return Reverse.reverse(str).equalsIgnoreCase(str);
    }
}
