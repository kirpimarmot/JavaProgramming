package day22_MultiDimensional_Array;

import java.util.Arrays;

public class Reverse_Second_Word {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[1].length()-1; i>=0; i--){
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);

        sentence = sentence.replaceFirst(words[1], reverse);
        System.out.println(sentence);


   /*   words[1]= reverse;

        String result = "";
        for (String word : words) {
            System.out.print(word+ " ");
        }

        System.out.println(result);
    */



    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */