package day15_ForLoop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of People:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent"))? 0.25 :(service.equals("great"))? 0.2
                : (service.equals("good"))? 0.15 :(service.equals("fair"))? 0.1 : 0.05;

        double totalTip = checkAmount * tipRate;

        System.out.println("Number of people entered: "+numOfPeople);
        System.out.println("Total to pay: "+checkAmount);
        System.out.println("Total tip: "+totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: "+(checkAmount/numOfPeople));
            System.out.println("Tip per person: "+ (totalTip/numOfPeople));
        }
        scan.close();









    }
}
