package day15_ForLoop;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {
    public static void main(String[] args) {
        /*Scanner input =new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        input.close();

        char firstChar = word.charAt(0);
        String result = "";
        if (firstChar>= '0'&& firstChar<='9'){
            result = "First character is digit";
        }else if (firstChar>='a'&& firstChar<='z'){
            result = "First character is lower case letter";
        }else if (firstChar>='A'&& firstChar<='Z'){
            result = "First character is upper case letter";
            }else{
            result = "First character is a special character";
        }

        System.out.println(result);*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        char firstCharacter = word.charAt(0);
        String result = "";

        if (firstCharacter >= '0' && firstCharacter<='9'){
            result = "first character is digit";
        }else if (firstCharacter>='a' && firstCharacter<='z'){
            result = "first character is lower case letter";
        }else if (firstCharacter>='A' && firstCharacter<='Z'){
            result = "First character is upper case letter";
        }else{
            result = "the first character is special character";
        }

        System.out.println(result);

    }
}
/*Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character is uppercase letter"
if the word starts with lowercase letters, print "first character is lowercase letter"
if the word starts with lowercase letters, print "first character is special character"
*/