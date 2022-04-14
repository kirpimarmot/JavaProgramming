package day04;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;
        int salary = weeklyHours * hourlyRate * numberOfWeeks;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);
    }
}
