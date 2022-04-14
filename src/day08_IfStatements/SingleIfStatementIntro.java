package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101 ;

        /*System.out.println("Odd Number");

        System.out.println("Even Number");*/
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; // not even number

        if(evenNumber){ // true
            System.out.println(number+ " is even number");
        }
        if (oddNumber){ // false
            System.out.println(number+ " is odd number");
        }
        System.out.println("----------------------------------" );
        int n = 200;

        //positive
        if(n > 0){ // if the n is greater than 0, it is positive
            System.out.println(n+ " is positive");
        }
        //Negative
        if(n < 0){ // if the n is less than zero, it is negative
            System.out.println(n+ " is negative");
        }
        // zero
        if(n == 0){ // if the n is equel to 0, it is 0
            System.out.println(n+ " is zero");
        }
        System.out.println("-----------------------------" );

        int score = 75;


         if(score >= 60){
             System.out.println("Congratulation on passing your exam!");
         }




    }


}
