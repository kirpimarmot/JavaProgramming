package SelfStudy;

import java.util.Scanner;

public class Bos10 {
    public static void main(String[] args) {
   Scanner scan =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str= scan.next();
        palindrome(str);
    }

    public static void palindrome(String str){

        String reversed ="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed+=str.charAt(i);
        }

        if (reversed.equalsIgnoreCase(str)){
            System.out.println(str+ " is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

       // boolean isPalindrome = str.equalsIgnoreCase(reversed);

        System.out.println(reversed);
    }

}


