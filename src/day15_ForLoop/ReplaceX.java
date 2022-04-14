package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();//xcodeX
        String str = "xcodeX";
        String result = str.replace("x", "a").replace("X",
                "a");
        System.out.println(result);






    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
