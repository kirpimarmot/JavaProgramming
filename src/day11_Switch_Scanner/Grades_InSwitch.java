package day11_Switch_Scanner;

public class Grades_InSwitch {
    public static void main(String[] args) {
        char grade = 'C';
        String result = "";

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Filed");
                break;
            default:
                System.out.println("Invalid");
        }

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result ="Great Job";
                break;
            case 'C':
                result= "Good";
                break;
            case 'D':
                result ="Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result ="Invalid";
        }

        System.out.println(result );

    }
}
