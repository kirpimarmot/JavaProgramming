package day09_IfStatemnets;

import java.util.IllegalFormatCodePointException;

public class PassedOrFailed {
    public static void main(String[] args) {
        int score = 75;
        if (score >=60) {
            System.out.println("Congratulations, you passed ");
        }else{
            System.out.println("Failed");
        }
    }
}
