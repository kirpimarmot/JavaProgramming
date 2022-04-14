package day04;

public class PrimitivesIntro {

    public static void main(String[] args) {
         // age: 383 years old
        byte age = 38;

        // weight: 160 pounds
        short weight = 160; // 160 is out of byte' range

        // salary: 100000
        int salary = 100_000; // 100000 is out of short' range
        // int is the preferred data type for integer numbers

        long asset = 3_333_333_333l;// if you don't use l the compiler takes the number as int

        // tax: 0.26
        float tax = 0.26f;
        double IP = 3.14;

        //#
        char ch1 = '#';
        char ch2 = 35;
        char ch3 = 35000;


        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);



    }

}
