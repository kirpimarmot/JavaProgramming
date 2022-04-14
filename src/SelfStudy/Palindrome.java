package SelfStudy;

import day10_NestedIf.IfStatementsWithoutCurlyBrace;

import java.lang.ref.SoftReference;

public class Palindrome {
    public static void main(String[] args) {
     String str = "aabb1234school!) (@#$%^!WoodenSpoon";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){
                letters += ch;
            }else{
                if (ch != ' ')
                specialChars += ch;
            }
        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
     





     }
    }

