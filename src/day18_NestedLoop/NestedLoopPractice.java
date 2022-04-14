package day18_NestedLoop;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age>=1 && age<=120)){// while the age is invalid
                System.err.println("Invalid Entry, Please re=enter");
                age=scan.nextInt();
        }

            System.out.println("Would you like to continue?");
            String answer1= scan.next().toLowerCase();

            while (!(answer1.equals("yes") || answer1.equals("no"))){// while the answer is invalid
                System.err.println("Invalid Entry, PLEASE RE-ENTER. Would you like to continue?");
                answer1 =scan.next();
            }

            if (answer1.equals("no")){
                break;
            }
        }
scan.close();




    }
}
