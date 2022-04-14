package day03_EscapeSequences; // Package name of this class

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock"); // first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("-------------------------");

        System.out.print("Knock Knock"); // just prints knock knock and does not append a new line
        System.out.print("Who is this?");
        System.out.print("This is Java?");

        System.out.println();
        System.out.println("---------------------------");

        System.out.println("Hello everyone, How are you today? Toay we will learn Escape Sequences, and next weel we will learn Variables");
        System.out.println("----------------------------------------------------------");
        System.out.print("Hello everyone, How are you today?");
        System.out.print("Toay we will learn Escape Sequences,");
        System.out.print("and next weel we will learn Variables");


    }
}
