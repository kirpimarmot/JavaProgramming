package day23_Custom_Methods_Void;

public class Custom_Methods_With_Parameters {

    public static void main(String[] args) {
        //  oddOrEven(); // the method demands additional info to complete its task
        oddOrEven(5);
        ageOfPerson(1978);
        printNumbers(10, 50);
    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }


    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is "+ age);
    }

    //                                                       10       50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        int num=0;
        for (int i = 10; i <51 ; i++) {
            num+=i;
            System.out.print(i+" ");
        }
    }
    
    
}
