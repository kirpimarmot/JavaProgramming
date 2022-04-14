package tasks_Solutions_day19;

import java.util.Scanner;

public class Yalcinla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input string value");
        String str = scanner.nextLine();

        System.out.println("input second value");
        String lookFor = scanner.next();

        int frequency = 0;//+1+1+1 ==> 3

        for (int i = 0; i <= (str.length()-lookFor.length()); i++) { // i: indexes of str

            if(str.substring(i, (i+ lookFor.length())).equals(lookFor)){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}