package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n%2==0){
            System.out.println("Even");// string
        }else{
            System.out.println("Odd");//string
        }

        System.out.println("---------------------------");
        String result1 = (n%2==0)?"Even" :"Odd";
        System.out.println(result1);
        System.out.println("---------------------------");
        int age =17;
        /*
        if (age>=23){
            System.out.println("Eligible");// string
            }else{
                System.out.println("Not eligible"); // string
            } */
        //System.out.println((age>=21)? "Eligible" : "Not eligible");
        String result2 = (age>=21)? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("------------------------------");
        int number = 100;
        /*if (number>0){
            System.out.println("Pozitive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        } */

        String result3 = (number > 0)? "Positive" :(number<0)? "Negative" : "Zero";



        }


        }


