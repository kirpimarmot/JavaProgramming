package SelfStudy;

import java.util.Scanner;

public class Proposal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            answer=scan.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
        scan.close();
    }
}
