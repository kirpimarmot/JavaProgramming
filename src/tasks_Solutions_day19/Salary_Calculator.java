package tasks_Solutions_day19;

import java.util.Locale;
import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
         while (true){
             System.out.println("How much you make an hour?");
             double hourRate = scan.nextDouble();
             if (hourRate<=0){
                 System.err.println("Invaid Entry for hourly rate");
                 System.exit(0);
             }
             System.out.println("How many hours do you work per week?");
             int weeklyHour = scan.nextInt();
             if (weeklyHour<1 && weeklyHour>144){
                 System.err.println("invalid entry for weekly hour");
                 System.exit(0);
             }
             System.out.println("Enter your state tax rate");
             double stateTaxRate = scan.nextDouble();
              if (stateTaxRate <0 || stateTaxRate>0.1){
                  System.out.println("Invalid Entry for state tax rate");
                  System.exit(0);
              }

              double federalTaxRate= 0.26;
              double grossSalary = hourRate * weeklyHour;
              double stateTax = grossSalary *stateTaxRate / 100;
              double federalTax= grossSalary * federalTaxRate / 100;
              double totalTax = stateTax+federalTax;
              double salaryAfterTAx = grossSalary -totalTax;

             System.out.println("grossSalary = " + grossSalary);
             System.out.println("stateTax = " + stateTax);
             System.out.println("federalTax = " + federalTax);
             System.out.println("totalTax = " + totalTax);
             System.out.println("salaryAfterTAx = " + salaryAfterTAx);

             System.out.println("Would you like to continue?");
             String answer = scan.next().toLowerCase();

             while (!(answer.equals("yes") && answer.equals("no"))){
                 System.out.println("Invalid Entry, please re-enter");
                 answer=scan.next().toLowerCase();
             }
             if (answer.equals("no")){
                 System.out.println("Thank you for using salary calculator APP");
                 break;
             }
         }
        scan.close();
    }
}
