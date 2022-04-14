package SelfStudy;

import java.util.Scanner;
import java.util.SplittableRandom;

public class people {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many people they live with");
        int people = scan.nextInt();
        String result= "";

        if (people>=3){
            if (people>= 3&& people<=6){
                result = "Live with 3-6 people";
            }else{
                result = "Live with more than 6 people";
            }

        }else{
            result= "Live with less than 3 people";


        }
        System.out.println(result);
    }
}
