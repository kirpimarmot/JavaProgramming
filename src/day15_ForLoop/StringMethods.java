package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = " ";// not empty because it has a white space
        boolean r = str.isEmpty();// false -space is a character- tells whether the variable is empty or not
        System.out.println(r);

        boolean r1 = str.isBlank();// true - but it is blank because there is no digit, letter or special character.
        System.out.println(r1);

        String str2 = "Cydeo   ";
        System.out.println(str2.isBlank());
        System.out.println("-----------------------");
        String s1 = "cydeo";
        String s2 = "CYDEO";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yEs".equalsIgnoreCase("Yes"));//true

        System.out.println("-----------------------");
        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");//false
        boolean hasJava = sentence.contains("Java");//true
        boolean hasJava2 = sentence.contains("java");//false, because java is case-sensitive language
        boolean hasJava3 = sentence.toLowerCase().contains("java");//true THIS IS THE ONLY WAY TO IGNORE THE CASE SENSITIVITY
        boolean r3 = sentence.contains("java") || sentence.contains("Java");//true, because one of them is true

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println("------------------------------");

        String input1 = "I love JAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//False
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//False

        System.out.println(input1.toLowerCase().contains("java"));//True
        System.out.println(input1.toUpperCase().contains("JAVA"));//True
        System.out.println("-----------------------------------");
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");//true
        System.out.println(x);
        boolean y = a.startsWith("oo");//false
        System.out.println(y);
        boolean z = a.endsWith("Spoon");//True
        System.out.println(z);
        boolean v =a.toLowerCase().startsWith("wooden");
        //True- in order to ignore the case sensitivity we first create the lowercase/uppercase version of string
        System.out.println(v);










    }
}
