package day13_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(3);

         System.out.println("thirdChar = "+thirdChar);
        System.out.println("-----------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChars = s1.length();
        System.out.println("Total Characters are "+totalChars);
        char lastChar = s1.charAt(s1.length()-1);// last index number
        System.out.println("lastChar is " +lastChar);
        char lastChar2 = s1.charAt(52);

        System.out.println("Last char = "+ lastChar2);

        System.out.println("----------------------------------");
        String str ="wooden spoon";
        System.out.println(str);

        System.out.println("_______________________");

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("------------------------");

        String s = "Java";

        s.toUpperCase();
        System.out.println(s);

        System.out.println("---------------------");

        s=s.toUpperCase();
        System.out.println(s);

        System.out.println("--------------------------------------------");

        //Today is great day to learn java programming language.
        String sentence = "Today is great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);








    }
}
