package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //>, >=, <, <=
        boolean result1 = 20 > 40;// false
        System.out.println("result1 = " + result1);
        boolean result13 = 200 > 40;

        boolean result2 = 300 >= 150;// as long as one of the assignment is true then the result will be true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;// true because one of the conditions is true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;// false because both conditions are not true
        System.out.println("result4 = " + result4);
        // credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;// if the credit score is 720 or greater, then it is eligible for loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120;// true 
        System.out.println("result5 = " + result5);
        boolean result6 = 200 < 180;// false
        System.out.println("result6 = " + result6);
        // passing score is
        int score = 75;
        boolean hasFailed = score <= 59;// false because both conditions are false
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;// true

        System.out.println("----------------------------------------------------" );
        int x = 100;
        int y = 200;
        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy";// false
        System.out.println("result8 = " + result8);
        boolean result9 = 'A' == 'a';// false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";//true
        System.out.println("result10 = " + result10);
        System.out.println("----------------------------------");

        boolean result11 = 100 != 200.5;// true
        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);
        boolean result14 = 200 != 200;//false

        System.out.println( 3+4);
        System.out.println("5+2= " + (3+4));









        


        




    }
}
