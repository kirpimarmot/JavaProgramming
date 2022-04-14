package day09_IfStatemnets;

public class MinNumber {
    public static void main(String[] args) {

        int num1 = 100,
                num2 =200;
        boolean num1IsMin = num1 < num2;
        boolean num2IsMin = num2 < num1;
        boolean equal = num1 == num2;

        if(num1IsMin){ //if num1 is the minimum number
            System.out.println(num1 +" is the minimum number");
        }
        if (num2IsMin){ // if num2 is minimum number
            System.out.println(num2 +" is the minimum number");
        }
        if (equal){ // if they are equal
            System.out.println("Equal");
        }



    }

}

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				100 is the minimum number
			n1 & n2
			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */